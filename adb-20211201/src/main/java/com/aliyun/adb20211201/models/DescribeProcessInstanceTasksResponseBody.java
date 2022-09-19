// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessInstanceTasksResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("ProcessInstanceState")
    public String processInstanceState;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskInstances")
    public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstances> taskInstances;

    public static DescribeProcessInstanceTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessInstanceTasksResponseBody self = new DescribeProcessInstanceTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessInstanceTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProcessInstanceTasksResponseBody setProcessInstanceState(String processInstanceState) {
        this.processInstanceState = processInstanceState;
        return this;
    }
    public String getProcessInstanceState() {
        return this.processInstanceState;
    }

    public DescribeProcessInstanceTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProcessInstanceTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeProcessInstanceTasksResponseBody setTaskInstances(java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstances> taskInstances) {
        this.taskInstances = taskInstances;
        return this;
    }
    public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstances> getTaskInstances() {
        return this.taskInstances;
    }

    public static class DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems extends TeaModel {
        @NameInMap("Cycle")
        public String cycle;

        @NameInMap("DateValue")
        public String dateValue;

        @NameInMap("DepTasks")
        public Long depTasks;

        @NameInMap("DependResult")
        public String dependResult;

        @NameInMap("ProcessCode")
        public Long processCode;

        @NameInMap("ProjectCode")
        public Long projectCode;

        @NameInMap("Status")
        public String status;

        public static DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems self = new DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems setCycle(String cycle) {
            this.cycle = cycle;
            return this;
        }
        public String getCycle() {
            return this.cycle;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems setDateValue(String dateValue) {
            this.dateValue = dateValue;
            return this;
        }
        public String getDateValue() {
            return this.dateValue;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems setDepTasks(Long depTasks) {
            this.depTasks = depTasks;
            return this;
        }
        public Long getDepTasks() {
            return this.depTasks;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems setDependResult(String dependResult) {
            this.dependResult = dependResult;
            return this;
        }
        public String getDependResult() {
            return this.dependResult;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems setProcessCode(Long processCode) {
            this.processCode = processCode;
            return this;
        }
        public Long getProcessCode() {
            return this.processCode;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasks extends TeaModel {
        @NameInMap("DependItems")
        public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems> dependItems;

        @NameInMap("Relation")
        public String relation;

        public static DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasks self = new DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasks();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasks setDependItems(java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems> dependItems) {
            this.dependItems = dependItems;
            return this;
        }
        public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasksDependItems> getDependItems() {
            return this.dependItems;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasks setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

    }

    public static class DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyLocalParams extends TeaModel {
        @NameInMap("Direct")
        public String direct;

        @NameInMap("Prop")
        public String prop;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyLocalParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyLocalParams self = new DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyLocalParams();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyLocalParams setDirect(String direct) {
            this.direct = direct;
            return this;
        }
        public String getDirect() {
            return this.direct;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyLocalParams setProp(String prop) {
            this.prop = prop;
            return this;
        }
        public String getProp() {
            return this.prop;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyLocalParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyLocalParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyVarPools extends TeaModel {
        @NameInMap("Direct")
        public String direct;

        @NameInMap("Prop")
        public String prop;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyVarPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyVarPools self = new DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyVarPools();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyVarPools setDirect(String direct) {
            this.direct = direct;
            return this;
        }
        public String getDirect() {
            return this.direct;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyVarPools setProp(String prop) {
            this.prop = prop;
            return this;
        }
        public String getProp() {
            return this.prop;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyVarPools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyVarPools setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeProcessInstanceTasksResponseBodyTaskInstancesDependency extends TeaModel {
        @NameInMap("DependTasks")
        public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasks> dependTasks;

        @NameInMap("LocalParams")
        public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyLocalParams> localParams;

        @NameInMap("Relation")
        public String relation;

        @NameInMap("VarPools")
        public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyVarPools> varPools;

        public static DescribeProcessInstanceTasksResponseBodyTaskInstancesDependency build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceTasksResponseBodyTaskInstancesDependency self = new DescribeProcessInstanceTasksResponseBodyTaskInstancesDependency();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependency setDependTasks(java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasks> dependTasks) {
            this.dependTasks = dependTasks;
            return this;
        }
        public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyDependTasks> getDependTasks() {
            return this.dependTasks;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependency setLocalParams(java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyLocalParams> localParams) {
            this.localParams = localParams;
            return this;
        }
        public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyLocalParams> getLocalParams() {
            return this.localParams;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependency setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependency setVarPools(java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyVarPools> varPools) {
            this.varPools = varPools;
            return this;
        }
        public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesDependencyVarPools> getVarPools() {
            return this.varPools;
        }

    }

    public static class DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine extends TeaModel {
        @NameInMap("Code")
        public Long code;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Flag")
        public String flag;

        @NameInMap("GlobalParamJson")
        public String globalParamJson;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LocationJson")
        public String locationJson;

        @NameInMap("ModifyBy")
        public String modifyBy;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectCode")
        public Long projectCode;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ReleaseState")
        public String releaseState;

        @NameInMap("ScheduleReleaseState")
        public String scheduleReleaseState;

        @NameInMap("TenantCode")
        public String tenantCode;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Version")
        public Long version;

        @NameInMap("WarningGroupId")
        public Long warningGroupId;

        public static DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine self = new DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setGlobalParamJson(String globalParamJson) {
            this.globalParamJson = globalParamJson;
            return this;
        }
        public String getGlobalParamJson() {
            return this.globalParamJson;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setLocationJson(String locationJson) {
            this.locationJson = locationJson;
            return this;
        }
        public String getLocationJson() {
            return this.locationJson;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setModifyBy(String modifyBy) {
            this.modifyBy = modifyBy;
            return this;
        }
        public String getModifyBy() {
            return this.modifyBy;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setReleaseState(String releaseState) {
            this.releaseState = releaseState;
            return this;
        }
        public String getReleaseState() {
            return this.releaseState;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setScheduleReleaseState(String scheduleReleaseState) {
            this.scheduleReleaseState = scheduleReleaseState;
            return this;
        }
        public String getScheduleReleaseState() {
            return this.scheduleReleaseState;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setTenantCode(String tenantCode) {
            this.tenantCode = tenantCode;
            return this;
        }
        public String getTenantCode() {
            return this.tenantCode;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine setWarningGroupId(Long warningGroupId) {
            this.warningGroupId = warningGroupId;
            return this;
        }
        public Long getWarningGroupId() {
            return this.warningGroupId;
        }

    }

    public static class DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance extends TeaModel {
        @NameInMap("CommandParam")
        public String commandParam;

        @NameInMap("CommandStartTime")
        public String commandStartTime;

        @NameInMap("CommandType")
        public String commandType;

        @NameInMap("DependenceScheduleTimes")
        public String dependenceScheduleTimes;

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

        public static DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance self = new DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setCommandParam(String commandParam) {
            this.commandParam = commandParam;
            return this;
        }
        public String getCommandParam() {
            return this.commandParam;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setCommandStartTime(String commandStartTime) {
            this.commandStartTime = commandStartTime;
            return this;
        }
        public String getCommandStartTime() {
            return this.commandStartTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setCommandType(String commandType) {
            this.commandType = commandType;
            return this;
        }
        public String getCommandType() {
            return this.commandType;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setDependenceScheduleTimes(String dependenceScheduleTimes) {
            this.dependenceScheduleTimes = dependenceScheduleTimes;
            return this;
        }
        public String getDependenceScheduleTimes() {
            return this.dependenceScheduleTimes;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setDryRun(Long dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Long getDryRun() {
            return this.dryRun;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setEnvironmentCode(Long environmentCode) {
            this.environmentCode = environmentCode;
            return this;
        }
        public Long getEnvironmentCode() {
            return this.environmentCode;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setExecutorId(Long executorId) {
            this.executorId = executorId;
            return this;
        }
        public Long getExecutorId() {
            return this.executorId;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setExecutorName(String executorName) {
            this.executorName = executorName;
            return this;
        }
        public String getExecutorName() {
            return this.executorName;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setFailureStrategy(String failureStrategy) {
            this.failureStrategy = failureStrategy;
            return this;
        }
        public String getFailureStrategy() {
            return this.failureStrategy;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setGlobalParams(String globalParams) {
            this.globalParams = globalParams;
            return this;
        }
        public String getGlobalParams() {
            return this.globalParams;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setHistoryCmd(String historyCmd) {
            this.historyCmd = historyCmd;
            return this;
        }
        public String getHistoryCmd() {
            return this.historyCmd;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setLocations(String locations) {
            this.locations = locations;
            return this;
        }
        public String getLocations() {
            return this.locations;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setMaxTryTimes(Long maxTryTimes) {
            this.maxTryTimes = maxTryTimes;
            return this;
        }
        public Long getMaxTryTimes() {
            return this.maxTryTimes;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setNextProcessInstanceId(Long nextProcessInstanceId) {
            this.nextProcessInstanceId = nextProcessInstanceId;
            return this;
        }
        public Long getNextProcessInstanceId() {
            return this.nextProcessInstanceId;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setProcessCode(Long processCode) {
            this.processCode = processCode;
            return this;
        }
        public Long getProcessCode() {
            return this.processCode;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setProcessDefinitionVersion(Long processDefinitionVersion) {
            this.processDefinitionVersion = processDefinitionVersion;
            return this;
        }
        public Long getProcessDefinitionVersion() {
            return this.processDefinitionVersion;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setProcessInstanceId(Long processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public Long getProcessInstanceId() {
            return this.processInstanceId;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setProcessInstancePriority(String processInstancePriority) {
            this.processInstancePriority = processInstancePriority;
            return this;
        }
        public String getProcessInstancePriority() {
            return this.processInstancePriority;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setRecovery(String recovery) {
            this.recovery = recovery;
            return this;
        }
        public String getRecovery() {
            return this.recovery;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setRunTimes(Long runTimes) {
            this.runTimes = runTimes;
            return this;
        }
        public Long getRunTimes() {
            return this.runTimes;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setSubProcessEnum(String subProcessEnum) {
            this.subProcessEnum = subProcessEnum;
            return this;
        }
        public String getSubProcessEnum() {
            return this.subProcessEnum;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setTaskDependType(String taskDependType) {
            this.taskDependType = taskDependType;
            return this;
        }
        public String getTaskDependType() {
            return this.taskDependType;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setTenantCode(String tenantCode) {
            this.tenantCode = tenantCode;
            return this;
        }
        public String getTenantCode() {
            return this.tenantCode;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setVarPool(String varPool) {
            this.varPool = varPool;
            return this;
        }
        public String getVarPool() {
            return this.varPool;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setWarningGroupId(Long warningGroupId) {
            this.warningGroupId = warningGroupId;
            return this;
        }
        public Long getWarningGroupId() {
            return this.warningGroupId;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setWarningType(String warningType) {
            this.warningType = warningType;
            return this;
        }
        public String getWarningType() {
            return this.warningType;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance setWorkerGroup(String workerGroup) {
            this.workerGroup = workerGroup;
            return this;
        }
        public String getWorkerGroup() {
            return this.workerGroup;
        }

    }

    public static class DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyLocalParams extends TeaModel {
        @NameInMap("Direct")
        public String direct;

        @NameInMap("Prop")
        public String prop;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyLocalParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyLocalParams self = new DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyLocalParams();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyLocalParams setDirect(String direct) {
            this.direct = direct;
            return this;
        }
        public String getDirect() {
            return this.direct;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyLocalParams setProp(String prop) {
            this.prop = prop;
            return this;
        }
        public String getProp() {
            return this.prop;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyLocalParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyLocalParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyVarPools extends TeaModel {
        @NameInMap("Direct")
        public String direct;

        @NameInMap("Prop")
        public String prop;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyVarPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyVarPools self = new DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyVarPools();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyVarPools setDirect(String direct) {
            this.direct = direct;
            return this;
        }
        public String getDirect() {
            return this.direct;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyVarPools setProp(String prop) {
            this.prop = prop;
            return this;
        }
        public String getProp() {
            return this.prop;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyVarPools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyVarPools setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependency extends TeaModel {
        @NameInMap("DependRelation")
        public String dependRelation;

        @NameInMap("LocalParams")
        public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyLocalParams> localParams;

        @NameInMap("NextNodes")
        public java.util.List<String> nextNodes;

        @NameInMap("Relation")
        public String relation;

        @NameInMap("VarPools")
        public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyVarPools> varPools;

        public static DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependency build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependency self = new DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependency();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependency setDependRelation(String dependRelation) {
            this.dependRelation = dependRelation;
            return this;
        }
        public String getDependRelation() {
            return this.dependRelation;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependency setLocalParams(java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyLocalParams> localParams) {
            this.localParams = localParams;
            return this;
        }
        public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyLocalParams> getLocalParams() {
            return this.localParams;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependency setNextNodes(java.util.List<String> nextNodes) {
            this.nextNodes = nextNodes;
            return this;
        }
        public java.util.List<String> getNextNodes() {
            return this.nextNodes;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependency setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependency setVarPools(java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyVarPools> varPools) {
            this.varPools = varPools;
            return this;
        }
        public java.util.List<DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependencyVarPools> getVarPools() {
            return this.varPools;
        }

    }

    public static class DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine extends TeaModel {
        @NameInMap("Code")
        public Long code;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnvironmentCode")
        public Long environmentCode;

        @NameInMap("FailRetryInterval")
        public Long failRetryInterval;

        @NameInMap("FailRetryTimes")
        public Long failRetryTimes;

        @NameInMap("Flag")
        public String flag;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyBy")
        public String modifyBy;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectCode")
        public Long projectCode;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ResourceIds")
        public String resourceIds;

        @NameInMap("TaskParams")
        public String taskParams;

        @NameInMap("TaskPriority")
        public String taskPriority;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("TimeoutFlag")
        public String timeoutFlag;

        @NameInMap("TimeoutNotifyStrategy")
        public String timeoutNotifyStrategy;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Version")
        public Long version;

        @NameInMap("WorkerGroup")
        public String workerGroup;

        public static DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine self = new DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setEnvironmentCode(Long environmentCode) {
            this.environmentCode = environmentCode;
            return this;
        }
        public Long getEnvironmentCode() {
            return this.environmentCode;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setFailRetryInterval(Long failRetryInterval) {
            this.failRetryInterval = failRetryInterval;
            return this;
        }
        public Long getFailRetryInterval() {
            return this.failRetryInterval;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setFailRetryTimes(Long failRetryTimes) {
            this.failRetryTimes = failRetryTimes;
            return this;
        }
        public Long getFailRetryTimes() {
            return this.failRetryTimes;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setModifyBy(String modifyBy) {
            this.modifyBy = modifyBy;
            return this;
        }
        public String getModifyBy() {
            return this.modifyBy;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setResourceIds(String resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public String getResourceIds() {
            return this.resourceIds;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setTaskPriority(String taskPriority) {
            this.taskPriority = taskPriority;
            return this;
        }
        public String getTaskPriority() {
            return this.taskPriority;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setTimeoutFlag(String timeoutFlag) {
            this.timeoutFlag = timeoutFlag;
            return this;
        }
        public String getTimeoutFlag() {
            return this.timeoutFlag;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setTimeoutNotifyStrategy(String timeoutNotifyStrategy) {
            this.timeoutNotifyStrategy = timeoutNotifyStrategy;
            return this;
        }
        public String getTimeoutNotifyStrategy() {
            return this.timeoutNotifyStrategy;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine setWorkerGroup(String workerGroup) {
            this.workerGroup = workerGroup;
            return this;
        }
        public String getWorkerGroup() {
            return this.workerGroup;
        }

    }

    public static class DescribeProcessInstanceTasksResponseBodyTaskInstances extends TeaModel {
        @NameInMap("AlertFlag")
        public String alertFlag;

        @NameInMap("AppLink")
        public String appLink;

        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("Dependency")
        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependency dependency;

        @NameInMap("DependentResult")
        public String dependentResult;

        @NameInMap("DryRun")
        public Long dryRun;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EnvironmentCode")
        public Long environmentCode;

        @NameInMap("EnvironmentConfig")
        public String environmentConfig;

        @NameInMap("ExecutorId")
        public Long executorId;

        @NameInMap("ExecutorName")
        public String executorName;

        @NameInMap("FirstSubmitTime")
        public String firstSubmitTime;

        @NameInMap("Flag")
        public String flag;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MaxRetryTimes")
        public Long maxRetryTimes;

        @NameInMap("Name")
        public String name;

        @NameInMap("Pid")
        public Long pid;

        @NameInMap("ProcessDefine")
        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine processDefine;

        @NameInMap("ProcessInstance")
        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance processInstance;

        @NameInMap("ProcessInstanceName")
        public String processInstanceName;

        @NameInMap("ProcessInstancePriority")
        public String processInstancePriority;

        @NameInMap("ProcessIntanceId")
        public Long processIntanceId;

        @NameInMap("Resources")
        public String resources;

        @NameInMap("RetryInterval")
        public Long retryInterval;

        @NameInMap("RetryTimes")
        public Long retryTimes;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("SwitchDependency")
        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependency switchDependency;

        @NameInMap("TaskCode")
        public Long taskCode;

        @NameInMap("TaskDefine")
        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine taskDefine;

        @NameInMap("TaskDefinitionVersion")
        public Long taskDefinitionVersion;

        @NameInMap("TaskInstancePriority")
        public String taskInstancePriority;

        @NameInMap("TaskParams")
        public String taskParams;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("VarPool")
        public String varPool;

        @NameInMap("WorkerGroup")
        public String workerGroup;

        public static DescribeProcessInstanceTasksResponseBodyTaskInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceTasksResponseBodyTaskInstances self = new DescribeProcessInstanceTasksResponseBodyTaskInstances();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setAlertFlag(String alertFlag) {
            this.alertFlag = alertFlag;
            return this;
        }
        public String getAlertFlag() {
            return this.alertFlag;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setAppLink(String appLink) {
            this.appLink = appLink;
            return this;
        }
        public String getAppLink() {
            return this.appLink;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setDependency(DescribeProcessInstanceTasksResponseBodyTaskInstancesDependency dependency) {
            this.dependency = dependency;
            return this;
        }
        public DescribeProcessInstanceTasksResponseBodyTaskInstancesDependency getDependency() {
            return this.dependency;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setDependentResult(String dependentResult) {
            this.dependentResult = dependentResult;
            return this;
        }
        public String getDependentResult() {
            return this.dependentResult;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setDryRun(Long dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Long getDryRun() {
            return this.dryRun;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setEnvironmentCode(Long environmentCode) {
            this.environmentCode = environmentCode;
            return this;
        }
        public Long getEnvironmentCode() {
            return this.environmentCode;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setEnvironmentConfig(String environmentConfig) {
            this.environmentConfig = environmentConfig;
            return this;
        }
        public String getEnvironmentConfig() {
            return this.environmentConfig;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setExecutorId(Long executorId) {
            this.executorId = executorId;
            return this;
        }
        public Long getExecutorId() {
            return this.executorId;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setExecutorName(String executorName) {
            this.executorName = executorName;
            return this;
        }
        public String getExecutorName() {
            return this.executorName;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setFirstSubmitTime(String firstSubmitTime) {
            this.firstSubmitTime = firstSubmitTime;
            return this;
        }
        public String getFirstSubmitTime() {
            return this.firstSubmitTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setMaxRetryTimes(Long maxRetryTimes) {
            this.maxRetryTimes = maxRetryTimes;
            return this;
        }
        public Long getMaxRetryTimes() {
            return this.maxRetryTimes;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setPid(Long pid) {
            this.pid = pid;
            return this;
        }
        public Long getPid() {
            return this.pid;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setProcessDefine(DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine processDefine) {
            this.processDefine = processDefine;
            return this;
        }
        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessDefine getProcessDefine() {
            return this.processDefine;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setProcessInstance(DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance processInstance) {
            this.processInstance = processInstance;
            return this;
        }
        public DescribeProcessInstanceTasksResponseBodyTaskInstancesProcessInstance getProcessInstance() {
            return this.processInstance;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setProcessInstanceName(String processInstanceName) {
            this.processInstanceName = processInstanceName;
            return this;
        }
        public String getProcessInstanceName() {
            return this.processInstanceName;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setProcessInstancePriority(String processInstancePriority) {
            this.processInstancePriority = processInstancePriority;
            return this;
        }
        public String getProcessInstancePriority() {
            return this.processInstancePriority;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setProcessIntanceId(Long processIntanceId) {
            this.processIntanceId = processIntanceId;
            return this;
        }
        public Long getProcessIntanceId() {
            return this.processIntanceId;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setResources(String resources) {
            this.resources = resources;
            return this;
        }
        public String getResources() {
            return this.resources;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setRetryInterval(Long retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Long getRetryInterval() {
            return this.retryInterval;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setRetryTimes(Long retryTimes) {
            this.retryTimes = retryTimes;
            return this;
        }
        public Long getRetryTimes() {
            return this.retryTimes;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setSwitchDependency(DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependency switchDependency) {
            this.switchDependency = switchDependency;
            return this;
        }
        public DescribeProcessInstanceTasksResponseBodyTaskInstancesSwitchDependency getSwitchDependency() {
            return this.switchDependency;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setTaskCode(Long taskCode) {
            this.taskCode = taskCode;
            return this;
        }
        public Long getTaskCode() {
            return this.taskCode;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setTaskDefine(DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine taskDefine) {
            this.taskDefine = taskDefine;
            return this;
        }
        public DescribeProcessInstanceTasksResponseBodyTaskInstancesTaskDefine getTaskDefine() {
            return this.taskDefine;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setTaskDefinitionVersion(Long taskDefinitionVersion) {
            this.taskDefinitionVersion = taskDefinitionVersion;
            return this;
        }
        public Long getTaskDefinitionVersion() {
            return this.taskDefinitionVersion;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setTaskInstancePriority(String taskInstancePriority) {
            this.taskInstancePriority = taskInstancePriority;
            return this;
        }
        public String getTaskInstancePriority() {
            return this.taskInstancePriority;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setVarPool(String varPool) {
            this.varPool = varPool;
            return this;
        }
        public String getVarPool() {
            return this.varPool;
        }

        public DescribeProcessInstanceTasksResponseBodyTaskInstances setWorkerGroup(String workerGroup) {
            this.workerGroup = workerGroup;
            return this;
        }
        public String getWorkerGroup() {
            return this.workerGroup;
        }

    }

}
