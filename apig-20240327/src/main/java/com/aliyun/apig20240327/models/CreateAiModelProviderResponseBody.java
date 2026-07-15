// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAiModelProviderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateAiModelProviderResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>464F9EA0-1052-51BD-8187-D292AA2D8D24</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateAiModelProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAiModelProviderResponseBody self = new CreateAiModelProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAiModelProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAiModelProviderResponseBody setData(CreateAiModelProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAiModelProviderResponseBodyData getData() {
        return this.data;
    }

    public CreateAiModelProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAiModelProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAiModelProviderResponseBodyDataModelCardsAvailablePaths extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/v1/chat/completions</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>chat</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateAiModelProviderResponseBodyDataModelCardsAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelProviderResponseBodyDataModelCardsAvailablePaths self = new CreateAiModelProviderResponseBodyDataModelCardsAvailablePaths();
            return TeaModel.build(map, self);
        }

        public CreateAiModelProviderResponseBodyDataModelCardsAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateAiModelProviderResponseBodyDataModelCardsAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAiModelProviderResponseBodyDataModelCardsCredit extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.015</p>
         */
        @NameInMap("cacheCost")
        public Float cacheCost;

        /**
         * <strong>example:</strong>
         * <p>0.03</p>
         */
        @NameInMap("inputCost")
        public Float inputCost;

        /**
         * <strong>example:</strong>
         * <p>0.06</p>
         */
        @NameInMap("outputCost")
        public Float outputCost;

        /**
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateAiModelProviderResponseBodyDataModelCardsCredit build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelProviderResponseBodyDataModelCardsCredit self = new CreateAiModelProviderResponseBodyDataModelCardsCredit();
            return TeaModel.build(map, self);
        }

        public CreateAiModelProviderResponseBodyDataModelCardsCredit setCacheCost(Float cacheCost) {
            this.cacheCost = cacheCost;
            return this;
        }
        public Float getCacheCost() {
            return this.cacheCost;
        }

        public CreateAiModelProviderResponseBodyDataModelCardsCredit setInputCost(Float inputCost) {
            this.inputCost = inputCost;
            return this;
        }
        public Float getInputCost() {
            return this.inputCost;
        }

        public CreateAiModelProviderResponseBodyDataModelCardsCredit setOutputCost(Float outputCost) {
            this.outputCost = outputCost;
            return this;
        }
        public Float getOutputCost() {
            return this.outputCost;
        }

        public CreateAiModelProviderResponseBodyDataModelCardsCredit setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAiModelProviderResponseBodyDataModelCardsMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>128000</p>
         */
        @NameInMap("maxInputTokens")
        public Long maxInputTokens;

        /**
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("maxOutputTokens")
        public Long maxOutputTokens;

        /**
         * <strong>example:</strong>
         * <p>132096</p>
         */
        @NameInMap("maxTokens")
        public Long maxTokens;

        @NameInMap("supportedInputModalities")
        public java.util.List<String> supportedInputModalities;

        @NameInMap("supportedOutputModalities")
        public java.util.List<String> supportedOutputModalities;

        public static CreateAiModelProviderResponseBodyDataModelCardsMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelProviderResponseBodyDataModelCardsMeta self = new CreateAiModelProviderResponseBodyDataModelCardsMeta();
            return TeaModel.build(map, self);
        }

        public CreateAiModelProviderResponseBodyDataModelCardsMeta setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public CreateAiModelProviderResponseBodyDataModelCardsMeta setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public CreateAiModelProviderResponseBodyDataModelCardsMeta setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public CreateAiModelProviderResponseBodyDataModelCardsMeta setSupportedInputModalities(java.util.List<String> supportedInputModalities) {
            this.supportedInputModalities = supportedInputModalities;
            return this;
        }
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        public CreateAiModelProviderResponseBodyDataModelCardsMeta setSupportedOutputModalities(java.util.List<String> supportedOutputModalities) {
            this.supportedOutputModalities = supportedOutputModalities;
            return this;
        }
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

    }

    public static class CreateAiModelProviderResponseBodyDataModelCards extends TeaModel {
        @NameInMap("availablePaths")
        public java.util.List<CreateAiModelProviderResponseBodyDataModelCardsAvailablePaths> availablePaths;

        @NameInMap("credit")
        public CreateAiModelProviderResponseBodyDataModelCardsCredit credit;

        /**
         * <strong>example:</strong>
         * <p>{&quot;stream&quot;:true,&quot;tools&quot;:true}</p>
         */
        @NameInMap("features")
        public java.util.Map<String, ?> features;

        /**
         * <strong>example:</strong>
         * <p>gw-ucbx3s2m****</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        @NameInMap("meta")
        public CreateAiModelProviderResponseBodyDataModelCardsMeta meta;

        /**
         * <strong>example:</strong>
         * <p>mc-xxx****</p>
         */
        @NameInMap("modelCardId")
        public String modelCardId;

        /**
         * <strong>example:</strong>
         * <p>gpt-4</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>openai</p>
         */
        @NameInMap("modelProvider")
        public String modelProvider;

        /**
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>2024-07-03T10:48:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static CreateAiModelProviderResponseBodyDataModelCards build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelProviderResponseBodyDataModelCards self = new CreateAiModelProviderResponseBodyDataModelCards();
            return TeaModel.build(map, self);
        }

        public CreateAiModelProviderResponseBodyDataModelCards setAvailablePaths(java.util.List<CreateAiModelProviderResponseBodyDataModelCardsAvailablePaths> availablePaths) {
            this.availablePaths = availablePaths;
            return this;
        }
        public java.util.List<CreateAiModelProviderResponseBodyDataModelCardsAvailablePaths> getAvailablePaths() {
            return this.availablePaths;
        }

        public CreateAiModelProviderResponseBodyDataModelCards setCredit(CreateAiModelProviderResponseBodyDataModelCardsCredit credit) {
            this.credit = credit;
            return this;
        }
        public CreateAiModelProviderResponseBodyDataModelCardsCredit getCredit() {
            return this.credit;
        }

        public CreateAiModelProviderResponseBodyDataModelCards setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public CreateAiModelProviderResponseBodyDataModelCards setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public CreateAiModelProviderResponseBodyDataModelCards setMeta(CreateAiModelProviderResponseBodyDataModelCardsMeta meta) {
            this.meta = meta;
            return this;
        }
        public CreateAiModelProviderResponseBodyDataModelCardsMeta getMeta() {
            return this.meta;
        }

        public CreateAiModelProviderResponseBodyDataModelCards setModelCardId(String modelCardId) {
            this.modelCardId = modelCardId;
            return this;
        }
        public String getModelCardId() {
            return this.modelCardId;
        }

        public CreateAiModelProviderResponseBodyDataModelCards setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public CreateAiModelProviderResponseBodyDataModelCards setModelProvider(String modelProvider) {
            this.modelProvider = modelProvider;
            return this;
        }
        public String getModelProvider() {
            return this.modelProvider;
        }

        public CreateAiModelProviderResponseBodyDataModelCards setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateAiModelProviderResponseBodyDataModelCards setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class CreateAiModelProviderResponseBodyData extends TeaModel {
        @NameInMap("boundServices")
        public java.util.List<ServiceInfo> boundServices;

        /**
         * <strong>example:</strong>
         * <p>OpenAI</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>gw-ucbx3s2m****</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        @NameInMap("modelCards")
        public java.util.List<CreateAiModelProviderResponseBodyDataModelCards> modelCards;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("modelCount")
        public Integer modelCount;

        /**
         * <strong>example:</strong>
         * <p>mp-xxx****</p>
         */
        @NameInMap("modelProviderId")
        public String modelProviderId;

        /**
         * <strong>example:</strong>
         * <p>openai</p>
         */
        @NameInMap("provider")
        public String provider;

        /**
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>2024-07-03T10:48:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static CreateAiModelProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAiModelProviderResponseBodyData self = new CreateAiModelProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAiModelProviderResponseBodyData setBoundServices(java.util.List<ServiceInfo> boundServices) {
            this.boundServices = boundServices;
            return this;
        }
        public java.util.List<ServiceInfo> getBoundServices() {
            return this.boundServices;
        }

        public CreateAiModelProviderResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateAiModelProviderResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public CreateAiModelProviderResponseBodyData setModelCards(java.util.List<CreateAiModelProviderResponseBodyDataModelCards> modelCards) {
            this.modelCards = modelCards;
            return this;
        }
        public java.util.List<CreateAiModelProviderResponseBodyDataModelCards> getModelCards() {
            return this.modelCards;
        }

        public CreateAiModelProviderResponseBodyData setModelCount(Integer modelCount) {
            this.modelCount = modelCount;
            return this;
        }
        public Integer getModelCount() {
            return this.modelCount;
        }

        public CreateAiModelProviderResponseBodyData setModelProviderId(String modelProviderId) {
            this.modelProviderId = modelProviderId;
            return this;
        }
        public String getModelProviderId() {
            return this.modelProviderId;
        }

        public CreateAiModelProviderResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public CreateAiModelProviderResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateAiModelProviderResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
