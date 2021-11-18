// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CheckNumberAvaliableResponseBody extends TeaModel {
    @NameInMap("CalleeAvaliable")
    public CheckNumberAvaliableResponseBodyCalleeAvaliable calleeAvaliable;

    @NameInMap("CallerAvaliable")
    public CheckNumberAvaliableResponseBodyCallerAvaliable callerAvaliable;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckNumberAvaliableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckNumberAvaliableResponseBody self = new CheckNumberAvaliableResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckNumberAvaliableResponseBody setCalleeAvaliable(CheckNumberAvaliableResponseBodyCalleeAvaliable calleeAvaliable) {
        this.calleeAvaliable = calleeAvaliable;
        return this;
    }
    public CheckNumberAvaliableResponseBodyCalleeAvaliable getCalleeAvaliable() {
        return this.calleeAvaliable;
    }

    public CheckNumberAvaliableResponseBody setCallerAvaliable(CheckNumberAvaliableResponseBodyCallerAvaliable callerAvaliable) {
        this.callerAvaliable = callerAvaliable;
        return this;
    }
    public CheckNumberAvaliableResponseBodyCallerAvaliable getCallerAvaliable() {
        return this.callerAvaliable;
    }

    public CheckNumberAvaliableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckNumberAvaliableResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CheckNumberAvaliableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckNumberAvaliableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckNumberAvaliableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckNumberAvaliableResponseBodyCalleeAvaliable extends TeaModel {
        @NameInMap("Avaliable")
        public Boolean avaliable;

        @NameInMap("Reason")
        public String reason;

        public static CheckNumberAvaliableResponseBodyCalleeAvaliable build(java.util.Map<String, ?> map) throws Exception {
            CheckNumberAvaliableResponseBodyCalleeAvaliable self = new CheckNumberAvaliableResponseBodyCalleeAvaliable();
            return TeaModel.build(map, self);
        }

        public CheckNumberAvaliableResponseBodyCalleeAvaliable setAvaliable(Boolean avaliable) {
            this.avaliable = avaliable;
            return this;
        }
        public Boolean getAvaliable() {
            return this.avaliable;
        }

        public CheckNumberAvaliableResponseBodyCalleeAvaliable setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class CheckNumberAvaliableResponseBodyCallerAvaliable extends TeaModel {
        @NameInMap("Avaliable")
        public Boolean avaliable;

        @NameInMap("Reason")
        public String reason;

        public static CheckNumberAvaliableResponseBodyCallerAvaliable build(java.util.Map<String, ?> map) throws Exception {
            CheckNumberAvaliableResponseBodyCallerAvaliable self = new CheckNumberAvaliableResponseBodyCallerAvaliable();
            return TeaModel.build(map, self);
        }

        public CheckNumberAvaliableResponseBodyCallerAvaliable setAvaliable(Boolean avaliable) {
            this.avaliable = avaliable;
            return this;
        }
        public Boolean getAvaliable() {
            return this.avaliable;
        }

        public CheckNumberAvaliableResponseBodyCallerAvaliable setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
