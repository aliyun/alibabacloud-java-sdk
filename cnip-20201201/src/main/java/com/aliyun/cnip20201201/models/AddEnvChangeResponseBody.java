// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddEnvChangeResponseBody extends TeaModel {
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("data")
    public AddEnvChangeResponseBodyData data;

    public static AddEnvChangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddEnvChangeResponseBody self = new AddEnvChangeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddEnvChangeResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public AddEnvChangeResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public AddEnvChangeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddEnvChangeResponseBody setData(AddEnvChangeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddEnvChangeResponseBodyData getData() {
        return this.data;
    }

    public static class AddEnvChangeResponseBodyData extends TeaModel {
        // 环境升级变更记录uid
        @NameInMap("uid")
        public String uid;

        public static AddEnvChangeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddEnvChangeResponseBodyData self = new AddEnvChangeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddEnvChangeResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
