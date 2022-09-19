// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateProcessDefinitionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GlobalParams")
    public java.util.List<CreateProcessDefinitionRequestGlobalParams> globalParams;

    @NameInMap("Locations")
    public java.util.List<CreateProcessDefinitionRequestLocations> locations;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentDirectoryId")
    public Long parentDirectoryId;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskDefinitions")
    public java.util.List<CreateProcessDefinitionRequestTaskDefinitions> taskDefinitions;

    @NameInMap("TaskRelations")
    public java.util.List<CreateProcessDefinitionRequestTaskRelations> taskRelations;

    @NameInMap("Timeout")
    public Long timeout;

    public static CreateProcessDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProcessDefinitionRequest self = new CreateProcessDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public CreateProcessDefinitionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateProcessDefinitionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProcessDefinitionRequest setGlobalParams(java.util.List<CreateProcessDefinitionRequestGlobalParams> globalParams) {
        this.globalParams = globalParams;
        return this;
    }
    public java.util.List<CreateProcessDefinitionRequestGlobalParams> getGlobalParams() {
        return this.globalParams;
    }

    public CreateProcessDefinitionRequest setLocations(java.util.List<CreateProcessDefinitionRequestLocations> locations) {
        this.locations = locations;
        return this;
    }
    public java.util.List<CreateProcessDefinitionRequestLocations> getLocations() {
        return this.locations;
    }

    public CreateProcessDefinitionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProcessDefinitionRequest setParentDirectoryId(Long parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public Long getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public CreateProcessDefinitionRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public CreateProcessDefinitionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateProcessDefinitionRequest setTaskDefinitions(java.util.List<CreateProcessDefinitionRequestTaskDefinitions> taskDefinitions) {
        this.taskDefinitions = taskDefinitions;
        return this;
    }
    public java.util.List<CreateProcessDefinitionRequestTaskDefinitions> getTaskDefinitions() {
        return this.taskDefinitions;
    }

    public CreateProcessDefinitionRequest setTaskRelations(java.util.List<CreateProcessDefinitionRequestTaskRelations> taskRelations) {
        this.taskRelations = taskRelations;
        return this;
    }
    public java.util.List<CreateProcessDefinitionRequestTaskRelations> getTaskRelations() {
        return this.taskRelations;
    }

    public CreateProcessDefinitionRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public static class CreateProcessDefinitionRequestGlobalParams extends TeaModel {
        @NameInMap("Direct")
        public String direct;

        @NameInMap("Prop")
        public String prop;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static CreateProcessDefinitionRequestGlobalParams build(java.util.Map<String, ?> map) throws Exception {
            CreateProcessDefinitionRequestGlobalParams self = new CreateProcessDefinitionRequestGlobalParams();
            return TeaModel.build(map, self);
        }

        public CreateProcessDefinitionRequestGlobalParams setDirect(String direct) {
            this.direct = direct;
            return this;
        }
        public String getDirect() {
            return this.direct;
        }

        public CreateProcessDefinitionRequestGlobalParams setProp(String prop) {
            this.prop = prop;
            return this;
        }
        public String getProp() {
            return this.prop;
        }

        public CreateProcessDefinitionRequestGlobalParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateProcessDefinitionRequestGlobalParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateProcessDefinitionRequestLocations extends TeaModel {
        @NameInMap("TaskCode")
        public Long taskCode;

        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static CreateProcessDefinitionRequestLocations build(java.util.Map<String, ?> map) throws Exception {
            CreateProcessDefinitionRequestLocations self = new CreateProcessDefinitionRequestLocations();
            return TeaModel.build(map, self);
        }

        public CreateProcessDefinitionRequestLocations setTaskCode(Long taskCode) {
            this.taskCode = taskCode;
            return this;
        }
        public Long getTaskCode() {
            return this.taskCode;
        }

        public CreateProcessDefinitionRequestLocations setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public CreateProcessDefinitionRequestLocations setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class CreateProcessDefinitionRequestTaskDefinitions extends TeaModel {
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

        public static CreateProcessDefinitionRequestTaskDefinitions build(java.util.Map<String, ?> map) throws Exception {
            CreateProcessDefinitionRequestTaskDefinitions self = new CreateProcessDefinitionRequestTaskDefinitions();
            return TeaModel.build(map, self);
        }

        public CreateProcessDefinitionRequestTaskDefinitions setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setEnvironmentCode(Long environmentCode) {
            this.environmentCode = environmentCode;
            return this;
        }
        public Long getEnvironmentCode() {
            return this.environmentCode;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setFailRetryInterval(Long failRetryInterval) {
            this.failRetryInterval = failRetryInterval;
            return this;
        }
        public Long getFailRetryInterval() {
            return this.failRetryInterval;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setFailRetryTimes(Long failRetryTimes) {
            this.failRetryTimes = failRetryTimes;
            return this;
        }
        public Long getFailRetryTimes() {
            return this.failRetryTimes;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setModifyBy(String modifyBy) {
            this.modifyBy = modifyBy;
            return this;
        }
        public String getModifyBy() {
            return this.modifyBy;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setResourceIds(String resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public String getResourceIds() {
            return this.resourceIds;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setTaskParamJson(String taskParamJson) {
            this.taskParamJson = taskParamJson;
            return this;
        }
        public String getTaskParamJson() {
            return this.taskParamJson;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setTaskPriority(String taskPriority) {
            this.taskPriority = taskPriority;
            return this;
        }
        public String getTaskPriority() {
            return this.taskPriority;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setTimeoutFlag(String timeoutFlag) {
            this.timeoutFlag = timeoutFlag;
            return this;
        }
        public String getTimeoutFlag() {
            return this.timeoutFlag;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setTimeoutNotifyStrategy(String timeoutNotifyStrategy) {
            this.timeoutNotifyStrategy = timeoutNotifyStrategy;
            return this;
        }
        public String getTimeoutNotifyStrategy() {
            return this.timeoutNotifyStrategy;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public CreateProcessDefinitionRequestTaskDefinitions setWorkerGroup(String workerGroup) {
            this.workerGroup = workerGroup;
            return this;
        }
        public String getWorkerGroup() {
            return this.workerGroup;
        }

    }

    public static class CreateProcessDefinitionRequestTaskRelations extends TeaModel {
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

        public static CreateProcessDefinitionRequestTaskRelations build(java.util.Map<String, ?> map) throws Exception {
            CreateProcessDefinitionRequestTaskRelations self = new CreateProcessDefinitionRequestTaskRelations();
            return TeaModel.build(map, self);
        }

        public CreateProcessDefinitionRequestTaskRelations setConditionParams(String conditionParams) {
            this.conditionParams = conditionParams;
            return this;
        }
        public String getConditionParams() {
            return this.conditionParams;
        }

        public CreateProcessDefinitionRequestTaskRelations setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public CreateProcessDefinitionRequestTaskRelations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateProcessDefinitionRequestTaskRelations setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateProcessDefinitionRequestTaskRelations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProcessDefinitionRequestTaskRelations setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public CreateProcessDefinitionRequestTaskRelations setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public CreateProcessDefinitionRequestTaskRelations setPostTaskCode(Long postTaskCode) {
            this.postTaskCode = postTaskCode;
            return this;
        }
        public Long getPostTaskCode() {
            return this.postTaskCode;
        }

        public CreateProcessDefinitionRequestTaskRelations setPostTaskVersion(Long postTaskVersion) {
            this.postTaskVersion = postTaskVersion;
            return this;
        }
        public Long getPostTaskVersion() {
            return this.postTaskVersion;
        }

        public CreateProcessDefinitionRequestTaskRelations setPreTaskCode(Long preTaskCode) {
            this.preTaskCode = preTaskCode;
            return this;
        }
        public Long getPreTaskCode() {
            return this.preTaskCode;
        }

        public CreateProcessDefinitionRequestTaskRelations setPreTaskVersion(Long preTaskVersion) {
            this.preTaskVersion = preTaskVersion;
            return this;
        }
        public Long getPreTaskVersion() {
            return this.preTaskVersion;
        }

        public CreateProcessDefinitionRequestTaskRelations setProcessCode(Long processCode) {
            this.processCode = processCode;
            return this;
        }
        public Long getProcessCode() {
            return this.processCode;
        }

        public CreateProcessDefinitionRequestTaskRelations setProcessDefinitionVersion(Long processDefinitionVersion) {
            this.processDefinitionVersion = processDefinitionVersion;
            return this;
        }
        public Long getProcessDefinitionVersion() {
            return this.processDefinitionVersion;
        }

        public CreateProcessDefinitionRequestTaskRelations setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public CreateProcessDefinitionRequestTaskRelations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
