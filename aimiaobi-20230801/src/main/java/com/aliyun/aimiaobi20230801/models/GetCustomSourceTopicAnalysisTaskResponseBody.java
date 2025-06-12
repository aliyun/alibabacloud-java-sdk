// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCustomSourceTopicAnalysisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCustomSourceTopicAnalysisTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("Title")
        public String title;

        /**
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
        @NameInMap("ClusterNews")
        public java.util.List<GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResultsClusterNews> clusterNews;

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
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ClusterCount")
        public Integer clusterCount;

        @NameInMap("ClusterResults")
        public java.util.List<GetCustomSourceTopicAnalysisTaskResponseBodyDataClusterResults> clusterResults;

        /**
         * <strong>example:</strong>
         * <p>错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MaxClusteredTopicNewsSize")
        public Integer maxClusteredTopicNewsSize;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ParsedNewsSize")
        public Integer parsedNewsSize;

        /**
         * <strong>example:</strong>
         * <p>SUCCESSED</p>
         */
        @NameInMap("Status")
        public String status;

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

    }

}
