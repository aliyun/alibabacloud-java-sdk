// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitCopyrightJobResponseBody extends TeaModel {
    // 请求Id
    @NameInMap("RequestID")
    public String requestID;

    // 返回信息
    @NameInMap("Message")
    public String message;

    // 返回数据
    @NameInMap("Data")
    public SubmitCopyrightJobResponseBodyData data;

    // 状态码
    @NameInMap("StatusCode")
    public Long statusCode;

    public static SubmitCopyrightJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightJobResponseBody self = new SubmitCopyrightJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightJobResponseBody setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public SubmitCopyrightJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitCopyrightJobResponseBody setData(SubmitCopyrightJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitCopyrightJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitCopyrightJobResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class SubmitCopyrightJobResponseBodyData extends TeaModel {
        // 任务id
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
