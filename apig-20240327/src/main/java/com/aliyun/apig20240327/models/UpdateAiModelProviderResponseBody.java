// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAiModelProviderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpdateAiModelProviderResponseBodyData data;

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

    public static UpdateAiModelProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiModelProviderResponseBody self = new UpdateAiModelProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAiModelProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAiModelProviderResponseBody setData(UpdateAiModelProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAiModelProviderResponseBodyData getData() {
        return this.data;
    }

    public UpdateAiModelProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAiModelProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAiModelProviderResponseBodyDataModelCardsAvailablePaths extends TeaModel {
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

        public static UpdateAiModelProviderResponseBodyDataModelCardsAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelProviderResponseBodyDataModelCardsAvailablePaths self = new UpdateAiModelProviderResponseBodyDataModelCardsAvailablePaths();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelProviderResponseBodyDataModelCardsAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateAiModelProviderResponseBodyDataModelCardsAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateAiModelProviderResponseBodyDataModelCardsCredit extends TeaModel {
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

        public static UpdateAiModelProviderResponseBodyDataModelCardsCredit build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelProviderResponseBodyDataModelCardsCredit self = new UpdateAiModelProviderResponseBodyDataModelCardsCredit();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelProviderResponseBodyDataModelCardsCredit setCacheCost(Float cacheCost) {
            this.cacheCost = cacheCost;
            return this;
        }
        public Float getCacheCost() {
            return this.cacheCost;
        }

        public UpdateAiModelProviderResponseBodyDataModelCardsCredit setInputCost(Float inputCost) {
            this.inputCost = inputCost;
            return this;
        }
        public Float getInputCost() {
            return this.inputCost;
        }

        public UpdateAiModelProviderResponseBodyDataModelCardsCredit setOutputCost(Float outputCost) {
            this.outputCost = outputCost;
            return this;
        }
        public Float getOutputCost() {
            return this.outputCost;
        }

        public UpdateAiModelProviderResponseBodyDataModelCardsCredit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateAiModelProviderResponseBodyDataModelCardsMeta extends TeaModel {
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

        public static UpdateAiModelProviderResponseBodyDataModelCardsMeta build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelProviderResponseBodyDataModelCardsMeta self = new UpdateAiModelProviderResponseBodyDataModelCardsMeta();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelProviderResponseBodyDataModelCardsMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public UpdateAiModelProviderResponseBodyDataModelCardsMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public UpdateAiModelProviderResponseBodyDataModelCardsMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public UpdateAiModelProviderResponseBodyDataModelCardsMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public UpdateAiModelProviderResponseBodyDataModelCardsMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

    public static class UpdateAiModelProviderResponseBodyDataModelCards extends TeaModel {
        @NameInMap("availablePaths")
        public java.util.List<UpdateAiModelProviderResponseBodyDataModelCardsAvailablePaths> availablePaths;

        @NameInMap("credit")
        public UpdateAiModelProviderResponseBodyDataModelCardsCredit credit;

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
        public UpdateAiModelProviderResponseBodyDataModelCardsMeta meta;

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

        public static UpdateAiModelProviderResponseBodyDataModelCards build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelProviderResponseBodyDataModelCards self = new UpdateAiModelProviderResponseBodyDataModelCards();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelProviderResponseBodyDataModelCards setAvailablePaths(java.util.List<UpdateAiModelProviderResponseBodyDataModelCardsAvailablePaths> availablePaths) {
            this.availablePaths = availablePaths;
            return this;
        }
        public java.util.List<UpdateAiModelProviderResponseBodyDataModelCardsAvailablePaths> getAvailablePaths() {
            return this.availablePaths;
        }

        public UpdateAiModelProviderResponseBodyDataModelCards setCredit(UpdateAiModelProviderResponseBodyDataModelCardsCredit credit) {
            this.credit = credit;
            return this;
        }
        public UpdateAiModelProviderResponseBodyDataModelCardsCredit getCredit() {
            return this.credit;
        }

        public UpdateAiModelProviderResponseBodyDataModelCards setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public UpdateAiModelProviderResponseBodyDataModelCards setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public UpdateAiModelProviderResponseBodyDataModelCards setMeta(UpdateAiModelProviderResponseBodyDataModelCardsMeta meta) {
            this.meta = meta;
            return this;
        }
        public UpdateAiModelProviderResponseBodyDataModelCardsMeta getMeta() {
            return this.meta;
        }

        public UpdateAiModelProviderResponseBodyDataModelCards setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

        public UpdateAiModelProviderResponseBodyDataModelCards setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateAiModelProviderResponseBodyDataModelCards setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

        public UpdateAiModelProviderResponseBodyDataModelCards setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateAiModelProviderResponseBodyDataModelCards setSourceURL(String sourceURL) {
            this.sourceURL = sourceURL;
            return this;
        }
        public String getSourceURL() {
            return this.sourceURL;
        }

        public UpdateAiModelProviderResponseBodyDataModelCards setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class UpdateAiModelProviderResponseBodyData extends TeaModel {
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
        public java.util.List<UpdateAiModelProviderResponseBodyDataModelCards> modelCards;

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

        public static UpdateAiModelProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiModelProviderResponseBodyData self = new UpdateAiModelProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAiModelProviderResponseBodyData setBoundServices(java.util.List<ServiceInfo> boundServices) {
            this.boundServices = boundServices;
            return this;
        }
        public java.util.List<ServiceInfo> getBoundServices() {
            return this.boundServices;
        }

        public UpdateAiModelProviderResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateAiModelProviderResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public UpdateAiModelProviderResponseBodyData setModelCards(java.util.List<UpdateAiModelProviderResponseBodyDataModelCards> modelCards) {
            this.modelCards = modelCards;
            return this;
        }
        public java.util.List<UpdateAiModelProviderResponseBodyDataModelCards> getModelCards() {
            return this.modelCards;
        }

        public UpdateAiModelProviderResponseBodyData setModelCount(Integer modelCount) {
            this.modelCount = modelCount;
            return this;
        }
        public Integer getModelCount() {
            return this.modelCount;
        }

        public UpdateAiModelProviderResponseBodyData setModelProviderId(String modelProviderId) {
            this.modelProviderId = modelProviderId;
            return this;
        }
        public String getModelProviderId() {
            return this.modelProviderId;
        }

        public UpdateAiModelProviderResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public UpdateAiModelProviderResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateAiModelProviderResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
