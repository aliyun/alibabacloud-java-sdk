// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ModelSetSpec extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>openai</p>
     */
    @NameInMap("apiInvokeType")
    public String apiInvokeType;

    @NameInMap("authConfig")
    public Authorization authConfig;

    @NameInMap("baseUrl")
    public String baseUrl;

    @NameInMap("features")
    public ModelSetSpecFeatures features;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("models")
    public java.util.List<ModelSetModelProfile> models;

    /**
     * <strong>example:</strong>
     * <p>FunctionAI</p>
     */
    @NameInMap("provider")
    public String provider;

    public static ModelSetSpec build(java.util.Map<String, ?> map) throws Exception {
        ModelSetSpec self = new ModelSetSpec();
        return TeaModel.build(map, self);
    }

    public ModelSetSpec setApiInvokeType(String apiInvokeType) {
        this.apiInvokeType = apiInvokeType;
        return this;
    }
    public String getApiInvokeType() {
        return this.apiInvokeType;
    }

    public ModelSetSpec setAuthConfig(Authorization authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public Authorization getAuthConfig() {
        return this.authConfig;
    }

    public ModelSetSpec setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public ModelSetSpec setFeatures(ModelSetSpecFeatures features) {
        this.features = features;
        return this;
    }
    public ModelSetSpecFeatures getFeatures() {
        return this.features;
    }

    public ModelSetSpec setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ModelSetSpec setModels(java.util.List<ModelSetModelProfile> models) {
        this.models = models;
        return this;
    }
    public java.util.List<ModelSetModelProfile> getModels() {
        return this.models;
    }

    public ModelSetSpec setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public static class ModelSetSpecFeatures extends TeaModel {
        @NameInMap("agentThought")
        public Boolean agentThought;

        @NameInMap("toolCall")
        public Boolean toolCall;

        @NameInMap("vision")
        public Boolean vision;

        public static ModelSetSpecFeatures build(java.util.Map<String, ?> map) throws Exception {
            ModelSetSpecFeatures self = new ModelSetSpecFeatures();
            return TeaModel.build(map, self);
        }

        public ModelSetSpecFeatures setAgentThought(Boolean agentThought) {
            this.agentThought = agentThought;
            return this;
        }
        public Boolean getAgentThought() {
            return this.agentThought;
        }

        public ModelSetSpecFeatures setToolCall(Boolean toolCall) {
            this.toolCall = toolCall;
            return this;
        }
        public Boolean getToolCall() {
            return this.toolCall;
        }

        public ModelSetSpecFeatures setVision(Boolean vision) {
            this.vision = vision;
            return this;
        }
        public Boolean getVision() {
            return this.vision;
        }

    }

}
