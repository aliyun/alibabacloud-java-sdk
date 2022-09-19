// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyProcessInstanceRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Flag")
    public String flag;

    @NameInMap("GlobalParams")
    public java.util.List<ModifyProcessInstanceRequestGlobalParams> globalParams;

    @NameInMap("Locations")
    public java.util.List<ModifyProcessInstanceRequestLocations> locations;

    @NameInMap("ProcessInstanceId")
    public Long processInstanceId;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScheduleTime")
    public String scheduleTime;

    @NameInMap("SyncDefine")
    public Boolean syncDefine;

    @NameInMap("TaskDefinitions")
    public java.util.List<ModifyProcessInstanceRequestTaskDefinitions> taskDefinitions;

    @NameInMap("TaskRelations")
    public java.util.List<ModifyProcessInstanceRequestTaskRelations> taskRelations;

    @NameInMap("Timeout")
    public Long timeout;

    public static ModifyProcessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProcessInstanceRequest self = new ModifyProcessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProcessInstanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyProcessInstanceRequest setFlag(String flag) {
        this.flag = flag;
        return this;
    }
    public String getFlag() {
        return this.flag;
    }

    public ModifyProcessInstanceRequest setGlobalParams(java.util.List<ModifyProcessInstanceRequestGlobalParams> globalParams) {
        this.globalParams = globalParams;
        return this;
    }
    public java.util.List<ModifyProcessInstanceRequestGlobalParams> getGlobalParams() {
        return this.globalParams;
    }

    public ModifyProcessInstanceRequest setLocations(java.util.List<ModifyProcessInstanceRequestLocations> locations) {
        this.locations = locations;
        return this;
    }
    public java.util.List<ModifyProcessInstanceRequestLocations> getLocations() {
        return this.locations;
    }

    public ModifyProcessInstanceRequest setProcessInstanceId(Long processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public Long getProcessInstanceId() {
        return this.processInstanceId;
    }

    public ModifyProcessInstanceRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public ModifyProcessInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyProcessInstanceRequest setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public ModifyProcessInstanceRequest setSyncDefine(Boolean syncDefine) {
        this.syncDefine = syncDefine;
        return this;
    }
    public Boolean getSyncDefine() {
        return this.syncDefine;
    }

    public ModifyProcessInstanceRequest setTaskDefinitions(java.util.List<ModifyProcessInstanceRequestTaskDefinitions> taskDefinitions) {
        this.taskDefinitions = taskDefinitions;
        return this;
    }
    public java.util.List<ModifyProcessInstanceRequestTaskDefinitions> getTaskDefinitions() {
        return this.taskDefinitions;
    }

    public ModifyProcessInstanceRequest setTaskRelations(java.util.List<ModifyProcessInstanceRequestTaskRelations> taskRelations) {
        this.taskRelations = taskRelations;
        return this;
    }
    public java.util.List<ModifyProcessInstanceRequestTaskRelations> getTaskRelations() {
        return this.taskRelations;
    }

    public ModifyProcessInstanceRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public static class ModifyProcessInstanceRequestGlobalParams extends TeaModel {
        @NameInMap("Direct")
        public String direct;

        @NameInMap("Prop")
        public String prop;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ModifyProcessInstanceRequestGlobalParams build(java.util.Map<String, ?> map) throws Exception {
            ModifyProcessInstanceRequestGlobalParams self = new ModifyProcessInstanceRequestGlobalParams();
            return TeaModel.build(map, self);
        }

        public ModifyProcessInstanceRequestGlobalParams setDirect(String direct) {
            this.direct = direct;
            return this;
        }
        public String getDirect() {
            return this.direct;
        }

        public ModifyProcessInstanceRequestGlobalParams setProp(String prop) {
            this.prop = prop;
            return this;
        }
        public String getProp() {
            return this.prop;
        }

        public ModifyProcessInstanceRequestGlobalParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyProcessInstanceRequestGlobalParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyProcessInstanceRequestLocations extends TeaModel {
        @NameInMap("TaskCode")
        public Long taskCode;

        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static ModifyProcessInstanceRequestLocations build(java.util.Map<String, ?> map) throws Exception {
            ModifyProcessInstanceRequestLocations self = new ModifyProcessInstanceRequestLocations();
            return TeaModel.build(map, self);
        }

        public ModifyProcessInstanceRequestLocations setTaskCode(Long taskCode) {
            this.taskCode = taskCode;
            return this;
        }
        public Long getTaskCode() {
            return this.taskCode;
        }

        public ModifyProcessInstanceRequestLocations setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public ModifyProcessInstanceRequestLocations setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class ModifyProcessInstanceRequestTaskDefinitions extends TeaModel {
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

        @NameInMap("OperateTime")
        public String operateTime;

        @NameInMap("Operator")
        public Long operator;

        @NameInMap("ProjectCode")
        public Long projectCode;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ResourceIds")
        public String resourceIds;

        @NameInMap("TaskParamJson")
        public String taskParamJson;

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

        public static ModifyProcessInstanceRequestTaskDefinitions build(java.util.Map<String, ?> map) throws Exception {
            ModifyProcessInstanceRequestTaskDefinitions self = new ModifyProcessInstanceRequestTaskDefinitions();
            return TeaModel.build(map, self);
        }

        public ModifyProcessInstanceRequestTaskDefinitions setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setEnvironmentCode(Long environmentCode) {
            this.environmentCode = environmentCode;
            return this;
        }
        public Long getEnvironmentCode() {
            return this.environmentCode;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setFailRetryInterval(Long failRetryInterval) {
            this.failRetryInterval = failRetryInterval;
            return this;
        }
        public Long getFailRetryInterval() {
            return this.failRetryInterval;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setFailRetryTimes(Long failRetryTimes) {
            this.failRetryTimes = failRetryTimes;
            return this;
        }
        public Long getFailRetryTimes() {
            return this.failRetryTimes;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setModifyBy(String modifyBy) {
            this.modifyBy = modifyBy;
            return this;
        }
        public String getModifyBy() {
            return this.modifyBy;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setResourceIds(String resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public String getResourceIds() {
            return this.resourceIds;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setTaskParamJson(String taskParamJson) {
            this.taskParamJson = taskParamJson;
            return this;
        }
        public String getTaskParamJson() {
            return this.taskParamJson;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setTaskPriority(String taskPriority) {
            this.taskPriority = taskPriority;
            return this;
        }
        public String getTaskPriority() {
            return this.taskPriority;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setTimeoutFlag(String timeoutFlag) {
            this.timeoutFlag = timeoutFlag;
            return this;
        }
        public String getTimeoutFlag() {
            return this.timeoutFlag;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setTimeoutNotifyStrategy(String timeoutNotifyStrategy) {
            this.timeoutNotifyStrategy = timeoutNotifyStrategy;
            return this;
        }
        public String getTimeoutNotifyStrategy() {
            return this.timeoutNotifyStrategy;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public ModifyProcessInstanceRequestTaskDefinitions setWorkerGroup(String workerGroup) {
            this.workerGroup = workerGroup;
            return this;
        }
        public String getWorkerGroup() {
            return this.workerGroup;
        }

    }

    public static class ModifyProcessInstanceRequestTaskRelations extends TeaModel {
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

        @NameInMap("OperateTime")
        public String operateTime;

        @NameInMap("Operator")
        public Long operator;

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

        public static ModifyProcessInstanceRequestTaskRelations build(java.util.Map<String, ?> map) throws Exception {
            ModifyProcessInstanceRequestTaskRelations self = new ModifyProcessInstanceRequestTaskRelations();
            return TeaModel.build(map, self);
        }

        public ModifyProcessInstanceRequestTaskRelations setConditionParams(String conditionParams) {
            this.conditionParams = conditionParams;
            return this;
        }
        public String getConditionParams() {
            return this.conditionParams;
        }

        public ModifyProcessInstanceRequestTaskRelations setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public ModifyProcessInstanceRequestTaskRelations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ModifyProcessInstanceRequestTaskRelations setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModifyProcessInstanceRequestTaskRelations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyProcessInstanceRequestTaskRelations setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public ModifyProcessInstanceRequestTaskRelations setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public ModifyProcessInstanceRequestTaskRelations setPostTaskCode(Long postTaskCode) {
            this.postTaskCode = postTaskCode;
            return this;
        }
        public Long getPostTaskCode() {
            return this.postTaskCode;
        }

        public ModifyProcessInstanceRequestTaskRelations setPostTaskVersion(Long postTaskVersion) {
            this.postTaskVersion = postTaskVersion;
            return this;
        }
        public Long getPostTaskVersion() {
            return this.postTaskVersion;
        }

        public ModifyProcessInstanceRequestTaskRelations setPreTaskCode(Long preTaskCode) {
            this.preTaskCode = preTaskCode;
            return this;
        }
        public Long getPreTaskCode() {
            return this.preTaskCode;
        }

        public ModifyProcessInstanceRequestTaskRelations setPreTaskVersion(Long preTaskVersion) {
            this.preTaskVersion = preTaskVersion;
            return this;
        }
        public Long getPreTaskVersion() {
            return this.preTaskVersion;
        }

        public ModifyProcessInstanceRequestTaskRelations setProcessCode(Long processCode) {
            this.processCode = processCode;
            return this;
        }
        public Long getProcessCode() {
            return this.processCode;
        }

        public ModifyProcessInstanceRequestTaskRelations setProcessDefinitionVersion(Long processDefinitionVersion) {
            this.processDefinitionVersion = processDefinitionVersion;
            return this;
        }
        public Long getProcessDefinitionVersion() {
            return this.processDefinitionVersion;
        }

        public ModifyProcessInstanceRequestTaskRelations setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public ModifyProcessInstanceRequestTaskRelations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
