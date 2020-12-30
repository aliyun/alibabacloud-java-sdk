// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowNodeInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("FlowNodeInstances")
    public ListFlowNodeInstanceResponseBodyFlowNodeInstances flowNodeInstances;

    @NameInMap("Total")
    public Integer total;

    public static ListFlowNodeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowNodeInstanceResponseBody self = new ListFlowNodeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowNodeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowNodeInstanceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowNodeInstanceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowNodeInstanceResponseBody setFlowNodeInstances(ListFlowNodeInstanceResponseBodyFlowNodeInstances flowNodeInstances) {
        this.flowNodeInstances = flowNodeInstances;
        return this;
    }
    public ListFlowNodeInstanceResponseBodyFlowNodeInstances getFlowNodeInstances() {
        return this.flowNodeInstances;
    }

    public ListFlowNodeInstanceResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("RetryInterval")
        public String retryInterval;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("ExternalInfo")
        public String externalInfo;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("ExternalChildIds")
        public String externalChildIds;

        @NameInMap("ExternalStatus")
        public String externalStatus;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Pending")
        public Boolean pending;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("MaxRetry")
        public String maxRetry;

        @NameInMap("FailAct")
        public String failAct;

        @NameInMap("JobParams")
        public String jobParams;

        @NameInMap("FlowInstanceId")
        public String flowInstanceId;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("Retries")
        public Integer retries;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("ExternalSubId")
        public String externalSubId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Id")
        public String id;

        public static ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance build(java.util.Map<String, ?> map) throws Exception {
            ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance self = new ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance();
            return TeaModel.build(map, self);
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setRetryInterval(String retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public String getRetryInterval() {
            return this.retryInterval;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setExternalInfo(String externalInfo) {
            this.externalInfo = externalInfo;
            return this;
        }
        public String getExternalInfo() {
            return this.externalInfo;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setExternalChildIds(String externalChildIds) {
            this.externalChildIds = externalChildIds;
            return this;
        }
        public String getExternalChildIds() {
            return this.externalChildIds;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setExternalStatus(String externalStatus) {
            this.externalStatus = externalStatus;
            return this;
        }
        public String getExternalStatus() {
            return this.externalStatus;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setPending(Boolean pending) {
            this.pending = pending;
            return this;
        }
        public Boolean getPending() {
            return this.pending;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setMaxRetry(String maxRetry) {
            this.maxRetry = maxRetry;
            return this;
        }
        public String getMaxRetry() {
            return this.maxRetry;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setFailAct(String failAct) {
            this.failAct = failAct;
            return this;
        }
        public String getFailAct() {
            return this.failAct;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setJobParams(String jobParams) {
            this.jobParams = jobParams;
            return this;
        }
        public String getJobParams() {
            return this.jobParams;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setRetries(Integer retries) {
            this.retries = retries;
            return this;
        }
        public Integer getRetries() {
            return this.retries;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setExternalSubId(String externalSubId) {
            this.externalSubId = externalSubId;
            return this;
        }
        public String getExternalSubId() {
            return this.externalSubId;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListFlowNodeInstanceResponseBodyFlowNodeInstances extends TeaModel {
        @NameInMap("FlowNodeInstance")
        public java.util.List<ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance> flowNodeInstance;

        public static ListFlowNodeInstanceResponseBodyFlowNodeInstances build(java.util.Map<String, ?> map) throws Exception {
            ListFlowNodeInstanceResponseBodyFlowNodeInstances self = new ListFlowNodeInstanceResponseBodyFlowNodeInstances();
            return TeaModel.build(map, self);
        }

        public ListFlowNodeInstanceResponseBodyFlowNodeInstances setFlowNodeInstance(java.util.List<ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance> flowNodeInstance) {
            this.flowNodeInstance = flowNodeInstance;
            return this;
        }
        public java.util.List<ListFlowNodeInstanceResponseBodyFlowNodeInstancesFlowNodeInstance> getFlowNodeInstance() {
            return this.flowNodeInstance;
        }

    }

}
