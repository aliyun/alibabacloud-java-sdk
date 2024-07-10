// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitCopyrightJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitCopyrightJobResponseBodyData data;

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
     * <p>FA258E67-09B8-4EAA-8F33-BA567834A2C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Long statusCode;

    public static SubmitCopyrightJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightJobResponseBody self = new SubmitCopyrightJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightJobResponseBody setData(SubmitCopyrightJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitCopyrightJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitCopyrightJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitCopyrightJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitCopyrightJobResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class SubmitCopyrightJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bfb786c639894f4d80648792021e****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static SubmitCopyrightJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitCopyrightJobResponseBodyData self = new SubmitCopyrightJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitCopyrightJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
