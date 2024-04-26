// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyRequest extends TeaModel {
    @NameInMap("CertNum")
    public String certNum;

    @NameInMap("CredName")
    public String credName;

    @NameInMap("CredType")
    public String credType;

    @NameInMap("IdentifyNum")
    public String identifyNum;

    @NameInMap("ImageContext")
    public String imageContext;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("IsCheck")
    public String isCheck;

    @NameInMap("IsOCR")
    public String isOCR;

    @NameInMap("UserName")
    public String userName;

    public static CredentialVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CredentialVerifyRequest self = new CredentialVerifyRequest();
        return TeaModel.build(map, self);
    }

    public CredentialVerifyRequest setCertNum(String certNum) {
        this.certNum = certNum;
        return this;
    }
    public String getCertNum() {
        return this.certNum;
    }

    public CredentialVerifyRequest setCredName(String credName) {
        this.credName = credName;
        return this;
    }
    public String getCredName() {
        return this.credName;
    }

    public CredentialVerifyRequest setCredType(String credType) {
        this.credType = credType;
        return this;
    }
    public String getCredType() {
        return this.credType;
    }

    public CredentialVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public CredentialVerifyRequest setImageContext(String imageContext) {
        this.imageContext = imageContext;
        return this;
    }
    public String getImageContext() {
        return this.imageContext;
    }

    public CredentialVerifyRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CredentialVerifyRequest setIsCheck(String isCheck) {
        this.isCheck = isCheck;
        return this;
    }
    public String getIsCheck() {
        return this.isCheck;
    }

    public CredentialVerifyRequest setIsOCR(String isOCR) {
        this.isOCR = isOCR;
        return this;
    }
    public String getIsOCR() {
        return this.isOCR;
    }

    public CredentialVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
