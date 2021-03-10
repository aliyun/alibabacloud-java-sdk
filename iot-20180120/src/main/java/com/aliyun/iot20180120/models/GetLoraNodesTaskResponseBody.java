// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetLoraNodesTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskState")
    public String taskState;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("SuccessCount")
    public Long successCount;

    @NameInMap("SuccessDevEuis")
    public GetLoraNodesTaskResponseBodySuccessDevEuis successDevEuis;

    public static GetLoraNodesTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoraNodesTaskResponseBody self = new GetLoraNodesTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoraNodesTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoraNodesTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLoraNodesTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLoraNodesTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLoraNodesTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetLoraNodesTaskResponseBody setTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }
    public String getTaskState() {
        return this.taskState;
    }

    public GetLoraNodesTaskResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetLoraNodesTaskResponseBody setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public GetLoraNodesTaskResponseBody setSuccessDevEuis(GetLoraNodesTaskResponseBodySuccessDevEuis successDevEuis) {
        this.successDevEuis = successDevEuis;
        return this;
    }
    public GetLoraNodesTaskResponseBodySuccessDevEuis getSuccessDevEuis() {
        return this.successDevEuis;
    }

    public static class GetLoraNodesTaskResponseBodySuccessDevEuis extends TeaModel {
        @NameInMap("SuccessDevEui")
        public java.util.List<String> successDevEui;

        public static GetLoraNodesTaskResponseBodySuccessDevEuis build(java.util.Map<String, ?> map) throws Exception {
            GetLoraNodesTaskResponseBodySuccessDevEuis self = new GetLoraNodesTaskResponseBodySuccessDevEuis();
            return TeaModel.build(map, self);
        }

        public GetLoraNodesTaskResponseBodySuccessDevEuis setSuccessDevEui(java.util.List<String> successDevEui) {
            this.successDevEui = successDevEui;
            return this;
        }
        public java.util.List<String> getSuccessDevEui() {
            return this.successDevEui;
        }

    }

}
