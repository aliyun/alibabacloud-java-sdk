// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelProviderLlmCodesResponseBody extends TeaModel {
    /**
     * <p>The paginated data object that contains the list of LLM information.</p>
     */
    @NameInMap("Data")
    public ListModelProviderLlmCodesResponseBodyData data;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records after filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListModelProviderLlmCodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelProviderLlmCodesResponseBody self = new ListModelProviderLlmCodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelProviderLlmCodesResponseBody setData(ListModelProviderLlmCodesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListModelProviderLlmCodesResponseBodyData getData() {
        return this.data;
    }

    public ListModelProviderLlmCodesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelProviderLlmCodesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelProviderLlmCodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelProviderLlmCodesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelProviderLlmCodesResponseBodyDataLlmInfoListCreditMultiplier extends TeaModel {
        /**
         * <p>The upper limit of the multiplier. An empty value indicates no upper limit. For example, if the minimum multiplier is 1 and the maximum multiplier is empty, it is displayed as starting from 1x.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Max")
        public Float max;

        /**
         * <p>The lower limit of the multiplier. If this value is equal to the maximum multiplier, it is a fixed multiplier. For example, if both the minimum and maximum multipliers are 2, it is displayed as 2x.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Min")
        public Float min;

        public static ListModelProviderLlmCodesResponseBodyDataLlmInfoListCreditMultiplier build(java.util.Map<String, ?> map) throws Exception {
            ListModelProviderLlmCodesResponseBodyDataLlmInfoListCreditMultiplier self = new ListModelProviderLlmCodesResponseBodyDataLlmInfoListCreditMultiplier();
            return TeaModel.build(map, self);
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoListCreditMultiplier setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoListCreditMultiplier setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

    }

    public static class ListModelProviderLlmCodesResponseBodyDataLlmInfoListInferenceMetadata extends TeaModel {
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

        public static ListModelProviderLlmCodesResponseBodyDataLlmInfoListInferenceMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListModelProviderLlmCodesResponseBodyDataLlmInfoListInferenceMetadata self = new ListModelProviderLlmCodesResponseBodyDataLlmInfoListInferenceMetadata();
            return TeaModel.build(map, self);
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoListInferenceMetadata setRequestModality(java.util.List<String> requestModality) {
            this.requestModality = requestModality;
            return this;
        }
        public java.util.List<String> getRequestModality() {
            return this.requestModality;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoListInferenceMetadata setResponseModality(java.util.List<String> responseModality) {
            this.responseModality = responseModality;
            return this;
        }
        public java.util.List<String> getResponseModality() {
            return this.responseModality;
        }

    }

    public static class ListModelProviderLlmCodesResponseBodyDataLlmInfoListPricesPrices extends TeaModel {
        /**
         * <p>The price in string format, such as 0.2.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Price")
        public String price;

        /**
         * <p>The name of the price item, such as input, output, or image generation.</p>
         * 
         * <strong>example:</strong>
         * <p>Input</p>
         */
        @NameInMap("PriceName")
        public String priceName;

        /**
         * <p>The price unit, such as per image or per 1,000 tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>Per image</p>
         */
        @NameInMap("PriceUnit")
        public String priceUnit;

        public static ListModelProviderLlmCodesResponseBodyDataLlmInfoListPricesPrices build(java.util.Map<String, ?> map) throws Exception {
            ListModelProviderLlmCodesResponseBodyDataLlmInfoListPricesPrices self = new ListModelProviderLlmCodesResponseBodyDataLlmInfoListPricesPrices();
            return TeaModel.build(map, self);
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoListPricesPrices setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoListPricesPrices setPriceName(String priceName) {
            this.priceName = priceName;
            return this;
        }
        public String getPriceName() {
            return this.priceName;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoListPricesPrices setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

    }

    public static class ListModelProviderLlmCodesResponseBodyDataLlmInfoListPrices extends TeaModel {
        /**
         * <p>The list of prices within the range.</p>
         */
        @NameInMap("Prices")
        public java.util.List<ListModelProviderLlmCodesResponseBodyDataLlmInfoListPricesPrices> prices;

        /**
         * <p>The name of the range, such as Default or 0-1M tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("RangeName")
        public String rangeName;

        public static ListModelProviderLlmCodesResponseBodyDataLlmInfoListPrices build(java.util.Map<String, ?> map) throws Exception {
            ListModelProviderLlmCodesResponseBodyDataLlmInfoListPrices self = new ListModelProviderLlmCodesResponseBodyDataLlmInfoListPrices();
            return TeaModel.build(map, self);
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoListPrices setPrices(java.util.List<ListModelProviderLlmCodesResponseBodyDataLlmInfoListPricesPrices> prices) {
            this.prices = prices;
            return this;
        }
        public java.util.List<ListModelProviderLlmCodesResponseBodyDataLlmInfoListPricesPrices> getPrices() {
            return this.prices;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoListPrices setRangeName(String rangeName) {
            this.rangeName = rangeName;
            return this;
        }
        public String getRangeName() {
            return this.rangeName;
        }

    }

    public static class ListModelProviderLlmCodesResponseBodyDataLlmInfoList extends TeaModel {
        /**
         * <p>The credit consumption multiplier. An empty value indicates that the model does not participate in credit billing.</p>
         */
        @NameInMap("CreditMultiplier")
        public ListModelProviderLlmCodesResponseBodyDataLlmInfoListCreditMultiplier creditMultiplier;

        /**
         * <p>The model description.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen image generation model that supports text-to-image and image editing capabilities</p>
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
        public ListModelProviderLlmCodesResponseBodyDataLlmInfoListInferenceMetadata inferenceMetadata;

        /**
         * <p>The LLM code, such as qwen-image-2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-image-2.0</p>
         */
        @NameInMap("LlmCode")
        public String llmCode;

        /**
         * <p>The model brand, such as Qwen, Wanx, or DeepSeek. This parameter is returned only for models annotated in the platform-side model pool.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        @NameInMap("ModelBrand")
        public String modelBrand;

        /**
         * <p>The model information, such as the context window size and the maximum number of input/output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;contextWindow&quot;:1000000,&quot;maxInputTokens&quot;:991808,&quot;maxReasoningTokens&quot;:262144,&quot;reasoningMaxInputTokens&quot;:983616,&quot;maxOutputTokens&quot;:131072,&quot;reasoningMaxOutputTokens&quot;:131072}</p>
         */
        @NameInMap("ModelInfo")
        public java.util.Map<String, ?> modelInfo;

        /**
         * <p>The model series, such as Qwen-Max or DeepSeek. This parameter is returned only for the wuying-credit provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen-Max</p>
         */
        @NameInMap("ModelSeries")
        public String modelSeries;

        /**
         * <p>The model name, such as Qwen-Image-2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen-Image-2.0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of price information.</p>
         */
        @NameInMap("Prices")
        public java.util.List<ListModelProviderLlmCodesResponseBodyDataLlmInfoListPrices> prices;

        /**
         * <p>The time when the model was published, in ISO 8601 format, such as 2026-03-04T06:25:17.000+00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-04T06:25:17.000+00:00</p>
         */
        @NameInMap("PublishedTime")
        public String publishedTime;

        /**
         * <p>Indicates whether the model is recommended. Valid values: true (recommended), false (explicitly not recommended), and null (not applicable, such as non-Bailian or unannotated models).</p>
         */
        @NameInMap("Recommended")
        public Boolean recommended;

        /**
         * <p>The model risk type. This parameter is returned only when includeRiskInfo is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("RiskType")
        public String riskType;

        public static ListModelProviderLlmCodesResponseBodyDataLlmInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListModelProviderLlmCodesResponseBodyDataLlmInfoList self = new ListModelProviderLlmCodesResponseBodyDataLlmInfoList();
            return TeaModel.build(map, self);
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoList setCreditMultiplier(ListModelProviderLlmCodesResponseBodyDataLlmInfoListCreditMultiplier creditMultiplier) {
            this.creditMultiplier = creditMultiplier;
            return this;
        }
        public ListModelProviderLlmCodesResponseBodyDataLlmInfoListCreditMultiplier getCreditMultiplier() {
            return this.creditMultiplier;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoList setFeatures(java.util.List<String> features) {
            this.features = features;
            return this;
        }
        public java.util.List<String> getFeatures() {
            return this.features;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoList setInferenceMetadata(ListModelProviderLlmCodesResponseBodyDataLlmInfoListInferenceMetadata inferenceMetadata) {
            this.inferenceMetadata = inferenceMetadata;
            return this;
        }
        public ListModelProviderLlmCodesResponseBodyDataLlmInfoListInferenceMetadata getInferenceMetadata() {
            return this.inferenceMetadata;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoList setLlmCode(String llmCode) {
            this.llmCode = llmCode;
            return this;
        }
        public String getLlmCode() {
            return this.llmCode;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoList setModelBrand(String modelBrand) {
            this.modelBrand = modelBrand;
            return this;
        }
        public String getModelBrand() {
            return this.modelBrand;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoList setModelInfo(java.util.Map<String, ?> modelInfo) {
            this.modelInfo = modelInfo;
            return this;
        }
        public java.util.Map<String, ?> getModelInfo() {
            return this.modelInfo;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoList setModelSeries(String modelSeries) {
            this.modelSeries = modelSeries;
            return this;
        }
        public String getModelSeries() {
            return this.modelSeries;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoList setPrices(java.util.List<ListModelProviderLlmCodesResponseBodyDataLlmInfoListPrices> prices) {
            this.prices = prices;
            return this;
        }
        public java.util.List<ListModelProviderLlmCodesResponseBodyDataLlmInfoListPrices> getPrices() {
            return this.prices;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoList setPublishedTime(String publishedTime) {
            this.publishedTime = publishedTime;
            return this;
        }
        public String getPublishedTime() {
            return this.publishedTime;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoList setRecommended(Boolean recommended) {
            this.recommended = recommended;
            return this;
        }
        public Boolean getRecommended() {
            return this.recommended;
        }

        public ListModelProviderLlmCodesResponseBodyDataLlmInfoList setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

    }

    public static class ListModelProviderLlmCodesResponseBodyData extends TeaModel {
        /**
         * <p>The list of LLM information.</p>
         */
        @NameInMap("LlmInfoList")
        public java.util.List<ListModelProviderLlmCodesResponseBodyDataLlmInfoList> llmInfoList;

        public static ListModelProviderLlmCodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModelProviderLlmCodesResponseBodyData self = new ListModelProviderLlmCodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModelProviderLlmCodesResponseBodyData setLlmInfoList(java.util.List<ListModelProviderLlmCodesResponseBodyDataLlmInfoList> llmInfoList) {
            this.llmInfoList = llmInfoList;
            return this;
        }
        public java.util.List<ListModelProviderLlmCodesResponseBodyDataLlmInfoList> getLlmInfoList() {
            return this.llmInfoList;
        }

    }

}
