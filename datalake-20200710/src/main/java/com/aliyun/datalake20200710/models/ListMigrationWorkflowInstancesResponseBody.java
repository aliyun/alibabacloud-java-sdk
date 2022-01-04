// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListMigrationWorkflowInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListMigrationWorkflowInstancesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListMigrationWorkflowInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationWorkflowInstancesResponseBody self = new ListMigrationWorkflowInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMigrationWorkflowInstancesResponseBody setData(java.util.List<ListMigrationWorkflowInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMigrationWorkflowInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListMigrationWorkflowInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMigrationWorkflowInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMigrationWorkflowInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMigrationWorkflowInstancesResponseBodyData extends TeaModel {
        @NameInMap("BatchProgress")
        public Integer batchProgress;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("EndTime")
        public Long endTime;

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

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MetastoreType")
        public String metastoreType;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        public static ListMigrationWorkflowInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationWorkflowInstancesResponseBodyData self = new ListMigrationWorkflowInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMigrationWorkflowInstancesResponseBodyData setBatchProgress(Integer batchProgress) {
            this.batchProgress = batchProgress;
            return this;
        }
        public Integer getBatchProgress() {
            return this.batchProgress;
        }

        public ListMigrationWorkflowInstancesResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListMigrationWorkflowInstancesResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListMigrationWorkflowInstancesResponseBodyData setFailureInfo(String failureInfo) {
            this.failureInfo = failureInfo;
            return this;
        }
        public String getFailureInfo() {
            return this.failureInfo;
        }

        public ListMigrationWorkflowInstancesResponseBodyData setFlowExtendResult(String flowExtendResult) {
            this.flowExtendResult = flowExtendResult;
            return this;
        }
        public String getFlowExtendResult() {
            return this.flowExtendResult;
        }

        public ListMigrationWorkflowInstancesResponseBodyData setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListMigrationWorkflowInstancesResponseBodyData setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        public ListMigrationWorkflowInstancesResponseBodyData setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListMigrationWorkflowInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMigrationWorkflowInstancesResponseBodyData setMetastoreType(String metastoreType) {
            this.metastoreType = metastoreType;
            return this;
        }
        public String getMetastoreType() {
            return this.metastoreType;
        }

        public ListMigrationWorkflowInstancesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMigrationWorkflowInstancesResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListMigrationWorkflowInstancesResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListMigrationWorkflowInstancesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
