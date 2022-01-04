// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetMetastoreMigrationResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMetastoreMigrationResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMetastoreMigrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetastoreMigrationResponseBody self = new GetMetastoreMigrationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetastoreMigrationResponseBody setData(GetMetastoreMigrationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetastoreMigrationResponseBodyData getData() {
        return this.data;
    }

    public GetMetastoreMigrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetastoreMigrationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance extends TeaModel {
        @NameInMap("BatchProgress")
        public Integer batchProgress;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ExecuteMode")
        public String executeMode;

        @NameInMap("FailureInfo")
        public String failureInfo;

        @NameInMap("FlowExtendResult")
        public String flowExtendResult;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowInstanceId")
        public String flowInstanceId;

        @NameInMap("FlowName")
        public String flowName;

        @NameInMap("OffsetTime")
        public Integer offsetTime;

        @NameInMap("OpsUrl")
        public String opsUrl;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalCuUsage")
        public Float totalCuUsage;

        public static GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance build(java.util.Map<String, ?> map) throws Exception {
            GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance self = new GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance();
            return TeaModel.build(map, self);
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setBatchProgress(Integer batchProgress) {
            this.batchProgress = batchProgress;
            return this;
        }
        public Integer getBatchProgress() {
            return this.batchProgress;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setExecuteMode(String executeMode) {
            this.executeMode = executeMode;
            return this;
        }
        public String getExecuteMode() {
            return this.executeMode;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setFailureInfo(String failureInfo) {
            this.failureInfo = failureInfo;
            return this;
        }
        public String getFailureInfo() {
            return this.failureInfo;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setFlowExtendResult(String flowExtendResult) {
            this.flowExtendResult = flowExtendResult;
            return this;
        }
        public String getFlowExtendResult() {
            return this.flowExtendResult;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setOffsetTime(Integer offsetTime) {
            this.offsetTime = offsetTime;
            return this;
        }
        public Integer getOffsetTime() {
            return this.offsetTime;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setOpsUrl(String opsUrl) {
            this.opsUrl = opsUrl;
            return this;
        }
        public String getOpsUrl() {
            return this.opsUrl;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance setTotalCuUsage(Float totalCuUsage) {
            this.totalCuUsage = totalCuUsage;
            return this;
        }
        public Float getTotalCuUsage() {
            return this.totalCuUsage;
        }

    }

    public static class GetMetastoreMigrationResponseBodyData extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MetastoreInfo")
        public String metastoreInfo;

        @NameInMap("MetastoreType")
        public String metastoreType;

        @NameInMap("Name")
        public String name;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("RunOptions")
        public String runOptions;

        @NameInMap("Status")
        public String status;

        @NameInMap("WorkflowLastRunInstance")
        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance workflowLastRunInstance;

        public static GetMetastoreMigrationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetastoreMigrationResponseBodyData self = new GetMetastoreMigrationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetastoreMigrationResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetMetastoreMigrationResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMetastoreMigrationResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMetastoreMigrationResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMetastoreMigrationResponseBodyData setMetastoreInfo(String metastoreInfo) {
            this.metastoreInfo = metastoreInfo;
            return this;
        }
        public String getMetastoreInfo() {
            return this.metastoreInfo;
        }

        public GetMetastoreMigrationResponseBodyData setMetastoreType(String metastoreType) {
            this.metastoreType = metastoreType;
            return this;
        }
        public String getMetastoreType() {
            return this.metastoreType;
        }

        public GetMetastoreMigrationResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMetastoreMigrationResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetMetastoreMigrationResponseBodyData setRunOptions(String runOptions) {
            this.runOptions = runOptions;
            return this;
        }
        public String getRunOptions() {
            return this.runOptions;
        }

        public GetMetastoreMigrationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMetastoreMigrationResponseBodyData setWorkflowLastRunInstance(GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance workflowLastRunInstance) {
            this.workflowLastRunInstance = workflowLastRunInstance;
            return this;
        }
        public GetMetastoreMigrationResponseBodyDataWorkflowLastRunInstance getWorkflowLastRunInstance() {
            return this.workflowLastRunInstance;
        }

    }

}
