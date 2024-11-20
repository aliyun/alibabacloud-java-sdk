// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Mobile3MetaSimpleVerifyRequest extends TeaModel {
    @NameInMap("IdentifyNum")
    public String identifyNum;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("ParamType")
    public String paramType;

    @NameInMap("UserName")
    public String userName;

    public static Mobile3MetaSimpleVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        Mobile3MetaSimpleVerifyRequest self = new Mobile3MetaSimpleVerifyRequest();
        return TeaModel.build(map, self);
    }

    public Mobile3MetaSimpleVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Mobile3MetaSimpleVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Mobile3MetaSimpleVerifyRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Mobile3MetaSimpleVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
