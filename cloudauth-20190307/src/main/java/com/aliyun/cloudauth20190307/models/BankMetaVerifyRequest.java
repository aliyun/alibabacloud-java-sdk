// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class BankMetaVerifyRequest extends TeaModel {
    /**
     * <p>Bank card number.</p>
     * <ul>
     * <li>When <code>paramType</code> is <code>normal</code>, enter the plain text bank card number.</li>
     * <li>When <code>paramType</code> is <code>md5</code>, enter the part of the card number except the last 6 digits in plain text + the last 6 digits encrypted with MD5 (32 lowercase).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>610*************1181</p>
     */
    @NameInMap("BankCard")
    public String bankCard;

    /**
     * <p>ID number.</p>
     * <ul>
     * <li>When <code>ProductType</code> is <code>BANK_CARD_3_META</code>, this field is required.</li>
     * <li>When <code>paramType</code> is <code>normal</code>, enter the plain text ID number.</li>
     * <li>When <code>paramType</code> is <code>md5</code>, enter the first 6 digits of the ID number in plain text + the birth date encrypted with MD5 (32 lowercase MD5) + the last 4 digits of the ID number.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>429001********8211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>Identity type.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>Mobile phone number.</p>
     * <ul>
     * <li>When <code>ProductType</code> is <code>BANK_CARD_4_META</code>, this field is required.</li>
     * <li>When <code>paramType</code> is <code>normal</code>, enter the plain text mobile phone number.</li>
     * <li>When <code>paramType</code> is <code>md5</code>, enter the mobile phone number (32 lowercase MD5).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>138******11</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>Parameter type:</p>
     * <ul>
     * <li>normal: Unencrypted.</li>
     * <li>md5: MD5 encrypted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>Product type to call:</p>
     * <ul>
     * <li>BANK_CARD_2_META: Bank card number + name verification.</li>
     * <li>BANK_CARD_3_META: Bank card number + name + ID number verification.</li>
     * <li>BANK_CARD_4_META: Bank card number + name + ID number + mobile phone number verification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BANK_CARD_2_META</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>Name.</p>
     * <ul>
     * <li>When <code>paramType</code> is <code>normal</code>, enter the plain text name.</li>
     * <li>When <code>paramType</code> is <code>md5</code>, encrypt the first character of the name with MD5 (32 lowercase MD5) + the rest of the name in plain text.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>张*</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>VERIFY_BANK_CARD: Bank card authentication mode. It indicates whether the provided bank card number matches the user\&quot;s real name, ID number, and mobile phone number.</p>
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
