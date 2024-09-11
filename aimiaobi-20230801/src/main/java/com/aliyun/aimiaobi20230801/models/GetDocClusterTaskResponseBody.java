// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDocClusterTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDocClusterTaskResponseBodyData data;

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
        @NameInMap("DocIds")
        public java.util.List<String> docIds;

        /**
         * <strong>example:</strong>
         * <p>聚类主题摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
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
         * <strong>example:</strong>
         * <p>错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("Status")
        public String status;

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
