// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDocClusterTaskResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GetDocClusterTaskResponseBodyData data;

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
     * <p>Indicates whether the request was successful. \<code>true\\</code>: The request was successful. \<code>false\\</code>: The request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDocClusterTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocClusterTaskResponseBody self = new GetDocClusterTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocClusterTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDocClusterTaskResponseBody setData(GetDocClusterTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDocClusterTaskResponseBodyData getData() {
        return this.data;
    }

    public GetDocClusterTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDocClusterTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocClusterTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocClusterTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDocClusterTaskResponseBodyDataTopics extends TeaModel {
        /**
         * <p>A list of document IDs for the clustering topic.</p>
         */
        @NameInMap("DocIds")
        public java.util.List<String> docIds;

        /**
         * <p>The summary of the clustering topic.</p>
         * 
         * <strong>example:</strong>
         * <p>聚类主题摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The name of the clustering topic.</p>
         * 
         * <strong>example:</strong>
         * <p>聚类主题名</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetDocClusterTaskResponseBodyDataTopics build(java.util.Map<String, ?> map) throws Exception {
            GetDocClusterTaskResponseBodyDataTopics self = new GetDocClusterTaskResponseBodyDataTopics();
            return TeaModel.build(map, self);
        }

        public GetDocClusterTaskResponseBodyDataTopics setDocIds(java.util.List<String> docIds) {
            this.docIds = docIds;
            return this;
        }
        public java.util.List<String> getDocIds() {
            return this.docIds;
        }

        public GetDocClusterTaskResponseBodyDataTopics setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetDocClusterTaskResponseBodyDataTopics setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetDocClusterTaskResponseBodyData extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The status of the task. Valid values: PENDING (to be executed), RUNNING (executing), SUCCESSED (successful), SUSPENDED (paused), FAILED (failed), and CANCELED (canceled).</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>A list of clustering topics.</p>
         */
        @NameInMap("Topics")
        public java.util.List<GetDocClusterTaskResponseBodyDataTopics> topics;

        public static GetDocClusterTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocClusterTaskResponseBodyData self = new GetDocClusterTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocClusterTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDocClusterTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDocClusterTaskResponseBodyData setTopics(java.util.List<GetDocClusterTaskResponseBodyDataTopics> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<GetDocClusterTaskResponseBodyDataTopics> getTopics() {
            return this.topics;
        }

    }

}
