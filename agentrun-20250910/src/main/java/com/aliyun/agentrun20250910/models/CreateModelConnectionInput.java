// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateModelConnectionInput extends TeaModel {
    /**
     * <p>要绑定的消费者API密钥列表；空表示开放模式</p>
     */
    @NameInMap("consumerApiKeys")
    public java.util.List<CreateModelConnectionInputConsumerApiKeys> consumerApiKeys;

    /**
     * <p>模型连接的描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAI GPT-4 connection for production</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>模型连接的唯一名称标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-openai-connection</p>
     */
    @NameInMap("modelConnectionName")
    public String modelConnectionName;

    /**
     * <p>模型元数据配置列表</p>
     */
    @NameInMap("modelInfoConfigs")
    public java.util.List<ModelInfoConfig> modelInfoConfigs;

    /**
     * <p>模型提供商名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>模型提供商的配置信息，包括基础URL、模型列表等</p>
     * <p>This parameter is required.</p>
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
