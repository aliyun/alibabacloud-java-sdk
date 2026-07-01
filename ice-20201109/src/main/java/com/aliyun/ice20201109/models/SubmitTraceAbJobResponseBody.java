// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceAbJobResponseBody extends TeaModel {
    /**
     * <p>Contains the IDs for the submitted job and the output media asset.</p>
     */
    @NameInMap("Data")
    public SubmitTraceAbJobResponseBodyData data;

    /**
     * <p>The response message. A value of <code>ok</code> indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier for the request. If you encounter an issue, provide this ID for technical support.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The HTTP status code. A value of <code>200</code> indicates success.</p>
     * 
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
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bfb786c639894f4d80648792021e****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ID of the media asset created for tracing.</p>
         * 
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
