package com.example.calculator;

import static java.sql.Types.NULL;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText eT;
    double result =0;
    int oper = 0; // 1: +, 2: -, 3: *, 4: /
    double AC, AC2;
    String temp;
    double num1, num2;
    boolean firstNum = false;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eT = (EditText) findViewById(R.id.eT);

    }
    public void btnPlus (View view){
        temp = eT.getText().toString();
        if (check(temp)){
            if (oper == 0) {
                num1 = Double.parseDouble(temp);
            } else {
                num2 = Double.parseDouble(temp);
                switch (oper) {
                    case 1: num1 = num1 + num2;
                        break;
                    case 2: num1 = num1 - num2;
                        break;
                    case 4: num1 = num1 / num2;
                        break;
                }
            }
            eT.setHint(""+num1);
            eT.setText("");
            oper = 1;
        } else {
            Toast.makeText(this, "Wrong input", Toast.LENGTH_SHORT).show();
        }
    }

    public void btnMinus (View view){
        temp = eT.getText().toString();
        if (check(temp)){
            if (oper == 0) {
                num1 = Double.parseDouble(temp);
            } else {
                num2 = Double.parseDouble(temp);
                switch (oper) {
                    case 1: num1 = num1 + num2;
                    break;
                    case 2: num1 = num1 - num2;
                    break;
                    case 4: num1 = num1 / num2;
                        break;
                }
            }
            eT.setHint(""+num1);
            eT.setText("");
            oper = 2;
        } else {
            Toast.makeText(this, "Wrong input", Toast.LENGTH_SHORT).show();
        }
    }

    public void btnDiv (View view){
        temp = eT.getText().toString();
        if (check(temp)){
            if (oper == 0) {
                num1 = Double.parseDouble(temp);
            } else {
                num2 = Double.parseDouble(temp);
                switch (oper) {
                    case 1: num1 = num1 + num2;
                        break;
                    case 2: num1 = num1 - num2;
                        break;
                    case 4: num1 = num1 / num2;
                        break;
                }
            }
            eT.setHint(""+num1);
            eT.setText("");
            oper = 4;
        } else {
            Toast.makeText(this, "Wrong input", Toast.LENGTH_SHORT).show();
        }
    }

    public void multiplication (View view){  //btn4

    }

    public void btnAC (View view){  //btn5
        oper = 0;
        eT.setHint("");
        eT.setText("");
    }

    public void btnEqual (View view){  //btn6
        temp = eT.getText().toString();
        if (check(temp)){
            if (oper == 0) {
                num1 = Double.parseDouble(temp);
            } else {
                num2 = Double.parseDouble(temp);
                switch (oper) {
                    case 1: num1 = num1 + num2;
                        break;
                    case 2: num1 = num1 - num2;
                        break;
                    case 4: num1 = num1 / num2;
                        break;
                }
            }
            eT.setText(""+num1);
            oper = 0;
        } else {
            Toast.makeText(this, "Wrong input", Toast.LENGTH_SHORT).show();
        }
    }

    public void credits (View view){

    }
    public static boolean check(String st){
        if ((st == "") || (st == " ") || (st == "-") || (st==".") || (st == "-.")) {
            return false;
        }
        return true;
    }

}






