// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAiModelCardResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpdateAiModelCardResponseBodyData data;

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

    public static UpdateAiModelCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiModelCardResponseBody self = new UpdateAiModelCardResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAiModelCardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAiModelCardResponseBody setData(UpdateAiModelCardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAiModelCardResponseBodyData getData() {
        return this.data;
    }

    public UpdateAiModelCardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAiModelCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAiModelCardResponseBodyDataAvailablePaths extends TeaModel {
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

        public static UpdateAiModelCardResponseBodyDataAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelCardResponseBodyDataAvailablePaths self = new UpdateAiModelCardResponseBodyDataAvailablePaths();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelCardResponseBodyDataAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateAiModelCardResponseBodyDataAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateAiModelCardResponseBodyDataCredit extends TeaModel {
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

        public static UpdateAiModelCardResponseBodyDataCredit build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelCardResponseBodyDataCredit self = new UpdateAiModelCardResponseBodyDataCredit();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelCardResponseBodyDataCredit setCacheCost(Float cacheCost) {
            this.cacheCost = cacheCost;
            return this;
        }
        public Float getCacheCost() {
            return this.cacheCost;
        }

        public UpdateAiModelCardResponseBodyDataCredit setInputCost(Float inputCost) {
            this.inputCost = inputCost;
            return this;
        }
        public Float getInputCost() {
            return this.inputCost;
        }

        public UpdateAiModelCardResponseBodyDataCredit setOutputCost(Float outputCost) {
            this.outputCost = outputCost;
            return this;
        }
        public Float getOutputCost() {
            return this.outputCost;
        }

        public UpdateAiModelCardResponseBodyDataCredit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateAiModelCardResponseBodyDataMeta extends TeaModel {
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

        @NameInMap("supportedInputModalities")
        public java.util.List<String> supportedInputModalities;

        @NameInMap("supportedOutputModalities")
        public java.util.List<String> supportedOutputModalities;

        public static UpdateAiModelCardResponseBodyDataMeta build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelCardResponseBodyDataMeta self = new UpdateAiModelCardResponseBodyDataMeta();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelCardResponseBodyDataMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public UpdateAiModelCardResponseBodyDataMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public UpdateAiModelCardResponseBodyDataMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public UpdateAiModelCardResponseBodyDataMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public UpdateAiModelCardResponseBodyDataMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

    public static class UpdateAiModelCardResponseBodyData extends TeaModel {
        @NameInMap("availablePaths")
        public java.util.List<UpdateAiModelCardResponseBodyDataAvailablePaths> availablePaths;

        @NameInMap("credit")
        public UpdateAiModelCardResponseBodyDataCredit credit;

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

        @NameInMap("meta")
        public UpdateAiModelCardResponseBodyDataMeta meta;

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

        public static UpdateAiModelCardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelCardResponseBodyData self = new UpdateAiModelCardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelCardResponseBodyData setAvailablePaths(java.util.List<UpdateAiModelCardResponseBodyDataAvailablePaths> availablePaths) {
            this.availablePaths = availablePaths;
            return this;
        }
        public java.util.List<UpdateAiModelCardResponseBodyDataAvailablePaths> getAvailablePaths() {
            return this.availablePaths;
        }

        public UpdateAiModelCardResponseBodyData setCredit(UpdateAiModelCardResponseBodyDataCredit credit) {
            this.credit = credit;
            return this;
        }
        public UpdateAiModelCardResponseBodyDataCredit getCredit() {
            return this.credit;
        }

        public UpdateAiModelCardResponseBodyData setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public UpdateAiModelCardResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public UpdateAiModelCardResponseBodyData setMeta(UpdateAiModelCardResponseBodyDataMeta meta) {
            this.meta = meta;
            return this;
        }
        public UpdateAiModelCardResponseBodyDataMeta getMeta() {
            return this.meta;
        }

        public UpdateAiModelCardResponseBodyData setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

        public UpdateAiModelCardResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateAiModelCardResponseBodyData setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

        public UpdateAiModelCardResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateAiModelCardResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
