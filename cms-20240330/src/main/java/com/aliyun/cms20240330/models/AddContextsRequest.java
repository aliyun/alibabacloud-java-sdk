// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AddContextsRequest extends TeaModel {
    /**
     * <p>The context type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>memory</p>
     */
    @NameInMap("contextType")
    public String contextType;

    /**
     * <p>An array of context items.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public java.util.List<AddContextsRequestItems> items;

    /**
     * <p>The memory type.</p>
     * 
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
         * <p>The unique agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>952730733889060865</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mm_480d961a1b5e4efe84603f4cbc0f</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>A list of categories to apply to the context item.</p>
         */
        @NameInMap("categories")
        public java.util.List<String> categories;

        /**
         * <p>The content of the context item.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a conversation assistant.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The custom instructions for processing the context.</p>
         * 
         * <strong>example:</strong>
         * <p>Your custom instructions here</p>
         */
        @NameInMap("customInstructions")
        public String customInstructions;

        /**
         * <p>An object containing experience information for the context.</p>
         * 
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
         * <p>The expiration timestamp for the context item.</p>
         * 
         * <strong>example:</strong>
         * <p>1731231212334396</p>
         */
        @NameInMap("expirationDate")
        public String expirationDate;

        /**
         * <p>Specifies whether the context item is immutable. If set to <code>true</code>, the item cannot be changed after it is created. The default value is <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("immutable")
        public Boolean immutable;

        /**
         * <p>Specifies whether to perform inference based on the context. The default value is <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("infer")
        public Boolean infer;

        /**
         * <p>A map of key-value pairs to apply as labels.</p>
         */
        @NameInMap("labels")
        public java.util.Map<String, String> labels;

        /**
         * <p>An array of message objects.</p>
         */
        @NameInMap("messages")
        public java.util.List<java.util.Map<String, ?>> messages;

        /**
         * <p>Key-value pairs to store as metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sessionId&quot;:&quot;test_session_001&quot;}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>jr-80ded1d6953c64ea</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>The timestamp of the context item.</p>
         * 
         * <strong>example:</strong>
         * <p>1774578167</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        /**
         * <p>The condition that triggers the context.</p>
         * 
         * <strong>example:</strong>
         * <p>Identify and troubleshoot SLs issues</p>
         */
        @NameInMap("triggerCondition")
        public String triggerCondition;

        /**
         * <p>The unique user ID.</p>
         * 
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
