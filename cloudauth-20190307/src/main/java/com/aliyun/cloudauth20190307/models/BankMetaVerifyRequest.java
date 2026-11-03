// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class BankMetaVerifyRequest extends TeaModel {
    /**
     * <p>The bank card number.</p>
     * <ul>
     * <li>If ParamType is set to normal, enter the bank card number in plaintext.</li>
     * <li>If ParamType is set to md5, enter all digits of the card number except the last 6 in plaintext, followed by the MD5 hash (32-character lowercase) of the last 6 digits.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>610*************1181</p>
     */
    @NameInMap("BankCard")
    public String bankCard;

    /**
     * <p>The ID card number.</p>
     * <ul>
     * <li>This parameter is required when ProductType is set to BANK_CARD_3_META.</li>
     * <li>If ParamType is set to normal, enter the ID card number in plaintext.</li>
     * <li>If ParamType is set to md5, enter the first 6 digits of the ID card number in plaintext, followed by the date of birth encrypted with MD5 (32-character lowercase MD5 hash), followed by the last 4 digits of the ID card number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>429001********8211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The ID document type.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The mobile phone number.</p>
     * <ul>
     * <li>This parameter is required when ProductType is set to BANK_CARD_4_META.</li>
     * <li>If ParamType is set to normal, enter the mobile phone number in plaintext.</li>
     * <li>If ParamType is set to md5, enter the MD5 hash (32-character lowercase) of the mobile phone number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>138******11</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The parameter type.</p>
     * <ul>
     * <li>normal: no encryption.</li>
     * <li>md5: MD5 encryption.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The product type.</p>
     * <ul>
     * <li>BANK_CARD_2_META: verifies the bank card number and name.</li>
     * <li>BANK_CARD_3_META: verifies the bank card number, name, and ID card number.</li>
     * <li>BANK_CARD_4_META: verifies the bank card number, name, ID card number, and mobile phone number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BANK_CARD_2_META</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The name.</p>
     * <ul>
     * <li>If ParamType is set to normal, enter the name in plaintext.</li>
     * <li>If ParamType is set to md5, enter the first character of the name encrypted with MD5 (32-character lowercase MD5 hash) followed by the remaining characters of the name in plaintext.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>张*</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>VERIFY_BANK_CARD: the bank card verification mode. Verifies whether the bank card number matches the user\&quot;s real name, ID card number, and mobile phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>VERIFY_BANK_CARD</p>
     */
    @NameInMap("VerifyMode")
    public String verifyMode;

    public static BankMetaVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        BankMetaVerifyRequest self = new BankMetaVerifyRequest();
        return TeaModel.build(map, self);
    }

    public BankMetaVerifyRequest setBankCard(String bankCard) {
        this.bankCard = bankCard;
        return this;
    }
    public String getBankCard() {
        return this.bankCard;
    }

    public BankMetaVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public BankMetaVerifyRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public BankMetaVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public BankMetaVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public BankMetaVerifyRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public BankMetaVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public BankMetaVerifyRequest setVerifyMode(String verifyMode) {
        this.verifyMode = verifyMode;
        return this;
    }
    public String getVerifyMode() {
        return this.verifyMode;
    }

}
