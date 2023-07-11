// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendCommandResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendCommandResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCommandResponseBody self = new SendCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public SendCommandResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendCommandResponseBody setData(SendCommandResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendCommandResponseBodyData getData() {
        return this.data;
    }

    public SendCommandResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendCommandResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendCommandResponseBodyData extends TeaModel {
        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("UniqueCode")
        public String uniqueCode;

        public static SendCommandResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendCommandResponseBodyData self = new SendCommandResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendCommandResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public SendCommandResponseBodyData setUniqueCode(String uniqueCode) {
            this.uniqueCode = uniqueCode;
            return this;
        }
        public String getUniqueCode() {
            return this.uniqueCode;
        }

    }

}
