// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartProcessInstanceRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DryRun")
    public Long dryRun;

    @NameInMap("EnvironmentCode")
    public Long environmentCode;

    @NameInMap("ExecType")
    public String execType;

    @NameInMap("ExpectedParallelismNumber")
    public Long expectedParallelismNumber;

    @NameInMap("FailureStrategy")
    public String failureStrategy;

    @NameInMap("ProcessCode")
    public Long processCode;

    @NameInMap("ProcessInstancePriority")
    public String processInstancePriority;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RunMode")
    public String runMode;

    @NameInMap("ScheduleEndTime")
    public String scheduleEndTime;

    @NameInMap("ScheduleStartTime")
    public String scheduleStartTime;

    @NameInMap("StartNodeList")
    public String startNodeList;

    @NameInMap("StartParams")
    public String startParams;

    @NameInMap("TaskDependType")
    public String taskDependType;

    @NameInMap("Timeout")
    public Long timeout;

    @NameInMap("WarningGroupId")
    public Long warningGroupId;

    @NameInMap("WarningType")
    public String warningType;

    @NameInMap("WorkerGroup")
    public String workerGroup;

    public static StartProcessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartProcessInstanceRequest self = new StartProcessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartProcessInstanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public StartProcessInstanceRequest setDryRun(Long dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Long getDryRun() {
        return this.dryRun;
    }

    public StartProcessInstanceRequest setEnvironmentCode(Long environmentCode) {
        this.environmentCode = environmentCode;
        return this;
    }
    public Long getEnvironmentCode() {
        return this.environmentCode;
    }

    public StartProcessInstanceRequest setExecType(String execType) {
        this.execType = execType;
        return this;
    }
    public String getExecType() {
        return this.execType;
    }

    public StartProcessInstanceRequest setExpectedParallelismNumber(Long expectedParallelismNumber) {
        this.expectedParallelismNumber = expectedParallelismNumber;
        return this;
    }
    public Long getExpectedParallelismNumber() {
        return this.expectedParallelismNumber;
    }

    public StartProcessInstanceRequest setFailureStrategy(String failureStrategy) {
        this.failureStrategy = failureStrategy;
        return this;
    }
    public String getFailureStrategy() {
        return this.failureStrategy;
    }

    public StartProcessInstanceRequest setProcessCode(Long processCode) {
        this.processCode = processCode;
        return this;
    }
    public Long getProcessCode() {
        return this.processCode;
    }

    public StartProcessInstanceRequest setProcessInstancePriority(String processInstancePriority) {
        this.processInstancePriority = processInstancePriority;
        return this;
    }
    public String getProcessInstancePriority() {
        return this.processInstancePriority;
    }

    public StartProcessInstanceRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public StartProcessInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartProcessInstanceRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public StartProcessInstanceRequest setScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
        return this;
    }
    public String getScheduleEndTime() {
        return this.scheduleEndTime;
    }

    public StartProcessInstanceRequest setScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
        return this;
    }
    public String getScheduleStartTime() {
        return this.scheduleStartTime;
    }

    public StartProcessInstanceRequest setStartNodeList(String startNodeList) {
        this.startNodeList = startNodeList;
        return this;
    }
    public String getStartNodeList() {
        return this.startNodeList;
    }

    public StartProcessInstanceRequest setStartParams(String startParams) {
        this.startParams = startParams;
        return this;
    }
    public String getStartParams() {
        return this.startParams;
    }

    public StartProcessInstanceRequest setTaskDependType(String taskDependType) {
        this.taskDependType = taskDependType;
        return this;
    }
    public String getTaskDependType() {
        return this.taskDependType;
    }

    public StartProcessInstanceRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public StartProcessInstanceRequest setWarningGroupId(Long warningGroupId) {
        this.warningGroupId = warningGroupId;
        return this;
    }
    public Long getWarningGroupId() {
        return this.warningGroupId;
    }

    public StartProcessInstanceRequest setWarningType(String warningType) {
        this.warningType = warningType;
        return this;
    }
    public String getWarningType() {
        return this.warningType;
    }

    public StartProcessInstanceRequest setWorkerGroup(String workerGroup) {
        this.workerGroup = workerGroup;
        return this;
    }
    public String getWorkerGroup() {
        return this.workerGroup;
    }

}
