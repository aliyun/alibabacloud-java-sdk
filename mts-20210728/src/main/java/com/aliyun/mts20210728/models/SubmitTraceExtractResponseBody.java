// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTraceExtractResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitTraceExtractResponseBodyData data;

    // 返回消息
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestID")
    public String requestID;

    // 状态码
    @NameInMap("StatusCode")
    public Long statusCode;

    public static SubmitTraceExtractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceExtractResponseBody self = new SubmitTraceExtractResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTraceExtractResponseBody setData(SubmitTraceExtractResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTraceExtractResponseBodyData getData() {
        return this.data;
    }

    public SubmitTraceExtractResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTraceExtractResponseBody setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public SubmitTraceExtractResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class SubmitTraceExtractResponseBodyData extends TeaModel {
        // 任务id
        @NameInMap("JobId")
        public String jobId;

        public static SubmitTraceExtractResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTraceExtractResponseBodyData self = new SubmitTraceExtractResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTraceExtractResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
