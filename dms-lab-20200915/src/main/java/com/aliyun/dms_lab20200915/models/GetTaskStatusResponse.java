// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_lab20200915.models;

import com.aliyun.tea.*;

public class GetTaskStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("LabDbTaskResult")
    @Validation(required = true)
    public GetTaskStatusResponseLabDbTaskResult labDbTaskResult;

    public static GetTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusResponse self = new GetTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTaskStatusResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTaskStatusResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTaskStatusResponse setLabDbTaskResult(GetTaskStatusResponseLabDbTaskResult labDbTaskResult) {
        this.labDbTaskResult = labDbTaskResult;
        return this;
    }
    public GetTaskStatusResponseLabDbTaskResult getLabDbTaskResult() {
        return this.labDbTaskResult;
    }

    public static class GetTaskStatusResponseLabDbTaskResult extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("SuccessCount")
        @Validation(required = true)
        public Integer successCount;

        @NameInMap("FailureCount")
        @Validation(required = true)
        public Integer failureCount;

        public static GetTaskStatusResponseLabDbTaskResult build(java.util.Map<String, ?> map) throws Exception {
            GetTaskStatusResponseLabDbTaskResult self = new GetTaskStatusResponseLabDbTaskResult();
            return TeaModel.build(map, self);
        }

        public GetTaskStatusResponseLabDbTaskResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTaskStatusResponseLabDbTaskResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskStatusResponseLabDbTaskResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetTaskStatusResponseLabDbTaskResult setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public GetTaskStatusResponseLabDbTaskResult setFailureCount(Integer failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Integer getFailureCount() {
            return this.failureCount;
        }

    }

}
