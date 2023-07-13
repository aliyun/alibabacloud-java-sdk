// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetLoraNodesTaskResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The number of devices that were created.</p>
     */
    @NameInMap("SuccessCount")
    public Long successCount;

    @NameInMap("SuccessDevEuis")
    public GetLoraNodesTaskResponseBodySuccessDevEuis successDevEuis;

    /**
     * <p>The task ID returned if the request is successful.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task status.</p>
     * <br>
     * <p>*   **RUNNING**: The task is in progress.</p>
     * <p>*   **FINISH**: The task is completed.</p>
     */
    @NameInMap("TaskState")
    public String taskState;

    /**
     * <p>The total number of devices that you want to create.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetLoraNodesTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoraNodesTaskResponseBody self = new GetLoraNodesTaskResponseBody();
        return TeaModel.build(map, self);
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
