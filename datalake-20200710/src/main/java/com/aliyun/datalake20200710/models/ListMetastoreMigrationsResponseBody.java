// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListMetastoreMigrationsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListMetastoreMigrationsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListMetastoreMigrationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetastoreMigrationsResponseBody self = new ListMetastoreMigrationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetastoreMigrationsResponseBody setData(java.util.List<ListMetastoreMigrationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMetastoreMigrationsResponseBodyData> getData() {
        return this.data;
    }

    public ListMetastoreMigrationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetastoreMigrationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMetastoreMigrationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance extends TeaModel {
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

        public static ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance build(java.util.Map<String, ?> map) throws Exception {
            ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance self = new ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance();
            return TeaModel.build(map, self);
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setBatchProgress(Integer batchProgress) {
            this.batchProgress = batchProgress;
            return this;
        }
        public Integer getBatchProgress() {
            return this.batchProgress;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setExecuteMode(String executeMode) {
            this.executeMode = executeMode;
            return this;
        }
        public String getExecuteMode() {
            return this.executeMode;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setFailureInfo(String failureInfo) {
            this.failureInfo = failureInfo;
            return this;
        }
        public String getFailureInfo() {
            return this.failureInfo;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setFlowExtendResult(String flowExtendResult) {
            this.flowExtendResult = flowExtendResult;
            return this;
        }
        public String getFlowExtendResult() {
            return this.flowExtendResult;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setOffsetTime(Integer offsetTime) {
            this.offsetTime = offsetTime;
            return this;
        }
        public Integer getOffsetTime() {
            return this.offsetTime;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setOpsUrl(String opsUrl) {
            this.opsUrl = opsUrl;
            return this;
        }
        public String getOpsUrl() {
            return this.opsUrl;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance setTotalCuUsage(Float totalCuUsage) {
            this.totalCuUsage = totalCuUsage;
            return this;
        }
        public Float getTotalCuUsage() {
            return this.totalCuUsage;
        }

    }

    public static class ListMetastoreMigrationsResponseBodyData extends TeaModel {
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
        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance workflowLastRunInstance;

        public static ListMetastoreMigrationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetastoreMigrationsResponseBodyData self = new ListMetastoreMigrationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetastoreMigrationsResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListMetastoreMigrationsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMetastoreMigrationsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMetastoreMigrationsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMetastoreMigrationsResponseBodyData setMetastoreInfo(String metastoreInfo) {
            this.metastoreInfo = metastoreInfo;
            return this;
        }
        public String getMetastoreInfo() {
            return this.metastoreInfo;
        }

        public ListMetastoreMigrationsResponseBodyData setMetastoreType(String metastoreType) {
            this.metastoreType = metastoreType;
            return this;
        }
        public String getMetastoreType() {
            return this.metastoreType;
        }

        public ListMetastoreMigrationsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMetastoreMigrationsResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListMetastoreMigrationsResponseBodyData setRunOptions(String runOptions) {
            this.runOptions = runOptions;
            return this;
        }
        public String getRunOptions() {
            return this.runOptions;
        }

        public ListMetastoreMigrationsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMetastoreMigrationsResponseBodyData setWorkflowLastRunInstance(ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance workflowLastRunInstance) {
            this.workflowLastRunInstance = workflowLastRunInstance;
            return this;
        }
        public ListMetastoreMigrationsResponseBodyDataWorkflowLastRunInstance getWorkflowLastRunInstance() {
            return this.workflowLastRunInstance;
        }

    }

}
