// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ModelConnection extends TeaModel {
    /**
     * <p>绑定的消费者API密钥列表</p>
     */
    @NameInMap("consumerApiKeys")
    public java.util.List<ModelConnectionConsumerAPIKey> consumerApiKeys;

    /**
     * <p>模型连接的创建时间，采用ISO 8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>模型连接的描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAI GPT-4 connection for production</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>模型连接最后一次更新的时间，采用ISO 8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>模型连接的唯一标识符</p>
     * 
     * <strong>example:</strong>
     * <p>mc-1234567890abcdef</p>
     */
    @NameInMap("modelConnectionId")
    public String modelConnectionId;

    /**
     * <p>模型连接的唯一名称标识</p>
     * 
     * <strong>example:</strong>
     * <p>my-openai-connection</p>
     */
    @NameInMap("modelConnectionName")
    public String modelConnectionName;

    /**
     * <p>模型元数据配置列表，包含各个模型的功能特性和参数规则</p>
     */
    @NameInMap("modelInfoConfigs")
    public java.util.List<ModelInfoConfig> modelInfoConfigs;

    /**
     * <p>模型提供商名称</p>
     * 
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>模型提供商的配置信息</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("providerSettings")
    public ModelConnectionProviderSettings providerSettings;

    /**
     * <p>模型连接所属的工作空间标识符</p>
     * 
     * <strong>example:</strong>
     * <p>ws-1234567890abcdef</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static ModelConnection build(java.util.Map<String, ?> map) throws Exception {
        ModelConnection self = new ModelConnection();
        return TeaModel.build(map, self);
    }

    public ModelConnection setConsumerApiKeys(java.util.List<ModelConnectionConsumerAPIKey> consumerApiKeys) {
        this.consumerApiKeys = consumerApiKeys;
        return this;
    }
    public java.util.List<ModelConnectionConsumerAPIKey> getConsumerApiKeys() {
        return this.consumerApiKeys;
    }

    public ModelConnection setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ModelConnection setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModelConnection setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public ModelConnection setModelConnectionId(String modelConnectionId) {
        this.modelConnectionId = modelConnectionId;
        return this;
    }
    public String getModelConnectionId() {
        return this.modelConnectionId;
    }

    public ModelConnection setModelConnectionName(String modelConnectionName) {
        this.modelConnectionName = modelConnectionName;
        return this;
    }
    public String getModelConnectionName() {
        return this.modelConnectionName;
    }

    public ModelConnection setModelInfoConfigs(java.util.List<ModelInfoConfig> modelInfoConfigs) {
        this.modelInfoConfigs = modelInfoConfigs;
        return this;
    }
    public java.util.List<ModelInfoConfig> getModelInfoConfigs() {
        return this.modelInfoConfigs;
    }

    public ModelConnection setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ModelConnection setProviderSettings(ModelConnectionProviderSettings providerSettings) {
        this.providerSettings = providerSettings;
        return this;
    }
    public ModelConnectionProviderSettings getProviderSettings() {
        return this.providerSettings;
    }

    public ModelConnection setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
