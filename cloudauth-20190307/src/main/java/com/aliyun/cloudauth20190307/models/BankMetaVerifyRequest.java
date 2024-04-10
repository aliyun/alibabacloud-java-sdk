// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class BankMetaVerifyRequest extends TeaModel {
    @NameInMap("BankCard")
    public String bankCard;

    @NameInMap("IdentifyNum")
    public String identifyNum;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("ParamType")
    public String paramType;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("UserName")
    public String userName;

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
