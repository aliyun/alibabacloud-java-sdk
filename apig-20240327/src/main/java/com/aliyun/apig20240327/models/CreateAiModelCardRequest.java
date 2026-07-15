// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAiModelCardRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;path&quot;:&quot;/v1/chat/completions&quot;,&quot;type&quot;:&quot;OpenAICompatible&quot;}]</p>
     */
    @NameInMap("availablePaths")
    public java.util.List<CreateAiModelCardRequestAvailablePaths> availablePaths;

    /**
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;fixed&quot;,&quot;inputCost&quot;:1.5,&quot;outputCost&quot;:3,&quot;cacheCost&quot;:0.5}</p>
     */
    @NameInMap("credit")
    public CreateAiModelCardRequestCredit credit;

    /**
     * <strong>example:</strong>
     * <p>{&quot;functionCalling&quot;:true,&quot;toolChoice&quot;:true,&quot;promptCaching&quot;:false}</p>
     */
    @NameInMap("features")
    public java.util.Map<String, ?> features;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-8c13d2b4f8a1</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;maxInputTokens&quot;:131072,&quot;maxOutputTokens&quot;:8192,&quot;maxTokens&quot;:131072,&quot;supportedInputModalities&quot;:[&quot;text&quot;,&quot;image&quot;],&quot;supportedOutputModalities&quot;:[&quot;text&quot;]}</p>
     */
    @NameInMap("meta")
    public CreateAiModelCardRequestMeta meta;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelName")
    public String modelName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("modelProvider")
    public String modelProvider;

    public static CreateAiModelCardRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiModelCardRequest self = new CreateAiModelCardRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiModelCardRequest setAvailablePaths(java.util.List<CreateAiModelCardRequestAvailablePaths> availablePaths) {
        this.availablePaths = availablePaths;
        return this;
    }
    public java.util.List<CreateAiModelCardRequestAvailablePaths> getAvailablePaths() {
        return this.availablePaths;
    }

    public CreateAiModelCardRequest setCredit(CreateAiModelCardRequestCredit credit) {
        this.credit = credit;
        return this;
    }
    public CreateAiModelCardRequestCredit getCredit() {
        return this.credit;
    }

    public CreateAiModelCardRequest setFeatures(java.util.Map<String, ?> features) {
        this.features = features;
        return this;
    }
    public java.util.Map<String, ?> getFeatures() {
        return this.features;
    }

    public CreateAiModelCardRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateAiModelCardRequest setMeta(CreateAiModelCardRequestMeta meta) {
        this.meta = meta;
        return this;
    }
    public CreateAiModelCardRequestMeta getMeta() {
        return this.meta;
    }

    public CreateAiModelCardRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateAiModelCardRequest setModelProvider(String modelProvider) {
        this.modelProvider = modelProvider;
        return this;
    }
    public String getModelProvider() {
        return this.modelProvider;
    }

    public static class CreateAiModelCardRequestAvailablePaths extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/v1/chat/completions</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>OpenAICompatible</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateAiModelCardRequestAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelCardRequestAvailablePaths self = new CreateAiModelCardRequestAvailablePaths();
            return TeaModel.build(map, self);
        }

        public CreateAiModelCardRequestAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateAiModelCardRequestAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAiModelCardRequestCredit extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("cacheCost")
        public Float cacheCost;

        /**
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("inputCost")
        public Float inputCost;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("outputCost")
        public Float outputCost;

        /**
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateAiModelCardRequestCredit build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelCardRequestCredit self = new CreateAiModelCardRequestCredit();
            return TeaModel.build(map, self);
        }

        public CreateAiModelCardRequestCredit setCacheCost(Float cacheCost) {
            this.cacheCost = cacheCost;
            return this;
        }
        public Float getCacheCost() {
            return this.cacheCost;
        }

        public CreateAiModelCardRequestCredit setInputCost(Float inputCost) {
            this.inputCost = inputCost;
            return this;
        }
        public Float getInputCost() {
            return this.inputCost;
        }

        public CreateAiModelCardRequestCredit setOutputCost(Float outputCost) {
            this.outputCost = outputCost;
            return this;
        }
        public Float getOutputCost() {
            return this.outputCost;
        }

        public CreateAiModelCardRequestCredit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAiModelCardRequestMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>131072</p>
         */
        @NameInMap("maxInputTokens")
        public Long maxInputTokens;

        /**
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("maxOutputTokens")
        public Long maxOutputTokens;

        /**
         * <strong>example:</strong>
         * <p>131072</p>
         */
        @NameInMap("maxTokens")
        public Long maxTokens;

        /**
         * <strong>example:</strong>
         * <p>[&quot;text&quot;,&quot;image&quot;]</p>
         */
        @NameInMap("supportedInputModalities")
        public java.util.List<String> supportedInputModalities;

        /**
         * <strong>example:</strong>
         * <p>[&quot;text&quot;]</p>
         */
        @NameInMap("supportedOutputModalities")
        public java.util.List<String> supportedOutputModalities;

        public static CreateAiModelCardRequestMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelCardRequestMeta self = new CreateAiModelCardRequestMeta();
            return TeaModel.build(map, self);
        }

        public CreateAiModelCardRequestMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public CreateAiModelCardRequestMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public CreateAiModelCardRequestMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public CreateAiModelCardRequestMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public CreateAiModelCardRequestMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

}
