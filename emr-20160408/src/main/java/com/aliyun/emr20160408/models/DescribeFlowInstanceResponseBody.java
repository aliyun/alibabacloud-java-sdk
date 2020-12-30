// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowInstanceResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("HasNodeFailed")
    public Boolean hasNodeFailed;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Lifecycle")
    public String lifecycle;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("Graph")
    public String graph;

    @NameInMap("ScheduleTime")
    public Long scheduleTime;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("CronExpression")
    public String cronExpression;

    @NameInMap("LogArchiveLocation")
    public String logArchiveLocation;

    @NameInMap("Id")
    public String id;

    @NameInMap("NodeInstance")
    public DescribeFlowInstanceResponseBodyNodeInstance nodeInstance;

    @NameInMap("DependencyFlowList")
    public DescribeFlowInstanceResponseBodyDependencyFlowList dependencyFlowList;

    public static DescribeFlowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowInstanceResponseBody self = new DescribeFlowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeFlowInstanceResponseBody setHasNodeFailed(Boolean hasNodeFailed) {
        this.hasNodeFailed = hasNodeFailed;
        return this;
    }
    public Boolean getHasNodeFailed() {
        return this.hasNodeFailed;
    }

    public DescribeFlowInstanceResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeFlowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowInstanceResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeFlowInstanceResponseBody setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public String getLifecycle() {
        return this.lifecycle;
    }

    public DescribeFlowInstanceResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeFlowInstanceResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DescribeFlowInstanceResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeFlowInstanceResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public DescribeFlowInstanceResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeFlowInstanceResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public DescribeFlowInstanceResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeFlowInstanceResponseBody setGraph(String graph) {
        this.graph = graph;
        return this;
    }
    public String getGraph() {
        return this.graph;
    }

    public DescribeFlowInstanceResponseBody setScheduleTime(Long scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public Long getScheduleTime() {
        return this.scheduleTime;
    }

    public DescribeFlowInstanceResponseBody setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public DescribeFlowInstanceResponseBody setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public DescribeFlowInstanceResponseBody setLogArchiveLocation(String logArchiveLocation) {
        this.logArchiveLocation = logArchiveLocation;
        return this;
    }
    public String getLogArchiveLocation() {
        return this.logArchiveLocation;
    }

    public DescribeFlowInstanceResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeFlowInstanceResponseBody setNodeInstance(DescribeFlowInstanceResponseBodyNodeInstance nodeInstance) {
        this.nodeInstance = nodeInstance;
        return this;
    }
    public DescribeFlowInstanceResponseBodyNodeInstance getNodeInstance() {
        return this.nodeInstance;
    }

    public DescribeFlowInstanceResponseBody setDependencyFlowList(DescribeFlowInstanceResponseBodyDependencyFlowList dependencyFlowList) {
        this.dependencyFlowList = dependencyFlowList;
        return this;
    }
    public DescribeFlowInstanceResponseBodyDependencyFlowList getDependencyFlowList() {
        return this.dependencyFlowList;
    }

    public static class DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("FailAct")
        public String failAct;

        @NameInMap("RetryInterval")
        public String retryInterval;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("ExternalInfo")
        public String externalInfo;

        @NameInMap("Retries")
        public Integer retries;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("ExternalStatus")
        public String externalStatus;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Id")
        public String id;

        @NameInMap("Pending")
        public Boolean pending;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("MaxRetry")
        public String maxRetry;

        public static DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance self = new DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance();
            return TeaModel.build(map, self);
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setFailAct(String failAct) {
            this.failAct = failAct;
            return this;
        }
        public String getFailAct() {
            return this.failAct;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setRetryInterval(String retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public String getRetryInterval() {
            return this.retryInterval;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setExternalInfo(String externalInfo) {
            this.externalInfo = externalInfo;
            return this;
        }
        public String getExternalInfo() {
            return this.externalInfo;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setRetries(Integer retries) {
            this.retries = retries;
            return this;
        }
        public Integer getRetries() {
            return this.retries;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setExternalStatus(String externalStatus) {
            this.externalStatus = externalStatus;
            return this;
        }
        public String getExternalStatus() {
            return this.externalStatus;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setPending(Boolean pending) {
            this.pending = pending;
            return this;
        }
        public Boolean getPending() {
            return this.pending;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance setMaxRetry(String maxRetry) {
            this.maxRetry = maxRetry;
            return this;
        }
        public String getMaxRetry() {
            return this.maxRetry;
        }

    }

    public static class DescribeFlowInstanceResponseBodyNodeInstance extends TeaModel {
        @NameInMap("NodeInstance")
        public java.util.List<DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance> nodeInstance;

        public static DescribeFlowInstanceResponseBodyNodeInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowInstanceResponseBodyNodeInstance self = new DescribeFlowInstanceResponseBodyNodeInstance();
            return TeaModel.build(map, self);
        }

        public DescribeFlowInstanceResponseBodyNodeInstance setNodeInstance(java.util.List<DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance> nodeInstance) {
            this.nodeInstance = nodeInstance;
            return this;
        }
        public java.util.List<DescribeFlowInstanceResponseBodyNodeInstanceNodeInstance> getNodeInstance() {
            return this.nodeInstance;
        }

    }

    public static class DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow extends TeaModel {
        @NameInMap("ScheduleKey")
        public String scheduleKey;

        @NameInMap("BizDate")
        public Long bizDate;

        @NameInMap("DependencyInstanceId")
        public String dependencyInstanceId;

        @NameInMap("DependencyFlowId")
        public String dependencyFlowId;

        @NameInMap("Meet")
        public Boolean meet;

        @NameInMap("FlowInstanceId")
        public String flowInstanceId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("FlowId")
        public String flowId;

        public static DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow self = new DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow();
            return TeaModel.build(map, self);
        }

        public DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow setScheduleKey(String scheduleKey) {
            this.scheduleKey = scheduleKey;
            return this;
        }
        public String getScheduleKey() {
            return this.scheduleKey;
        }

        public DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow setDependencyInstanceId(String dependencyInstanceId) {
            this.dependencyInstanceId = dependencyInstanceId;
            return this;
        }
        public String getDependencyInstanceId() {
            return this.dependencyInstanceId;
        }

        public DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow setDependencyFlowId(String dependencyFlowId) {
            this.dependencyFlowId = dependencyFlowId;
            return this;
        }
        public String getDependencyFlowId() {
            return this.dependencyFlowId;
        }

        public DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow setMeet(Boolean meet) {
            this.meet = meet;
            return this;
        }
        public Boolean getMeet() {
            return this.meet;
        }

        public DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        public DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

    }

    public static class DescribeFlowInstanceResponseBodyDependencyFlowList extends TeaModel {
        @NameInMap("ParentFlow")
        public java.util.List<DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow> parentFlow;

        public static DescribeFlowInstanceResponseBodyDependencyFlowList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowInstanceResponseBodyDependencyFlowList self = new DescribeFlowInstanceResponseBodyDependencyFlowList();
            return TeaModel.build(map, self);
        }

        public DescribeFlowInstanceResponseBodyDependencyFlowList setParentFlow(java.util.List<DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow> parentFlow) {
            this.parentFlow = parentFlow;
            return this;
        }
        public java.util.List<DescribeFlowInstanceResponseBodyDependencyFlowListParentFlow> getParentFlow() {
            return this.parentFlow;
        }

    }

}
