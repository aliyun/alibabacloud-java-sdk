// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the task.</p>
     */
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
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OperationFailure.OperationFailed</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *      &quot;requestId&quot;: &quot;123****&quot;,
         *      &quot;errorCode&quot;: &quot;InvalidRamUser.NoPermission&quot;,
         *      &quot;errorMsg&quot;: &quot;Ram user is not authorized to perform the operation.&quot;
         * }</p>
         */
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
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-09T00:46:03Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The error returned for the task.</p>
         */
        @NameInMap("error")
        public GetTaskResponseBodyTaskError error;

        /**
         * <p>The code of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vbascjthm7kzhp3****</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The path of the resources. The relative resource ID. The resource path contains the complete resource location (parent resource/child resource).</p>
         * 
         * <strong>example:</strong>
         * <p>Instance/i-8vbascjthm7kzhp3****
         * Instance/r-8vbf5abe31c9c4d4/Account/cctest</p>
         */
        @NameInMap("resourcePath")
        public String resourcePath;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The task state.</p>
         * <p>Pending</p>
         * <p>Running</p>
         * <p>Succeeded</p>
         * <p>Failed</p>
         * <p>Cancelling</p>
         * <p>Cancelled.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the task operation. Valid values: Create, Update, and Delete.</p>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("taskAction")
        public String taskAction;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>task-433aead756057fff8189a7ce5****</p>
         */
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

        public GetTaskResponseBodyTask setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetTaskResponseBodyTask setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetTaskResponseBodyTask setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetTaskResponseBodyTask setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }
        public String getResourcePath() {
            return this.resourcePath;
        }

        public GetTaskResponseBodyTask setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
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
