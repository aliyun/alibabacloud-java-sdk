// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateEnvironmentResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateEnvironmentResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static CreateEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentResponseBody self = new CreateEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentResponseBody setData(CreateEnvironmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEnvironmentResponseBodyData getData() {
        return this.data;
    }

    public CreateEnvironmentResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateEnvironmentResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateEnvironmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEnvironmentResponseBodyData extends TeaModel {
        @NameInMap("uid")
        public String uid;

        public static CreateEnvironmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentResponseBodyData self = new CreateEnvironmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
