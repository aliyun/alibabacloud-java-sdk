// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTracemuResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public SubmitTracemuResponseBodyData data;

    // 返回信息
    @NameInMap("Message")
    public String message;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 状态码
    @NameInMap("StatusCode")
    public Long statusCode;

    public static SubmitTracemuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTracemuResponseBody self = new SubmitTracemuResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTracemuResponseBody setData(SubmitTracemuResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTracemuResponseBodyData getData() {
        return this.data;
    }

    public SubmitTracemuResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTracemuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTracemuResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class SubmitTracemuResponseBodyData extends TeaModel {
        // 任务id
        @NameInMap("JobId")
        public String jobId;

        public static SubmitTracemuResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTracemuResponseBodyData self = new SubmitTracemuResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTracemuResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
