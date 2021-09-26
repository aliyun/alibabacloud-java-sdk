// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowNodeInstanceResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    @NameInMap("EnvConf")
    public String envConf;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RetryInterval")
    public String retryInterval;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("ExternalInfo")
    public String externalInfo;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("ExternalChildIds")
    public String externalChildIds;

    @NameInMap("MonitorConf")
    public String monitorConf;

    @NameInMap("ExternalStatus")
    public String externalStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("RetryPolicy")
    public String retryPolicy;

    @NameInMap("Adhoc")
    public Boolean adhoc;

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

    @NameInMap("ParamConf")
    public String paramConf;

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

    @NameInMap("RunConf")
    public String runConf;

    @NameInMap("ExternalSubId")
    public String externalSubId;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("Id")
    public String id;

    public static DescribeFlowNodeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowNodeInstanceResponseBody self = new DescribeFlowNodeInstanceResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeFlowNodeInstanceResponseBody setEnvConf(String envConf) {
        this.envConf = envConf;
        return this;
    }
    public String getEnvConf() {
        return this.envConf;
    }

    public DescribeFlowNodeInstanceResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeFlowNodeInstanceResponseBody setRetryInterval(String retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public String getRetryInterval() {
        return this.retryInterval;
    }

    public DescribeFlowNodeInstanceResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public DescribeFlowNodeInstanceResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeFlowNodeInstanceResponseBody setExternalInfo(String externalInfo) {
        this.externalInfo = externalInfo;
        return this;
    }
    public String getExternalInfo() {
        return this.externalInfo;
    }

    public DescribeFlowNodeInstanceResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DescribeFlowNodeInstanceResponseBody setExternalChildIds(String externalChildIds) {
        this.externalChildIds = externalChildIds;
        return this;
    }
    public String getExternalChildIds() {
        return this.externalChildIds;
    }

    public DescribeFlowNodeInstanceResponseBody setMonitorConf(String monitorConf) {
        this.monitorConf = monitorConf;
        return this;
    }
    public String getMonitorConf() {
        return this.monitorConf;
    }

    public DescribeFlowNodeInstanceResponseBody setExternalStatus(String externalStatus) {
        this.externalStatus = externalStatus;
        return this;
    }
    public String getExternalStatus() {
        return this.externalStatus;
    }

    public DescribeFlowNodeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowNodeInstanceResponseBody setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public DescribeFlowNodeInstanceResponseBody setRetryPolicy(String retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }
    public String getRetryPolicy() {
        return this.retryPolicy;
    }

    public DescribeFlowNodeInstanceResponseBody setAdhoc(Boolean adhoc) {
        this.adhoc = adhoc;
        return this;
    }
    public Boolean getAdhoc() {
        return this.adhoc;
    }

    public DescribeFlowNodeInstanceResponseBody setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public DescribeFlowNodeInstanceResponseBody setPending(Boolean pending) {
        this.pending = pending;
        return this;
    }
    public Boolean getPending() {
        return this.pending;
    }

    public DescribeFlowNodeInstanceResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeFlowNodeInstanceResponseBody setMaxRetry(String maxRetry) {
        this.maxRetry = maxRetry;
        return this;
    }
    public String getMaxRetry() {
        return this.maxRetry;
    }

    public DescribeFlowNodeInstanceResponseBody setFailAct(String failAct) {
        this.failAct = failAct;
        return this;
    }
    public String getFailAct() {
        return this.failAct;
    }

    public DescribeFlowNodeInstanceResponseBody setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public DescribeFlowNodeInstanceResponseBody setFlowInstanceId(String flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
        return this;
    }
    public String getFlowInstanceId() {
        return this.flowInstanceId;
    }

    public DescribeFlowNodeInstanceResponseBody setParamConf(String paramConf) {
        this.paramConf = paramConf;
        return this;
    }
    public String getParamConf() {
        return this.paramConf;
    }

    public DescribeFlowNodeInstanceResponseBody setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeFlowNodeInstanceResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public DescribeFlowNodeInstanceResponseBody setRetries(Integer retries) {
        this.retries = retries;
        return this;
    }
    public Integer getRetries() {
        return this.retries;
    }

    public DescribeFlowNodeInstanceResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeFlowNodeInstanceResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeFlowNodeInstanceResponseBody setRunConf(String runConf) {
        this.runConf = runConf;
        return this;
    }
    public String getRunConf() {
        return this.runConf;
    }

    public DescribeFlowNodeInstanceResponseBody setExternalSubId(String externalSubId) {
        this.externalSubId = externalSubId;
        return this;
    }
    public String getExternalSubId() {
        return this.externalSubId;
    }

    public DescribeFlowNodeInstanceResponseBody setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public DescribeFlowNodeInstanceResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeFlowNodeInstanceResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeFlowNodeInstanceResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeFlowNodeInstanceResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public DescribeFlowNodeInstanceResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
