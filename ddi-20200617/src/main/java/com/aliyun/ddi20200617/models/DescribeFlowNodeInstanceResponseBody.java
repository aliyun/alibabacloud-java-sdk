// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowNodeInstanceResponseBody extends TeaModel {
    @NameInMap("Adhoc")
    public Boolean adhoc;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EnvConf")
    public String envConf;

    @NameInMap("ExternalChildIds")
    public String externalChildIds;

    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("ExternalInfo")
    public String externalInfo;

    @NameInMap("ExternalStatus")
    public String externalStatus;

    @NameInMap("ExternalSubId")
    public String externalSubId;

    @NameInMap("FailAct")
    public String failAct;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("FlowInstanceId")
    public String flowInstanceId;

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
    public String maxRetry;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("MonitorConf")
    public String monitorConf;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("ParamConf")
    public String paramConf;

    @NameInMap("Pending")
    public Boolean pending;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Retries")
    public Integer retries;

    @NameInMap("RetryInterval")
    public String retryInterval;

    @NameInMap("RetryPolicy")
    public String retryPolicy;

    @NameInMap("RunConf")
    public String runConf;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    public static DescribeFlowNodeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowNodeInstanceResponseBody self = new DescribeFlowNodeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowNodeInstanceResponseBody setAdhoc(Boolean adhoc) {
        this.adhoc = adhoc;
        return this;
    }
    public Boolean getAdhoc() {
        return this.adhoc;
    }

    public DescribeFlowNodeInstanceResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeFlowNodeInstanceResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeFlowNodeInstanceResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public DescribeFlowNodeInstanceResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeFlowNodeInstanceResponseBody setEnvConf(String envConf) {
        this.envConf = envConf;
        return this;
    }
    public String getEnvConf() {
        return this.envConf;
    }

    public DescribeFlowNodeInstanceResponseBody setExternalChildIds(String externalChildIds) {
        this.externalChildIds = externalChildIds;
        return this;
    }
    public String getExternalChildIds() {
        return this.externalChildIds;
    }

    public DescribeFlowNodeInstanceResponseBody setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public DescribeFlowNodeInstanceResponseBody setExternalInfo(String externalInfo) {
        this.externalInfo = externalInfo;
        return this;
    }
    public String getExternalInfo() {
        return this.externalInfo;
    }

    public DescribeFlowNodeInstanceResponseBody setExternalStatus(String externalStatus) {
        this.externalStatus = externalStatus;
        return this;
    }
    public String getExternalStatus() {
        return this.externalStatus;
    }

    public DescribeFlowNodeInstanceResponseBody setExternalSubId(String externalSubId) {
        this.externalSubId = externalSubId;
        return this;
    }
    public String getExternalSubId() {
        return this.externalSubId;
    }

    public DescribeFlowNodeInstanceResponseBody setFailAct(String failAct) {
        this.failAct = failAct;
        return this;
    }
    public String getFailAct() {
        return this.failAct;
    }

    public DescribeFlowNodeInstanceResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public DescribeFlowNodeInstanceResponseBody setFlowInstanceId(String flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
        return this;
    }
    public String getFlowInstanceId() {
        return this.flowInstanceId;
    }

    public DescribeFlowNodeInstanceResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeFlowNodeInstanceResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DescribeFlowNodeInstanceResponseBody setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeFlowNodeInstanceResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeFlowNodeInstanceResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeFlowNodeInstanceResponseBody setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public DescribeFlowNodeInstanceResponseBody setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public DescribeFlowNodeInstanceResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public DescribeFlowNodeInstanceResponseBody setMaxRetry(String maxRetry) {
        this.maxRetry = maxRetry;
        return this;
    }
    public String getMaxRetry() {
        return this.maxRetry;
    }

    public DescribeFlowNodeInstanceResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeFlowNodeInstanceResponseBody setMonitorConf(String monitorConf) {
        this.monitorConf = monitorConf;
        return this;
    }
    public String getMonitorConf() {
        return this.monitorConf;
    }

    public DescribeFlowNodeInstanceResponseBody setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public DescribeFlowNodeInstanceResponseBody setParamConf(String paramConf) {
        this.paramConf = paramConf;
        return this;
    }
    public String getParamConf() {
        return this.paramConf;
    }

    public DescribeFlowNodeInstanceResponseBody setPending(Boolean pending) {
        this.pending = pending;
        return this;
    }
    public Boolean getPending() {
        return this.pending;
    }

    public DescribeFlowNodeInstanceResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeFlowNodeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowNodeInstanceResponseBody setRetries(Integer retries) {
        this.retries = retries;
        return this;
    }
    public Integer getRetries() {
        return this.retries;
    }

    public DescribeFlowNodeInstanceResponseBody setRetryInterval(String retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public String getRetryInterval() {
        return this.retryInterval;
    }

    public DescribeFlowNodeInstanceResponseBody setRetryPolicy(String retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }
    public String getRetryPolicy() {
        return this.retryPolicy;
    }

    public DescribeFlowNodeInstanceResponseBody setRunConf(String runConf) {
        this.runConf = runConf;
        return this;
    }
    public String getRunConf() {
        return this.runConf;
    }

    public DescribeFlowNodeInstanceResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeFlowNodeInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeFlowNodeInstanceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
