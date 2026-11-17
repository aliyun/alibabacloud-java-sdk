// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class BankMetaVerifyIntlRequest extends TeaModel {
    /**
     * <p>The bank card number.</p>
     * <ul>
     * <li>If paramType is set to normal, enter the plaintext bank card number.</li>
     * <li>If paramType is set to md5, enter the plaintext of the bank card number except the last 6 digits, followed by the 32-character lowercase MD5 hash of the last 6 digits.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>● Plaintext: 12345678******
     * ● Ciphertext:
     * 12345678f8ee21920e37807b43e7e912ab829b6e</p>
     */
    @NameInMap("BankCard")
    public String bankCard;

    /**
     * <p>The identification document number.</p>
     * <ul>
     * <li>If paramType is set to normal, enter the plaintext identification document number.</li>
     * <li>If paramType is set to md5:<ul>
     * <li>For an ID card, enter the first 6 digits in plaintext, followed by the ciphertext of the date of birth, and then the last 4 digits in plaintext.</li>
     * <li>For other identification documents, encrypt the last two characters by using MD5.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>Important:
     * This parameter is required if ProductType is set to one of the following values:</p>
     * <ul>
     * <li>BANK_CARD_3_META</li>
     * <li>BANK_CARD_4_META</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>● Plaintext: 429001********8211
     * ● Ciphertext:
     * 42900132fa7bcd874161bea8ec8fd98f390ec98211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The type of the identification document. If you leave this parameter empty, the default value is ID card. For other types of identification documents, see the following table.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The mobile phone number.</p>
     * <ul>
     * <li>If paramType is set to normal, enter the plaintext mobile phone number.</li>
     * <li>If paramType is set to md5, enter the ciphertext mobile phone number.</li>
     * </ul>
     * <p>Important:</p>
     * <ul>
     * <li>This parameter is required if ProductType is set to BANK_CARD_4_META.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>● Plaintext: 186****2055
     * ● Ciphertext:
     * 849169cd3b20621c1c78bd61a11a4fc2</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li>normal: No encryption.</li>
     * <li>md5: MD5 encryption.</li>
     * </ul>
     * <p>Important:</p>
     * <ul>
     * <li>The ciphertext of all parameters must be a 32-character lowercase MD5 string.</li>
     * <li>Different MD5 tools may generate different ciphertexts. If the API call succeeds before encryption but fails after encryption, try using a different MD5 tool.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The fixed value. Valid value: BANK_CARD_N_META.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BANK_CARD_N_META</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product type. Valid values:</p>
     * <ul>
     * <li>BANK_CARD_2_META: Verifies the bank card number and name.</li>
     * <li>BANK_CARD_3_META: Verifies the bank card number, name, and ID card number.</li>
     * <li>BANK_CARD_4_META: Verifies the bank card number, name, ID card number, and mobile phone number.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BANK_CARD_4_META</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The name.</p>
     * <ul>
     * <li>If paramType is set to normal, enter the plaintext name.</li>
     * <li>If paramType is set to md5, enter the 32-character lowercase MD5 hash of the first character of the name, followed by the plaintext of the remaining characters.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang*</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The verification mode. Valid value: VERIFY_BANK_CARD. This value indicates the bank card authentication mode, which verifies whether the provided bank card number matches the real name, ID card number, and mobile phone number of the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VERIFY_BANK_CARD</p>
     */
    @NameInMap("VerifyMode")
    public String verifyMode;

    public static BankMetaVerifyIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        BankMetaVerifyIntlRequest self = new BankMetaVerifyIntlRequest();
        return TeaModel.build(map, self);
    }

    public BankMetaVerifyIntlRequest setBankCard(String bankCard) {
        this.bankCard = bankCard;
        return this;
    }
    public String getBankCard() {
        return this.bankCard;
    }

    public BankMetaVerifyIntlRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public BankMetaVerifyIntlRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public BankMetaVerifyIntlRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public BankMetaVerifyIntlRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public BankMetaVerifyIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public BankMetaVerifyIntlRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public BankMetaVerifyIntlRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public BankMetaVerifyIntlRequest setVerifyMode(String verifyMode) {
        this.verifyMode = verifyMode;
        return this;
    }
    public String getVerifyMode() {
        return this.verifyMode;
    }

}
