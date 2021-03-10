// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetLoraNodesTaskResponse extends TeaModel {
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
    public GetLoraNodesTaskResponseSuccessDevEuis successDevEuis;

    public static GetLoraNodesTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoraNodesTaskResponse self = new GetLoraNodesTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetLoraNodesTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoraNodesTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLoraNodesTaskResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLoraNodesTaskResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLoraNodesTaskResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetLoraNodesTaskResponse setTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }
    public String getTaskState() {
        return this.taskState;
    }

    public GetLoraNodesTaskResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetLoraNodesTaskResponse setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public GetLoraNodesTaskResponse setSuccessDevEuis(GetLoraNodesTaskResponseSuccessDevEuis successDevEuis) {
        this.successDevEuis = successDevEuis;
        return this;
    }
    public GetLoraNodesTaskResponseSuccessDevEuis getSuccessDevEuis() {
        return this.successDevEuis;
    }

    public static class GetLoraNodesTaskResponseSuccessDevEuis extends TeaModel {
        @NameInMap("SuccessDevEui")
        @Validation(required = true)
        public java.util.List<String> successDevEui;

        public static GetLoraNodesTaskResponseSuccessDevEuis build(java.util.Map<String, ?> map) throws Exception {
            GetLoraNodesTaskResponseSuccessDevEuis self = new GetLoraNodesTaskResponseSuccessDevEuis();
            return TeaModel.build(map, self);
        }

        public GetLoraNodesTaskResponseSuccessDevEuis setSuccessDevEui(java.util.List<String> successDevEui) {
            this.successDevEui = successDevEui;
            return this;
        }
        public java.util.List<String> getSuccessDevEui() {
            return this.successDevEui;
        }

    }

}
