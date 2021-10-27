// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateAuthKeyRequest extends TeaModel {
    @NameInMap("AuthYears")
    public Integer authYears;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Test")
    public Boolean test;

    @NameInMap("UserDeviceId")
    public String userDeviceId;

    public static CreateAuthKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthKeyRequest self = new CreateAuthKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthKeyRequest setAuthYears(Integer authYears) {
        this.authYears = authYears;
        return this;
    }
    public Integer getAuthYears() {
        return this.authYears;
    }

    public CreateAuthKeyRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateAuthKeyRequest setTest(Boolean test) {
        this.test = test;
        return this;
    }
    public Boolean getTest() {
        return this.test;
    }

    public CreateAuthKeyRequest setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
        return this;
    }
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

}
