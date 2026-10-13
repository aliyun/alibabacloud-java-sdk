// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMemoryResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The updated memory.</p>
     */
    @NameInMap("data")
    public UpdateMemoryResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01A00000-0000-0000-0000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryResponseBody self = new UpdateMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMemoryResponseBody setData(UpdateMemoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateMemoryResponseBodyData getData() {
        return this.data;
    }

    public UpdateMemoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateMemoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMemoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMemoryResponseBodyDataContent extends TeaModel {
        /**
         * <p>The memory text.</p>
         * 
         * <strong>example:</strong>
         * <p>The user enjoys hiking</p>
         */
        @NameInMap("text")
        public String text;

        public static UpdateMemoryResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateMemoryResponseBodyDataContent self = new UpdateMemoryResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public UpdateMemoryResponseBodyDataContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class UpdateMemoryResponseBodyDataScope extends TeaModel {
        /**
         * <p>The agent ID. The length is limited to 1 to 128 UTF-8 bytes. The ID cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with an agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The session ID. The length is limited to 1 to 128 UTF-8 bytes. The ID cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with a session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The user ID. The length is limited to 1 to 128 UTF-8 bytes. The ID cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with a user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static UpdateMemoryResponseBodyDataScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateMemoryResponseBodyDataScope self = new UpdateMemoryResponseBodyDataScope();
            return TeaModel.build(map, self);
        }

        public UpdateMemoryResponseBodyDataScope setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public UpdateMemoryResponseBodyDataScope setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public UpdateMemoryResponseBodyDataScope setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UpdateMemoryResponseBodyData extends TeaModel {
        /**
         * <p>The memory content.</p>
         */
        @NameInMap("content")
        public UpdateMemoryResponseBodyDataContent content;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The long-term memory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mem-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("memoryId")
        public String memoryId;

        /**
         * <p>The memory metadata.</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>The memory scope.</p>
         */
        @NameInMap("scope")
        public UpdateMemoryResponseBodyDataScope scope;

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:05:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static UpdateMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMemoryResponseBodyData self = new UpdateMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateMemoryResponseBodyData setContent(UpdateMemoryResponseBodyDataContent content) {
            this.content = content;
            return this;
        }
        public UpdateMemoryResponseBodyDataContent getContent() {
            return this.content;
        }

        public UpdateMemoryResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateMemoryResponseBodyData setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

        public UpdateMemoryResponseBodyData setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public UpdateMemoryResponseBodyData setScope(UpdateMemoryResponseBodyDataScope scope) {
            this.scope = scope;
            return this;
        }
        public UpdateMemoryResponseBodyDataScope getScope() {
            return this.scope;
        }

        public UpdateMemoryResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
