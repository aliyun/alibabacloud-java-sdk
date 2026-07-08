// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCustomSourceTopicAnalysisTaskResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetCustomSourceTopicAnalysisTaskResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
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
     * <p>Indicates whether the request was successful. \<code>true\\</code> indicates success and \<code>false\\</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCustomSourceTopicAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomSourceTopicAnalysisTaskResponseBody self = new GetCustomSourceTopicAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomSourceTopicAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomSourceTopicAnalysisTaskResponseBody setData(GetCustomSourceTopicAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomSourceTopicAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public GetCustomSourceTopicAnalysisTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCustomSourceTopicAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomSourceTopicAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomSourceTopicAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResultsClusterNews extends TeaModel {
        /**
         * <p>The title of the news article.</p>
         * 
         * <strong>example:</strong>
         * <p>新闻标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL of the news article.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/xxx.html">http://www.example.com/xxx.html</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResultsClusterNews build(java.util.Map<String, ?> map) throws Exception {
            GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResultsClusterNews self = new GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResultsClusterNews();
            return TeaModel.build(map, self);
        }

        public GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResultsClusterNews setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResultsClusterNews setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResults extends TeaModel {
        /**
         * <p>A list of aggregated news articles. The body text is not included.</p>
         */
        @NameInMap("ClusterNews")
        public java.util.List<GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResultsClusterNews> clusterNews;

        /**
         * <p>The name of the aggregated topic.</p>
         * 
         * <strong>example:</strong>
         * <p>话题名称</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResults build(java.util.Map<String, ?> map) throws Exception {
            GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResults self = new GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResults();
            return TeaModel.build(map, self);
        }

        public GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResults setClusterNews(java.util.List<GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResultsClusterNews> clusterNews) {
            this.clusterNews = clusterNews;
            return this;
        }
        public java.util.List<GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResultsClusterNews> getClusterNews() {
            return this.clusterNews;
        }

        public GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResults setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class GetCustomSourceTopicAnalysisTaskResponseBodyData extends TeaModel {
        /**
         * <p>The number of documents after clustering.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ClusterCount")
        public Integer clusterCount;

        /**
         * <p>A list of news aggregation results.</p>
         */
        @NameInMap("ClusterResults")
        public java.util.List<GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResults> clusterResults;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The maximum number of news articles in a cluster after aggregation.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MaxClusteredTopicNewsSize")
        public Integer maxClusteredTopicNewsSize;

        /**
         * <p>The number of news articles after the file is parsed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ParsedNewsSize")
        public Integer parsedNewsSize;

        /**
         * <p>The status of the task. Valid values: \<code>PENDING\\</code>, \<code>RUNNING\\</code>, \<code>SUCCESSED\\</code>, \<code>FAILED\\</code>, and \<code>CANCELED\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total runtime in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("rt")
        public Long rt;

        /**
         * <p>The token usage. The possible billable items are:
         * quanmiaoMax, quanmiaoPlus</p>
         */
        @NameInMap("usages")
        public java.util.Map<String, Long> usages;

        public static GetCustomSourceTopicAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomSourceTopicAnalysisTaskResponseBodyData self = new GetCustomSourceTopicAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomSourceTopicAnalysisTaskResponseBodyData setClusterCount(Integer clusterCount) {
            this.clusterCount = clusterCount;
            return this;
        }
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        public GetCustomSourceTopicAnalysisTaskResponseBodyData setClusterResults(java.util.List<GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResults> clusterResults) {
            this.clusterResults = clusterResults;
            return this;
        }
        public java.util.List<GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResults> getClusterResults() {
            return this.clusterResults;
        }

        public GetCustomSourceTopicAnalysisTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetCustomSourceTopicAnalysisTaskResponseBodyData setMaxClusteredTopicNewsSize(Integer maxClusteredTopicNewsSize) {
            this.maxClusteredTopicNewsSize = maxClusteredTopicNewsSize;
            return this;
        }
        public Integer getMaxClusteredTopicNewsSize() {
            return this.maxClusteredTopicNewsSize;
        }

        public GetCustomSourceTopicAnalysisTaskResponseBodyData setParsedNewsSize(Integer parsedNewsSize) {
            this.parsedNewsSize = parsedNewsSize;
            return this;
        }
        public Integer getParsedNewsSize() {
            return this.parsedNewsSize;
        }

        public GetCustomSourceTopicAnalysisTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCustomSourceTopicAnalysisTaskResponseBodyData setRt(Long rt) {
            this.rt = rt;
            return this;
        }
        public Long getRt() {
            return this.rt;
        }

        public GetCustomSourceTopicAnalysisTaskResponseBodyData setUsages(java.util.Map<String, Long> usages) {
            this.usages = usages;
            return this;
        }
        public java.util.Map<String, Long> getUsages() {
            return this.usages;
        }

    }

}
