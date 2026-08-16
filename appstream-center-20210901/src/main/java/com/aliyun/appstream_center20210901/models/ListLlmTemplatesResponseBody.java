// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListLlmTemplatesResponseBody extends TeaModel {
    /**
     * <p>The list of returned data objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListLlmTemplatesResponseBodyData> data;

    /**
     * <p>The current page number of the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of query results per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of query results.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLlmTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLlmTemplatesResponseBody self = new ListLlmTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLlmTemplatesResponseBody setData(java.util.List<ListLlmTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLlmTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListLlmTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLlmTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLlmTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLlmTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLlmTemplatesResponseBodyDataCreditMultiplier extends TeaModel {
        /**
         * <p>The maximum multiplier. A null value indicates no upper limit. For example, Min=1 with Max as null is displayed as 1x and above.</p>
         */
        @NameInMap("Max")
        public Float max;

        /**
         * <p>The minimum multiplier. When equal to Max, it represents a fixed multiplier. For example, Min=Max=2 is displayed as 2x.</p>
         */
        @NameInMap("Min")
        public Float min;

        public static ListLlmTemplatesResponseBodyDataCreditMultiplier build(java.util.Map<String, ?> map) throws Exception {
            ListLlmTemplatesResponseBodyDataCreditMultiplier self = new ListLlmTemplatesResponseBodyDataCreditMultiplier();
            return TeaModel.build(map, self);
        }

        public ListLlmTemplatesResponseBodyDataCreditMultiplier setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

        public ListLlmTemplatesResponseBodyDataCreditMultiplier setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

    }

    public static class ListLlmTemplatesResponseBodyDataInferenceMetadata extends TeaModel {
        /**
         * <p>The list of request modalities, such as Text, Image, and Audio.</p>
         */
        @NameInMap("RequestModality")
        public java.util.List<String> requestModality;

        /**
         * <p>The list of response modalities, such as Text, Image, and Audio.</p>
         */
        @NameInMap("ResponseModality")
        public java.util.List<String> responseModality;

        public static ListLlmTemplatesResponseBodyDataInferenceMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListLlmTemplatesResponseBodyDataInferenceMetadata self = new ListLlmTemplatesResponseBodyDataInferenceMetadata();
            return TeaModel.build(map, self);
        }

        public ListLlmTemplatesResponseBodyDataInferenceMetadata setRequestModality(java.util.List<String> requestModality) {
            this.requestModality = requestModality;
            return this;
        }
        public java.util.List<String> getRequestModality() {
            return this.requestModality;
        }

        public ListLlmTemplatesResponseBodyDataInferenceMetadata setResponseModality(java.util.List<String> responseModality) {
            this.responseModality = responseModality;
            return this;
        }
        public java.util.List<String> getResponseModality() {
            return this.responseModality;
        }

    }

    public static class ListLlmTemplatesResponseBodyDataPricesPrices extends TeaModel {
        /**
         * <p>The price in string format, such as 0.2.</p>
         */
        @NameInMap("Price")
        public String price;

        /**
         * <p>The price name, such as Input, Output, or Image Generation.</p>
         */
        @NameInMap("PriceName")
        public String priceName;

        /**
         * <p>The price unit, such as per image or per thousand tokens.</p>
         */
        @NameInMap("PriceUnit")
        public String priceUnit;

        public static ListLlmTemplatesResponseBodyDataPricesPrices build(java.util.Map<String, ?> map) throws Exception {
            ListLlmTemplatesResponseBodyDataPricesPrices self = new ListLlmTemplatesResponseBodyDataPricesPrices();
            return TeaModel.build(map, self);
        }

        public ListLlmTemplatesResponseBodyDataPricesPrices setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public ListLlmTemplatesResponseBodyDataPricesPrices setPriceName(String priceName) {
            this.priceName = priceName;
            return this;
        }
        public String getPriceName() {
            return this.priceName;
        }

        public ListLlmTemplatesResponseBodyDataPricesPrices setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

    }

    public static class ListLlmTemplatesResponseBodyDataPrices extends TeaModel {
        /**
         * <p>The list of prices within the range.</p>
         */
        @NameInMap("Prices")
        public java.util.List<ListLlmTemplatesResponseBodyDataPricesPrices> prices;

        /**
         * <p>The range name, such as Default or 0-1M tokens.</p>
         */
        @NameInMap("RangeName")
        public String rangeName;

        public static ListLlmTemplatesResponseBodyDataPrices build(java.util.Map<String, ?> map) throws Exception {
            ListLlmTemplatesResponseBodyDataPrices self = new ListLlmTemplatesResponseBodyDataPrices();
            return TeaModel.build(map, self);
        }

        public ListLlmTemplatesResponseBodyDataPrices setPrices(java.util.List<ListLlmTemplatesResponseBodyDataPricesPrices> prices) {
            this.prices = prices;
            return this;
        }
        public java.util.List<ListLlmTemplatesResponseBodyDataPricesPrices> getPrices() {
            return this.prices;
        }

        public ListLlmTemplatesResponseBodyDataPrices setRangeName(String rangeName) {
            this.rangeName = rangeName;
            return this;
        }
        public String getRangeName() {
            return this.rangeName;
        }

    }

    public static class ListLlmTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>The model configuration JSON object.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;id&quot;: &quot;qwen3.6-plus&quot;,
         *     &quot;cost&quot;: {
         *         &quot;input&quot;: 0,
         *         &quot;output&quot;: 0,
         *         &quot;cacheRead&quot;: 0,
         *         &quot;cacheWrite&quot;: 0
         *     },
         *     &quot;name&quot;: &quot;Qwen3.6-Plus&quot;,
         *     &quot;input&quot;: [&quot;image&quot;, &quot;text&quot;],
         *     &quot;compat&quot;: {
         *         &quot;supportsUsageInStreaming&quot;: true
         *     },
         *     &quot;maxTokens&quot;: 65536,
         *     &quot;reasoning&quot;: false,
         *     &quot;contextWindow&quot;: 1000000
         * }</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The credit consumption multiplier (rate). A null value indicates that the model does not participate in credit-based billing.</p>
         */
        @NameInMap("CreditMultiplier")
        public ListLlmTemplatesResponseBodyDataCreditMultiplier creditMultiplier;

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen Plus series models</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of model features, such as function-calling, web-search, and structured-outputs.</p>
         */
        @NameInMap("Features")
        public java.util.List<String> features;

        /**
         * <p>The inference metadata, including request and response modalities.</p>
         */
        @NameInMap("InferenceMetadata")
        public ListLlmTemplatesResponseBodyDataInferenceMetadata inferenceMetadata;

        /**
         * <p>Indicates whether this is the default model under the associated model group.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefaultModel")
        public Boolean isDefaultModel;

        /**
         * <p>The model code.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.6-plus</p>
         */
        @NameInMap("LlmCode")
        public String llmCode;

        /**
         * <p>The model template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>llmt-xxxx</p>
         */
        @NameInMap("LlmTemplateId")
        public String llmTemplateId;

        /**
         * <p>The model information, including context window size and maximum input/output tokens.</p>
         */
        @NameInMap("ModelInfo")
        public java.util.Map<String, ?> modelInfo;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3.6-Plus</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of price information.</p>
         */
        @NameInMap("Prices")
        public java.util.List<ListLlmTemplatesResponseBodyDataPrices> prices;

        /**
         * <p>The ID of the model provider template.</p>
         * 
         * <strong>example:</strong>
         * <p>mpt-xxxx</p>
         */
        @NameInMap("ProviderTemplateId")
        public String providerTemplateId;

        /**
         * <p>The publish time in ISO 8601 format, such as 2026-03-04T06:25:17.000+00:00.</p>
         */
        @NameInMap("PublishedTime")
        public String publishedTime;

        /**
         * <p>The authorization scope of the associated model group. Valid values: ALL_USER (all users), USER_MIXED (specified users and user groups), RESOURCE_MIXED (specified resources). Returned only when SmartModel is set to true.</p>
         */
        @NameInMap("RefScope")
        public String refScope;

        /**
         * <p>The number of route policies configured under this model tier. Returned only when SmartModel is set to true. Returns 0 for tiers without configured policies.</p>
         */
        @NameInMap("RoutePolicyCount")
        public Integer routePolicyCount;

        public static ListLlmTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLlmTemplatesResponseBodyData self = new ListLlmTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLlmTemplatesResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListLlmTemplatesResponseBodyData setCreditMultiplier(ListLlmTemplatesResponseBodyDataCreditMultiplier creditMultiplier) {
            this.creditMultiplier = creditMultiplier;
            return this;
        }
        public ListLlmTemplatesResponseBodyDataCreditMultiplier getCreditMultiplier() {
            return this.creditMultiplier;
        }

        public ListLlmTemplatesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLlmTemplatesResponseBodyData setFeatures(java.util.List<String> features) {
            this.features = features;
            return this;
        }
        public java.util.List<String> getFeatures() {
            return this.features;
        }

        public ListLlmTemplatesResponseBodyData setInferenceMetadata(ListLlmTemplatesResponseBodyDataInferenceMetadata inferenceMetadata) {
            this.inferenceMetadata = inferenceMetadata;
            return this;
        }
        public ListLlmTemplatesResponseBodyDataInferenceMetadata getInferenceMetadata() {
            return this.inferenceMetadata;
        }

        public ListLlmTemplatesResponseBodyData setIsDefaultModel(Boolean isDefaultModel) {
            this.isDefaultModel = isDefaultModel;
            return this;
        }
        public Boolean getIsDefaultModel() {
            return this.isDefaultModel;
        }

        public ListLlmTemplatesResponseBodyData setLlmCode(String llmCode) {
            this.llmCode = llmCode;
            return this;
        }
        public String getLlmCode() {
            return this.llmCode;
        }

        public ListLlmTemplatesResponseBodyData setLlmTemplateId(String llmTemplateId) {
            this.llmTemplateId = llmTemplateId;
            return this;
        }
        public String getLlmTemplateId() {
            return this.llmTemplateId;
        }

        public ListLlmTemplatesResponseBodyData setModelInfo(java.util.Map<String, ?> modelInfo) {
            this.modelInfo = modelInfo;
            return this;
        }
        public java.util.Map<String, ?> getModelInfo() {
            return this.modelInfo;
        }

        public ListLlmTemplatesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLlmTemplatesResponseBodyData setPrices(java.util.List<ListLlmTemplatesResponseBodyDataPrices> prices) {
            this.prices = prices;
            return this;
        }
        public java.util.List<ListLlmTemplatesResponseBodyDataPrices> getPrices() {
            return this.prices;
        }

        public ListLlmTemplatesResponseBodyData setProviderTemplateId(String providerTemplateId) {
            this.providerTemplateId = providerTemplateId;
            return this;
        }
        public String getProviderTemplateId() {
            return this.providerTemplateId;
        }

        public ListLlmTemplatesResponseBodyData setPublishedTime(String publishedTime) {
            this.publishedTime = publishedTime;
            return this;
        }
        public String getPublishedTime() {
            return this.publishedTime;
        }

        public ListLlmTemplatesResponseBodyData setRefScope(String refScope) {
            this.refScope = refScope;
            return this;
        }
        public String getRefScope() {
            return this.refScope;
        }

        public ListLlmTemplatesResponseBodyData setRoutePolicyCount(Integer routePolicyCount) {
            this.routePolicyCount = routePolicyCount;
            return this;
        }
        public Integer getRoutePolicyCount() {
            return this.routePolicyCount;
        }

    }

}
