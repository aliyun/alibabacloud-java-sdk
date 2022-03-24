// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowJobHistoryResponseBody extends TeaModel {
    // 作业实例列表。
    @NameInMap("NodeInstances")
    public ListFlowJobHistoryResponseBodyNodeInstances nodeInstances;

    // 当前页码。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页查询时设置的每页行数。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 记录总数。
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
        // 集群ID。
        @NameInMap("ClusterId")
        public String clusterId;

        // 运行结束时间。
        @NameInMap("EndTime")
        public Long endTime;

        // 环境变量设置。
        @NameInMap("EnvConf")
        public String envConf;

        // 启动器的application的ID。
        @NameInMap("ExternalId")
        public String externalId;

        // 外部信息。例如，运行作业的错误诊断信息。
        @NameInMap("ExternalInfo")
        public String externalInfo;

        // 实例对应的Container的状态：SUBMITTED, RUNNING, SUCCESS, FAIL, KILL_FAIL, KILL_SUCCESS
        @NameInMap("ExternalStatus")
        public String externalStatus;

        // 失败策略，可能的取值：CONTINUE（提过本次作业），STOP（停止作业）
        @NameInMap("FailAct")
        public String failAct;

        // 创建时间。
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        // 创建时间。
        @NameInMap("GmtModified")
        public Long gmtModified;

        // 保留参数。
        @NameInMap("HostName")
        public String hostName;

        // 作业实例ID。
        @NameInMap("Id")
        public String id;

        // 作业ID。
        @NameInMap("JobId")
        public String jobId;

        // 作业名称。
        @NameInMap("JobName")
        public String jobName;

        // 作业内容。
        @NameInMap("JobParams")
        public String jobParams;

        // 作业类型。
        @NameInMap("JobType")
        public String jobType;

        // 最大重试次数。
        @NameInMap("MaxRetry")
        public Integer maxRetry;

        // 保留参数。
        @NameInMap("NodeName")
        public String nodeName;

        // 参数设置。
        @NameInMap("ParamConf")
        public String paramConf;

        // 项目ID。
        @NameInMap("ProjectId")
        public String projectId;

        // 重试次数。
        @NameInMap("Retries")
        public Integer retries;

        // 重试间隔 0-300（秒）。
        @NameInMap("RetryInterval")
        public Long retryInterval;

        // 运行配置，取值如下：priority（优先级），userName（任务的Linux提交用户），memory（内存，单位为MB），cores（核数）
        @NameInMap("RunConf")
        public String runConf;

        // 运行开始时间。
        @NameInMap("StartTime")
        public Long startTime;

        // 实例的执行状态：PREP：准备启动，SUBMITTING：提交中，RUNNING：运行中DONE：已完成，OK：执行成功，FAILED：执行失败，KILLED：已终止，KILL_FAILED：终止失败，START_RETRY：开始重试
        @NameInMap("Status")
        public String status;

        // 节点类型：JOB：作业，CLUSTER：集群，START：开始，END：结束
        @NameInMap("Type")
        public String type;

        // 是否结束。
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
