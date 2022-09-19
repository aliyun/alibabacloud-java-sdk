// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyProcessDefinitionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DirectoryId")
    public Long directoryId;

    @NameInMap("GlobalParams")
    public java.util.List<ModifyProcessDefinitionRequestGlobalParams> globalParams;

    @NameInMap("Locations")
    public java.util.List<ModifyProcessDefinitionRequestLocations> locations;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentDirectoryId")
    public Long parentDirectoryId;

    @NameInMap("ProcessCode")
    public Long processCode;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskDefinitions")
    public java.util.List<ModifyProcessDefinitionRequestTaskDefinitions> taskDefinitions;

    @NameInMap("TaskRelations")
    public java.util.List<ModifyProcessDefinitionRequestTaskRelations> taskRelations;

    public static ModifyProcessDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProcessDefinitionRequest self = new ModifyProcessDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProcessDefinitionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyProcessDefinitionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyProcessDefinitionRequest setDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public Long getDirectoryId() {
        return this.directoryId;
    }

    public ModifyProcessDefinitionRequest setGlobalParams(java.util.List<ModifyProcessDefinitionRequestGlobalParams> globalParams) {
        this.globalParams = globalParams;
        return this;
    }
    public java.util.List<ModifyProcessDefinitionRequestGlobalParams> getGlobalParams() {
        return this.globalParams;
    }

    public ModifyProcessDefinitionRequest setLocations(java.util.List<ModifyProcessDefinitionRequestLocations> locations) {
        this.locations = locations;
        return this;
    }
    public java.util.List<ModifyProcessDefinitionRequestLocations> getLocations() {
        return this.locations;
    }

    public ModifyProcessDefinitionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyProcessDefinitionRequest setParentDirectoryId(Long parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public Long getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public ModifyProcessDefinitionRequest setProcessCode(Long processCode) {
        this.processCode = processCode;
        return this;
    }
    public Long getProcessCode() {
        return this.processCode;
    }

    public ModifyProcessDefinitionRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public ModifyProcessDefinitionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyProcessDefinitionRequest setTaskDefinitions(java.util.List<ModifyProcessDefinitionRequestTaskDefinitions> taskDefinitions) {
        this.taskDefinitions = taskDefinitions;
        return this;
    }
    public java.util.List<ModifyProcessDefinitionRequestTaskDefinitions> getTaskDefinitions() {
        return this.taskDefinitions;
    }

    public ModifyProcessDefinitionRequest setTaskRelations(java.util.List<ModifyProcessDefinitionRequestTaskRelations> taskRelations) {
        this.taskRelations = taskRelations;
        return this;
    }
    public java.util.List<ModifyProcessDefinitionRequestTaskRelations> getTaskRelations() {
        return this.taskRelations;
    }

    public static class ModifyProcessDefinitionRequestGlobalParams extends TeaModel {
        @NameInMap("Direct")
        public String direct;

        @NameInMap("Prop")
        public String prop;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ModifyProcessDefinitionRequestGlobalParams build(java.util.Map<String, ?> map) throws Exception {
            ModifyProcessDefinitionRequestGlobalParams self = new ModifyProcessDefinitionRequestGlobalParams();
            return TeaModel.build(map, self);
        }

        public ModifyProcessDefinitionRequestGlobalParams setDirect(String direct) {
            this.direct = direct;
            return this;
        }
        public String getDirect() {
            return this.direct;
        }

        public ModifyProcessDefinitionRequestGlobalParams setProp(String prop) {
            this.prop = prop;
            return this;
        }
        public String getProp() {
            return this.prop;
        }

        public ModifyProcessDefinitionRequestGlobalParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyProcessDefinitionRequestGlobalParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyProcessDefinitionRequestLocations extends TeaModel {
        @NameInMap("TaskCode")
        public Long taskCode;

        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static ModifyProcessDefinitionRequestLocations build(java.util.Map<String, ?> map) throws Exception {
            ModifyProcessDefinitionRequestLocations self = new ModifyProcessDefinitionRequestLocations();
            return TeaModel.build(map, self);
        }

        public ModifyProcessDefinitionRequestLocations setTaskCode(Long taskCode) {
            this.taskCode = taskCode;
            return this;
        }
        public Long getTaskCode() {
            return this.taskCode;
        }

        public ModifyProcessDefinitionRequestLocations setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public ModifyProcessDefinitionRequestLocations setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class ModifyProcessDefinitionRequestTaskDefinitions extends TeaModel {
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

        public static ModifyProcessDefinitionRequestTaskDefinitions build(java.util.Map<String, ?> map) throws Exception {
            ModifyProcessDefinitionRequestTaskDefinitions self = new ModifyProcessDefinitionRequestTaskDefinitions();
            return TeaModel.build(map, self);
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setEnvironmentCode(Long environmentCode) {
            this.environmentCode = environmentCode;
            return this;
        }
        public Long getEnvironmentCode() {
            return this.environmentCode;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setFailRetryInterval(Long failRetryInterval) {
            this.failRetryInterval = failRetryInterval;
            return this;
        }
        public Long getFailRetryInterval() {
            return this.failRetryInterval;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setFailRetryTimes(Long failRetryTimes) {
            this.failRetryTimes = failRetryTimes;
            return this;
        }
        public Long getFailRetryTimes() {
            return this.failRetryTimes;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setModifyBy(String modifyBy) {
            this.modifyBy = modifyBy;
            return this;
        }
        public String getModifyBy() {
            return this.modifyBy;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setResourceIds(String resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public String getResourceIds() {
            return this.resourceIds;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setTaskParamJson(String taskParamJson) {
            this.taskParamJson = taskParamJson;
            return this;
        }
        public String getTaskParamJson() {
            return this.taskParamJson;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setTaskPriority(String taskPriority) {
            this.taskPriority = taskPriority;
            return this;
        }
        public String getTaskPriority() {
            return this.taskPriority;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setTimeoutFlag(String timeoutFlag) {
            this.timeoutFlag = timeoutFlag;
            return this;
        }
        public String getTimeoutFlag() {
            return this.timeoutFlag;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setTimeoutNotifyStrategy(String timeoutNotifyStrategy) {
            this.timeoutNotifyStrategy = timeoutNotifyStrategy;
            return this;
        }
        public String getTimeoutNotifyStrategy() {
            return this.timeoutNotifyStrategy;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public ModifyProcessDefinitionRequestTaskDefinitions setWorkerGroup(String workerGroup) {
            this.workerGroup = workerGroup;
            return this;
        }
        public String getWorkerGroup() {
            return this.workerGroup;
        }

    }

    public static class ModifyProcessDefinitionRequestTaskRelations extends TeaModel {
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

        public static ModifyProcessDefinitionRequestTaskRelations build(java.util.Map<String, ?> map) throws Exception {
            ModifyProcessDefinitionRequestTaskRelations self = new ModifyProcessDefinitionRequestTaskRelations();
            return TeaModel.build(map, self);
        }

        public ModifyProcessDefinitionRequestTaskRelations setConditionParams(String conditionParams) {
            this.conditionParams = conditionParams;
            return this;
        }
        public String getConditionParams() {
            return this.conditionParams;
        }

        public ModifyProcessDefinitionRequestTaskRelations setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public ModifyProcessDefinitionRequestTaskRelations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ModifyProcessDefinitionRequestTaskRelations setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModifyProcessDefinitionRequestTaskRelations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyProcessDefinitionRequestTaskRelations setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public ModifyProcessDefinitionRequestTaskRelations setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public ModifyProcessDefinitionRequestTaskRelations setPostTaskCode(Long postTaskCode) {
            this.postTaskCode = postTaskCode;
            return this;
        }
        public Long getPostTaskCode() {
            return this.postTaskCode;
        }

        public ModifyProcessDefinitionRequestTaskRelations setPostTaskVersion(Long postTaskVersion) {
            this.postTaskVersion = postTaskVersion;
            return this;
        }
        public Long getPostTaskVersion() {
            return this.postTaskVersion;
        }

        public ModifyProcessDefinitionRequestTaskRelations setPreTaskCode(Long preTaskCode) {
            this.preTaskCode = preTaskCode;
            return this;
        }
        public Long getPreTaskCode() {
            return this.preTaskCode;
        }

        public ModifyProcessDefinitionRequestTaskRelations setPreTaskVersion(Long preTaskVersion) {
            this.preTaskVersion = preTaskVersion;
            return this;
        }
        public Long getPreTaskVersion() {
            return this.preTaskVersion;
        }

        public ModifyProcessDefinitionRequestTaskRelations setProcessCode(Long processCode) {
            this.processCode = processCode;
            return this;
        }
        public Long getProcessCode() {
            return this.processCode;
        }

        public ModifyProcessDefinitionRequestTaskRelations setProcessDefinitionVersion(Long processDefinitionVersion) {
            this.processDefinitionVersion = processDefinitionVersion;
            return this;
        }
        public Long getProcessDefinitionVersion() {
            return this.processDefinitionVersion;
        }

        public ModifyProcessDefinitionRequestTaskRelations setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public ModifyProcessDefinitionRequestTaskRelations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
