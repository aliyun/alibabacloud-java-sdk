// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendVamlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendVamlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendVamlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendVamlResponseBody self = new SendVamlResponseBody();
        return TeaModel.build(map, self);
    }

    public SendVamlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendVamlResponseBody setData(SendVamlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendVamlResponseBodyData getData() {
        return this.data;
    }

    public SendVamlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendVamlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendVamlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendVamlResponseBodyData extends TeaModel {
        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("UniqueCode")
        public String uniqueCode;

        public static SendVamlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendVamlResponseBodyData self = new SendVamlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendVamlResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public SendVamlResponseBodyData setUniqueCode(String uniqueCode) {
            this.uniqueCode = uniqueCode;
            return this;
        }
        public String getUniqueCode() {
            return this.uniqueCode;
        }

    }

}
