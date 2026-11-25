// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryModelUsageListResponseBody extends TeaModel {
    /**
     * <p>The model usage details on the current page. If no models match or the page number exceeds the result range, an empty list is returned. For 24h or 1d queries without specified start and end dates, an empty list is also returned when no statistical results are available. For other windows or custom date ranges, no valid list data is provided when no statistical results are available. The absence of statistical results does not directly indicate that no actual calls were made.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;LlmCode&quot;:&quot;qwen3-max-2026-01-23&quot;,&quot;ModelName&quot;:&quot;Qwen3 Max&quot;,&quot;CallCount&quot;:12480,&quot;FailureCount&quot;:180,&quot;PointsConsumption&quot;:100,&quot;InputPointsRate&quot;:0.739,&quot;OutputPointsRate&quot;:0.261,&quot;SuccessRate&quot;:0.98557692,&quot;AvgTtftMs&quot;:620,&quot;CacheHitRate&quot;:0.86}]</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryModelUsageListResponseBodyData> data;

    /**
     * <p>The page number for this query, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size used for this query. The actual number of returned entries may be less than this value.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier for this request, used to locate and troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of models used for pagination. When statistical results are available, this field returns the number of models that meet the model type and keyword conditions. This may include models with 0 calls within the selected date range, so it is not necessarily equal to ActiveModelCount.</p>
     * <p><strong>When no statistical results are available within the query range, this value returns 0. You cannot determine that the business has no models or no actual calls based solely on TotalCount=0.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryModelUsageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryModelUsageListResponseBody self = new QueryModelUsageListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryModelUsageListResponseBody setData(java.util.List<QueryModelUsageListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryModelUsageListResponseBodyData> getData() {
        return this.data;
    }

    public QueryModelUsageListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryModelUsageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryModelUsageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryModelUsageListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryModelUsageListResponseBodyDataCreditMultiplier extends TeaModel {
        /**
         * <p>The upper limit of the credit multiplier, in multiples. If it is empty, it indicates that the multiplier starts from Min and no maximum multiplier is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Max")
        public Float max;

        /**
         * <p>The lower limit of the credit multiplier, in multiples. If it is equal to Max, it indicates a fixed multiplier.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Min")
        public Float min;

        public static QueryModelUsageListResponseBodyDataCreditMultiplier build(java.util.Map<String, ?> map) throws Exception {
            QueryModelUsageListResponseBodyDataCreditMultiplier self = new QueryModelUsageListResponseBodyDataCreditMultiplier();
            return TeaModel.build(map, self);
        }

        public QueryModelUsageListResponseBodyDataCreditMultiplier setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

        public QueryModelUsageListResponseBodyDataCreditMultiplier setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

    }

    public static class QueryModelUsageListResponseBodyData extends TeaModel {
        /**
         * <p>The average time to first token (TTFT) latency, which is the total duration of valid TTFT samples divided by the number of samples, in milliseconds, rounded to the nearest integer. This field is empty when no valid samples are available. It does not represent the total time taken for a complete response.</p>
         * 
         * <strong>example:</strong>
         * <p>620</p>
         */
        @NameInMap("AvgTtftMs")
        public Long avgTtftMs;

        /**
         * <p>The proportion of cached input usage to the total input usage, expressed as a decimal between 0 and 1. For example, 0.86 indicates 86%. It is not the proportion of requests that hit the cache. This field is empty when the base usage is incomplete or the total input usage is 0. The return value is rounded to a maximum of 8 decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>0.86</p>
         */
        @NameInMap("CacheHitRate")
        public Double cacheHitRate;

        /**
         * <p>The total number of model calls within the query range, including both successful and failed calls.</p>
         * 
         * <strong>example:</strong>
         * <p>12480</p>
         */
        @NameInMap("CallCount")
        public Long callCount;

        /**
         * <p>The maximum context length of the model, in tokens. This field is empty when no model information is available.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("ContextWindow")
        public Long contextWindow;

        /**
         * <p>The display range of the credit consumption multiplier, in multiples. It is used to display price hints and is not used to recalculate the PointsConsumption returned by this API operation.</p>
         * <ul>
         * <li>If Min and Max are equal: fixed multiplier.</li>
         * <li>If Max is greater than Min: multiplier range.</li>
         * <li>If Max is empty: starts from the Min multiplier.</li>
         * <li>If the entire object is empty: the model does not participate in credit billing, or no multiplier information is available. An empty value for this field alone cannot determine whether actual charges apply.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Min&quot;:1,&quot;Max&quot;:3}</p>
         */
        @NameInMap("CreditMultiplier")
        public QueryModelUsageListResponseBodyDataCreditMultiplier creditMultiplier;

        /**
         * <p>The description of the model. The display language is affected by Language. This field is empty when no description is available.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen large language model</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The proportion of explicit cache creation credits to the total credits. This field is empty when it cannot be calculated.</p>
         * 
         * <strong>example:</strong>
         * <p>0.115</p>
         */
        @NameInMap("ExplicitCacheCreationPointsRate")
        public Double explicitCacheCreationPointsRate;

        /**
         * <p>The proportion of explicit cache hit credits to the total credits. This field is empty when it cannot be calculated.</p>
         * 
         * <strong>example:</strong>
         * <p>0.043</p>
         */
        @NameInMap("ExplicitCacheHitPointsRate")
        public Double explicitCacheHitPointsRate;

        /**
         * <p>The number of failed calls within the query range, including failed calls that are throttled.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("FailureCount")
        public Long failureCount;

        /**
         * <p>The list of model capability tags. The display language is affected by Language. Capabilities without a configured display name retain their original codes. An empty list is returned when no capability information is available. Tags are extensible, not a fixed enumeration, and do not imply that all capabilities can be called through this API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Text generation&quot;,&quot;Tool calling&quot;]</p>
         */
        @NameInMap("FeatureList")
        public java.util.List<String> featureList;

        /**
         * <p>The URL of the model brand icon. This field is empty when no brand icon is available. The example URL only illustrates the URL format and is not a fixed download address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/qwen.png">https://example.com/qwen.png</a></p>
         */
        @NameInMap("IconUrl")
        public String iconUrl;

        /**
         * <p>The proportion of implicit cache hit credits to the total credits. This field is empty when it cannot be calculated.</p>
         * 
         * <strong>example:</strong>
         * <p>0.171</p>
         */
        @NameInMap("ImplicitCacheHitPointsRate")
        public Double implicitCacheHitPointsRate;

        /**
         * <p>The proportion of input credits to the total consumed credits, expressed as a decimal between 0 and 1. For example, 0.739 indicates 73.9%. This field is provided only when the input and output credit details are complete, the values are valid, and the total credits are greater than 0. Otherwise, it is empty.</p>
         * <p>The proportion is rounded to a maximum of 8 decimal places. The sum of input and output credits may be less than the total credits. Additionally, adding this value to OutputPointsRate may result in minor rounding errors. Do not calculate other credits or verify bills based solely on the sum of the proportions.</p>
         * 
         * <strong>example:</strong>
         * <p>0.739</p>
         */
        @NameInMap("InputPointsRate")
        public Double inputPointsRate;

        /**
         * <p>The new model tag. The current version does not provide this tag. Ignore this field and do not use it to determine whether a model is newly released.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("IsNew")
        public Boolean isNew;

        /**
         * <p>The identifier or code of the model, used to identify the model and associate usage and model information. The return value is an open string and should not be hardcoded as an enumeration on the client side.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-max-2026-01-23</p>
         */
        @NameInMap("LlmCode")
        public String llmCode;

        /**
         * <p>The maximum output length for a single generation of the model, in tokens. This field is empty when no model information is available.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        @NameInMap("MaxOutput")
        public Long maxOutput;

        /**
         * <p>The display name of the model brand. The display language is affected by Language. This field is empty when no brand information is available.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen</p>
         */
        @NameInMap("ModelBrandName")
        public String modelBrandName;

        /**
         * <p>The display name of the model. The display language is affected by Language. If no name is available, LlmCode is returned. The name may change, so the model code should be used when associating data.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3 Max</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The proportion of normal input credits to the total credits. This field is empty when it cannot be calculated.</p>
         * 
         * <strong>example:</strong>
         * <p>0.329</p>
         */
        @NameInMap("NormalInputPointsRate")
        public Double normalInputPointsRate;

        /**
         * <p>The proportion of output credits to the total consumed credits, expressed as a decimal between 0 and 1. For example, 0.261 indicates 26.1%. This field is provided only when the input and output credit details are complete, the values are valid, and the total credits are greater than 0. Otherwise, it is empty. The proportion is rounded to a maximum of 8 decimal places, and adding this value to InputPointsRate may result in minor rounding errors.</p>
         * 
         * <strong>example:</strong>
         * <p>0.261</p>
         */
        @NameInMap("OutputPointsRate")
        public Double outputPointsRate;

        /**
         * <p>The actual credits consumed within the query range. The return value can be displayed directly without further conversion. CreditMultiplier is only used to display the multiplier and should not be multiplied by this value.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PointsConsumption")
        public Double pointsConsumption;

        /**
         * <p>The number of successful calls divided by the total number of calls, expressed as a decimal between 0 and 1, not a percentage. This field is empty when the number of calls is 0. Multiply this value by 100 to display it as a percentage. The return value is rounded to a maximum of 8 decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>0.98557692</p>
         */
        @NameInMap("SuccessRate")
        public Double successRate;

        /**
         * <p>The proportion of tool calling credits to the total credits. This field is empty when it cannot be calculated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ToolCallPointsRate")
        public Double toolCallPointsRate;

        /**
         * <p>The 95th percentile value of the time to first token (TTFT) latency, in milliseconds. This field is provided only when corresponding data exists within a fixed statistical window. <strong>It is empty when custom start and end dates are passed, even if the start and end dates are the same.</strong> The value 700 in the field table is an example under a fixed statistical window and does not apply to custom date ranges.</p>
         * 
         * <strong>example:</strong>
         * <p>700</p>
         */
        @NameInMap("TtftP95Ms")
        public Long ttftP95Ms;

        public static QueryModelUsageListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryModelUsageListResponseBodyData self = new QueryModelUsageListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryModelUsageListResponseBodyData setAvgTtftMs(Long avgTtftMs) {
            this.avgTtftMs = avgTtftMs;
            return this;
        }
        public Long getAvgTtftMs() {
            return this.avgTtftMs;
        }

        public QueryModelUsageListResponseBodyData setCacheHitRate(Double cacheHitRate) {
            this.cacheHitRate = cacheHitRate;
            return this;
        }
        public Double getCacheHitRate() {
            return this.cacheHitRate;
        }

        public QueryModelUsageListResponseBodyData setCallCount(Long callCount) {
            this.callCount = callCount;
            return this;
        }
        public Long getCallCount() {
            return this.callCount;
        }

        public QueryModelUsageListResponseBodyData setContextWindow(Long contextWindow) {
            this.contextWindow = contextWindow;
            return this;
        }
        public Long getContextWindow() {
            return this.contextWindow;
        }

        public QueryModelUsageListResponseBodyData setCreditMultiplier(QueryModelUsageListResponseBodyDataCreditMultiplier creditMultiplier) {
            this.creditMultiplier = creditMultiplier;
            return this;
        }
        public QueryModelUsageListResponseBodyDataCreditMultiplier getCreditMultiplier() {
            return this.creditMultiplier;
        }

        public QueryModelUsageListResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryModelUsageListResponseBodyData setExplicitCacheCreationPointsRate(Double explicitCacheCreationPointsRate) {
            this.explicitCacheCreationPointsRate = explicitCacheCreationPointsRate;
            return this;
        }
        public Double getExplicitCacheCreationPointsRate() {
            return this.explicitCacheCreationPointsRate;
        }

        public QueryModelUsageListResponseBodyData setExplicitCacheHitPointsRate(Double explicitCacheHitPointsRate) {
            this.explicitCacheHitPointsRate = explicitCacheHitPointsRate;
            return this;
        }
        public Double getExplicitCacheHitPointsRate() {
            return this.explicitCacheHitPointsRate;
        }

        public QueryModelUsageListResponseBodyData setFailureCount(Long failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Long getFailureCount() {
            return this.failureCount;
        }

        public QueryModelUsageListResponseBodyData setFeatureList(java.util.List<String> featureList) {
            this.featureList = featureList;
            return this;
        }
        public java.util.List<String> getFeatureList() {
            return this.featureList;
        }

        public QueryModelUsageListResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public QueryModelUsageListResponseBodyData setImplicitCacheHitPointsRate(Double implicitCacheHitPointsRate) {
            this.implicitCacheHitPointsRate = implicitCacheHitPointsRate;
            return this;
        }
        public Double getImplicitCacheHitPointsRate() {
            return this.implicitCacheHitPointsRate;
        }

        public QueryModelUsageListResponseBodyData setInputPointsRate(Double inputPointsRate) {
            this.inputPointsRate = inputPointsRate;
            return this;
        }
        public Double getInputPointsRate() {
            return this.inputPointsRate;
        }

        public QueryModelUsageListResponseBodyData setIsNew(Boolean isNew) {
            this.isNew = isNew;
            return this;
        }
        public Boolean getIsNew() {
            return this.isNew;
        }

        public QueryModelUsageListResponseBodyData setLlmCode(String llmCode) {
            this.llmCode = llmCode;
            return this;
        }
        public String getLlmCode() {
            return this.llmCode;
        }

        public QueryModelUsageListResponseBodyData setMaxOutput(Long maxOutput) {
            this.maxOutput = maxOutput;
            return this;
        }
        public Long getMaxOutput() {
            return this.maxOutput;
        }

        public QueryModelUsageListResponseBodyData setModelBrandName(String modelBrandName) {
            this.modelBrandName = modelBrandName;
            return this;
        }
        public String getModelBrandName() {
            return this.modelBrandName;
        }

        public QueryModelUsageListResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public QueryModelUsageListResponseBodyData setNormalInputPointsRate(Double normalInputPointsRate) {
            this.normalInputPointsRate = normalInputPointsRate;
            return this;
        }
        public Double getNormalInputPointsRate() {
            return this.normalInputPointsRate;
        }

        public QueryModelUsageListResponseBodyData setOutputPointsRate(Double outputPointsRate) {
            this.outputPointsRate = outputPointsRate;
            return this;
        }
        public Double getOutputPointsRate() {
            return this.outputPointsRate;
        }

        public QueryModelUsageListResponseBodyData setPointsConsumption(Double pointsConsumption) {
            this.pointsConsumption = pointsConsumption;
            return this;
        }
        public Double getPointsConsumption() {
            return this.pointsConsumption;
        }

        public QueryModelUsageListResponseBodyData setSuccessRate(Double successRate) {
            this.successRate = successRate;
            return this;
        }
        public Double getSuccessRate() {
            return this.successRate;
        }

        public QueryModelUsageListResponseBodyData setToolCallPointsRate(Double toolCallPointsRate) {
            this.toolCallPointsRate = toolCallPointsRate;
            return this;
        }
        public Double getToolCallPointsRate() {
            return this.toolCallPointsRate;
        }

        public QueryModelUsageListResponseBodyData setTtftP95Ms(Long ttftP95Ms) {
            this.ttftP95Ms = ttftP95Ms;
            return this;
        }
        public Long getTtftP95Ms() {
            return this.ttftP95Ms;
        }

    }

}
