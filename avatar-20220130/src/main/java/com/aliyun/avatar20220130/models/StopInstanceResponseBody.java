// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class StopInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StopInstanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static StopInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceResponseBody self = new StopInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopInstanceResponseBody setData(StopInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopInstanceResponseBodyData getData() {
        return this.data;
    }

    public StopInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StopInstanceResponseBodyData extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("SessionId")
        public String sessionId;

        public static StopInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopInstanceResponseBodyData self = new StopInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopInstanceResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public StopInstanceResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
