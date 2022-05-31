// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("task")
    public GetTaskResponseBodyTask task;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setTask(GetTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetTaskResponseBodyTaskError extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("message")
        public String message;

        public static GetTaskResponseBodyTaskError build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskError self = new GetTaskResponseBodyTaskError();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetTaskResponseBodyTaskError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class GetTaskResponseBodyTask extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("error")
        public GetTaskResponseBodyTaskError error;

        @NameInMap("productCode")
        public String productCode;

        @NameInMap("resourceId")
        public String resourceId;

        @NameInMap("resourceTypeCode")
        public String resourceTypeCode;

        @NameInMap("retryAfter")
        public Integer retryAfter;

        @NameInMap("status")
        public String status;

        @NameInMap("taskAction")
        public String taskAction;

        @NameInMap("taskId")
        public String taskId;

        public static GetTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTask self = new GetTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTaskResponseBodyTask setError(GetTaskResponseBodyTaskError error) {
            this.error = error;
            return this;
        }
        public GetTaskResponseBodyTaskError getError() {
            return this.error;
        }

        public GetTaskResponseBodyTask setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetTaskResponseBodyTask setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetTaskResponseBodyTask setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        public GetTaskResponseBodyTask setRetryAfter(Integer retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }
        public Integer getRetryAfter() {
            return this.retryAfter;
        }

        public GetTaskResponseBodyTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskResponseBodyTask setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public GetTaskResponseBodyTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
