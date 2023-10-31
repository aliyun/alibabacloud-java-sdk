// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyIntlRequest extends TeaModel {
    @NameInMap("IdentifyNum")
    public String identifyNum;

    @NameInMap("ParamType")
    public String paramType;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("UserName")
    public String userName;

    public static Id2MetaVerifyIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaVerifyIntlRequest self = new Id2MetaVerifyIntlRequest();
        return TeaModel.build(map, self);
    }

    public Id2MetaVerifyIntlRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public Id2MetaVerifyIntlRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public Id2MetaVerifyIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public Id2MetaVerifyIntlRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
