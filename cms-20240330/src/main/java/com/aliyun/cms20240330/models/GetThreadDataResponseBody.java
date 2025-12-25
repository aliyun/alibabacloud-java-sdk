// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetThreadDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeName;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("messages")
    public java.util.List<GetThreadDataResponseBodyMessages> messages;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>aliding_thread_448d05c048a3481f8c19bc1a6038f8f6</p>
     */
    @NameInMap("threadId")
    public String threadId;

    public static GetThreadDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThreadDataResponseBody self = new GetThreadDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThreadDataResponseBody setDigitalEmployeeName(String digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public GetThreadDataResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public GetThreadDataResponseBody setMessages(java.util.List<GetThreadDataResponseBodyMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<GetThreadDataResponseBodyMessages> getMessages() {
        return this.messages;
    }

    public GetThreadDataResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetThreadDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThreadDataResponseBody setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public static class GetThreadDataResponseBodyMessages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>205190712643664705</p>
         */
        @NameInMap("callerUid")
        public String callerUid;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("digitalEmployeeName")
        public String digitalEmployeeName;

        @NameInMap("items")
        public java.util.List<java.util.Map<String, ?>> items;

        /**
         * <strong>example:</strong>
         * <p>7F0000012B1B668BC3D59A7EF8A00063</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <strong>example:</strong>
         * <p>1560138499250147</p>
         */
        @NameInMap("ownerUid")
        public String ownerUid;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("parentMessageId")
        public String parentMessageId;

        /**
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>jr-c2b000da0e41b543</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <strong>example:</strong>
         * <p>98958d65-6cdb-4f40-8f46-f5e49f13c860</p>
         */
        @NameInMap("threadId")
        public String threadId;

        /**
         * <strong>example:</strong>
         * <p>1765359068</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        /**
         * <strong>example:</strong>
         * <p>3b5287ba17572104610774286d0096</p>
         */
        @NameInMap("traceId")
        public String traceId;

        @NameInMap("variables")
        public java.util.Map<String, String> variables;

        public static GetThreadDataResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            GetThreadDataResponseBodyMessages self = new GetThreadDataResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public GetThreadDataResponseBodyMessages setCallerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }
        public String getCallerUid() {
            return this.callerUid;
        }

        public GetThreadDataResponseBodyMessages setDigitalEmployeeName(String digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }
        public String getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        public GetThreadDataResponseBodyMessages setItems(java.util.List<java.util.Map<String, ?>> items) {
            this.items = items;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
        }

        public GetThreadDataResponseBodyMessages setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public GetThreadDataResponseBodyMessages setOwnerUid(String ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public String getOwnerUid() {
            return this.ownerUid;
        }

        public GetThreadDataResponseBodyMessages setParentMessageId(String parentMessageId) {
            this.parentMessageId = parentMessageId;
            return this;
        }
        public String getParentMessageId() {
            return this.parentMessageId;
        }

        public GetThreadDataResponseBodyMessages setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetThreadDataResponseBodyMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetThreadDataResponseBodyMessages setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public GetThreadDataResponseBodyMessages setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

        public GetThreadDataResponseBodyMessages setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetThreadDataResponseBodyMessages setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetThreadDataResponseBodyMessages setVariables(java.util.Map<String, String> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.Map<String, String> getVariables() {
            return this.variables;
        }

    }

}
