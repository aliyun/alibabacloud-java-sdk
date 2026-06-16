// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SendChatMessageResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public SendChatMessageResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE65CE1F-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong>**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static SendChatMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendChatMessageResponseBody self = new SendChatMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendChatMessageResponseBody setData(SendChatMessageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendChatMessageResponseBodyData getData() {
        return this.data;
    }

    public SendChatMessageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SendChatMessageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SendChatMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendChatMessageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class SendChatMessageResponseBodyData extends TeaModel {
        /**
         * <p>AgentId</p>
         * 
         * <strong>example:</strong>
         * <p>3jqqdiuxun******</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>Message</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>SessionId</p>
         * 
         * <strong>example:</strong>
         * <p>6zbqbho********</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static SendChatMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendChatMessageResponseBodyData self = new SendChatMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendChatMessageResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public SendChatMessageResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SendChatMessageResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SendChatMessageResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
