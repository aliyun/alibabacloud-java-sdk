// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class MemoryCollection extends TeaModel {
    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("description")
    public String description;

    @NameInMap("embedderConfig")
    public EmbedderConfig embedderConfig;

    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    @NameInMap("llmConfig")
    public LLMConfig llmConfig;

    @NameInMap("memoryCollectionId")
    public String memoryCollectionId;

    @NameInMap("memoryCollectionName")
    public String memoryCollectionName;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    @NameInMap("vectorStoreConfig")
    public VectorStoreConfig vectorStoreConfig;

    public static MemoryCollection build(java.util.Map<String, ?> map) throws Exception {
        MemoryCollection self = new MemoryCollection();
        return TeaModel.build(map, self);
    }

    public MemoryCollection setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public MemoryCollection setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MemoryCollection setEmbedderConfig(EmbedderConfig embedderConfig) {
        this.embedderConfig = embedderConfig;
        return this;
    }
    public EmbedderConfig getEmbedderConfig() {
        return this.embedderConfig;
    }

    public MemoryCollection setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public MemoryCollection setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public MemoryCollection setLlmConfig(LLMConfig llmConfig) {
        this.llmConfig = llmConfig;
        return this;
    }
    public LLMConfig getLlmConfig() {
        return this.llmConfig;
    }

    public MemoryCollection setMemoryCollectionId(String memoryCollectionId) {
        this.memoryCollectionId = memoryCollectionId;
        return this;
    }
    public String getMemoryCollectionId() {
        return this.memoryCollectionId;
    }

    public MemoryCollection setMemoryCollectionName(String memoryCollectionName) {
        this.memoryCollectionName = memoryCollectionName;
        return this;
    }
    public String getMemoryCollectionName() {
        return this.memoryCollectionName;
    }

    public MemoryCollection setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public MemoryCollection setVectorStoreConfig(VectorStoreConfig vectorStoreConfig) {
        this.vectorStoreConfig = vectorStoreConfig;
        return this;
    }
    public VectorStoreConfig getVectorStoreConfig() {
        return this.vectorStoreConfig;
    }

}
