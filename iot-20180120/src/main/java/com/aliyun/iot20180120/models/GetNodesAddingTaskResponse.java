// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetNodesAddingTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("TaskState")
    @Validation(required = true)
    public String taskState;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("SuccessCount")
    @Validation(required = true)
    public Long successCount;

    @NameInMap("SuccessDevEuis")
    @Validation(required = true)
    public GetNodesAddingTaskResponseSuccessDevEuis successDevEuis;

    public static GetNodesAddingTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodesAddingTaskResponse self = new GetNodesAddingTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetNodesAddingTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodesAddingTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetNodesAddingTaskResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNodesAddingTaskResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetNodesAddingTaskResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetNodesAddingTaskResponse setTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }
    public String getTaskState() {
        return this.taskState;
    }

    public GetNodesAddingTaskResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetNodesAddingTaskResponse setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public GetNodesAddingTaskResponse setSuccessDevEuis(GetNodesAddingTaskResponseSuccessDevEuis successDevEuis) {
        this.successDevEuis = successDevEuis;
        return this;
    }
    public GetNodesAddingTaskResponseSuccessDevEuis getSuccessDevEuis() {
        return this.successDevEuis;
    }

    public static class GetNodesAddingTaskResponseSuccessDevEuis extends TeaModel {
        @NameInMap("SuccessDevEui")
        @Validation(required = true)
        public java.util.List<String> successDevEui;

        public static GetNodesAddingTaskResponseSuccessDevEuis build(java.util.Map<String, ?> map) throws Exception {
            GetNodesAddingTaskResponseSuccessDevEuis self = new GetNodesAddingTaskResponseSuccessDevEuis();
            return TeaModel.build(map, self);
        }

        public GetNodesAddingTaskResponseSuccessDevEuis setSuccessDevEui(java.util.List<String> successDevEui) {
            this.successDevEui = successDevEui;
            return this;
        }
        public java.util.List<String> getSuccessDevEui() {
            return this.successDevEui;
        }

    }

}
