// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceAbJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitTraceAbJobResponseBodyData data;

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
     * <p><strong><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Long statusCode;

    public static SubmitTraceAbJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceAbJobResponseBody self = new SubmitTraceAbJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTraceAbJobResponseBody setData(SubmitTraceAbJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTraceAbJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitTraceAbJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTraceAbJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTraceAbJobResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class SubmitTraceAbJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bfb786c639894f4d80648792021e****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>bf53333264f4d80648792021e****</p>
         */
        @NameInMap("TraceMediaId")
        public String traceMediaId;

        public static SubmitTraceAbJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTraceAbJobResponseBodyData self = new SubmitTraceAbJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTraceAbJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitTraceAbJobResponseBodyData setTraceMediaId(String traceMediaId) {
            this.traceMediaId = traceMediaId;
            return this;
        }
        public String getTraceMediaId() {
            return this.traceMediaId;
        }

    }

}
