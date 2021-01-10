// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeInstanceDeploymentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetEdgeInstanceDeploymentResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetEdgeInstanceDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeInstanceDeploymentResponseBody self = new GetEdgeInstanceDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeInstanceDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public GetEdgeInstanceDeploymentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEdgeInstanceDeploymentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList extends TeaModel {
        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Stage")
        public Integer stage;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("Log")
        public String log;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("OperateType")
        public Integer operateType;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("GmtCompleted")
        public String gmtCompleted;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCompletedTimestamp")
        public Long gmtCompletedTimestamp;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        public static GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList self = new GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList();
            return TeaModel.build(map, self);
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setStage(Integer stage) {
            this.stage = stage;
            return this;
        }
        public Integer getStage() {
            return this.stage;
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

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setOperateType(Integer operateType) {
            this.operateType = operateType;
            return this;
        }
        public Integer getOperateType() {
            return this.operateType;
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

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setGmtCompleted(String gmtCompleted) {
            this.gmtCompleted = gmtCompleted;
            return this;
        }
        public String getGmtCompleted() {
            return this.gmtCompleted;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList setGmtCompletedTimestamp(Long gmtCompletedTimestamp) {
            this.gmtCompletedTimestamp = gmtCompletedTimestamp;
            return this;
        }
        public Long getGmtCompletedTimestamp() {
            return this.gmtCompletedTimestamp;
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

    }

    public static class GetEdgeInstanceDeploymentResponseBodyDataTaskList extends TeaModel {
        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("ResourceSnapshotList")
        public java.util.List<GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList> resourceSnapshotList;

        @NameInMap("Stage")
        public Integer stage;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("GmtCompleted")
        public String gmtCompleted;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCompletedTimestamp")
        public Long gmtCompletedTimestamp;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("TaskId")
        public String taskId;

        public static GetEdgeInstanceDeploymentResponseBodyDataTaskList build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeInstanceDeploymentResponseBodyDataTaskList self = new GetEdgeInstanceDeploymentResponseBodyDataTaskList();
            return TeaModel.build(map, self);
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
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

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGmtCompleted(String gmtCompleted) {
            this.gmtCompleted = gmtCompleted;
            return this;
        }
        public String getGmtCompleted() {
            return this.gmtCompleted;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGmtCompletedTimestamp(Long gmtCompletedTimestamp) {
            this.gmtCompletedTimestamp = gmtCompletedTimestamp;
            return this;
        }
        public Long getGmtCompletedTimestamp() {
            return this.gmtCompletedTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyDataTaskList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
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
        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("DeploymentId")
        public String deploymentId;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("TaskList")
        public java.util.List<GetEdgeInstanceDeploymentResponseBodyDataTaskList> taskList;

        @NameInMap("GmtCompleted")
        public String gmtCompleted;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCompletedTimestamp")
        public Long gmtCompletedTimestamp;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static GetEdgeInstanceDeploymentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeInstanceDeploymentResponseBodyData self = new GetEdgeInstanceDeploymentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEdgeInstanceDeploymentResponseBodyData setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
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

        public GetEdgeInstanceDeploymentResponseBodyData setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setTaskList(java.util.List<GetEdgeInstanceDeploymentResponseBodyDataTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<GetEdgeInstanceDeploymentResponseBodyDataTaskList> getTaskList() {
            return this.taskList;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setGmtCompleted(String gmtCompleted) {
            this.gmtCompleted = gmtCompleted;
            return this;
        }
        public String getGmtCompleted() {
            return this.gmtCompleted;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setGmtCompletedTimestamp(Long gmtCompletedTimestamp) {
            this.gmtCompletedTimestamp = gmtCompletedTimestamp;
            return this;
        }
        public Long getGmtCompletedTimestamp() {
            return this.gmtCompletedTimestamp;
        }

        public GetEdgeInstanceDeploymentResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

}
