// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessInstancesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProcessInstances")
    public java.util.List<DescribeProcessInstancesResponseBodyProcessInstances> processInstances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeProcessInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessInstancesResponseBody self = new DescribeProcessInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProcessInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProcessInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeProcessInstancesResponseBody setProcessInstances(java.util.List<DescribeProcessInstancesResponseBodyProcessInstances> processInstances) {
        this.processInstances = processInstances;
        return this;
    }
    public java.util.List<DescribeProcessInstancesResponseBodyProcessInstances> getProcessInstances() {
        return this.processInstances;
    }

    public DescribeProcessInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProcessInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeProcessInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProcessInstancesResponseBodyProcessInstances extends TeaModel {
        @NameInMap("CommandParam")
        public String commandParam;

        @NameInMap("CommandStartTime")
        public String commandStartTime;

        @NameInMap("CommandType")
        public String commandType;

        @NameInMap("DependenceScheduleTimes")
        public String dependenceScheduleTimes;

        @NameInMap("DirectoryId")
        public Long directoryId;

        @NameInMap("DryRun")
        public Long dryRun;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EnvironmentCode")
        public Long environmentCode;

        @NameInMap("ExecutorId")
        public Long executorId;

        @NameInMap("ExecutorName")
        public String executorName;

        @NameInMap("FailureStrategy")
        public String failureStrategy;

        @NameInMap("GlobalParams")
        public String globalParams;

        @NameInMap("HistoryCmd")
        public String historyCmd;

        @NameInMap("Locations")
        public String locations;

        @NameInMap("MaxTryTimes")
        public Long maxTryTimes;

        @NameInMap("Name")
        public String name;

        @NameInMap("NextProcessInstanceId")
        public Long nextProcessInstanceId;

        @NameInMap("ParentDirectoryId")
        public Long parentDirectoryId;

        @NameInMap("ParentDirectoryName")
        public String parentDirectoryName;

        @NameInMap("ProcessCode")
        public Long processCode;

        @NameInMap("ProcessDefinitionVersion")
        public Long processDefinitionVersion;

        @NameInMap("ProcessInstanceId")
        public Long processInstanceId;

        @NameInMap("ProcessInstancePriority")
        public String processInstancePriority;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("Recovery")
        public String recovery;

        @NameInMap("RunTimes")
        public Long runTimes;

        @NameInMap("ScheduleTime")
        public String scheduleTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("SubProcessEnum")
        public String subProcessEnum;

        @NameInMap("TaskDependType")
        public String taskDependType;

        @NameInMap("TenantCode")
        public String tenantCode;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("VarPool")
        public String varPool;

        @NameInMap("WarningGroupId")
        public Long warningGroupId;

        @NameInMap("WarningType")
        public String warningType;

        @NameInMap("WorkerGroup")
        public String workerGroup;

        public static DescribeProcessInstancesResponseBodyProcessInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstancesResponseBodyProcessInstances self = new DescribeProcessInstancesResponseBodyProcessInstances();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setCommandParam(String commandParam) {
            this.commandParam = commandParam;
            return this;
        }
        public String getCommandParam() {
            return this.commandParam;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setCommandStartTime(String commandStartTime) {
            this.commandStartTime = commandStartTime;
            return this;
        }
        public String getCommandStartTime() {
            return this.commandStartTime;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setCommandType(String commandType) {
            this.commandType = commandType;
            return this;
        }
        public String getCommandType() {
            return this.commandType;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setDependenceScheduleTimes(String dependenceScheduleTimes) {
            this.dependenceScheduleTimes = dependenceScheduleTimes;
            return this;
        }
        public String getDependenceScheduleTimes() {
            return this.dependenceScheduleTimes;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setDirectoryId(Long directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public Long getDirectoryId() {
            return this.directoryId;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setDryRun(Long dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Long getDryRun() {
            return this.dryRun;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setEnvironmentCode(Long environmentCode) {
            this.environmentCode = environmentCode;
            return this;
        }
        public Long getEnvironmentCode() {
            return this.environmentCode;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setExecutorId(Long executorId) {
            this.executorId = executorId;
            return this;
        }
        public Long getExecutorId() {
            return this.executorId;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setExecutorName(String executorName) {
            this.executorName = executorName;
            return this;
        }
        public String getExecutorName() {
            return this.executorName;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setFailureStrategy(String failureStrategy) {
            this.failureStrategy = failureStrategy;
            return this;
        }
        public String getFailureStrategy() {
            return this.failureStrategy;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setGlobalParams(String globalParams) {
            this.globalParams = globalParams;
            return this;
        }
        public String getGlobalParams() {
            return this.globalParams;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setHistoryCmd(String historyCmd) {
            this.historyCmd = historyCmd;
            return this;
        }
        public String getHistoryCmd() {
            return this.historyCmd;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setLocations(String locations) {
            this.locations = locations;
            return this;
        }
        public String getLocations() {
            return this.locations;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setMaxTryTimes(Long maxTryTimes) {
            this.maxTryTimes = maxTryTimes;
            return this;
        }
        public Long getMaxTryTimes() {
            return this.maxTryTimes;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setNextProcessInstanceId(Long nextProcessInstanceId) {
            this.nextProcessInstanceId = nextProcessInstanceId;
            return this;
        }
        public Long getNextProcessInstanceId() {
            return this.nextProcessInstanceId;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setParentDirectoryId(Long parentDirectoryId) {
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }
        public Long getParentDirectoryId() {
            return this.parentDirectoryId;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setParentDirectoryName(String parentDirectoryName) {
            this.parentDirectoryName = parentDirectoryName;
            return this;
        }
        public String getParentDirectoryName() {
            return this.parentDirectoryName;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setProcessCode(Long processCode) {
            this.processCode = processCode;
            return this;
        }
        public Long getProcessCode() {
            return this.processCode;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setProcessDefinitionVersion(Long processDefinitionVersion) {
            this.processDefinitionVersion = processDefinitionVersion;
            return this;
        }
        public Long getProcessDefinitionVersion() {
            return this.processDefinitionVersion;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setProcessInstanceId(Long processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public Long getProcessInstanceId() {
            return this.processInstanceId;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setProcessInstancePriority(String processInstancePriority) {
            this.processInstancePriority = processInstancePriority;
            return this;
        }
        public String getProcessInstancePriority() {
            return this.processInstancePriority;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setRecovery(String recovery) {
            this.recovery = recovery;
            return this;
        }
        public String getRecovery() {
            return this.recovery;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setRunTimes(Long runTimes) {
            this.runTimes = runTimes;
            return this;
        }
        public Long getRunTimes() {
            return this.runTimes;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setSubProcessEnum(String subProcessEnum) {
            this.subProcessEnum = subProcessEnum;
            return this;
        }
        public String getSubProcessEnum() {
            return this.subProcessEnum;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setTaskDependType(String taskDependType) {
            this.taskDependType = taskDependType;
            return this;
        }
        public String getTaskDependType() {
            return this.taskDependType;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setTenantCode(String tenantCode) {
            this.tenantCode = tenantCode;
            return this;
        }
        public String getTenantCode() {
            return this.tenantCode;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setVarPool(String varPool) {
            this.varPool = varPool;
            return this;
        }
        public String getVarPool() {
            return this.varPool;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setWarningGroupId(Long warningGroupId) {
            this.warningGroupId = warningGroupId;
            return this;
        }
        public Long getWarningGroupId() {
            return this.warningGroupId;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setWarningType(String warningType) {
            this.warningType = warningType;
            return this;
        }
        public String getWarningType() {
            return this.warningType;
        }

        public DescribeProcessInstancesResponseBodyProcessInstances setWorkerGroup(String workerGroup) {
            this.workerGroup = workerGroup;
            return this;
        }
        public String getWorkerGroup() {
            return this.workerGroup;
        }

    }

}
