// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendTextResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendTextResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendTextResponseBody self = new SendTextResponseBody();
        return TeaModel.build(map, self);
    }

    public SendTextResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendTextResponseBody setData(SendTextResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendTextResponseBodyData getData() {
        return this.data;
    }

    public SendTextResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendTextResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendTextResponseBodyData extends TeaModel {
        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("UniqueCode")
        public String uniqueCode;

        public static SendTextResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendTextResponseBodyData self = new SendTextResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendTextResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public SendTextResponseBodyData setUniqueCode(String uniqueCode) {
            this.uniqueCode = uniqueCode;
            return this;
        }
        public String getUniqueCode() {
            return this.uniqueCode;
        }

    }

}
