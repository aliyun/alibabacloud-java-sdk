// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListWorkflowInstantencesResponseBody extends TeaModel {
    @NameInMap("FlowInstances")
    public java.util.List<ListWorkflowInstantencesResponseBodyFlowInstances> flowInstances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Long success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListWorkflowInstantencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowInstantencesResponseBody self = new ListWorkflowInstantencesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowInstantencesResponseBody setFlowInstances(java.util.List<ListWorkflowInstantencesResponseBodyFlowInstances> flowInstances) {
        this.flowInstances = flowInstances;
        return this;
    }
    public java.util.List<ListWorkflowInstantencesResponseBodyFlowInstances> getFlowInstances() {
        return this.flowInstances;
    }

    public ListWorkflowInstantencesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowInstantencesResponseBody setSuccess(Long success) {
        this.success = success;
        return this;
    }
    public Long getSuccess() {
        return this.success;
    }

    public ListWorkflowInstantencesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkflowInstantencesResponseBodyFlowInstances extends TeaModel {
        @NameInMap("BatchProgress")
        public Integer batchProgress;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("EndTime")
        public String endTime;

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

        @NameInMap("TotalCuUsage")
        public Float totalCuUsage;

        public static ListWorkflowInstantencesResponseBodyFlowInstances build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowInstantencesResponseBodyFlowInstances self = new ListWorkflowInstantencesResponseBodyFlowInstances();
            return TeaModel.build(map, self);
        }

        public ListWorkflowInstantencesResponseBodyFlowInstances setBatchProgress(Integer batchProgress) {
            this.batchProgress = batchProgress;
            return this;
        }
        public Integer getBatchProgress() {
            return this.batchProgress;
        }

        public ListWorkflowInstantencesResponseBodyFlowInstances setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListWorkflowInstantencesResponseBodyFlowInstances setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListWorkflowInstantencesResponseBodyFlowInstances setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListWorkflowInstantencesResponseBodyFlowInstances setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListWorkflowInstantencesResponseBodyFlowInstances setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        public ListWorkflowInstantencesResponseBodyFlowInstances setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListWorkflowInstantencesResponseBodyFlowInstances setOffsetTime(Integer offsetTime) {
            this.offsetTime = offsetTime;
            return this;
        }
        public Integer getOffsetTime() {
            return this.offsetTime;
        }

        public ListWorkflowInstantencesResponseBodyFlowInstances setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListWorkflowInstantencesResponseBodyFlowInstances setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListWorkflowInstantencesResponseBodyFlowInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkflowInstantencesResponseBodyFlowInstances setTotalCuUsage(Float totalCuUsage) {
            this.totalCuUsage = totalCuUsage;
            return this;
        }
        public Float getTotalCuUsage() {
            return this.totalCuUsage;
        }

    }

}
