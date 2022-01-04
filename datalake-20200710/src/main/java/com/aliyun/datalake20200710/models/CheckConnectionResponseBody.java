// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CheckConnectionResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckConnectionResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckConnectionResponseBody self = new CheckConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckConnectionResponseBody setData(CheckConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckConnectionResponseBodyData getData() {
        return this.data;
    }

    public CheckConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckConnectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckConnectionResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("IsValid")
        public Boolean isValid;

        @NameInMap("Msg")
        public String msg;

        public static CheckConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckConnectionResponseBodyData self = new CheckConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckConnectionResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CheckConnectionResponseBodyData setIsValid(Boolean isValid) {
            this.isValid = isValid;
            return this;
        }
        public Boolean getIsValid() {
            return this.isValid;
        }

        public CheckConnectionResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

    }

}
