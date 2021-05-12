// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListFoundationVersionsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<FoundationVersion> data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ListFoundationVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFoundationVersionsResponseBody self = new ListFoundationVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFoundationVersionsResponseBody setData(java.util.List<FoundationVersion> data) {
        this.data = data;
        return this;
    }
    public java.util.List<FoundationVersion> getData() {
        return this.data;
    }

    public ListFoundationVersionsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListFoundationVersionsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListFoundationVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
