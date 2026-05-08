// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AddContextsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>memory</p>
     */
    @NameInMap("contextType")
    public String contextType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public java.util.List<AddContextsRequestItems> items;

    /**
     * <strong>example:</strong>
     * <p>short</p>
     */
    @NameInMap("memoryType")
    public String memoryType;

    public static AddContextsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContextsRequest self = new AddContextsRequest();
        return TeaModel.build(map, self);
    }

    public AddContextsRequest setContextType(String contextType) {
        this.contextType = contextType;
        return this;
    }
    public String getContextType() {
        return this.contextType;
    }

    public AddContextsRequest setItems(java.util.List<AddContextsRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AddContextsRequestItems> getItems() {
        return this.items;
    }

    public AddContextsRequest setMemoryType(String memoryType) {
        this.memoryType = memoryType;
        return this;
    }
    public String getMemoryType() {
        return this.memoryType;
    }

    public static class AddContextsRequestItems extends TeaModel {
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

        @NameInMap("categories")
        public java.util.List<String> categories;

        /**
         * <strong>example:</strong>
         * <p>You are a conversation assistant.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>Your custom instructions here</p>
         */
        @NameInMap("customInstructions")
        public String customInstructions;

        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;taskType&quot;: &quot;troubleshooting&quot;,
         *     &quot;complexity&quot;: &quot;medium&quot;,
         *     &quot;confidence&quot;: 0.95
         * }</p>
         */
        @NameInMap("experience")
        public java.util.Map<String, ?> experience;

        /**
         * <strong>example:</strong>
         * <p>1731231212334396</p>
         */
        @NameInMap("expirationDate")
        public String expirationDate;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("immutable")
        public Boolean immutable;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("infer")
        public Boolean infer;

        @NameInMap("labels")
        public java.util.Map<String, String> labels;

        @NameInMap("messages")
        public java.util.List<java.util.Map<String, ?>> messages;

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
         * <p>1774578167</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("triggerCondition")
        public String triggerCondition;

        /**
         * <strong>example:</strong>
         * <p>test_user_001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static AddContextsRequestItems build(java.util.Map<String, ?> map) throws Exception {
            AddContextsRequestItems self = new AddContextsRequestItems();
            return TeaModel.build(map, self);
        }

        public AddContextsRequestItems setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public AddContextsRequestItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public AddContextsRequestItems setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public AddContextsRequestItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AddContextsRequestItems setCustomInstructions(String customInstructions) {
            this.customInstructions = customInstructions;
            return this;
        }
        public String getCustomInstructions() {
            return this.customInstructions;
        }

        public AddContextsRequestItems setExperience(java.util.Map<String, ?> experience) {
            this.experience = experience;
            return this;
        }
        public java.util.Map<String, ?> getExperience() {
            return this.experience;
        }

        public AddContextsRequestItems setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public AddContextsRequestItems setImmutable(Boolean immutable) {
            this.immutable = immutable;
            return this;
        }
        public Boolean getImmutable() {
            return this.immutable;
        }

        public AddContextsRequestItems setInfer(Boolean infer) {
            this.infer = infer;
            return this;
        }
        public Boolean getInfer() {
            return this.infer;
        }

        public AddContextsRequestItems setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public AddContextsRequestItems setMessages(java.util.List<java.util.Map<String, ?>> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getMessages() {
            return this.messages;
        }

        public AddContextsRequestItems setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public AddContextsRequestItems setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public AddContextsRequestItems setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public AddContextsRequestItems setTriggerCondition(String triggerCondition) {
            this.triggerCondition = triggerCondition;
            return this;
        }
        public String getTriggerCondition() {
            return this.triggerCondition;
        }

        public AddContextsRequestItems setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
