// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceExtractJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitTraceExtractJobResponseBodyData data;

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
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Long statusCode;

    public static SubmitTraceExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceExtractJobResponseBody self = new SubmitTraceExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTraceExtractJobResponseBody setData(SubmitTraceExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTraceExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitTraceExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTraceExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTraceExtractJobResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class SubmitTraceExtractJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bfb786c639894f4d80648792021e****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static SubmitTraceExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTraceExtractJobResponseBodyData self = new SubmitTraceExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTraceExtractJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
