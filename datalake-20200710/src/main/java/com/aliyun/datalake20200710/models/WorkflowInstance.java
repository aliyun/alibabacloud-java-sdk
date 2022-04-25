// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class WorkflowInstance extends TeaModel {
    // 执行进度
    @NameInMap("BatchProgress")
    public Integer batchProgress;

    // 工作流id
    @NameInMap("DlfWorkflowId")
    public String dlfWorkflowId;

    // 结束时间
    @NameInMap("EndTime")
    public Long endTime;

    // 业务流程实例id
    @NameInMap("ExternalInstanceId")
    public String externalInstanceId;

    // 运行日志
    @NameInMap("RuntimeLogs")
    public java.util.List<LogInfo> runtimeLogs;

    // 开始时间
    @NameInMap("StartTime")
    public Long startTime;

    // 运行状态
    @NameInMap("Status")
    public String status;

    public static WorkflowInstance build(java.util.Map<String, ?> map) throws Exception {
        WorkflowInstance self = new WorkflowInstance();
        return TeaModel.build(map, self);
    }

    public WorkflowInstance setBatchProgress(Integer batchProgress) {
        this.batchProgress = batchProgress;
        return this;
    }
    public Integer getBatchProgress() {
        return this.batchProgress;
    }

    public WorkflowInstance setDlfWorkflowId(String dlfWorkflowId) {
        this.dlfWorkflowId = dlfWorkflowId;
        return this;
    }
    public String getDlfWorkflowId() {
        return this.dlfWorkflowId;
    }

    public WorkflowInstance setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public WorkflowInstance setExternalInstanceId(String externalInstanceId) {
        this.externalInstanceId = externalInstanceId;
        return this;
    }
    public String getExternalInstanceId() {
        return this.externalInstanceId;
    }

    public WorkflowInstance setRuntimeLogs(java.util.List<LogInfo> runtimeLogs) {
        this.runtimeLogs = runtimeLogs;
        return this;
    }
    public java.util.List<LogInfo> getRuntimeLogs() {
        return this.runtimeLogs;
    }

    public WorkflowInstance setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public WorkflowInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
