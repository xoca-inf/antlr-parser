

//import lexica_math.LexicalAnalyzer;
//import parser_math.Parser;

import lexica_math.LexicalAnalyzer;
import parser_math.Parser;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            System.out.println(new Parser(new LexicalAnalyzer(in.nextLine())).expr().val);
        }
        in.close();
    }
}
