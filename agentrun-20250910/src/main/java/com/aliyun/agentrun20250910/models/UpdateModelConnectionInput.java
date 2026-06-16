// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateModelConnectionInput extends TeaModel {
    /**
     * <p>A list of consumer API keys to associate with the model connection.</p>
     */
    @NameInMap("consumerApiKeys")
    public java.util.List<UpdateModelConnectionInputConsumerApiKeys> consumerApiKeys;

    /**
     * <p>A new description for the model connection.</p>
     * 
     * <strong>example:</strong>
     * <p>Updated connection description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>A new list of model metadata configurations.</p>
     */
    @NameInMap("modelInfoConfigs")
    public java.util.List<ModelInfoConfig> modelInfoConfigs;

    /**
     * <p>A new configuration for the model provider.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("providerSettings")
    public ModelConnectionProviderSettings providerSettings;

    public static UpdateModelConnectionInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelConnectionInput self = new UpdateModelConnectionInput();
        return TeaModel.build(map, self);
    }

    public UpdateModelConnectionInput setConsumerApiKeys(java.util.List<UpdateModelConnectionInputConsumerApiKeys> consumerApiKeys) {
        this.consumerApiKeys = consumerApiKeys;
        return this;
    }
    public java.util.List<UpdateModelConnectionInputConsumerApiKeys> getConsumerApiKeys() {
        return this.consumerApiKeys;
    }

    public UpdateModelConnectionInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModelConnectionInput setModelInfoConfigs(java.util.List<ModelInfoConfig> modelInfoConfigs) {
        this.modelInfoConfigs = modelInfoConfigs;
        return this;
    }
    public java.util.List<ModelInfoConfig> getModelInfoConfigs() {
        return this.modelInfoConfigs;
    }

    public UpdateModelConnectionInput setProviderSettings(ModelConnectionProviderSettings providerSettings) {
        this.providerSettings = providerSettings;
        return this;
    }
    public ModelConnectionProviderSettings getProviderSettings() {
        return this.providerSettings;
    }

    public static class UpdateModelConnectionInputConsumerApiKeys extends TeaModel {
        @NameInMap("apiKeyId")
        public String apiKeyId;

        @NameInMap("value")
        public String value;

        public static UpdateModelConnectionInputConsumerApiKeys build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelConnectionInputConsumerApiKeys self = new UpdateModelConnectionInputConsumerApiKeys();
            return TeaModel.build(map, self);
        }

        public UpdateModelConnectionInputConsumerApiKeys setApiKeyId(String apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }
        public String getApiKeyId() {
            return this.apiKeyId;
        }

        public UpdateModelConnectionInputConsumerApiKeys setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
