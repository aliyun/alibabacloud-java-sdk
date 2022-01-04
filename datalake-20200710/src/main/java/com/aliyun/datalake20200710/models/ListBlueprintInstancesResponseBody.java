// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListBlueprintInstancesResponseBody extends TeaModel {
    @NameInMap("BlueprintInstances")
    public java.util.List<ListBlueprintInstancesResponseBodyBlueprintInstances> blueprintInstances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBlueprintInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBlueprintInstancesResponseBody self = new ListBlueprintInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBlueprintInstancesResponseBody setBlueprintInstances(java.util.List<ListBlueprintInstancesResponseBodyBlueprintInstances> blueprintInstances) {
        this.blueprintInstances = blueprintInstances;
        return this;
    }
    public java.util.List<ListBlueprintInstancesResponseBodyBlueprintInstances> getBlueprintInstances() {
        return this.blueprintInstances;
    }

    public ListBlueprintInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBlueprintInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListBlueprintInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflow extends TeaModel {
        @NameInMap("LatestEndTime")
        public String latestEndTime;

        @NameInMap("LatestInstanceStatus")
        public String latestInstanceStatus;

        @NameInMap("LatestStartTime")
        public String latestStartTime;

        @NameInMap("WorkflowId")
        public String workflowId;

        public static ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflow build(java.util.Map<String, ?> map) throws Exception {
            ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflow self = new ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflow();
            return TeaModel.build(map, self);
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflow setLatestEndTime(String latestEndTime) {
            this.latestEndTime = latestEndTime;
            return this;
        }
        public String getLatestEndTime() {
            return this.latestEndTime;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflow setLatestInstanceStatus(String latestInstanceStatus) {
            this.latestInstanceStatus = latestInstanceStatus;
            return this;
        }
        public String getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflow setLatestStartTime(String latestStartTime) {
            this.latestStartTime = latestStartTime;
            return this;
        }
        public String getLatestStartTime() {
            return this.latestStartTime;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflow setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance extends TeaModel {
        @NameInMap("BatchProgress")
        public Integer batchProgress;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FailureInfo")
        public String failureInfo;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowInstanceId")
        public String flowInstanceId;

        @NameInMap("FlowName")
        public String flowName;

        @NameInMap("OffsetTime")
        public Integer offsetTime;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance build(java.util.Map<String, ?> map) throws Exception {
            ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance self = new ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance();
            return TeaModel.build(map, self);
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance setBatchProgress(Integer batchProgress) {
            this.batchProgress = batchProgress;
            return this;
        }
        public Integer getBatchProgress() {
            return this.batchProgress;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance setFailureInfo(String failureInfo) {
            this.failureInfo = failureInfo;
            return this;
        }
        public String getFailureInfo() {
            return this.failureInfo;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance setOffsetTime(Integer offsetTime) {
            this.offsetTime = offsetTime;
            return this;
        }
        public Integer getOffsetTime() {
            return this.offsetTime;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListBlueprintInstancesResponseBodyBlueprintInstances extends TeaModel {
        @NameInMap("BatchProgress")
        public Integer batchProgress;

        @NameInMap("BlueprintInstanceId")
        public String blueprintInstanceId;

        @NameInMap("BlueprintType")
        public String blueprintType;

        @NameInMap("Creator")
        public Long creator;

        @NameInMap("CreatorLoginName")
        public String creatorLoginName;

        @NameInMap("DataSourceConfig")
        public String dataSourceConfig;

        @NameInMap("ExecuteCapacity")
        public String executeCapacity;

        @NameInMap("ExecuteParameters")
        public String executeParameters;

        @NameInMap("ExecuteType")
        public String executeType;

        @NameInMap("FailureInfo")
        public String failureInfo;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("OffsetTime")
        public Integer offsetTime;

        @NameInMap("Owner")
        public Long owner;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TargetDatabase")
        public String targetDatabase;

        @NameInMap("TargetFormat")
        public String targetFormat;

        @NameInMap("TargetLocationUri")
        public String targetLocationUri;

        @NameInMap("TargetPartitions")
        public String targetPartitions;

        @NameInMap("TargetTable")
        public String targetTable;

        @NameInMap("Workflow")
        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflow workflow;

        @NameInMap("WorkflowId")
        public String workflowId;

        @NameInMap("WorkflowLastRunInstance")
        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance workflowLastRunInstance;

        @NameInMap("WorkflowProjectId")
        public String workflowProjectId;

        public static ListBlueprintInstancesResponseBodyBlueprintInstances build(java.util.Map<String, ?> map) throws Exception {
            ListBlueprintInstancesResponseBodyBlueprintInstances self = new ListBlueprintInstancesResponseBodyBlueprintInstances();
            return TeaModel.build(map, self);
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setBatchProgress(Integer batchProgress) {
            this.batchProgress = batchProgress;
            return this;
        }
        public Integer getBatchProgress() {
            return this.batchProgress;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setBlueprintInstanceId(String blueprintInstanceId) {
            this.blueprintInstanceId = blueprintInstanceId;
            return this;
        }
        public String getBlueprintInstanceId() {
            return this.blueprintInstanceId;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setBlueprintType(String blueprintType) {
            this.blueprintType = blueprintType;
            return this;
        }
        public String getBlueprintType() {
            return this.blueprintType;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setCreator(Long creator) {
            this.creator = creator;
            return this;
        }
        public Long getCreator() {
            return this.creator;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setCreatorLoginName(String creatorLoginName) {
            this.creatorLoginName = creatorLoginName;
            return this;
        }
        public String getCreatorLoginName() {
            return this.creatorLoginName;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setDataSourceConfig(String dataSourceConfig) {
            this.dataSourceConfig = dataSourceConfig;
            return this;
        }
        public String getDataSourceConfig() {
            return this.dataSourceConfig;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setExecuteCapacity(String executeCapacity) {
            this.executeCapacity = executeCapacity;
            return this;
        }
        public String getExecuteCapacity() {
            return this.executeCapacity;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setExecuteParameters(String executeParameters) {
            this.executeParameters = executeParameters;
            return this;
        }
        public String getExecuteParameters() {
            return this.executeParameters;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setExecuteType(String executeType) {
            this.executeType = executeType;
            return this;
        }
        public String getExecuteType() {
            return this.executeType;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setFailureInfo(String failureInfo) {
            this.failureInfo = failureInfo;
            return this;
        }
        public String getFailureInfo() {
            return this.failureInfo;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setOffsetTime(Integer offsetTime) {
            this.offsetTime = offsetTime;
            return this;
        }
        public Integer getOffsetTime() {
            return this.offsetTime;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setOwner(Long owner) {
            this.owner = owner;
            return this;
        }
        public Long getOwner() {
            return this.owner;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setTargetDatabase(String targetDatabase) {
            this.targetDatabase = targetDatabase;
            return this;
        }
        public String getTargetDatabase() {
            return this.targetDatabase;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setTargetFormat(String targetFormat) {
            this.targetFormat = targetFormat;
            return this;
        }
        public String getTargetFormat() {
            return this.targetFormat;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setTargetLocationUri(String targetLocationUri) {
            this.targetLocationUri = targetLocationUri;
            return this;
        }
        public String getTargetLocationUri() {
            return this.targetLocationUri;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setTargetPartitions(String targetPartitions) {
            this.targetPartitions = targetPartitions;
            return this;
        }
        public String getTargetPartitions() {
            return this.targetPartitions;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setTargetTable(String targetTable) {
            this.targetTable = targetTable;
            return this;
        }
        public String getTargetTable() {
            return this.targetTable;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setWorkflow(ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflow workflow) {
            this.workflow = workflow;
            return this;
        }
        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflow getWorkflow() {
            return this.workflow;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setWorkflowLastRunInstance(ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance workflowLastRunInstance) {
            this.workflowLastRunInstance = workflowLastRunInstance;
            return this;
        }
        public ListBlueprintInstancesResponseBodyBlueprintInstancesWorkflowLastRunInstance getWorkflowLastRunInstance() {
            return this.workflowLastRunInstance;
        }

        public ListBlueprintInstancesResponseBodyBlueprintInstances setWorkflowProjectId(String workflowProjectId) {
            this.workflowProjectId = workflowProjectId;
            return this;
        }
        public String getWorkflowProjectId() {
            return this.workflowProjectId;
        }

    }

}
