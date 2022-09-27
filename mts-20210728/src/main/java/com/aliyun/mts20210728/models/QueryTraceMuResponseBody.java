// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryTraceMuResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryTraceMuResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestID")
    public String requestID;

    @NameInMap("StatusCode")
    public Long statusCode;

    public static QueryTraceMuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceMuResponseBody self = new QueryTraceMuResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTraceMuResponseBody setData(java.util.List<QueryTraceMuResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTraceMuResponseBodyData> getData() {
        return this.data;
    }

    public QueryTraceMuResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTraceMuResponseBody setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public QueryTraceMuResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class QueryTraceMuResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("Output")
        public String output;

        @NameInMap("Status")
        public String status;

        @NameInMap("Trace")
        public String trace;

        @NameInMap("TraceId")
        public Long traceId;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("UserId")
        public Long userId;

        public static QueryTraceMuResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTraceMuResponseBodyData self = new QueryTraceMuResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTraceMuResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryTraceMuResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryTraceMuResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryTraceMuResponseBodyData setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public QueryTraceMuResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public QueryTraceMuResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTraceMuResponseBodyData setTrace(String trace) {
            this.trace = trace;
            return this;
        }
        public String getTrace() {
            return this.trace;
        }

        public QueryTraceMuResponseBodyData setTraceId(Long traceId) {
            this.traceId = traceId;
            return this;
        }
        public Long getTraceId() {
            return this.traceId;
        }

        public QueryTraceMuResponseBodyData setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryTraceMuResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
