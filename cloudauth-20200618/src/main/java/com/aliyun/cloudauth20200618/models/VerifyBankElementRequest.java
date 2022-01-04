// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class VerifyBankElementRequest extends TeaModel {
    @NameInMap("BankCardFile")
    public String bankCardFile;

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

    public static VerifyBankElementRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyBankElementRequest self = new VerifyBankElementRequest();
        return TeaModel.build(map, self);
    }

    public VerifyBankElementRequest setBankCardFile(String bankCardFile) {
        this.bankCardFile = bankCardFile;
        return this;
    }
    public String getBankCardFile() {
        return this.bankCardFile;
    }

    public VerifyBankElementRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public VerifyBankElementRequest setBankCardUrl(String bankCardUrl) {
        this.bankCardUrl = bankCardUrl;
        return this;
    }
    public String getBankCardUrl() {
        return this.bankCardUrl;
    }

    public VerifyBankElementRequest setIdName(String idName) {
        this.idName = idName;
        return this;
    }
    public String getIdName() {
        return this.idName;
    }

    public VerifyBankElementRequest setIdNo(String idNo) {
        this.idNo = idNo;
        return this;
    }
    public String getIdNo() {
        return this.idNo;
    }

    public VerifyBankElementRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public VerifyBankElementRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public VerifyBankElementRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public VerifyBankElementRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
