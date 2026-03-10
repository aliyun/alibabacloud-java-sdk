// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AddMemoriesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>952730733889060865</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>mm_480d961a1b5e4efe84603f4cbc0f</p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("asyncMode")
    public Boolean asyncMode;

    /**
     * <strong>example:</strong>
     * <p>Your custom instructions here</p>
     */
    @NameInMap("customInstructions")
    public String customInstructions;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("infer")
    public Boolean infer;

    @NameInMap("messages")
    public java.util.List<AddMemoriesRequestMessages> messages;

    /**
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;test_session_001&quot;}</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <strong>example:</strong>
     * <p>jr-80ded1d6953c64ea</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <strong>example:</strong>
     * <p>test_user_001</p>
     */
    @NameInMap("userId")
    public String userId;

    public static AddMemoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMemoriesRequest self = new AddMemoriesRequest();
        return TeaModel.build(map, self);
    }

    public AddMemoriesRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public AddMemoriesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddMemoriesRequest setAsyncMode(Boolean asyncMode) {
        this.asyncMode = asyncMode;
        return this;
    }
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

    public AddMemoriesRequest setCustomInstructions(String customInstructions) {
        this.customInstructions = customInstructions;
        return this;
    }
    public String getCustomInstructions() {
        return this.customInstructions;
    }

    public AddMemoriesRequest setInfer(Boolean infer) {
        this.infer = infer;
        return this;
    }
    public Boolean getInfer() {
        return this.infer;
    }

    public AddMemoriesRequest setMessages(java.util.List<AddMemoriesRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<AddMemoriesRequestMessages> getMessages() {
        return this.messages;
    }

    public AddMemoriesRequest setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public AddMemoriesRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public AddMemoriesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class AddMemoriesRequestMessages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>My name is Zhang San and I live in Hangzhou.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static AddMemoriesRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            AddMemoriesRequestMessages self = new AddMemoriesRequestMessages();
            return TeaModel.build(map, self);
        }

        public AddMemoriesRequestMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AddMemoriesRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
