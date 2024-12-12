// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryTraceAbJobListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryTraceAbJobListResponseBodyData> data;

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

    public static QueryTraceAbJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceAbJobListResponseBody self = new QueryTraceAbJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTraceAbJobListResponseBody setData(java.util.List<QueryTraceAbJobListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTraceAbJobListResponseBodyData> getData() {
        return this.data;
    }

    public QueryTraceAbJobListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTraceAbJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTraceAbJobListResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class QueryTraceAbJobListResponseBodyDataInput extends TeaModel {
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

        public static QueryTraceAbJobListResponseBodyDataInput build(java.util.Map<String, ?> map) throws Exception {
            QueryTraceAbJobListResponseBodyDataInput self = new QueryTraceAbJobListResponseBodyDataInput();
            return TeaModel.build(map, self);
        }

        public QueryTraceAbJobListResponseBodyDataInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public QueryTraceAbJobListResponseBodyDataInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTraceAbJobListResponseBodyDataOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss://bucket/dir/</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryTraceAbJobListResponseBodyDataOutput build(java.util.Map<String, ?> map) throws Exception {
            QueryTraceAbJobListResponseBodyDataOutput self = new QueryTraceAbJobListResponseBodyDataOutput();
            return TeaModel.build(map, self);
        }

        public QueryTraceAbJobListResponseBodyDataOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public QueryTraceAbJobListResponseBodyDataOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryTraceAbJobListResponseBodyData extends TeaModel {
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

        @NameInMap("Input")
        public QueryTraceAbJobListResponseBodyDataInput input;

        /**
         * <strong>example:</strong>
         * <p>bfb786c639894f4d80648792021eff90</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Level")
        public Long level;

        @NameInMap("Output")
        public QueryTraceAbJobListResponseBodyDataOutput output;

        /**
         * <strong>example:</strong>
         * <p>{&quot;Code&quot;:&quot;success&quot;,&quot;Message&quot;:&quot;ok&quot;}</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>437bd2b51105d07b12a9</strong></strong></p>
         */
        @NameInMap("TraceMediaId")
        public String traceMediaId;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <strong>example:</strong>
         * <p>13466932****</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static QueryTraceAbJobListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTraceAbJobListResponseBodyData self = new QueryTraceAbJobListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTraceAbJobListResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryTraceAbJobListResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryTraceAbJobListResponseBodyData setInput(QueryTraceAbJobListResponseBodyDataInput input) {
            this.input = input;
            return this;
        }
        public QueryTraceAbJobListResponseBodyDataInput getInput() {
            return this.input;
        }

        public QueryTraceAbJobListResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryTraceAbJobListResponseBodyData setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public QueryTraceAbJobListResponseBodyData setOutput(QueryTraceAbJobListResponseBodyDataOutput output) {
            this.output = output;
            return this;
        }
        public QueryTraceAbJobListResponseBodyDataOutput getOutput() {
            return this.output;
        }

        public QueryTraceAbJobListResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryTraceAbJobListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTraceAbJobListResponseBodyData setTraceMediaId(String traceMediaId) {
            this.traceMediaId = traceMediaId;
            return this;
        }
        public String getTraceMediaId() {
            return this.traceMediaId;
        }

        public QueryTraceAbJobListResponseBodyData setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryTraceAbJobListResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
