// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListFoundationVersionsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListFoundationVersionsResponseBodyData data;

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

    public ListFoundationVersionsResponseBody setData(ListFoundationVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFoundationVersionsResponseBodyData getData() {
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

    public static class ListFoundationVersionsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<FoundationVersion> list;

        public static ListFoundationVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFoundationVersionsResponseBodyData self = new ListFoundationVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFoundationVersionsResponseBodyData setList(java.util.List<FoundationVersion> list) {
            this.list = list;
            return this;
        }
        public java.util.List<FoundationVersion> getList() {
            return this.list;
        }

    }

}
