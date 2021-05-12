// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetFoundationVersionResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<FoundationVersion> data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetFoundationVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFoundationVersionResponseBody self = new GetFoundationVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFoundationVersionResponseBody setData(java.util.List<FoundationVersion> data) {
        this.data = data;
        return this;
    }
    public java.util.List<FoundationVersion> getData() {
        return this.data;
    }

    public GetFoundationVersionResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetFoundationVersionResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetFoundationVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
