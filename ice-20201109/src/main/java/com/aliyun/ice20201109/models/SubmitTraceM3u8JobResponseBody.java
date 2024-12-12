// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceM3u8JobResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitTraceM3u8JobResponseBodyData data;

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

    public static SubmitTraceM3u8JobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceM3u8JobResponseBody self = new SubmitTraceM3u8JobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTraceM3u8JobResponseBody setData(SubmitTraceM3u8JobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTraceM3u8JobResponseBodyData getData() {
        return this.data;
    }

    public SubmitTraceM3u8JobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTraceM3u8JobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitTraceM3u8JobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bfb786c639894f4d8064879202****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static SubmitTraceM3u8JobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTraceM3u8JobResponseBodyData self = new SubmitTraceM3u8JobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTraceM3u8JobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
