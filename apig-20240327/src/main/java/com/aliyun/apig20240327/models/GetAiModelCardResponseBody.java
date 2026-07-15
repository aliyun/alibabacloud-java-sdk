// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetAiModelCardResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetAiModelCardResponseBodyData data;

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

    public static GetAiModelCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiModelCardResponseBody self = new GetAiModelCardResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiModelCardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAiModelCardResponseBody setData(GetAiModelCardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAiModelCardResponseBodyData getData() {
        return this.data;
    }

    public GetAiModelCardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAiModelCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAiModelCardResponseBodyDataAvailablePaths extends TeaModel {
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

        public static GetAiModelCardResponseBodyDataAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            GetAiModelCardResponseBodyDataAvailablePaths self = new GetAiModelCardResponseBodyDataAvailablePaths();
            return TeaModel.build(map, self);
        }

        public GetAiModelCardResponseBodyDataAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetAiModelCardResponseBodyDataAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAiModelCardResponseBodyDataCredit extends TeaModel {
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

        public static GetAiModelCardResponseBodyDataCredit build(java.util.Map<String, ?> map) throws Exception {
            GetAiModelCardResponseBodyDataCredit self = new GetAiModelCardResponseBodyDataCredit();
            return TeaModel.build(map, self);
        }

        public GetAiModelCardResponseBodyDataCredit setCacheCost(Float cacheCost) {
            this.cacheCost = cacheCost;
            return this;
        }
        public Float getCacheCost() {
            return this.cacheCost;
        }

        public GetAiModelCardResponseBodyDataCredit setInputCost(Float inputCost) {
            this.inputCost = inputCost;
            return this;
        }
        public Float getInputCost() {
            return this.inputCost;
        }

        public GetAiModelCardResponseBodyDataCredit setOutputCost(Float outputCost) {
            this.outputCost = outputCost;
            return this;
        }
        public Float getOutputCost() {
            return this.outputCost;
        }

        public GetAiModelCardResponseBodyDataCredit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAiModelCardResponseBodyDataMeta extends TeaModel {
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

        public static GetAiModelCardResponseBodyDataMeta build(java.util.Map<String, ?> map) throws Exception {
            GetAiModelCardResponseBodyDataMeta self = new GetAiModelCardResponseBodyDataMeta();
            return TeaModel.build(map, self);
        }

        public GetAiModelCardResponseBodyDataMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public GetAiModelCardResponseBodyDataMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public GetAiModelCardResponseBodyDataMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public GetAiModelCardResponseBodyDataMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public GetAiModelCardResponseBodyDataMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

    public static class GetAiModelCardResponseBodyData extends TeaModel {
        @NameInMap("availablePaths")
        public java.util.List<GetAiModelCardResponseBodyDataAvailablePaths> availablePaths;

        @NameInMap("credit")
        public GetAiModelCardResponseBodyDataCredit credit;

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
        public GetAiModelCardResponseBodyDataMeta meta;

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

        public static GetAiModelCardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAiModelCardResponseBodyData self = new GetAiModelCardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAiModelCardResponseBodyData setAvailablePaths(java.util.List<GetAiModelCardResponseBodyDataAvailablePaths> availablePaths) {
            this.availablePaths = availablePaths;
            return this;
        }
        public java.util.List<GetAiModelCardResponseBodyDataAvailablePaths> getAvailablePaths() {
            return this.availablePaths;
        }

        public GetAiModelCardResponseBodyData setCredit(GetAiModelCardResponseBodyDataCredit credit) {
            this.credit = credit;
            return this;
        }
        public GetAiModelCardResponseBodyDataCredit getCredit() {
            return this.credit;
        }

        public GetAiModelCardResponseBodyData setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public GetAiModelCardResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetAiModelCardResponseBodyData setMeta(GetAiModelCardResponseBodyDataMeta meta) {
            this.meta = meta;
            return this;
        }
        public GetAiModelCardResponseBodyDataMeta getMeta() {
            return this.meta;
        }

        public GetAiModelCardResponseBodyData setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

        public GetAiModelCardResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetAiModelCardResponseBodyData setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

        public GetAiModelCardResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAiModelCardResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
