// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAiModelSourceModelRequest extends TeaModel {
    /**
     * <p>The protocols and invocation paths supported by the model.</p>
     */
    @NameInMap("availablePaths")
    public java.util.List<UpdateAiModelSourceModelRequestAvailablePaths> availablePaths;

    /**
     * <p>The credit pricing configuration of the model.</p>
     */
    @NameInMap("credit")
    public UpdateAiModelSourceModelRequestCredit credit;

    /**
     * <p>The expected object version. Use the version returned by the most recent query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("expectedVersion")
    public Long expectedVersion;

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
    public UpdateAiModelSourceModelRequestMeta meta;

    /**
     * <p>The actual model name used by the upstream service.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelName")
    public String modelName;

    public static UpdateAiModelSourceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiModelSourceModelRequest self = new UpdateAiModelSourceModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiModelSourceModelRequest setAvailablePaths(java.util.List<UpdateAiModelSourceModelRequestAvailablePaths> availablePaths) {
        this.availablePaths = availablePaths;
        return this;
    }
    public java.util.List<UpdateAiModelSourceModelRequestAvailablePaths> getAvailablePaths() {
        return this.availablePaths;
    }

    public UpdateAiModelSourceModelRequest setCredit(UpdateAiModelSourceModelRequestCredit credit) {
        this.credit = credit;
        return this;
    }
    public UpdateAiModelSourceModelRequestCredit getCredit() {
        return this.credit;
    }

    public UpdateAiModelSourceModelRequest setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public UpdateAiModelSourceModelRequest setFeatures(java.util.Map<String, ?> features) {
        this.features = features;
        return this;
    }
    public java.util.Map<String, ?> getFeatures() {
        return this.features;
    }

    public UpdateAiModelSourceModelRequest setMeta(UpdateAiModelSourceModelRequestMeta meta) {
        this.meta = meta;
        return this;
    }
    public UpdateAiModelSourceModelRequestMeta getMeta() {
        return this.meta;
    }

    public UpdateAiModelSourceModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public static class UpdateAiModelSourceModelRequestAvailablePaths extends TeaModel {
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

        public static UpdateAiModelSourceModelRequestAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelSourceModelRequestAvailablePaths self = new UpdateAiModelSourceModelRequestAvailablePaths();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelSourceModelRequestAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateAiModelSourceModelRequestAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateAiModelSourceModelRequestCredit extends TeaModel {
        /**
         * <p>The number of credits per million cached input tokens. The value must be a non-negative number. A value of 0 indicates that cached input is free of charge.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("cacheCost")
        public Float cacheCost;

        /**
         * <p>The number of credits per million input tokens. The value must be a non-negative number. A value of 0 indicates that input is free of charge.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("inputCost")
        public Float inputCost;

        /**
         * <p>The number of credits per million output tokens. The value must be a non-negative number. A value of 0 indicates that output is free of charge.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("outputCost")
        public Float outputCost;

        /**
         * <p>The pricing method. Valid value: fixed (fixed credit pricing).</p>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateAiModelSourceModelRequestCredit build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelSourceModelRequestCredit self = new UpdateAiModelSourceModelRequestCredit();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelSourceModelRequestCredit setCacheCost(Float cacheCost) {
            this.cacheCost = cacheCost;
            return this;
        }
        public Float getCacheCost() {
            return this.cacheCost;
        }

        public UpdateAiModelSourceModelRequestCredit setInputCost(Float inputCost) {
            this.inputCost = inputCost;
            return this;
        }
        public Float getInputCost() {
            return this.inputCost;
        }

        public UpdateAiModelSourceModelRequestCredit setOutputCost(Float outputCost) {
            this.outputCost = outputCost;
            return this;
        }
        public Float getOutputCost() {
            return this.outputCost;
        }

        public UpdateAiModelSourceModelRequestCredit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateAiModelSourceModelRequestMeta extends TeaModel {
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

        public static UpdateAiModelSourceModelRequestMeta build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelSourceModelRequestMeta self = new UpdateAiModelSourceModelRequestMeta();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelSourceModelRequestMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public UpdateAiModelSourceModelRequestMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public UpdateAiModelSourceModelRequestMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public UpdateAiModelSourceModelRequestMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public UpdateAiModelSourceModelRequestMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

}
