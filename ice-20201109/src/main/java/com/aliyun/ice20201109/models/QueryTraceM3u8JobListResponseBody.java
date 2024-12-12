// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryTraceM3u8JobListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryTraceM3u8JobListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Long statusCode;

    public static QueryTraceM3u8JobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceM3u8JobListResponseBody self = new QueryTraceM3u8JobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTraceM3u8JobListResponseBody setData(java.util.List<QueryTraceM3u8JobListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTraceM3u8JobListResponseBodyData> getData() {
        return this.data;
    }

    public QueryTraceM3u8JobListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTraceM3u8JobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTraceM3u8JobListResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class QueryTraceM3u8JobListResponseBodyDataOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryTraceM3u8JobListResponseBodyDataOutput build(java.util.Map<String, ?> map) throws Exception {
            QueryTraceM3u8JobListResponseBodyDataOutput self = new QueryTraceM3u8JobListResponseBodyDataOutput();
            return TeaModel.build(map, self);
        }

        public QueryTraceM3u8JobListResponseBodyDataOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public QueryTraceM3u8JobListResponseBodyDataOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTraceM3u8JobListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1627357322</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1627357322</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>d718e2ff4f018ccf419a7b71</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Output")
        public QueryTraceM3u8JobListResponseBodyDataOutput output;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Trace")
        public String trace;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>437bd2b105d07b12a9a82</strong></strong></p>
         */
        @NameInMap("TraceMediaId")
        public String traceMediaId;

        /**
         * <strong>example:</strong>
         * <p>112</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <strong>example:</strong>
         * <p>1346693276****</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static QueryTraceM3u8JobListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTraceM3u8JobListResponseBodyData self = new QueryTraceM3u8JobListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTraceM3u8JobListResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryTraceM3u8JobListResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryTraceM3u8JobListResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryTraceM3u8JobListResponseBodyData setOutput(QueryTraceM3u8JobListResponseBodyDataOutput output) {
            this.output = output;
            return this;
        }
        public QueryTraceM3u8JobListResponseBodyDataOutput getOutput() {
            return this.output;
        }

        public QueryTraceM3u8JobListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTraceM3u8JobListResponseBodyData setTrace(String trace) {
            this.trace = trace;
            return this;
        }
        public String getTrace() {
            return this.trace;
        }

        public QueryTraceM3u8JobListResponseBodyData setTraceMediaId(String traceMediaId) {
            this.traceMediaId = traceMediaId;
            return this;
        }
        public String getTraceMediaId() {
            return this.traceMediaId;
        }

        public QueryTraceM3u8JobListResponseBodyData setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryTraceM3u8JobListResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
