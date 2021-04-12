// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CommonRequestRequest extends TeaModel {
    // A short description of struct
    @NameInMap("Api")
    public String api;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("Params")
    public String params;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("BizOrderNo")
    public String bizOrderNo;

    public static CommonRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CommonRequestRequest self = new CommonRequestRequest();
        return TeaModel.build(map, self);
    }

    public CommonRequestRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    public CommonRequestRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public CommonRequestRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public CommonRequestRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CommonRequestRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

}
