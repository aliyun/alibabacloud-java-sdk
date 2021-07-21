// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionPlatformsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<Platform> data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetProductVersionPlatformsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPlatformsResponseBody self = new GetProductVersionPlatformsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionPlatformsResponseBody setData(java.util.List<Platform> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Platform> getData() {
        return this.data;
    }

    public GetProductVersionPlatformsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetProductVersionPlatformsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetProductVersionPlatformsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
