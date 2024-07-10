// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

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
     * <p>030E2671-806A-52AF-A93C-DA8E308603A6</p>
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
         * <p>437bd2b516ffda105d07b12a9a82****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

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

        public SubmitTraceAbJobResponseBodyData setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
