// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeInstanceDeploymentResponseBody extends TeaModel {
    /**
     * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see [Error codes](~~135200~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that is returned if the call was successful.</p>
     */
    @NameInMap("Data")
    public GetEdgeInstanceDeploymentResponseBodyData data;

    /**
     * <p>The error message that is returned if the call failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetEdgeInstanceDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeInstanceDeploymentResponseBody self = new GetEdgeInstanceDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeInstanceDeploymentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEdgeInstanceDeploymentResponseBody setData(GetEdgeInstanceDeploymentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEdgeInstanceDeploymentResponseBodyData getData() {
        return this.data;
    }

    public GetEdgeInstanceDeploymentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetEdgeInstanceDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeInstanceDeploymentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList extends TeaModel {
        /**
         * <p>The time when the deployment task snapshot was complete.</p>
         */
        @NameInMap("GmtCompleted")
        public String gmtCompleted;

        /**
         * <p>The UNIX timestamp when the deployment task snapshot was complete.</p>
         */
        @NameInMap("GmtCompletedTimestamp")
        public Long gmtCompletedTimestamp;

        /**
         * <p>The time when the deployment task snapshot was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The UNIX timestamp when the deployment task snapshot was created.</p>
         */
        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        /**
         * <p>The last time when the deployment task snapshot was modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The last UNIX timestamp when the deployment task snapshot was modified.</p>
         */
        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        /**
         * <p>The logs of resource deployment.</p>
         */
        @NameInMap("Log")
        public String log;

        /**
         * <p>The type of the operation.</p>
         * <br>
         * <p>*   0: deploys resources.</p>
         * <p>*   1: deletes resources.</p>
         */
        @NameInMap("OperateType")
        public Integer operateType;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the resource.</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the deployment task snapshot.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The stage of the snapshot task.</p>
         * <br>
         * <p>*   0: The snapshot task was in the initial state.</p>
         * <p>*   8: The snapshot task was being assembled.</p>
         * <p>*   16: The snapshot task was being packaged.</p>
         * <p>*   24: The snapshot task was being dispatched.</p>
         * <p>*   32: The snapshot task was complete.</p>
         */
        @NameInMap("Stage")
        public Integer stage;

        /**
         * <p>The status of the snapshot task.</p>
         * <br>
         * <p>*   0: The snapshot task was not started.</p>
         * <p>*   1: The snapshot task was being processed.</p>
         * <p>*   2: The snapshot task was successful.</p>
         * <p>*   3: The snapshot task failed.</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList self = new GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList();
            return TeaModel.build(map, self);
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setGmtCompleted(String gmtCompleted) {
            this.gmtCompleted = gmtCompleted;
            return this;
        }
        public String getGmtCompleted() {
            return this.gmtCompleted;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setGmtCompletedTimestamp(Long gmtCompletedTimestamp) {
            this.gmtCompletedTimestamp = gmtCompletedTimestamp;
            return this;
        }
        public Long getGmtCompletedTimestamp() {
            return this.gmtCompletedTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setOperateType(Integer operateType) {
            this.operateType = operateType;
            return this;
        }
        public Integer getOperateType() {
            return this.operateType;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setStage(Integer stage) {
            this.stage = stage;
            return this;
        }
        public Integer getStage() {
            return this.stage;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetEdgeInstanceDeploymentResponseBodyDataTaskList extends TeaModel {
        /**
         * <p>The ID of the gateway.</p>
         */
        @NameInMap("GatewayId")
        public String gatewayId;

        /**
         * <p>The time when the deployment subtask was complete.</p>
         */
        @NameInMap("GmtCompleted")
        public String gmtCompleted;

        /**
         * <p>The UNIX timestamp when the deployment subtask was complete.</p>
         */
        @NameInMap("GmtCompletedTimestamp")
        public Long gmtCompletedTimestamp;

        /**
         * <p>The time when the deployment subtask was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The UNIX timestamp when the deployment subtask was created.</p>
         */
        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        /**
         * <p>The last time when the deployment subtask was modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The last UNIX timestamp when the deployment subtask was modified.</p>
         */
        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        /**
         * <p>The list of deployment task snapshots.</p>
         */
        @NameInMap("ResourceSnapshotList")
        public java.util.List<GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList> resourceSnapshotList;

        /**
         * <p>The stage of the deployment subtask.</p>
         * <br>
         * <p>*   0: The subtask was not started.</p>
         * <p>*   8: The subtask was being assembled.</p>
         * <p>*   16: The subtask was being packaged.</p>
         * <p>*   24: The subtask was being dispatched.</p>
         * <p>*   32: The subtask was complete.</p>
         */
        @NameInMap("Stage")
        public Integer stage;

        /**
         * <p>The status of the deployment subtask.</p>
         * <br>
         * <p>*   0: The subtask was in the initial state.</p>
         * <p>*   1: The subtask was being processed.</p>
         * <p>*   2: The subtask was successful.</p>
         * <p>*   3: The subtask failed.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the deployment subtask.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GetEdgeInstanceDeploymentResponseBodyDataTaskList build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeInstanceDeploymentResponseBodyDataTaskList self = new GetEdgeInstanceDeploymentResponseBodyDataTaskList();
            return TeaModel.build(map, self);
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGmtCompleted(String gmtCompleted) {
            this.gmtCompleted = gmtCompleted;
            return this;
        }
        public String getGmtCompleted() {
            return this.gmtCompleted;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGmtCompletedTimestamp(Long gmtCompletedTimestamp) {
            this.gmtCompletedTimestamp = gmtCompletedTimestamp;
            return this;
        }
        public Long getGmtCompletedTimestamp() {
            return this.gmtCompletedTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setResourceSnapshotList(java.util.List<GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList> resourceSnapshotList) {
            this.resourceSnapshotList = resourceSnapshotList;
            return this;
        }
        public java.util.List<GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList> getResourceSnapshotList() {
            return this.resourceSnapshotList;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setStage(Integer stage) {
            this.stage = stage;
            return this;
        }
        public Integer getStage() {
            return this.stage;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class GetEdgeInstanceDeploymentResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the deployment task.</p>
         */
        @NameInMap("DeploymentId")
        public String deploymentId;

        /**
         * <p>The description of the deployment task.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the deployment task was complete.</p>
         */
        @NameInMap("GmtCompleted")
        public String gmtCompleted;

        /**
         * <p>The UNIX timestamp when the deployment task was complete.</p>
         */
        @NameInMap("GmtCompletedTimestamp")
        public Long gmtCompletedTimestamp;

        /**
         * <p>The time when the deployment task was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The UNIX timestamp when the deployment task was created.</p>
         */
        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        /**
         * <p>The last time when the deployment task was modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The last UNIX timestamp when the deployment task was modified.</p>
         */
        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        /**
         * <p>The status of the deployment task.</p>
         * <br>
         * <p>*   0: The task was not started.</p>
         * <p>*   1: The task was being processed.</p>
         * <p>*   2: The task was successful.</p>
         * <p>*   3: The task failed.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The list of deployment subtasks.</p>
         */
        @NameInMap("TaskList")
        public java.util.List<GetEdgeInstanceDeploymentResponseBodyDataTaskList> taskList;

        /**
         * <p>The type of the deployment task.</p>
         * <br>
         * <p>*   deploy: deploys the edge instance.</p>
         * <p>*   reset: resets the edge instance.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetEdgeInstanceDeploymentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeInstanceDeploymentResponseBodyData self = new GetEdgeInstanceDeploymentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEdgeInstanceDeploymentResponseBodyData setDeploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public String getDeploymentId() {
            return this.deploymentId;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setGmtCompleted(String gmtCompleted) {
            this.gmtCompleted = gmtCompleted;
            return this;
        }
        public String getGmtCompleted() {
            return this.gmtCompleted;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setGmtCompletedTimestamp(Long gmtCompletedTimestamp) {
            this.gmtCompletedTimestamp = gmtCompletedTimestamp;
            return this;
        }
        public Long getGmtCompletedTimestamp() {
            return this.gmtCompletedTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setTaskList(java.util.List<GetEdgeInstanceDeploymentResponseBodyDataTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<GetEdgeInstanceDeploymentResponseBodyDataTaskList> getTaskList() {
            return this.taskList;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
