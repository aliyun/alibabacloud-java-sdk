// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class AddMemoriesRequest extends TeaModel {
    /**
     * <p>The memory write request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public AddMemoriesRequestBody body;

    public static AddMemoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMemoriesRequest self = new AddMemoriesRequest();
        return TeaModel.build(map, self);
    }

    public AddMemoriesRequest setBody(AddMemoriesRequestBody body) {
        this.body = body;
        return this;
    }
    public AddMemoriesRequestBody getBody() {
        return this.body;
    }

    public static class AddMemoriesRequestBodyMessages extends TeaModel {
        /**
         * <p>The message content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The user likes hiking</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The message role.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static AddMemoriesRequestBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            AddMemoriesRequestBodyMessages self = new AddMemoriesRequestBodyMessages();
            return TeaModel.build(map, self);
        }

        public AddMemoriesRequestBodyMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AddMemoriesRequestBodyMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class AddMemoriesRequestBodyScope extends TeaModel {
        /**
         * <p>The agent ID. The length is limited to 1 to 128 UTF-8 bytes. The ID cannot contain a forward slash (/) or an asterisk (*).</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The session ID. The length is limited to 1 to 128 UTF-8 bytes. The ID cannot contain a forward slash (/) or an asterisk (*).</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The user ID. The length is limited to 1 to 128 UTF-8 bytes. The ID cannot contain a forward slash (/) or an asterisk (*).</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static AddMemoriesRequestBodyScope build(java.util.Map<String, ?> map) throws Exception {
            AddMemoriesRequestBodyScope self = new AddMemoriesRequestBodyScope();
            return TeaModel.build(map, self);
        }

        public AddMemoriesRequestBodyScope setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public AddMemoriesRequestBodyScope setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public AddMemoriesRequestBodyScope setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class AddMemoriesRequestBody extends TeaModel {
        /**
         * <p>The list of messages. You must provide either this parameter or Text, but not both. You can specify 1 to 20 messages, and the total size of Content must not exceed 32,000 UTF-8 bytes.</p>
         */
        @NameInMap("messages")
        public java.util.List<AddMemoriesRequestBodyMessages> messages;

        /**
         * <p>The string key-value metadata. You can specify up to 16 keys. The maximum length of a key is 64 characters, and the maximum length of a value is 1,024 characters.</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>The time reference point for this batch of messages or text. The time must be in RFC 3339 format with a time zone and support fractional seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-08T13:56:00+08:00</p>
         */
        @NameInMap("referenceTime")
        public String referenceTime;

        /**
         * <p>The write scope. UserId, AgentId, and SessionId are all optional.</p>
         */
        @NameInMap("scope")
        public AddMemoriesRequestBodyScope scope;

        /**
         * <p>Specifies whether to synchronously wait for memory extraction to complete. Default value: true.</p>
         */
        @NameInMap("sync")
        public Boolean sync;

        /**
         * <p>The text to be written directly. You must provide either this parameter or Messages, but not both. The text size must not exceed 32,000 UTF-8 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>The user likes hiking</p>
         */
        @NameInMap("text")
        public String text;

        public static AddMemoriesRequestBody build(java.util.Map<String, ?> map) throws Exception {
            AddMemoriesRequestBody self = new AddMemoriesRequestBody();
            return TeaModel.build(map, self);
        }

        public AddMemoriesRequestBody setMessages(java.util.List<AddMemoriesRequestBodyMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<AddMemoriesRequestBodyMessages> getMessages() {
            return this.messages;
        }

        public AddMemoriesRequestBody setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public AddMemoriesRequestBody setReferenceTime(String referenceTime) {
            this.referenceTime = referenceTime;
            return this;
        }
        public String getReferenceTime() {
            return this.referenceTime;
        }

        public AddMemoriesRequestBody setScope(AddMemoriesRequestBodyScope scope) {
            this.scope = scope;
            return this;
        }
        public AddMemoriesRequestBodyScope getScope() {
            return this.scope;
        }

        public AddMemoriesRequestBody setSync(Boolean sync) {
            this.sync = sync;
            return this;
        }
        public Boolean getSync() {
            return this.sync;
        }

        public AddMemoriesRequestBody setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
