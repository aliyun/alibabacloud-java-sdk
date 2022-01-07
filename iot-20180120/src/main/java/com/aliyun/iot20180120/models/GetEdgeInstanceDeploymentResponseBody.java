// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeInstanceDeploymentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetEdgeInstanceDeploymentResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("GmtCompleted")
        public String gmtCompleted;

        @NameInMap("GmtCompletedTimestamp")
        public Long gmtCompletedTimestamp;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("Log")
        public String log;

        @NameInMap("OperateType")
        public Integer operateType;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("Stage")
        public Integer stage;

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
        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("GmtCompleted")
        public String gmtCompleted;

        @NameInMap("GmtCompletedTimestamp")
        public Long gmtCompletedTimestamp;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("ResourceSnapshotList")
        public java.util.List<GetEdgeInstanceDeploymentResponseBodyDataTaskListResourceSnapshotList> resourceSnapshotList;

        @NameInMap("Stage")
        public Integer stage;

        @NameInMap("Status")
        public Integer status;

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
        @NameInMap("DeploymentId")
        public String deploymentId;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCompleted")
        public String gmtCompleted;

        @NameInMap("GmtCompletedTimestamp")
        public Long gmtCompletedTimestamp;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskList")
        public java.util.List<GetEdgeInstanceDeploymentResponseBodyDataTaskList> taskList;

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
