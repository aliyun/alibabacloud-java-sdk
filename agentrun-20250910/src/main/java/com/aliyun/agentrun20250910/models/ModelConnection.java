// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ModelConnection extends TeaModel {
    /**
     * <p>A list of consumer API keys bound to this model connection.</p>
     */
    @NameInMap("consumerApiKeys")
    public java.util.List<ModelConnectionConsumerAPIKey> consumerApiKeys;

    /**
     * <p>The time the model connection was created, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>A description of the model connection.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAI GPT-4 connection for production</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The time the model connection was last updated, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>The model connection\&quot;s unique identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-1234567890abcdef</p>
     */
    @NameInMap("modelConnectionId")
    public String modelConnectionId;

    /**
     * <p>A unique name identifying the model connection.</p>
     * 
     * <strong>example:</strong>
     * <p>my-openai-connection</p>
     */
    @NameInMap("modelConnectionName")
    public String modelConnectionName;

    /**
     * <p>A list of model metadata configurations. Each configuration includes the features and parameter rules for a specific model.</p>
     */
    @NameInMap("modelInfoConfigs")
    public java.util.List<ModelInfoConfig> modelInfoConfigs;

    /**
     * <p>The model provider\&quot;s name.</p>
     * 
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>The settings for the model provider.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("providerSettings")
    public ModelConnectionProviderSettings providerSettings;

    /**
     * <p>The identifier of the workspace containing the model connection.</p>
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
