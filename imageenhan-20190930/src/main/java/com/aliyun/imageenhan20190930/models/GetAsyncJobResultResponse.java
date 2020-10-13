// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GetAsyncJobResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetAsyncJobResultResponseData data;

    public static GetAsyncJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncJobResultResponse self = new GetAsyncJobResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncJobResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsyncJobResultResponse setData(GetAsyncJobResultResponseData data) {
        this.data = data;
        return this;
    }
    public GetAsyncJobResultResponseData getData() {
        return this.data;
    }

    public static class GetAsyncJobResultResponseData extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Result")
        @Validation(required = true)
        public String result;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        public static GetAsyncJobResultResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncJobResultResponseData self = new GetAsyncJobResultResponseData();
            return TeaModel.build(map, self);
        }

        public GetAsyncJobResultResponseData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetAsyncJobResultResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAsyncJobResultResponseData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetAsyncJobResultResponseData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetAsyncJobResultResponseData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

}
