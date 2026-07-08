// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetEnterpriseVocAnalysisTaskResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the enterprise VOC analysis.</p>
     */
    @NameInMap("Data")
    public GetEnterpriseVocAnalysisTaskResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. \<code>true\\</code> indicates success. \<code>false\\</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetEnterpriseVocAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseVocAnalysisTaskResponseBody self = new GetEnterpriseVocAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseVocAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnterpriseVocAnalysisTaskResponseBody setData(GetEnterpriseVocAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnterpriseVocAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public GetEnterpriseVocAnalysisTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetEnterpriseVocAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEnterpriseVocAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEnterpriseVocAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic extends TeaModel {
        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <p>The type of the tag mining task. Valid values: \<code>singleTagValue\\</code> (single tag), \<code>multiTagValues\\</code> (multiple tags), and \<code>summaryAndOverview\\</code> (summary and overview).</p>
         * 
         * <strong>example:</strong>
         * <p>multiTagValues</p>
         */
        @NameInMap("TagTaskType")
        public String tagTaskType;

        /**
         * <p>The number of tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ValueCount")
        public Integer valueCount;

        public static GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic self = new GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic setTagTaskType(String tagTaskType) {
            this.tagTaskType = tagTaskType;
            return this;
        }
        public String getTagTaskType() {
            return this.tagTaskType;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic setValueCount(Integer valueCount) {
            this.valueCount = valueCount;
            return this;
        }
        public Integer getValueCount() {
            return this.valueCount;
        }

    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics extends TeaModel {
        /**
         * <p>The statistics of tag value counts.</p>
         */
        @NameInMap("TagValueCountStatistic")
        public java.util.List<GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic> tagValueCountStatistic;

        public static GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics self = new GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics setTagValueCountStatistic(java.util.List<GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic> tagValueCountStatistic) {
            this.tagValueCountStatistic = tagValueCountStatistic;
            return this;
        }
        public java.util.List<GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatisticsTagValueCountStatistic> getTagValueCountStatistic() {
            return this.tagValueCountStatistic;
        }

    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic extends TeaModel {
        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <p>The type of the tag mining task. Valid values: \<code>singleTagValue\\</code> (single tag), \<code>multiTagValues\\</code> (multiple tags), and \<code>summaryAndOverview\\</code> (summary and overview).</p>
         * 
         * <strong>example:</strong>
         * <p>multiTagValues</p>
         */
        @NameInMap("TagTaskType")
        public String tagTaskType;

        /**
         * <p>The number of tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ValueCount")
        public Integer valueCount;

        public static GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic self = new GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic setTagTaskType(String tagTaskType) {
            this.tagTaskType = tagTaskType;
            return this;
        }
        public String getTagTaskType() {
            return this.tagTaskType;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic setValueCount(Integer valueCount) {
            this.valueCount = valueCount;
            return this;
        }
        public Integer getValueCount() {
            return this.valueCount;
        }

    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics extends TeaModel {
        /**
         * <p>The statistics of tag value counts.</p>
         */
        @NameInMap("TagValueCountStatistic")
        public java.util.List<GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic> tagValueCountStatistic;

        public static GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics self = new GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics setTagValueCountStatistic(java.util.List<GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic> tagValueCountStatistic) {
            this.tagValueCountStatistic = tagValueCountStatistic;
            return this;
        }
        public java.util.List<GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatisticsTagValueCountStatistic> getTagValueCountStatistic() {
            return this.tagValueCountStatistic;
        }

    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview extends TeaModel {
        /**
         * <p>The total number of analyzed data entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The statistics of filter tags.</p>
         */
        @NameInMap("FilterDimensionStatistics")
        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics filterDimensionStatistics;

        /**
         * <p>The statistics of content tags.</p>
         */
        @NameInMap("TagDimensionStatistics")
        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics tagDimensionStatistics;

        public static GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview self = new GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview setFilterDimensionStatistics(GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics filterDimensionStatistics) {
            this.filterDimensionStatistics = filterDimensionStatistics;
            return this;
        }
        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewFilterDimensionStatistics getFilterDimensionStatistics() {
            return this.filterDimensionStatistics;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview setTagDimensionStatistics(GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics tagDimensionStatistics) {
            this.tagDimensionStatistics = tagDimensionStatistics;
            return this;
        }
        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverviewTagDimensionStatistics getTagDimensionStatistics() {
            return this.tagDimensionStatistics;
        }

    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyDataUsage extends TeaModel {
        /**
         * <p>The number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>The number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        public static GetEnterpriseVocAnalysisTaskResponseBodyDataUsage build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyDataUsage self = new GetEnterpriseVocAnalysisTaskResponseBodyDataUsage();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyDataUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

    }

    public static class GetEnterpriseVocAnalysisTaskResponseBodyData extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The statistics overview.</p>
         */
        @NameInMap("StatisticsOverview")
        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview statisticsOverview;

        /**
         * <p>The status of the task. Valid values: \<code>PENDING\\</code> (pending), \<code>RUNNING\\</code> (running), \<code>SUCCESSED\\</code> (successful), \<code>FAILED\\</code> (failed), and \<code>CANCELED\\</code> (canceled).</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The usage statistics.</p>
         */
        @NameInMap("Usage")
        public GetEnterpriseVocAnalysisTaskResponseBodyDataUsage usage;

        public static GetEnterpriseVocAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseVocAnalysisTaskResponseBodyData self = new GetEnterpriseVocAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyData setStatisticsOverview(GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview statisticsOverview) {
            this.statisticsOverview = statisticsOverview;
            return this;
        }
        public GetEnterpriseVocAnalysisTaskResponseBodyDataStatisticsOverview getStatisticsOverview() {
            return this.statisticsOverview;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEnterpriseVocAnalysisTaskResponseBodyData setUsage(GetEnterpriseVocAnalysisTaskResponseBodyDataUsage usage) {
            this.usage = usage;
            return this;
        }
        public GetEnterpriseVocAnalysisTaskResponseBodyDataUsage getUsage() {
            return this.usage;
        }

    }

}
