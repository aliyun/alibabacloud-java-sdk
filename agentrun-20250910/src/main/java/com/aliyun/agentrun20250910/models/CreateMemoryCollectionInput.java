// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateMemoryCollectionInput extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("embedderConfig")
    public EmbedderConfig embedderConfig;

    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    @NameInMap("llmConfig")
    public LLMConfig llmConfig;

    @NameInMap("memoryCollectionName")
    public String memoryCollectionName;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    @NameInMap("type")
    public String type;

    @NameInMap("vectorStoreConfig")
    public VectorStoreConfig vectorStoreConfig;

    public static CreateMemoryCollectionInput build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryCollectionInput self = new CreateMemoryCollectionInput();
        return TeaModel.build(map, self);
    }

    public CreateMemoryCollectionInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMemoryCollectionInput setEmbedderConfig(EmbedderConfig embedderConfig) {
        this.embedderConfig = embedderConfig;
        return this;
    }
    public EmbedderConfig getEmbedderConfig() {
        return this.embedderConfig;
    }

    public CreateMemoryCollectionInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public CreateMemoryCollectionInput setLlmConfig(LLMConfig llmConfig) {
        this.llmConfig = llmConfig;
        return this;
    }
    public LLMConfig getLlmConfig() {
        return this.llmConfig;
    }

    public CreateMemoryCollectionInput setMemoryCollectionName(String memoryCollectionName) {
        this.memoryCollectionName = memoryCollectionName;
        return this;
    }
    public String getMemoryCollectionName() {
        return this.memoryCollectionName;
    }

    public CreateMemoryCollectionInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public CreateMemoryCollectionInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateMemoryCollectionInput setVectorStoreConfig(VectorStoreConfig vectorStoreConfig) {
        this.vectorStoreConfig = vectorStoreConfig;
        return this;
    }
    public VectorStoreConfig getVectorStoreConfig() {
        return this.vectorStoreConfig;
    }

}
