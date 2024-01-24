// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class VerifyBankElementAdvanceRequest extends TeaModel {
    @NameInMap("BankCardFile")
    public java.io.InputStream bankCardFileObject;

    @NameInMap("BankCardNo")
    public String bankCardNo;

    @NameInMap("BankCardUrl")
    public String bankCardUrl;

    @NameInMap("IdName")
    public String idName;

    @NameInMap("IdNo")
    public String idNo;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    @NameInMap("SceneId")
    public Long sceneId;

    public static VerifyBankElementAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyBankElementAdvanceRequest self = new VerifyBankElementAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public VerifyBankElementAdvanceRequest setBankCardFileObject(java.io.InputStream bankCardFileObject) {
        this.bankCardFileObject = bankCardFileObject;
        return this;
    }
    public java.io.InputStream getBankCardFileObject() {
        return this.bankCardFileObject;
    }

    public VerifyBankElementAdvanceRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public VerifyBankElementAdvanceRequest setBankCardUrl(String bankCardUrl) {
        this.bankCardUrl = bankCardUrl;
        return this;
    }
    public String getBankCardUrl() {
        return this.bankCardUrl;
    }

    public VerifyBankElementAdvanceRequest setIdName(String idName) {
        this.idName = idName;
        return this;
    }
    public String getIdName() {
        return this.idName;
    }

    public VerifyBankElementAdvanceRequest setIdNo(String idNo) {
        this.idNo = idNo;
        return this;
    }
    public String getIdNo() {
        return this.idNo;
    }

    public VerifyBankElementAdvanceRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public VerifyBankElementAdvanceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public VerifyBankElementAdvanceRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public VerifyBankElementAdvanceRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
