// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartChatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StartChatResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartChatResponseBody self = new StartChatResponseBody();
        return TeaModel.build(map, self);
    }

    public StartChatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartChatResponseBody setData(StartChatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartChatResponseBodyData getData() {
        return this.data;
    }

    public StartChatResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StartChatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartChatResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>$23086709$EAUNIT</p>
         */
        @NameInMap("ChatConversationId")
        public String chatConversationId;

        /**
         * <strong>example:</strong>
         * <p>chat-525523618219921408</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static StartChatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartChatResponseBodyData self = new StartChatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartChatResponseBodyData setChatConversationId(String chatConversationId) {
            this.chatConversationId = chatConversationId;
            return this;
        }
        public String getChatConversationId() {
            return this.chatConversationId;
        }

        public StartChatResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
