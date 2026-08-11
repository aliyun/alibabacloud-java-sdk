// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListModelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>The specified parameter is invalid</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("models")
    public java.util.List<ListModelsResponseBodyModels> models;

    /**
     * <strong>example:</strong>
     * <p>lwytFRtLdNk=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>36045E0A-551D-592D-B1BC-4C56596CE59E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelsResponseBody self = new ListModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListModelsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListModelsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListModelsResponseBody setModels(java.util.List<ListModelsResponseBodyModels> models) {
        this.models = models;
        return this;
    }
    public java.util.List<ListModelsResponseBodyModels> getModels() {
        return this.models;
    }

    public ListModelsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListModelsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelsResponseBodyModelsInferenceMetadata extends TeaModel {
        @NameInMap("requestModality")
        public java.util.List<String> requestModality;

        @NameInMap("responseModality")
        public java.util.List<String> responseModality;

        public static ListModelsResponseBodyModelsInferenceMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyModelsInferenceMetadata self = new ListModelsResponseBodyModelsInferenceMetadata();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyModelsInferenceMetadata setRequestModality(java.util.List<String> requestModality) {
            this.requestModality = requestModality;
            return this;
        }
        public java.util.List<String> getRequestModality() {
            return this.requestModality;
        }

        public ListModelsResponseBodyModelsInferenceMetadata setResponseModality(java.util.List<String> responseModality) {
            this.responseModality = responseModality;
            return this;
        }
        public java.util.List<String> getResponseModality() {
            return this.responseModality;
        }

    }

    public static class ListModelsResponseBodyModelsModelInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("contextWindow")
        public Long contextWindow;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxInputTokens")
        public Long maxInputTokens;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxOutputTokens")
        public Long maxOutputTokens;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxReasoningTokens")
        public Long maxReasoningTokens;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("reasoningMaxInputTokens")
        public Long reasoningMaxInputTokens;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("reasoningMaxOutputTokens")
        public Long reasoningMaxOutputTokens;

        public static ListModelsResponseBodyModelsModelInfo build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyModelsModelInfo self = new ListModelsResponseBodyModelsModelInfo();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyModelsModelInfo setContextWindow(Long contextWindow) {
            this.contextWindow = contextWindow;
            return this;
        }
        public Long getContextWindow() {
            return this.contextWindow;
        }

        public ListModelsResponseBodyModelsModelInfo setMaxInputTokens(Long maxInputTokens) {
            this.maxInputTokens = maxInputTokens;
            return this;
        }
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        public ListModelsResponseBodyModelsModelInfo setMaxOutputTokens(Long maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public ListModelsResponseBodyModelsModelInfo setMaxReasoningTokens(Long maxReasoningTokens) {
            this.maxReasoningTokens = maxReasoningTokens;
            return this;
        }
        public Long getMaxReasoningTokens() {
            return this.maxReasoningTokens;
        }

        public ListModelsResponseBodyModelsModelInfo setReasoningMaxInputTokens(Long reasoningMaxInputTokens) {
            this.reasoningMaxInputTokens = reasoningMaxInputTokens;
            return this;
        }
        public Long getReasoningMaxInputTokens() {
            return this.reasoningMaxInputTokens;
        }

        public ListModelsResponseBodyModelsModelInfo setReasoningMaxOutputTokens(Long reasoningMaxOutputTokens) {
            this.reasoningMaxOutputTokens = reasoningMaxOutputTokens;
            return this;
        }
        public Long getReasoningMaxOutputTokens() {
            return this.reasoningMaxOutputTokens;
        }

    }

    public static class ListModelsResponseBodyModelsPricesPrices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("price")
        public String price;

        /**
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("priceName")
        public String priceName;

        /**
         * <strong>example:</strong>
         * <p>Per 1M tokens</p>
         */
        @NameInMap("priceUnit")
        public String priceUnit;

        public static ListModelsResponseBodyModelsPricesPrices build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyModelsPricesPrices self = new ListModelsResponseBodyModelsPricesPrices();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyModelsPricesPrices setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public ListModelsResponseBodyModelsPricesPrices setPriceName(String priceName) {
            this.priceName = priceName;
            return this;
        }
        public String getPriceName() {
            return this.priceName;
        }

        public ListModelsResponseBodyModelsPricesPrices setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

    }

    public static class ListModelsResponseBodyModelsPrices extends TeaModel {
        @NameInMap("prices")
        public java.util.List<ListModelsResponseBodyModelsPricesPrices> prices;

        /**
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("rangeName")
        public String rangeName;

        public static ListModelsResponseBodyModelsPrices build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyModelsPrices self = new ListModelsResponseBodyModelsPrices();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyModelsPrices setPrices(java.util.List<ListModelsResponseBodyModelsPricesPrices> prices) {
            this.prices = prices;
            return this;
        }
        public java.util.List<ListModelsResponseBodyModelsPricesPrices> getPrices() {
            return this.prices;
        }

        public ListModelsResponseBodyModelsPrices setRangeName(String rangeName) {
            this.rangeName = rangeName;
            return this;
        }
        public String getRangeName() {
            return this.rangeName;
        }

    }

    public static class ListModelsResponseBodyModels extends TeaModel {
        @NameInMap("capabilities")
        public java.util.List<String> capabilities;

        /**
         * <strong>example:</strong>
         * <p>provided by qwen</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("features")
        public java.util.List<String> features;

        @NameInMap("inferenceMetadata")
        public ListModelsResponseBodyModelsInferenceMetadata inferenceMetadata;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("model")
        public String model;

        @NameInMap("modelInfo")
        public ListModelsResponseBodyModelsModelInfo modelInfo;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("prices")
        public java.util.List<ListModelsResponseBodyModelsPrices> prices;

        /**
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        @NameInMap("provider")
        public String provider;

        /**
         * <strong>example:</strong>
         * <p>1779268196000</p>
         */
        @NameInMap("publishedTime")
        public Long publishedTime;

        public static ListModelsResponseBodyModels build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyModels self = new ListModelsResponseBodyModels();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyModels setCapabilities(java.util.List<String> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

        public ListModelsResponseBodyModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelsResponseBodyModels setFeatures(java.util.List<String> features) {
            this.features = features;
            return this;
        }
        public java.util.List<String> getFeatures() {
            return this.features;
        }

        public ListModelsResponseBodyModels setInferenceMetadata(ListModelsResponseBodyModelsInferenceMetadata inferenceMetadata) {
            this.inferenceMetadata = inferenceMetadata;
            return this;
        }
        public ListModelsResponseBodyModelsInferenceMetadata getInferenceMetadata() {
            return this.inferenceMetadata;
        }

        public ListModelsResponseBodyModels setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListModelsResponseBodyModels setModelInfo(ListModelsResponseBodyModelsModelInfo modelInfo) {
            this.modelInfo = modelInfo;
            return this;
        }
        public ListModelsResponseBodyModelsModelInfo getModelInfo() {
            return this.modelInfo;
        }

        public ListModelsResponseBodyModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModelsResponseBodyModels setPrices(java.util.List<ListModelsResponseBodyModelsPrices> prices) {
            this.prices = prices;
            return this;
        }
        public java.util.List<ListModelsResponseBodyModelsPrices> getPrices() {
            return this.prices;
        }

        public ListModelsResponseBodyModels setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListModelsResponseBodyModels setPublishedTime(Long publishedTime) {
            this.publishedTime = publishedTime;
            return this;
        }
        public Long getPublishedTime() {
            return this.publishedTime;
        }

    }

}
