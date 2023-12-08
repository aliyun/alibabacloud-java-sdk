// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateStorageAnalysisTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public CreateStorageAnalysisTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateStorageAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageAnalysisTaskResponseBody self = new CreateStorageAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStorageAnalysisTaskResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateStorageAnalysisTaskResponseBody setData(CreateStorageAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateStorageAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateStorageAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateStorageAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStorageAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateStorageAnalysisTaskResponseBodyData extends TeaModel {
        @NameInMap("CreateTaskSuccess")
        public Boolean createTaskSuccess;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("TaskId")
        public String taskId;

        public static CreateStorageAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateStorageAnalysisTaskResponseBodyData self = new CreateStorageAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateStorageAnalysisTaskResponseBodyData setCreateTaskSuccess(Boolean createTaskSuccess) {
            this.createTaskSuccess = createTaskSuccess;
            return this;
        }
        public Boolean getCreateTaskSuccess() {
            return this.createTaskSuccess;
        }

        public CreateStorageAnalysisTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreateStorageAnalysisTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
