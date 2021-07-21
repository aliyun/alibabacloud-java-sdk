// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddAuthorizationResponseBody extends TeaModel {
    @NameInMap("success")
    public Boolean success;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("data")
    public AddAuthorizationResponseBodyData data;

    public static AddAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAuthorizationResponseBody self = new AddAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAuthorizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddAuthorizationResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public AddAuthorizationResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public AddAuthorizationResponseBody setData(AddAuthorizationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddAuthorizationResponseBodyData getData() {
        return this.data;
    }

    public static class AddAuthorizationResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static AddAuthorizationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddAuthorizationResponseBodyData self = new AddAuthorizationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddAuthorizationResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
