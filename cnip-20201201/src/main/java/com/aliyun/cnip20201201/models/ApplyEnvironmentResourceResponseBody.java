// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ApplyEnvironmentResourceResponseBody extends TeaModel {
    @NameInMap("data")
    public ApplyEnvironmentResourceResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static ApplyEnvironmentResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyEnvironmentResourceResponseBody self = new ApplyEnvironmentResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyEnvironmentResourceResponseBody setData(ApplyEnvironmentResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ApplyEnvironmentResourceResponseBodyData getData() {
        return this.data;
    }

    public ApplyEnvironmentResourceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ApplyEnvironmentResourceResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ApplyEnvironmentResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplyEnvironmentResourceResponseBodyData extends TeaModel {
        @NameInMap("status")
        public String status;

        public static ApplyEnvironmentResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplyEnvironmentResourceResponseBodyData self = new ApplyEnvironmentResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplyEnvironmentResourceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
