// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowJobHistoryResponseBody extends TeaModel {
    @NameInMap("NodeInstances")
    public ListFlowJobHistoryResponseBodyNodeInstances nodeInstances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static ListFlowJobHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowJobHistoryResponseBody self = new ListFlowJobHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowJobHistoryResponseBody setNodeInstances(ListFlowJobHistoryResponseBodyNodeInstances nodeInstances) {
        this.nodeInstances = nodeInstances;
        return this;
    }
    public ListFlowJobHistoryResponseBodyNodeInstances getNodeInstances() {
        return this.nodeInstances;
    }

    public ListFlowJobHistoryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowJobHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowJobHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowJobHistoryResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("EnvConf")
        public String envConf;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("ExternalInfo")
        public String externalInfo;

        @NameInMap("ExternalStatus")
        public String externalStatus;

        @NameInMap("FailAct")
        public String failAct;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Id")
        public String id;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobParams")
        public String jobParams;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("MaxRetry")
        public Integer maxRetry;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ParamConf")
        public String paramConf;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Retries")
        public Integer retries;

        @NameInMap("RetryInterval")
        public Long retryInterval;

        @NameInMap("RunConf")
        public String runConf;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("pending")
        public Boolean pending;

        public static ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance build(java.util.Map<String, ?> map) throws Exception {
            ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance self = new ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance();
            return TeaModel.build(map, self);
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setEnvConf(String envConf) {
            this.envConf = envConf;
            return this;
        }
        public String getEnvConf() {
            return this.envConf;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setExternalInfo(String externalInfo) {
            this.externalInfo = externalInfo;
            return this;
        }
        public String getExternalInfo() {
            return this.externalInfo;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setExternalStatus(String externalStatus) {
            this.externalStatus = externalStatus;
            return this;
        }
        public String getExternalStatus() {
            return this.externalStatus;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setFailAct(String failAct) {
            this.failAct = failAct;
            return this;
        }
        public String getFailAct() {
            return this.failAct;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setJobParams(String jobParams) {
            this.jobParams = jobParams;
            return this;
        }
        public String getJobParams() {
            return this.jobParams;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setMaxRetry(Integer maxRetry) {
            this.maxRetry = maxRetry;
            return this;
        }
        public Integer getMaxRetry() {
            return this.maxRetry;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setParamConf(String paramConf) {
            this.paramConf = paramConf;
            return this;
        }
        public String getParamConf() {
            return this.paramConf;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setRetries(Integer retries) {
            this.retries = retries;
            return this;
        }
        public Integer getRetries() {
            return this.retries;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setRetryInterval(Long retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Long getRetryInterval() {
            return this.retryInterval;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setRunConf(String runConf) {
            this.runConf = runConf;
            return this;
        }
        public String getRunConf() {
            return this.runConf;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance setPending(Boolean pending) {
            this.pending = pending;
            return this;
        }
        public Boolean getPending() {
            return this.pending;
        }

    }

    public static class ListFlowJobHistoryResponseBodyNodeInstances extends TeaModel {
        @NameInMap("NodeInstance")
        public java.util.List<ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance> nodeInstance;

        public static ListFlowJobHistoryResponseBodyNodeInstances build(java.util.Map<String, ?> map) throws Exception {
            ListFlowJobHistoryResponseBodyNodeInstances self = new ListFlowJobHistoryResponseBodyNodeInstances();
            return TeaModel.build(map, self);
        }

        public ListFlowJobHistoryResponseBodyNodeInstances setNodeInstance(java.util.List<ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance> nodeInstance) {
            this.nodeInstance = nodeInstance;
            return this;
        }
        public java.util.List<ListFlowJobHistoryResponseBodyNodeInstancesNodeInstance> getNodeInstance() {
            return this.nodeInstance;
        }

    }

}
