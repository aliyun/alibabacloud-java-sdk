// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddEnvironmentProductVersionResponseBody extends TeaModel {
    @NameInMap("data")
    public AddEnvironmentProductVersionResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static AddEnvironmentProductVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentProductVersionResponseBody self = new AddEnvironmentProductVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentProductVersionResponseBody setData(AddEnvironmentProductVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddEnvironmentProductVersionResponseBodyData getData() {
        return this.data;
    }

    public AddEnvironmentProductVersionResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public AddEnvironmentProductVersionResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public AddEnvironmentProductVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddEnvironmentProductVersionResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static AddEnvironmentProductVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddEnvironmentProductVersionResponseBodyData self = new AddEnvironmentProductVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddEnvironmentProductVersionResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
