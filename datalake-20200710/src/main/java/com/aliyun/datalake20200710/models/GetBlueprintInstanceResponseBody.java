// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetBlueprintInstanceResponseBody extends TeaModel {
    @NameInMap("BlueprintInstance")
    public GetBlueprintInstanceResponseBodyBlueprintInstance blueprintInstance;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetBlueprintInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBlueprintInstanceResponseBody self = new GetBlueprintInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBlueprintInstanceResponseBody setBlueprintInstance(GetBlueprintInstanceResponseBodyBlueprintInstance blueprintInstance) {
        this.blueprintInstance = blueprintInstance;
        return this;
    }
    public GetBlueprintInstanceResponseBodyBlueprintInstance getBlueprintInstance() {
        return this.blueprintInstance;
    }

    public GetBlueprintInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBlueprintInstanceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflow extends TeaModel {
        @NameInMap("LatestEndTime")
        public String latestEndTime;

        @NameInMap("LatestInstanceStatus")
        public String latestInstanceStatus;

        @NameInMap("LatestStartTime")
        public String latestStartTime;

        @NameInMap("WorkflowId")
        public String workflowId;

        public static GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflow build(java.util.Map<String, ?> map) throws Exception {
            GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflow self = new GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflow();
            return TeaModel.build(map, self);
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflow setLatestEndTime(String latestEndTime) {
            this.latestEndTime = latestEndTime;
            return this;
        }
        public String getLatestEndTime() {
            return this.latestEndTime;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflow setLatestInstanceStatus(String latestInstanceStatus) {
            this.latestInstanceStatus = latestInstanceStatus;
            return this;
        }
        public String getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflow setLatestStartTime(String latestStartTime) {
            this.latestStartTime = latestStartTime;
            return this;
        }
        public String getLatestStartTime() {
            return this.latestStartTime;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflow setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance extends TeaModel {
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

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance build(java.util.Map<String, ?> map) throws Exception {
            GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance self = new GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance();
            return TeaModel.build(map, self);
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance setFailureInfo(String failureInfo) {
            this.failureInfo = failureInfo;
            return this;
        }
        public String getFailureInfo() {
            return this.failureInfo;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetBlueprintInstanceResponseBodyBlueprintInstance extends TeaModel {
        @NameInMap("BlueprintInstanceId")
        public String blueprintInstanceId;

        @NameInMap("BlueprintType")
        public String blueprintType;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DataSourceConfig")
        public String dataSourceConfig;

        @NameInMap("ExecuteCapacity")
        public Long executeCapacity;

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

        @NameInMap("Owner")
        public String owner;

        @NameInMap("PreProcessingConfig")
        public String preProcessingConfig;

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
        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflow workflow;

        @NameInMap("WorkflowId")
        public String workflowId;

        @NameInMap("WorkflowLastRunInstance")
        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance workflowLastRunInstance;

        @NameInMap("WorkflowProjectId")
        public String workflowProjectId;

        public static GetBlueprintInstanceResponseBodyBlueprintInstance build(java.util.Map<String, ?> map) throws Exception {
            GetBlueprintInstanceResponseBodyBlueprintInstance self = new GetBlueprintInstanceResponseBodyBlueprintInstance();
            return TeaModel.build(map, self);
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setBlueprintInstanceId(String blueprintInstanceId) {
            this.blueprintInstanceId = blueprintInstanceId;
            return this;
        }
        public String getBlueprintInstanceId() {
            return this.blueprintInstanceId;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setBlueprintType(String blueprintType) {
            this.blueprintType = blueprintType;
            return this;
        }
        public String getBlueprintType() {
            return this.blueprintType;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setDataSourceConfig(String dataSourceConfig) {
            this.dataSourceConfig = dataSourceConfig;
            return this;
        }
        public String getDataSourceConfig() {
            return this.dataSourceConfig;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setExecuteCapacity(Long executeCapacity) {
            this.executeCapacity = executeCapacity;
            return this;
        }
        public Long getExecuteCapacity() {
            return this.executeCapacity;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setExecuteParameters(String executeParameters) {
            this.executeParameters = executeParameters;
            return this;
        }
        public String getExecuteParameters() {
            return this.executeParameters;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setExecuteType(String executeType) {
            this.executeType = executeType;
            return this;
        }
        public String getExecuteType() {
            return this.executeType;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setFailureInfo(String failureInfo) {
            this.failureInfo = failureInfo;
            return this;
        }
        public String getFailureInfo() {
            return this.failureInfo;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setPreProcessingConfig(String preProcessingConfig) {
            this.preProcessingConfig = preProcessingConfig;
            return this;
        }
        public String getPreProcessingConfig() {
            return this.preProcessingConfig;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setTargetDatabase(String targetDatabase) {
            this.targetDatabase = targetDatabase;
            return this;
        }
        public String getTargetDatabase() {
            return this.targetDatabase;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setTargetFormat(String targetFormat) {
            this.targetFormat = targetFormat;
            return this;
        }
        public String getTargetFormat() {
            return this.targetFormat;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setTargetLocationUri(String targetLocationUri) {
            this.targetLocationUri = targetLocationUri;
            return this;
        }
        public String getTargetLocationUri() {
            return this.targetLocationUri;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setTargetPartitions(String targetPartitions) {
            this.targetPartitions = targetPartitions;
            return this;
        }
        public String getTargetPartitions() {
            return this.targetPartitions;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setTargetTable(String targetTable) {
            this.targetTable = targetTable;
            return this;
        }
        public String getTargetTable() {
            return this.targetTable;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setWorkflow(GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflow workflow) {
            this.workflow = workflow;
            return this;
        }
        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflow getWorkflow() {
            return this.workflow;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setWorkflowLastRunInstance(GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance workflowLastRunInstance) {
            this.workflowLastRunInstance = workflowLastRunInstance;
            return this;
        }
        public GetBlueprintInstanceResponseBodyBlueprintInstanceWorkflowLastRunInstance getWorkflowLastRunInstance() {
            return this.workflowLastRunInstance;
        }

        public GetBlueprintInstanceResponseBodyBlueprintInstance setWorkflowProjectId(String workflowProjectId) {
            this.workflowProjectId = workflowProjectId;
            return this;
        }
        public String getWorkflowProjectId() {
            return this.workflowProjectId;
        }

    }

}
