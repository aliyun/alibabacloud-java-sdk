// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("ProcessInstance")
    public DescribeProcessInstanceAttributeResponseBodyProcessInstance processInstance;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeProcessInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessInstanceAttributeResponseBody self = new DescribeProcessInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessInstanceAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProcessInstanceAttributeResponseBody setProcessInstance(DescribeProcessInstanceAttributeResponseBodyProcessInstance processInstance) {
        this.processInstance = processInstance;
        return this;
    }
    public DescribeProcessInstanceAttributeResponseBodyProcessInstance getProcessInstance() {
        return this.processInstance;
    }

    public DescribeProcessInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProcessInstanceAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition extends TeaModel {
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

        public static DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition self = new DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setGlobalParamJson(String globalParamJson) {
            this.globalParamJson = globalParamJson;
            return this;
        }
        public String getGlobalParamJson() {
            return this.globalParamJson;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setLocationJson(String locationJson) {
            this.locationJson = locationJson;
            return this;
        }
        public String getLocationJson() {
            return this.locationJson;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setModifyBy(String modifyBy) {
            this.modifyBy = modifyBy;
            return this;
        }
        public String getModifyBy() {
            return this.modifyBy;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setReleaseState(String releaseState) {
            this.releaseState = releaseState;
            return this;
        }
        public String getReleaseState() {
            return this.releaseState;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setScheduleReleaseState(String scheduleReleaseState) {
            this.scheduleReleaseState = scheduleReleaseState;
            return this;
        }
        public String getScheduleReleaseState() {
            return this.scheduleReleaseState;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setTenantCode(String tenantCode) {
            this.tenantCode = tenantCode;
            return this;
        }
        public String getTenantCode() {
            return this.tenantCode;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition setWarningGroupId(Long warningGroupId) {
            this.warningGroupId = warningGroupId;
            return this;
        }
        public Long getWarningGroupId() {
            return this.warningGroupId;
        }

    }

    public static class DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations extends TeaModel {
        @NameInMap("ConditionParams")
        public String conditionParams;

        @NameInMap("ConditionType")
        public String conditionType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PostTaskCode")
        public Long postTaskCode;

        @NameInMap("PostTaskVersion")
        public Long postTaskVersion;

        @NameInMap("PreTaskCode")
        public Long preTaskCode;

        @NameInMap("PreTaskVersion")
        public Long preTaskVersion;

        @NameInMap("ProcessCode")
        public Long processCode;

        @NameInMap("ProcessDefinitionVersion")
        public Long processDefinitionVersion;

        @NameInMap("ProjectCode")
        public Long projectCode;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations self = new DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations setConditionParams(String conditionParams) {
            this.conditionParams = conditionParams;
            return this;
        }
        public String getConditionParams() {
            return this.conditionParams;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations setPostTaskCode(Long postTaskCode) {
            this.postTaskCode = postTaskCode;
            return this;
        }
        public Long getPostTaskCode() {
            return this.postTaskCode;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations setPostTaskVersion(Long postTaskVersion) {
            this.postTaskVersion = postTaskVersion;
            return this;
        }
        public Long getPostTaskVersion() {
            return this.postTaskVersion;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations setPreTaskCode(Long preTaskCode) {
            this.preTaskCode = preTaskCode;
            return this;
        }
        public Long getPreTaskCode() {
            return this.preTaskCode;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations setPreTaskVersion(Long preTaskVersion) {
            this.preTaskVersion = preTaskVersion;
            return this;
        }
        public Long getPreTaskVersion() {
            return this.preTaskVersion;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations setProcessCode(Long processCode) {
            this.processCode = processCode;
            return this;
        }
        public Long getProcessCode() {
            return this.processCode;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations setProcessDefinitionVersion(Long processDefinitionVersion) {
            this.processDefinitionVersion = processDefinitionVersion;
            return this;
        }
        public Long getProcessDefinitionVersion() {
            return this.processDefinitionVersion;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions extends TeaModel {
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

        public static DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions self = new DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setEnvironmentCode(Long environmentCode) {
            this.environmentCode = environmentCode;
            return this;
        }
        public Long getEnvironmentCode() {
            return this.environmentCode;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setFailRetryInterval(Long failRetryInterval) {
            this.failRetryInterval = failRetryInterval;
            return this;
        }
        public Long getFailRetryInterval() {
            return this.failRetryInterval;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setFailRetryTimes(Long failRetryTimes) {
            this.failRetryTimes = failRetryTimes;
            return this;
        }
        public Long getFailRetryTimes() {
            return this.failRetryTimes;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setModifyBy(String modifyBy) {
            this.modifyBy = modifyBy;
            return this;
        }
        public String getModifyBy() {
            return this.modifyBy;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setResourceIds(String resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public String getResourceIds() {
            return this.resourceIds;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setTaskPriority(String taskPriority) {
            this.taskPriority = taskPriority;
            return this;
        }
        public String getTaskPriority() {
            return this.taskPriority;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setTimeoutFlag(String timeoutFlag) {
            this.timeoutFlag = timeoutFlag;
            return this;
        }
        public String getTimeoutFlag() {
            return this.timeoutFlag;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setTimeoutNotifyStrategy(String timeoutNotifyStrategy) {
            this.timeoutNotifyStrategy = timeoutNotifyStrategy;
            return this;
        }
        public String getTimeoutNotifyStrategy() {
            return this.timeoutNotifyStrategy;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions setWorkerGroup(String workerGroup) {
            this.workerGroup = workerGroup;
            return this;
        }
        public String getWorkerGroup() {
            return this.workerGroup;
        }

    }

    public static class DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagData extends TeaModel {
        @NameInMap("ProcessDefinition")
        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition processDefinition;

        @NameInMap("ProcessTaskRelations")
        public java.util.List<DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations> processTaskRelations;

        @NameInMap("TaskDefinitions")
        public java.util.List<DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions> taskDefinitions;

        public static DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagData self = new DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagData();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagData setProcessDefinition(DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition processDefinition) {
            this.processDefinition = processDefinition;
            return this;
        }
        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessDefinition getProcessDefinition() {
            return this.processDefinition;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagData setProcessTaskRelations(java.util.List<DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations> processTaskRelations) {
            this.processTaskRelations = processTaskRelations;
            return this;
        }
        public java.util.List<DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataProcessTaskRelations> getProcessTaskRelations() {
            return this.processTaskRelations;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagData setTaskDefinitions(java.util.List<DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions> taskDefinitions) {
            this.taskDefinitions = taskDefinitions;
            return this;
        }
        public java.util.List<DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagDataTaskDefinitions> getTaskDefinitions() {
            return this.taskDefinitions;
        }

    }

    public static class DescribeProcessInstanceAttributeResponseBodyProcessInstance extends TeaModel {
        @NameInMap("CommandParam")
        public String commandParam;

        @NameInMap("CommandStartTime")
        public String commandStartTime;

        @NameInMap("CommandType")
        public String commandType;

        @NameInMap("DagData")
        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagData dagData;

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

        public static DescribeProcessInstanceAttributeResponseBodyProcessInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessInstanceAttributeResponseBodyProcessInstance self = new DescribeProcessInstanceAttributeResponseBodyProcessInstance();
            return TeaModel.build(map, self);
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setCommandParam(String commandParam) {
            this.commandParam = commandParam;
            return this;
        }
        public String getCommandParam() {
            return this.commandParam;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setCommandStartTime(String commandStartTime) {
            this.commandStartTime = commandStartTime;
            return this;
        }
        public String getCommandStartTime() {
            return this.commandStartTime;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setCommandType(String commandType) {
            this.commandType = commandType;
            return this;
        }
        public String getCommandType() {
            return this.commandType;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setDagData(DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagData dagData) {
            this.dagData = dagData;
            return this;
        }
        public DescribeProcessInstanceAttributeResponseBodyProcessInstanceDagData getDagData() {
            return this.dagData;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setDependenceScheduleTimes(String dependenceScheduleTimes) {
            this.dependenceScheduleTimes = dependenceScheduleTimes;
            return this;
        }
        public String getDependenceScheduleTimes() {
            return this.dependenceScheduleTimes;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setDryRun(Long dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Long getDryRun() {
            return this.dryRun;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setEnvironmentCode(Long environmentCode) {
            this.environmentCode = environmentCode;
            return this;
        }
        public Long getEnvironmentCode() {
            return this.environmentCode;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setExecutorId(Long executorId) {
            this.executorId = executorId;
            return this;
        }
        public Long getExecutorId() {
            return this.executorId;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setExecutorName(String executorName) {
            this.executorName = executorName;
            return this;
        }
        public String getExecutorName() {
            return this.executorName;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setFailureStrategy(String failureStrategy) {
            this.failureStrategy = failureStrategy;
            return this;
        }
        public String getFailureStrategy() {
            return this.failureStrategy;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setGlobalParams(String globalParams) {
            this.globalParams = globalParams;
            return this;
        }
        public String getGlobalParams() {
            return this.globalParams;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setHistoryCmd(String historyCmd) {
            this.historyCmd = historyCmd;
            return this;
        }
        public String getHistoryCmd() {
            return this.historyCmd;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setLocations(String locations) {
            this.locations = locations;
            return this;
        }
        public String getLocations() {
            return this.locations;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setMaxTryTimes(Long maxTryTimes) {
            this.maxTryTimes = maxTryTimes;
            return this;
        }
        public Long getMaxTryTimes() {
            return this.maxTryTimes;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setNextProcessInstanceId(Long nextProcessInstanceId) {
            this.nextProcessInstanceId = nextProcessInstanceId;
            return this;
        }
        public Long getNextProcessInstanceId() {
            return this.nextProcessInstanceId;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setProcessCode(Long processCode) {
            this.processCode = processCode;
            return this;
        }
        public Long getProcessCode() {
            return this.processCode;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setProcessDefinitionVersion(Long processDefinitionVersion) {
            this.processDefinitionVersion = processDefinitionVersion;
            return this;
        }
        public Long getProcessDefinitionVersion() {
            return this.processDefinitionVersion;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setProcessInstanceId(Long processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public Long getProcessInstanceId() {
            return this.processInstanceId;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setProcessInstancePriority(String processInstancePriority) {
            this.processInstancePriority = processInstancePriority;
            return this;
        }
        public String getProcessInstancePriority() {
            return this.processInstancePriority;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setRecovery(String recovery) {
            this.recovery = recovery;
            return this;
        }
        public String getRecovery() {
            return this.recovery;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setRunTimes(Long runTimes) {
            this.runTimes = runTimes;
            return this;
        }
        public Long getRunTimes() {
            return this.runTimes;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setSubProcessEnum(String subProcessEnum) {
            this.subProcessEnum = subProcessEnum;
            return this;
        }
        public String getSubProcessEnum() {
            return this.subProcessEnum;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setTaskDependType(String taskDependType) {
            this.taskDependType = taskDependType;
            return this;
        }
        public String getTaskDependType() {
            return this.taskDependType;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setTenantCode(String tenantCode) {
            this.tenantCode = tenantCode;
            return this;
        }
        public String getTenantCode() {
            return this.tenantCode;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setVarPool(String varPool) {
            this.varPool = varPool;
            return this;
        }
        public String getVarPool() {
            return this.varPool;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setWarningGroupId(Long warningGroupId) {
            this.warningGroupId = warningGroupId;
            return this;
        }
        public Long getWarningGroupId() {
            return this.warningGroupId;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setWarningType(String warningType) {
            this.warningType = warningType;
            return this;
        }
        public String getWarningType() {
            return this.warningType;
        }

        public DescribeProcessInstanceAttributeResponseBodyProcessInstance setWorkerGroup(String workerGroup) {
            this.workerGroup = workerGroup;
            return this;
        }
        public String getWorkerGroup() {
            return this.workerGroup;
        }

    }

}
