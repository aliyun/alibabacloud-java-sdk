// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitCopyrightExtractResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitCopyrightExtractResponseBodyData data;

    // 返回消息
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestID")
    public String requestID;

    // 状态码
    @NameInMap("StatusCode")
    public Long statusCode;

    public static SubmitCopyrightExtractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightExtractResponseBody self = new SubmitCopyrightExtractResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightExtractResponseBody setData(SubmitCopyrightExtractResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitCopyrightExtractResponseBodyData getData() {
        return this.data;
    }

    public SubmitCopyrightExtractResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitCopyrightExtractResponseBody setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public SubmitCopyrightExtractResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class SubmitCopyrightExtractResponseBodyData extends TeaModel {
        // 任务id
        @NameInMap("JobId")
        public String jobId;

        public static SubmitCopyrightExtractResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitCopyrightExtractResponseBodyData self = new SubmitCopyrightExtractResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitCopyrightExtractResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
