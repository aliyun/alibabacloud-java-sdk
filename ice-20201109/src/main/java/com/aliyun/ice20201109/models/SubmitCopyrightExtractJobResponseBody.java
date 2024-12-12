// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCopyrightExtractJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitCopyrightExtractJobResponseBodyData data;

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
     * <p><strong><strong>2876-6263-4B75-8F2C-CD0F7FCF</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Long statusCode;

    public static SubmitCopyrightExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightExtractJobResponseBody self = new SubmitCopyrightExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightExtractJobResponseBody setData(SubmitCopyrightExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitCopyrightExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitCopyrightExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitCopyrightExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitCopyrightExtractJobResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class SubmitCopyrightExtractJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bfb786c63****4d80648792021eff90</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static SubmitCopyrightExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitCopyrightExtractJobResponseBodyData self = new SubmitCopyrightExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitCopyrightExtractJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
