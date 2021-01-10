// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetNodesAddingTaskResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("SuccessDevEuis")
    public GetNodesAddingTaskResponseBodySuccessDevEuis successDevEuis;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("SuccessCount")
    public Long successCount;

    @NameInMap("TaskState")
    public String taskState;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetNodesAddingTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodesAddingTaskResponseBody self = new GetNodesAddingTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodesAddingTaskResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetNodesAddingTaskResponseBody setSuccessDevEuis(GetNodesAddingTaskResponseBodySuccessDevEuis successDevEuis) {
        this.successDevEuis = successDevEuis;
        return this;
    }
    public GetNodesAddingTaskResponseBodySuccessDevEuis getSuccessDevEuis() {
        return this.successDevEuis;
    }

    public GetNodesAddingTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetNodesAddingTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodesAddingTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetNodesAddingTaskResponseBody setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public GetNodesAddingTaskResponseBody setTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }
    public String getTaskState() {
        return this.taskState;
    }

    public GetNodesAddingTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNodesAddingTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNodesAddingTaskResponseBodySuccessDevEuis extends TeaModel {
        @NameInMap("SuccessDevEui")
        public java.util.List<String> successDevEui;

        public static GetNodesAddingTaskResponseBodySuccessDevEuis build(java.util.Map<String, ?> map) throws Exception {
            GetNodesAddingTaskResponseBodySuccessDevEuis self = new GetNodesAddingTaskResponseBodySuccessDevEuis();
            return TeaModel.build(map, self);
        }

        public GetNodesAddingTaskResponseBodySuccessDevEuis setSuccessDevEui(java.util.List<String> successDevEui) {
            this.successDevEui = successDevEui;
            return this;
        }
        public java.util.List<String> getSuccessDevEui() {
            return this.successDevEui;
        }

    }

}
