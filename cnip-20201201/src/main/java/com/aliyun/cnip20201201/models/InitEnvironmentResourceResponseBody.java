// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class InitEnvironmentResourceResponseBody extends TeaModel {
    @NameInMap("data")
    public InitEnvironmentResourceResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static InitEnvironmentResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitEnvironmentResourceResponseBody self = new InitEnvironmentResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public InitEnvironmentResourceResponseBody setData(InitEnvironmentResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InitEnvironmentResourceResponseBodyData getData() {
        return this.data;
    }

    public InitEnvironmentResourceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public InitEnvironmentResourceResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public InitEnvironmentResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InitEnvironmentResourceResponseBodyData extends TeaModel {
        @NameInMap("status")
        public String status;

        public static InitEnvironmentResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InitEnvironmentResourceResponseBodyData self = new InitEnvironmentResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InitEnvironmentResourceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
