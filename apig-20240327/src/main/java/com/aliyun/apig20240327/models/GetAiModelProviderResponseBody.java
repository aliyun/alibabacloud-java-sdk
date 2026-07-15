// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetAiModelProviderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetAiModelProviderResponseBodyData data;

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

    public static GetAiModelProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiModelProviderResponseBody self = new GetAiModelProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiModelProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAiModelProviderResponseBody setData(GetAiModelProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAiModelProviderResponseBodyData getData() {
        return this.data;
    }

    public GetAiModelProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAiModelProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAiModelProviderResponseBodyDataModelCardsAvailablePaths extends TeaModel {
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

        public static GetAiModelProviderResponseBodyDataModelCardsAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            GetAiModelProviderResponseBodyDataModelCardsAvailablePaths self = new GetAiModelProviderResponseBodyDataModelCardsAvailablePaths();
            return TeaModel.build(map, self);
        }

        public GetAiModelProviderResponseBodyDataModelCardsAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetAiModelProviderResponseBodyDataModelCardsAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAiModelProviderResponseBodyDataModelCardsCredit extends TeaModel {
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

        public static GetAiModelProviderResponseBodyDataModelCardsCredit build(java.util.Map<String, ?> map) throws Exception {
            GetAiModelProviderResponseBodyDataModelCardsCredit self = new GetAiModelProviderResponseBodyDataModelCardsCredit();
            return TeaModel.build(map, self);
        }

        public GetAiModelProviderResponseBodyDataModelCardsCredit setCacheCost(Float cacheCost) {
            this.cacheCost = cacheCost;
            return this;
        }
        public Float getCacheCost() {
            return this.cacheCost;
        }

        public GetAiModelProviderResponseBodyDataModelCardsCredit setInputCost(Float inputCost) {
            this.inputCost = inputCost;
            return this;
        }
        public Float getInputCost() {
            return this.inputCost;
        }

        public GetAiModelProviderResponseBodyDataModelCardsCredit setOutputCost(Float outputCost) {
            this.outputCost = outputCost;
            return this;
        }
        public Float getOutputCost() {
            return this.outputCost;
        }

        public GetAiModelProviderResponseBodyDataModelCardsCredit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAiModelProviderResponseBodyDataModelCardsMeta extends TeaModel {
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

        public static GetAiModelProviderResponseBodyDataModelCardsMeta build(java.util.Map<String, ?> map) throws Exception {
            GetAiModelProviderResponseBodyDataModelCardsMeta self = new GetAiModelProviderResponseBodyDataModelCardsMeta();
            return TeaModel.build(map, self);
        }

        public GetAiModelProviderResponseBodyDataModelCardsMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public GetAiModelProviderResponseBodyDataModelCardsMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public GetAiModelProviderResponseBodyDataModelCardsMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public GetAiModelProviderResponseBodyDataModelCardsMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public GetAiModelProviderResponseBodyDataModelCardsMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

    public static class GetAiModelProviderResponseBodyDataModelCards extends TeaModel {
        @NameInMap("availablePaths")
        public java.util.List<GetAiModelProviderResponseBodyDataModelCardsAvailablePaths> availablePaths;

        @NameInMap("credit")
        public GetAiModelProviderResponseBodyDataModelCardsCredit credit;

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
        public GetAiModelProviderResponseBodyDataModelCardsMeta meta;

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
         * <p><a href="http://https://dashscope-intl.aliyuncs.com">http://https://dashscope-intl.aliyuncs.com</a></p>
         */
        @NameInMap("sourceURL")
        public String sourceURL;

        /**
         * <strong>example:</strong>
         * <p>2026-07-14 18:30:00</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static GetAiModelProviderResponseBodyDataModelCards build(java.util.Map<String, ?> map) throws Exception {
            GetAiModelProviderResponseBodyDataModelCards self = new GetAiModelProviderResponseBodyDataModelCards();
            return TeaModel.build(map, self);
        }

        public GetAiModelProviderResponseBodyDataModelCards setAvailablePaths(java.util.List<GetAiModelProviderResponseBodyDataModelCardsAvailablePaths> availablePaths) {
            this.availablePaths = availablePaths;
            return this;
        }
        public java.util.List<GetAiModelProviderResponseBodyDataModelCardsAvailablePaths> getAvailablePaths() {
            return this.availablePaths;
        }

        public GetAiModelProviderResponseBodyDataModelCards setCredit(GetAiModelProviderResponseBodyDataModelCardsCredit credit) {
            this.credit = credit;
            return this;
        }
        public GetAiModelProviderResponseBodyDataModelCardsCredit getCredit() {
            return this.credit;
        }

        public GetAiModelProviderResponseBodyDataModelCards setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public GetAiModelProviderResponseBodyDataModelCards setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetAiModelProviderResponseBodyDataModelCards setMeta(GetAiModelProviderResponseBodyDataModelCardsMeta meta) {
            this.meta = meta;
            return this;
        }
        public GetAiModelProviderResponseBodyDataModelCardsMeta getMeta() {
            return this.meta;
        }

        public GetAiModelProviderResponseBodyDataModelCards setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

        public GetAiModelProviderResponseBodyDataModelCards setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetAiModelProviderResponseBodyDataModelCards setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

        public GetAiModelProviderResponseBodyDataModelCards setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAiModelProviderResponseBodyDataModelCards setSourceURL(String sourceURL) {
            this.sourceURL = sourceURL;
            return this;
        }
        public String getSourceURL() {
            return this.sourceURL;
        }

        public GetAiModelProviderResponseBodyDataModelCards setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetAiModelProviderResponseBodyData extends TeaModel {
        @NameInMap("boundServices")
        public java.util.List<ServiceInfo> boundServices;

        /**
         * <strong>example:</strong>
         * <p>千问云 / 阿里云百炼</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>gw-8c13d2b4f8a1</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        @NameInMap("modelCards")
        public java.util.List<GetAiModelProviderResponseBodyDataModelCards> modelCards;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("modelCount")
        public Integer modelCount;

        /**
         * <strong>example:</strong>
         * <p>mp-8c13d2b4f8a1</p>
         */
        @NameInMap("modelProviderId")
        public String modelProviderId;

        /**
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        @NameInMap("provider")
        public String provider;

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

        public static GetAiModelProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAiModelProviderResponseBodyData self = new GetAiModelProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAiModelProviderResponseBodyData setBoundServices(java.util.List<ServiceInfo> boundServices) {
            this.boundServices = boundServices;
            return this;
        }
        public java.util.List<ServiceInfo> getBoundServices() {
            return this.boundServices;
        }

        public GetAiModelProviderResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetAiModelProviderResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetAiModelProviderResponseBodyData setModelCards(java.util.List<GetAiModelProviderResponseBodyDataModelCards> modelCards) {
            this.modelCards = modelCards;
            return this;
        }
        public java.util.List<GetAiModelProviderResponseBodyDataModelCards> getModelCards() {
            return this.modelCards;
        }

        public GetAiModelProviderResponseBodyData setModelCount(Integer modelCount) {
            this.modelCount = modelCount;
            return this;
        }
        public Integer getModelCount() {
            return this.modelCount;
        }

        public GetAiModelProviderResponseBodyData setModelProviderId(String modelProviderId) {
            this.modelProviderId = modelProviderId;
            return this;
        }
        public String getModelProviderId() {
            return this.modelProviderId;
        }

        public GetAiModelProviderResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetAiModelProviderResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAiModelProviderResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
