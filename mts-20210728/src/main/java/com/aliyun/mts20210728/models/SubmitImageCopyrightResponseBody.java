// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitImageCopyrightResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public SubmitImageCopyrightResponseBodyData data;

    // 返回信息
    @NameInMap("Message")
    public String message;

    // 请求id
    @NameInMap("RequestID")
    public String requestID;

    // 状态码
    @NameInMap("StatusCode")
    public Long statusCode;

    public static SubmitImageCopyrightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageCopyrightResponseBody self = new SubmitImageCopyrightResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitImageCopyrightResponseBody setData(SubmitImageCopyrightResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitImageCopyrightResponseBodyData getData() {
        return this.data;
    }

    public SubmitImageCopyrightResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitImageCopyrightResponseBody setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public SubmitImageCopyrightResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class SubmitImageCopyrightResponseBodyData extends TeaModel {
        // 任务id
        @NameInMap("JobId")
        public String jobId;

        public static SubmitImageCopyrightResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitImageCopyrightResponseBodyData self = new SubmitImageCopyrightResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitImageCopyrightResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
