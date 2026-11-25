// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAiModelSourceModelRequest extends TeaModel {
    /**
     * <p>The protocols and invocation paths supported by the model.</p>
     */
    @NameInMap("availablePaths")
    public java.util.List<CreateAiModelSourceModelRequestAvailablePaths> availablePaths;

    /**
     * <p>The credit pricing configuration of the model.</p>
     */
    @NameInMap("credit")
    public CreateAiModelSourceModelRequestCredit credit;

    /**
     * <p>The set of capabilities declared by the model. The key is the capability name, and the value indicates whether the capability is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;nativeStreaming&quot;:true}</p>
     */
    @NameInMap("features")
    public java.util.Map<String, ?> features;

    /**
     * <p>The token limits and input and output modality information of the model.</p>
     */
    @NameInMap("meta")
    public CreateAiModelSourceModelRequestMeta meta;

    /**
     * <p>The actual model name used by the upstream service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelName")
    public String modelName;

    /**
     * <p>The ID of the model source. Use the modelSourceId returned by the CreateAiModelSource operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ms-d00000000000000000000</p>
     */
    @NameInMap("modelSourceId")
    public String modelSourceId;

    /**
     * <p>The client-generated idempotency token used to identify the same creation or retry operation.</p>
     * 
     * <strong>example:</strong>
     * <p>b1907ca4-952c-4c5f-8d1f-0aa6ae339c96</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateAiModelSourceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiModelSourceModelRequest self = new CreateAiModelSourceModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiModelSourceModelRequest setAvailablePaths(java.util.List<CreateAiModelSourceModelRequestAvailablePaths> availablePaths) {
        this.availablePaths = availablePaths;
        return this;
    }
    public java.util.List<CreateAiModelSourceModelRequestAvailablePaths> getAvailablePaths() {
        return this.availablePaths;
    }

    public CreateAiModelSourceModelRequest setCredit(CreateAiModelSourceModelRequestCredit credit) {
        this.credit = credit;
        return this;
    }
    public CreateAiModelSourceModelRequestCredit getCredit() {
        return this.credit;
    }

    public CreateAiModelSourceModelRequest setFeatures(java.util.Map<String, ?> features) {
        this.features = features;
        return this;
    }
    public java.util.Map<String, ?> getFeatures() {
        return this.features;
    }

    public CreateAiModelSourceModelRequest setMeta(CreateAiModelSourceModelRequestMeta meta) {
        this.meta = meta;
        return this;
    }
    public CreateAiModelSourceModelRequestMeta getMeta() {
        return this.meta;
    }

    public CreateAiModelSourceModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateAiModelSourceModelRequest setModelSourceId(String modelSourceId) {
        this.modelSourceId = modelSourceId;
        return this;
    }
    public String getModelSourceId() {
        return this.modelSourceId;
    }

    public CreateAiModelSourceModelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateAiModelSourceModelRequestAvailablePaths extends TeaModel {
        /**
         * <p>The invocation path of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/chat/completions</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The protocol type used by the invocation path.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAI/v1</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateAiModelSourceModelRequestAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelSourceModelRequestAvailablePaths self = new CreateAiModelSourceModelRequestAvailablePaths();
            return TeaModel.build(map, self);
        }

        public CreateAiModelSourceModelRequestAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateAiModelSourceModelRequestAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAiModelSourceModelRequestCredit extends TeaModel {
        /**
         * <p>The number of credits per million input tokens that hit the cache. The value must be a non-negative number. A value of 0 indicates that cached input is free of charge.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("cacheCost")
        public Float cacheCost;

        /**
         * <p>The number of credits per million input tokens. The value must be a non-negative number. A value of 0 indicates that the input is free of charge.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("inputCost")
        public Float inputCost;

        /**
         * <p>The number of credits per million output tokens. The value must be a non-negative number. A value of 0 indicates that the output is free of charge.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("outputCost")
        public Float outputCost;

        /**
         * <p>The pricing method. Valid values: fixed (fixed credit pricing).</p>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateAiModelSourceModelRequestCredit build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelSourceModelRequestCredit self = new CreateAiModelSourceModelRequestCredit();
            return TeaModel.build(map, self);
        }

        public CreateAiModelSourceModelRequestCredit setCacheCost(Float cacheCost) {
            this.cacheCost = cacheCost;
            return this;
        }
        public Float getCacheCost() {
            return this.cacheCost;
        }

        public CreateAiModelSourceModelRequestCredit setInputCost(Float inputCost) {
            this.inputCost = inputCost;
            return this;
        }
        public Float getInputCost() {
            return this.inputCost;
        }

        public CreateAiModelSourceModelRequestCredit setOutputCost(Float outputCost) {
            this.outputCost = outputCost;
            return this;
        }
        public Float getOutputCost() {
            return this.outputCost;
        }

        public CreateAiModelSourceModelRequestCredit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAiModelSourceModelRequestMeta extends TeaModel {
        /**
         * <p>The maximum number of input tokens supported by the model.</p>
         * 
         * <strong>example:</strong>
         * <p>32768</p>
         */
        @NameInMap("maxInputTokens")
        public Long maxInputTokens;

        /**
         * <p>The maximum number of output tokens supported by the model.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("maxOutputTokens")
        public Long maxOutputTokens;

        /**
         * <p>The maximum number of context tokens supported by the model.</p>
         * 
         * <strong>example:</strong>
         * <p>40960</p>
         */
        @NameInMap("maxTokens")
        public Long maxTokens;

        /**
         * <p>The input modalities supported by the model.</p>
         */
        @NameInMap("supportedInputModalities")
        public java.util.List<String> supportedInputModalities;

        /**
         * <p>The output modalities supported by the model.</p>
         */
        @NameInMap("supportedOutputModalities")
        public java.util.List<String> supportedOutputModalities;

        public static CreateAiModelSourceModelRequestMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelSourceModelRequestMeta self = new CreateAiModelSourceModelRequestMeta();
            return TeaModel.build(map, self);
        }

        public CreateAiModelSourceModelRequestMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public CreateAiModelSourceModelRequestMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public CreateAiModelSourceModelRequestMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public CreateAiModelSourceModelRequestMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public CreateAiModelSourceModelRequestMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

}
