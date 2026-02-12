// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateMemoryCollectionInput extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("embedderConfig")
    public EmbedderConfig embedderConfig;

    @NameInMap("enableConversationHistory")
    public Boolean enableConversationHistory;

    @NameInMap("enableConversationState")
    public Boolean enableConversationState;

    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    @NameInMap("llmConfig")
    public LLMConfig llmConfig;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    @NameInMap("vectorStoreConfig")
    public VectorStoreConfig vectorStoreConfig;

    public static UpdateMemoryCollectionInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryCollectionInput self = new UpdateMemoryCollectionInput();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryCollectionInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMemoryCollectionInput setEmbedderConfig(EmbedderConfig embedderConfig) {
        this.embedderConfig = embedderConfig;
        return this;
    }
    public EmbedderConfig getEmbedderConfig() {
        return this.embedderConfig;
    }

    public UpdateMemoryCollectionInput setEnableConversationHistory(Boolean enableConversationHistory) {
        this.enableConversationHistory = enableConversationHistory;
        return this;
    }
    public Boolean getEnableConversationHistory() {
        return this.enableConversationHistory;
    }

    public UpdateMemoryCollectionInput setEnableConversationState(Boolean enableConversationState) {
        this.enableConversationState = enableConversationState;
        return this;
    }
    public Boolean getEnableConversationState() {
        return this.enableConversationState;
    }

    public UpdateMemoryCollectionInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public UpdateMemoryCollectionInput setLlmConfig(LLMConfig llmConfig) {
        this.llmConfig = llmConfig;
        return this;
    }
    public LLMConfig getLlmConfig() {
        return this.llmConfig;
    }

    public UpdateMemoryCollectionInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public UpdateMemoryCollectionInput setVectorStoreConfig(VectorStoreConfig vectorStoreConfig) {
        this.vectorStoreConfig = vectorStoreConfig;
        return this;
    }
    public VectorStoreConfig getVectorStoreConfig() {
        return this.vectorStoreConfig;
    }

}
