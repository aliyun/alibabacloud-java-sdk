// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateAuthKeyRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("UserDeviceId")
    public String userDeviceId;

    @NameInMap("Test")
    public Boolean test;

    @NameInMap("AuthYears")
    public Integer authYears;

    public static CreateAuthKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthKeyRequest self = new CreateAuthKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthKeyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateAuthKeyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateAuthKeyRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateAuthKeyRequest setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
        return this;
    }
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

    public CreateAuthKeyRequest setTest(Boolean test) {
        this.test = test;
        return this;
    }
    public Boolean getTest() {
        return this.test;
    }

    public CreateAuthKeyRequest setAuthYears(Integer authYears) {
        this.authYears = authYears;
        return this;
    }
    public Integer getAuthYears() {
        return this.authYears;
    }

}
