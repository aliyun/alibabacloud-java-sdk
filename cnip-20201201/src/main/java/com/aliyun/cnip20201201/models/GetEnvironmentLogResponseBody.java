// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetEnvironmentLogResponseBody extends TeaModel {
    @NameInMap("data")
    public GetEnvironmentLogResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetEnvironmentLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentLogResponseBody self = new GetEnvironmentLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentLogResponseBody setData(GetEnvironmentLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentLogResponseBodyData getData() {
        return this.data;
    }

    public GetEnvironmentLogResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetEnvironmentLogResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetEnvironmentLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEnvironmentLogResponseBodyData extends TeaModel {
        @NameInMap("end")
        public Boolean end;

        @NameInMap("message")
        public String message;

        public static GetEnvironmentLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentLogResponseBodyData self = new GetEnvironmentLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentLogResponseBodyData setEnd(Boolean end) {
            this.end = end;
            return this;
        }
        public Boolean getEnd() {
            return this.end;
        }

        public GetEnvironmentLogResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
