// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationProcessResponse extends TeaModel {
    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<GetMigrationProcessResponseData> data;

    public static GetMigrationProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationProcessResponse self = new GetMigrationProcessResponse();
        return TeaModel.build(map, self);
    }

    public GetMigrationProcessResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMigrationProcessResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMigrationProcessResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMigrationProcessResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMigrationProcessResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMigrationProcessResponse setData(java.util.List<GetMigrationProcessResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetMigrationProcessResponseData> getData() {
        return this.data;
    }

    public static class GetMigrationProcessResponseData extends TeaModel {
        @NameInMap("TaskName")
        @Validation(required = true)
        public String taskName;

        @NameInMap("TaskStatus")
        @Validation(required = true)
        public String taskStatus;

        public static GetMigrationProcessResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMigrationProcessResponseData self = new GetMigrationProcessResponseData();
            return TeaModel.build(map, self);
        }

        public GetMigrationProcessResponseData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetMigrationProcessResponseData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
