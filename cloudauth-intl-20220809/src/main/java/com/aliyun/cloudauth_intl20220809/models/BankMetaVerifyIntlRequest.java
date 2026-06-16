// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class BankMetaVerifyIntlRequest extends TeaModel {
    /**
     * <p>The bank card number.</p>
     * <ul>
     * <li>If paramType is set to normal, enter the bank card number in plaintext.</li>
     * <li>If paramType is set to md5, provide the plaintext of all digits except the last 6 digits + the MD5 value (32-character lowercase) of the last 6 digits.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>● 明文：12345678******
     * ● 密文：
     * 12345678f8ee21920e37807b43e7e912ab829b6e</p>
     */
    @NameInMap("BankCard")
    public String bankCard;

    /**
     * <p>The ID document number.</p>
     * <ul>
     * <li>If paramType is set to normal, enter the ID document number in plaintext.</li>
     * <li>If paramType is set to md5:<ul>
     * <li>For ID cards: the first 6 digits (plaintext) + date of birth (ciphertext) + the last 4 digits (plaintext).</li>
     * <li>For other documents: the last 2 characters are MD5-encrypted.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>Important:
     * This parameter is required when ProductType is set to one of the following values:</p>
     * <ul>
     * <li>BANK_CARD_3_META</li>
     * <li>BANK_CARD_4_META.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>● 明文：429001********8211
     * ● 密文：
     * 42900132fa7bcd874161bea8ec8fd98f390ec98211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The ID document type. If left empty, the default value is ID card. For other document types, refer to the table below.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The phone number.</p>
     * <ul>
     * <li>If paramType is set to normal, enter the phone number in plaintext.</li>
     * <li>If paramType is set to md5, enter the phone number in ciphertext.</li>
     * </ul>
     * <p>Important:</p>
     * <ul>
     * <li>This parameter is required when ProductType is set to BANK_CARD_4_META.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>● 明文：186****2055
     * ● 密文：
     * 849169cd3b20621c1c78bd61a11a4fc2</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The encryption method. Valid values:</p>
     * <ul>
     * <li>normal: no encryption</li>
     * <li>md5: MD5 encryption</li>
     * </ul>
     * <p>Important:</p>
     * <ul>
     * <li>All encrypted parameter values must be 32-character lowercase MD5 strings.</li>
     * <li>Different MD5 tools may produce different ciphertext. If the API call succeeds before encryption but fails after encryption, try a different MD5 tool.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>Fixed value: BANK_CARD_N_META.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BANK_CARD_N_META</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product type to call. Valid values:</p>
     * <ul>
     * <li>BANK_CARD_2_META: Bank card number + name verification.</li>
     * <li>BANK_CARD_3_META: Bank card number + name + ID card number verification.</li>
     * <li>BANK_CARD_4_META: Bank card number + name + ID card number + phone number verification.</li>
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
     * <li>If paramType is set to normal, enter the name in plaintext.</li>
     * <li>If paramType is set to md5, provide the MD5-encrypted first character of the name (32-character lowercase MD5) + the plaintext of the remaining characters.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>张*</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>VERIFY_BANK_CARD: bank card authentication mode. Indicates whether the provided bank card number matches the user\&quot;s real name, ID card number, and phone number.</p>
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
