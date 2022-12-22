// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendMessageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendMessageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static SendMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMessageResponseBody self = new SendMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendMessageResponseBody setData(SendMessageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendMessageResponseBodyData getData() {
        return this.data;
    }

    public SendMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendMessageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendMessageResponseBodyData extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("SessionId")
        public String sessionId;

        public static SendMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendMessageResponseBodyData self = new SendMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendMessageResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public SendMessageResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
