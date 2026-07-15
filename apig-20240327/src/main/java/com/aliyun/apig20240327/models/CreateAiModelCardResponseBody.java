// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAiModelCardResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;modelCardId&quot;:&quot;mc-8c13d2b4f8a1&quot;,&quot;gatewayId&quot;:&quot;gw-8c13d2b4f8a1&quot;,&quot;modelProvider&quot;:&quot;qwen&quot;,&quot;modelName&quot;:&quot;qwen-plus&quot;,&quot;source&quot;:&quot;user&quot;,&quot;credit&quot;:{&quot;type&quot;:&quot;fixed&quot;,&quot;inputCost&quot;:1.5,&quot;outputCost&quot;:3,&quot;cacheCost&quot;:0.5},&quot;features&quot;:{&quot;functionCalling&quot;:true,&quot;toolChoice&quot;:true},&quot;meta&quot;:{&quot;maxInputTokens&quot;:131072,&quot;maxOutputTokens&quot;:8192,&quot;maxTokens&quot;:131072,&quot;supportedInputModalities&quot;:[&quot;text&quot;,&quot;image&quot;],&quot;supportedOutputModalities&quot;:[&quot;text&quot;]},&quot;availablePaths&quot;:[{&quot;path&quot;:&quot;/v1/chat/completions&quot;,&quot;type&quot;:&quot;OpenAICompatible&quot;}],&quot;updateTime&quot;:&quot;2026-07-14 18:30:00&quot;}</p>
     */
    @NameInMap("data")
    public CreateAiModelCardResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateAiModelCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAiModelCardResponseBody self = new CreateAiModelCardResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAiModelCardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAiModelCardResponseBody setData(CreateAiModelCardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAiModelCardResponseBodyData getData() {
        return this.data;
    }

    public CreateAiModelCardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAiModelCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAiModelCardResponseBodyDataAvailablePaths extends TeaModel {
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

        public static CreateAiModelCardResponseBodyDataAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelCardResponseBodyDataAvailablePaths self = new CreateAiModelCardResponseBodyDataAvailablePaths();
            return TeaModel.build(map, self);
        }

        public CreateAiModelCardResponseBodyDataAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateAiModelCardResponseBodyDataAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAiModelCardResponseBodyDataCredit extends TeaModel {
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

        public static CreateAiModelCardResponseBodyDataCredit build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelCardResponseBodyDataCredit self = new CreateAiModelCardResponseBodyDataCredit();
            return TeaModel.build(map, self);
        }

        public CreateAiModelCardResponseBodyDataCredit setCacheCost(Float cacheCost) {
            this.cacheCost = cacheCost;
            return this;
        }
        public Float getCacheCost() {
            return this.cacheCost;
        }

        public CreateAiModelCardResponseBodyDataCredit setInputCost(Float inputCost) {
            this.inputCost = inputCost;
            return this;
        }
        public Float getInputCost() {
            return this.inputCost;
        }

        public CreateAiModelCardResponseBodyDataCredit setOutputCost(Float outputCost) {
            this.outputCost = outputCost;
            return this;
        }
        public Float getOutputCost() {
            return this.outputCost;
        }

        public CreateAiModelCardResponseBodyDataCredit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAiModelCardResponseBodyDataMeta extends TeaModel {
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

        public static CreateAiModelCardResponseBodyDataMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelCardResponseBodyDataMeta self = new CreateAiModelCardResponseBodyDataMeta();
            return TeaModel.build(map, self);
        }

        public CreateAiModelCardResponseBodyDataMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public CreateAiModelCardResponseBodyDataMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public CreateAiModelCardResponseBodyDataMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public CreateAiModelCardResponseBodyDataMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public CreateAiModelCardResponseBodyDataMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

    public static class CreateAiModelCardResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[{&quot;path&quot;:&quot;/v1/chat/completions&quot;,&quot;type&quot;:&quot;OpenAICompatible&quot;}]</p>
         */
        @NameInMap("availablePaths")
        public java.util.List<CreateAiModelCardResponseBodyDataAvailablePaths> availablePaths;

        /**
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;fixed&quot;,&quot;inputCost&quot;:1.5,&quot;outputCost&quot;:3,&quot;cacheCost&quot;:0.5}</p>
         */
        @NameInMap("credit")
        public CreateAiModelCardResponseBodyDataCredit credit;

        /**
         * <strong>example:</strong>
         * <p>{&quot;functionCalling&quot;:true,&quot;toolChoice&quot;:true}</p>
         */
        @NameInMap("features")
        public java.util.Map<String, ?> features;

        /**
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
        public CreateAiModelCardResponseBodyDataMeta meta;

        /**
         * <strong>example:</strong>
         * <p>mc-8c13d2b4f8a1</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        @NameInMap("modelProvider")
        public String modelProvider;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>2026-07-14 18:30:00</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static CreateAiModelCardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelCardResponseBodyData self = new CreateAiModelCardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAiModelCardResponseBodyData setAvailablePaths(java.util.List<CreateAiModelCardResponseBodyDataAvailablePaths> availablePaths) {
            this.availablePaths = availablePaths;
            return this;
        }
        public java.util.List<CreateAiModelCardResponseBodyDataAvailablePaths> getAvailablePaths() {
            return this.availablePaths;
        }

        public CreateAiModelCardResponseBodyData setCredit(CreateAiModelCardResponseBodyDataCredit credit) {
            this.credit = credit;
            return this;
        }
        public CreateAiModelCardResponseBodyDataCredit getCredit() {
            return this.credit;
        }

        public CreateAiModelCardResponseBodyData setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public CreateAiModelCardResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public CreateAiModelCardResponseBodyData setMeta(CreateAiModelCardResponseBodyDataMeta meta) {
            this.meta = meta;
            return this;
        }
        public CreateAiModelCardResponseBodyDataMeta getMeta() {
            return this.meta;
        }

        public CreateAiModelCardResponseBodyData setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

        public CreateAiModelCardResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public CreateAiModelCardResponseBodyData setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

        public CreateAiModelCardResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateAiModelCardResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
