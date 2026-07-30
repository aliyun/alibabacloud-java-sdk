// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAiModelCardRequest extends TeaModel {
    /**
     * <p>The list of invocation paths supported by the model. Each item must include both path and type. The list is overwritten as a whole during updates.</p>
     */
    @NameInMap("availablePaths")
    public java.util.List<UpdateAiModelCardRequestAvailablePaths> availablePaths;

    /**
     * <p>The credit billing information of the model. Only the fixed type is supported. The unit is Credits per million tokens. If not specified, all cost values default to 0.</p>
     */
    @NameInMap("credit")
    public UpdateAiModelCardRequestCredit credit;

    /**
     * <p>The model capability switches. Keys must be model capability names supported by the API gateway. Values are Boolean.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;functionCalling&quot;:true,&quot;toolChoice&quot;:true,&quot;promptCaching&quot;:false}</p>
     */
    @NameInMap("features")
    public java.util.Map<String, ?> features;

    /**
     * <p>The token limits and input/output modality information of the model.</p>
     */
    @NameInMap("meta")
    public UpdateAiModelCardRequestMeta meta;

    /**
     * <p>The model name. The name must be unique within the same AI gateway instance and model provider. Maximum length: 256 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelName")
    public String modelName;

    /**
     * <p>The model provider identifier. The value must reference an existing model provider in the target AI gateway instance. Maximum length: 128 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("modelProvider")
    public String modelProvider;

    public static UpdateAiModelCardRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiModelCardRequest self = new UpdateAiModelCardRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiModelCardRequest setAvailablePaths(java.util.List<UpdateAiModelCardRequestAvailablePaths> availablePaths) {
        this.availablePaths = availablePaths;
        return this;
    }
    public java.util.List<UpdateAiModelCardRequestAvailablePaths> getAvailablePaths() {
        return this.availablePaths;
    }

    public UpdateAiModelCardRequest setCredit(UpdateAiModelCardRequestCredit credit) {
        this.credit = credit;
        return this;
    }
    public UpdateAiModelCardRequestCredit getCredit() {
        return this.credit;
    }

    public UpdateAiModelCardRequest setFeatures(java.util.Map<String, ?> features) {
        this.features = features;
        return this;
    }
    public java.util.Map<String, ?> getFeatures() {
        return this.features;
    }

    public UpdateAiModelCardRequest setMeta(UpdateAiModelCardRequestMeta meta) {
        this.meta = meta;
        return this;
    }
    public UpdateAiModelCardRequestMeta getMeta() {
        return this.meta;
    }

    public UpdateAiModelCardRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public UpdateAiModelCardRequest setModelProvider(String modelProvider) {
        this.modelProvider = modelProvider;
        return this;
    }
    public String getModelProvider() {
        return this.modelProvider;
    }

    public static class UpdateAiModelCardRequestAvailablePaths extends TeaModel {
        /**
         * <p>The model invocation path. Maximum length: 2048 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/chat/completions</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The protocol type of the path. Maximum length: 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAICompatible</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateAiModelCardRequestAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelCardRequestAvailablePaths self = new UpdateAiModelCardRequestAvailablePaths();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelCardRequestAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateAiModelCardRequestAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateAiModelCardRequestCredit extends TeaModel {
        /**
         * <p>The cache hit token cost in Credits per million tokens. The value must be greater than or equal to 0. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("cacheCost")
        public Float cacheCost;

        /**
         * <p>The input token cost in Credits per million tokens. The value must be greater than or equal to 0. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("inputCost")
        public Float inputCost;

        /**
         * <p>The output token cost in Credits per million tokens. The value must be greater than or equal to 0. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("outputCost")
        public Float outputCost;

        /**
         * <p>The billing type. Only fixed is supported. Default value: fixed.</p>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateAiModelCardRequestCredit build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelCardRequestCredit self = new UpdateAiModelCardRequestCredit();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelCardRequestCredit setCacheCost(Float cacheCost) {
            this.cacheCost = cacheCost;
            return this;
        }
        public Float getCacheCost() {
            return this.cacheCost;
        }

        public UpdateAiModelCardRequestCredit setInputCost(Float inputCost) {
            this.inputCost = inputCost;
            return this;
        }
        public Float getInputCost() {
            return this.inputCost;
        }

        public UpdateAiModelCardRequestCredit setOutputCost(Float outputCost) {
            this.outputCost = outputCost;
            return this;
        }
        public Float getOutputCost() {
            return this.outputCost;
        }

        public UpdateAiModelCardRequestCredit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateAiModelCardRequestMeta extends TeaModel {
        /**
         * <p>The maximum number of input tokens supported by the model. The value must be greater than or equal to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>131072</p>
         */
        @NameInMap("maxInputTokens")
        public Long maxInputTokens;

        /**
         * <p>The maximum number of output tokens supported by the model. The value must be greater than or equal to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("maxOutputTokens")
        public Long maxOutputTokens;

        /**
         * <p>The maximum total number of context tokens supported by the model. The value must be greater than or equal to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>131072</p>
         */
        @NameInMap("maxTokens")
        public Long maxTokens;

        /**
         * <p>The list of input modalities supported by the model. The list contains up to 16 items, and each item must not be empty.</p>
         */
        @NameInMap("supportedInputModalities")
        public java.util.List<String> supportedInputModalities;

        /**
         * <p>The list of output modalities supported by the model. The list contains up to 16 items, and each item must not be empty.</p>
         */
        @NameInMap("supportedOutputModalities")
        public java.util.List<String> supportedOutputModalities;

        public static UpdateAiModelCardRequestMeta build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelCardRequestMeta self = new UpdateAiModelCardRequestMeta();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelCardRequestMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public UpdateAiModelCardRequestMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public UpdateAiModelCardRequestMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public UpdateAiModelCardRequestMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public UpdateAiModelCardRequestMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

}
