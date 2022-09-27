// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTraceAbResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitTraceAbResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestID")
    public String requestID;

    @NameInMap("StatusCode")
    public Long statusCode;

    public static SubmitTraceAbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceAbResponseBody self = new SubmitTraceAbResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTraceAbResponseBody setData(SubmitTraceAbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTraceAbResponseBodyData getData() {
        return this.data;
    }

    public SubmitTraceAbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTraceAbResponseBody setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public SubmitTraceAbResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class SubmitTraceAbResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MediaId")
        public String mediaId;

        public static SubmitTraceAbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTraceAbResponseBodyData self = new SubmitTraceAbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTraceAbResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitTraceAbResponseBodyData setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
