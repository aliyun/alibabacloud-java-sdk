// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("WorkflowInstanceDetail")
    public GetWorkflowInstanceResponseBodyWorkflowInstanceDetail workflowInstanceDetail;

    public static GetWorkflowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceResponseBody self = new GetWorkflowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowInstanceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetWorkflowInstanceResponseBody setWorkflowInstanceDetail(GetWorkflowInstanceResponseBodyWorkflowInstanceDetail workflowInstanceDetail) {
        this.workflowInstanceDetail = workflowInstanceDetail;
        return this;
    }
    public GetWorkflowInstanceResponseBodyWorkflowInstanceDetail getWorkflowInstanceDetail() {
        return this.workflowInstanceDetail;
    }

    public static class GetWorkflowInstanceResponseBodyWorkflowInstanceDetailFailedNodeInstance extends TeaModel {
        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("ExternalInfo")
        public String externalInfo;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("NodeInstanceId")
        public String nodeInstanceId;

        @NameInMap("Status")
        public String status;

        public static GetWorkflowInstanceResponseBodyWorkflowInstanceDetailFailedNodeInstance build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyWorkflowInstanceDetailFailedNodeInstance self = new GetWorkflowInstanceResponseBodyWorkflowInstanceDetailFailedNodeInstance();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailFailedNodeInstance setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailFailedNodeInstance setExternalInfo(String externalInfo) {
            this.externalInfo = externalInfo;
            return this;
        }
        public String getExternalInfo() {
            return this.externalInfo;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailFailedNodeInstance setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailFailedNodeInstance setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailFailedNodeInstance setNodeInstanceId(String nodeInstanceId) {
            this.nodeInstanceId = nodeInstanceId;
            return this;
        }
        public String getNodeInstanceId() {
            return this.nodeInstanceId;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailFailedNodeInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs extends TeaModel {
        @NameInMap("BizTime")
        public String bizTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LogContent")
        public String logContent;

        @NameInMap("LogId")
        public String logId;

        @NameInMap("LogSummary")
        public String logSummary;

        @NameInMap("LogType")
        public String logType;

        @NameInMap("Trigger")
        public String trigger;

        public static GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs self = new GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs setBizTime(String bizTime) {
            this.bizTime = bizTime;
            return this;
        }
        public String getBizTime() {
            return this.bizTime;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs setLogContent(String logContent) {
            this.logContent = logContent;
            return this;
        }
        public String getLogContent() {
            return this.logContent;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs setLogId(String logId) {
            this.logId = logId;
            return this;
        }
        public String getLogId() {
            return this.logId;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs setLogSummary(String logSummary) {
            this.logSummary = logSummary;
            return this;
        }
        public String getLogSummary() {
            return this.logSummary;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs setTrigger(String trigger) {
            this.trigger = trigger;
            return this;
        }
        public String getTrigger() {
            return this.trigger;
        }

    }

    public static class GetWorkflowInstanceResponseBodyWorkflowInstanceDetail extends TeaModel {
        @NameInMap("FailedNodeInstance")
        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailFailedNodeInstance failedNodeInstance;

        @NameInMap("FlowInstanceId")
        public String flowInstanceId;

        @NameInMap("FlowNodeSize")
        public String flowNodeSize;

        @NameInMap("HasFailedNode")
        public String hasFailedNode;

        @NameInMap("RuntimeLogs")
        public java.util.List<GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs> runtimeLogs;

        public static GetWorkflowInstanceResponseBodyWorkflowInstanceDetail build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyWorkflowInstanceDetail self = new GetWorkflowInstanceResponseBodyWorkflowInstanceDetail();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetail setFailedNodeInstance(GetWorkflowInstanceResponseBodyWorkflowInstanceDetailFailedNodeInstance failedNodeInstance) {
            this.failedNodeInstance = failedNodeInstance;
            return this;
        }
        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetailFailedNodeInstance getFailedNodeInstance() {
            return this.failedNodeInstance;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetail setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }
        public String getFlowInstanceId() {
            return this.flowInstanceId;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetail setFlowNodeSize(String flowNodeSize) {
            this.flowNodeSize = flowNodeSize;
            return this;
        }
        public String getFlowNodeSize() {
            return this.flowNodeSize;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetail setHasFailedNode(String hasFailedNode) {
            this.hasFailedNode = hasFailedNode;
            return this;
        }
        public String getHasFailedNode() {
            return this.hasFailedNode;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceDetail setRuntimeLogs(java.util.List<GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs> runtimeLogs) {
            this.runtimeLogs = runtimeLogs;
            return this;
        }
        public java.util.List<GetWorkflowInstanceResponseBodyWorkflowInstanceDetailRuntimeLogs> getRuntimeLogs() {
            return this.runtimeLogs;
        }

    }

}
