// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateModelConnectionInput extends TeaModel {
    /**
     * <p>A list of consumer API keys for the model connection. If this list is empty, the connection enters open mode.</p>
     */
    @NameInMap("consumerApiKeys")
    public java.util.List<CreateModelConnectionInputConsumerApiKeys> consumerApiKeys;

    /**
     * <p>A description of the model connection.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAI GPT-4 connection for production</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>A unique name for the model connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-openai-connection</p>
     */
    @NameInMap("modelConnectionName")
    public String modelConnectionName;

    /**
     * <p>A list of model metadata configurations.</p>
     */
    @NameInMap("modelInfoConfigs")
    public java.util.List<ModelInfoConfig> modelInfoConfigs;

    /**
     * <p>The model provider name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>Configuration settings for the model provider, such as the base URL and a list of models.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("providerSettings")
    public ModelConnectionProviderSettings providerSettings;

    /**
     * <p>The ID of the workspace containing the model connection.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-1234567890abcdef</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateModelConnectionInput build(java.util.Map<String, ?> map) throws Exception {
        CreateModelConnectionInput self = new CreateModelConnectionInput();
        return TeaModel.build(map, self);
    }

    public CreateModelConnectionInput setConsumerApiKeys(java.util.List<CreateModelConnectionInputConsumerApiKeys> consumerApiKeys) {
        this.consumerApiKeys = consumerApiKeys;
        return this;
    }
    public java.util.List<CreateModelConnectionInputConsumerApiKeys> getConsumerApiKeys() {
        return this.consumerApiKeys;
    }

    public CreateModelConnectionInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelConnectionInput setModelConnectionName(String modelConnectionName) {
        this.modelConnectionName = modelConnectionName;
        return this;
    }
    public String getModelConnectionName() {
        return this.modelConnectionName;
    }

    public CreateModelConnectionInput setModelInfoConfigs(java.util.List<ModelInfoConfig> modelInfoConfigs) {
        this.modelInfoConfigs = modelInfoConfigs;
        return this;
    }
    public java.util.List<ModelInfoConfig> getModelInfoConfigs() {
        return this.modelInfoConfigs;
    }

    public CreateModelConnectionInput setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateModelConnectionInput setProviderSettings(ModelConnectionProviderSettings providerSettings) {
        this.providerSettings = providerSettings;
        return this;
    }
    public ModelConnectionProviderSettings getProviderSettings() {
        return this.providerSettings;
    }

    public CreateModelConnectionInput setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateModelConnectionInputConsumerApiKeys extends TeaModel {
        @NameInMap("apiKeyId")
        public String apiKeyId;

        @NameInMap("value")
        public String value;

        public static CreateModelConnectionInputConsumerApiKeys build(java.util.Map<String, ?> map) throws Exception {
            CreateModelConnectionInputConsumerApiKeys self = new CreateModelConnectionInputConsumerApiKeys();
            return TeaModel.build(map, self);
        }

        public CreateModelConnectionInputConsumerApiKeys setApiKeyId(String apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }
        public String getApiKeyId() {
            return this.apiKeyId;
        }

        public CreateModelConnectionInputConsumerApiKeys setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
