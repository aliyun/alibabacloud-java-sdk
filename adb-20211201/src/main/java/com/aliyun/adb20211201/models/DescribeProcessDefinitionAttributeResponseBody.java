// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessDefinitionAttributeResponseBody extends TeaModel {
    @NameInMap("DagData")
    public DescribeProcessDefinitionAttributeResponseBodyDagData dagData;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeProcessDefinitionAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessDefinitionAttributeResponseBody self = new DescribeProcessDefinitionAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessDefinitionAttributeResponseBody setDagData(DescribeProcessDefinitionAttributeResponseBodyDagData dagData) {
        this.dagData = dagData;
        return this;
    }
    public DescribeProcessDefinitionAttributeResponseBodyDagData getDagData() {
        return this.dagData;
    }

    public DescribeProcessDefinitionAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProcessDefinitionAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProcessDefinitionAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition extends TeaModel {
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

        public static DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition self = new DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition();
            return TeaModel.build(map, self);
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setGlobalParamJson(String globalParamJson) {
            this.globalParamJson = globalParamJson;
            return this;
        }
        public String getGlobalParamJson() {
            return this.globalParamJson;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setLocationJson(String locationJson) {
            this.locationJson = locationJson;
            return this;
        }
        public String getLocationJson() {
            return this.locationJson;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setModifyBy(String modifyBy) {
            this.modifyBy = modifyBy;
            return this;
        }
        public String getModifyBy() {
            return this.modifyBy;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setReleaseState(String releaseState) {
            this.releaseState = releaseState;
            return this;
        }
        public String getReleaseState() {
            return this.releaseState;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setScheduleReleaseState(String scheduleReleaseState) {
            this.scheduleReleaseState = scheduleReleaseState;
            return this;
        }
        public String getScheduleReleaseState() {
            return this.scheduleReleaseState;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setTenantCode(String tenantCode) {
            this.tenantCode = tenantCode;
            return this;
        }
        public String getTenantCode() {
            return this.tenantCode;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition setWarningGroupId(Long warningGroupId) {
            this.warningGroupId = warningGroupId;
            return this;
        }
        public Long getWarningGroupId() {
            return this.warningGroupId;
        }

    }

    public static class DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations extends TeaModel {
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

        public static DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations self = new DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations();
            return TeaModel.build(map, self);
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations setConditionParams(String conditionParams) {
            this.conditionParams = conditionParams;
            return this;
        }
        public String getConditionParams() {
            return this.conditionParams;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations setConditionType(String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public String getConditionType() {
            return this.conditionType;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations setPostTaskCode(Long postTaskCode) {
            this.postTaskCode = postTaskCode;
            return this;
        }
        public Long getPostTaskCode() {
            return this.postTaskCode;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations setPostTaskVersion(Long postTaskVersion) {
            this.postTaskVersion = postTaskVersion;
            return this;
        }
        public Long getPostTaskVersion() {
            return this.postTaskVersion;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations setPreTaskCode(Long preTaskCode) {
            this.preTaskCode = preTaskCode;
            return this;
        }
        public Long getPreTaskCode() {
            return this.preTaskCode;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations setPreTaskVersion(Long preTaskVersion) {
            this.preTaskVersion = preTaskVersion;
            return this;
        }
        public Long getPreTaskVersion() {
            return this.preTaskVersion;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations setProcessCode(Long processCode) {
            this.processCode = processCode;
            return this;
        }
        public Long getProcessCode() {
            return this.processCode;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations setProcessDefinitionVersion(Long processDefinitionVersion) {
            this.processDefinitionVersion = processDefinitionVersion;
            return this;
        }
        public Long getProcessDefinitionVersion() {
            return this.processDefinitionVersion;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions extends TeaModel {
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

        public static DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions self = new DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions();
            return TeaModel.build(map, self);
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setEnvironmentCode(Long environmentCode) {
            this.environmentCode = environmentCode;
            return this;
        }
        public Long getEnvironmentCode() {
            return this.environmentCode;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setFailRetryInterval(Long failRetryInterval) {
            this.failRetryInterval = failRetryInterval;
            return this;
        }
        public Long getFailRetryInterval() {
            return this.failRetryInterval;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setFailRetryTimes(Long failRetryTimes) {
            this.failRetryTimes = failRetryTimes;
            return this;
        }
        public Long getFailRetryTimes() {
            return this.failRetryTimes;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setModifyBy(String modifyBy) {
            this.modifyBy = modifyBy;
            return this;
        }
        public String getModifyBy() {
            return this.modifyBy;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setResourceIds(String resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public String getResourceIds() {
            return this.resourceIds;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setTaskPriority(String taskPriority) {
            this.taskPriority = taskPriority;
            return this;
        }
        public String getTaskPriority() {
            return this.taskPriority;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setTimeoutFlag(String timeoutFlag) {
            this.timeoutFlag = timeoutFlag;
            return this;
        }
        public String getTimeoutFlag() {
            return this.timeoutFlag;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setTimeoutNotifyStrategy(String timeoutNotifyStrategy) {
            this.timeoutNotifyStrategy = timeoutNotifyStrategy;
            return this;
        }
        public String getTimeoutNotifyStrategy() {
            return this.timeoutNotifyStrategy;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions setWorkerGroup(String workerGroup) {
            this.workerGroup = workerGroup;
            return this;
        }
        public String getWorkerGroup() {
            return this.workerGroup;
        }

    }

    public static class DescribeProcessDefinitionAttributeResponseBodyDagData extends TeaModel {
        @NameInMap("ProcessDefinition")
        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition processDefinition;

        @NameInMap("ProcessTaskRelations")
        public java.util.List<DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations> processTaskRelations;

        @NameInMap("TaskDefinitions")
        public java.util.List<DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions> taskDefinitions;

        public static DescribeProcessDefinitionAttributeResponseBodyDagData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessDefinitionAttributeResponseBodyDagData self = new DescribeProcessDefinitionAttributeResponseBodyDagData();
            return TeaModel.build(map, self);
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagData setProcessDefinition(DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition processDefinition) {
            this.processDefinition = processDefinition;
            return this;
        }
        public DescribeProcessDefinitionAttributeResponseBodyDagDataProcessDefinition getProcessDefinition() {
            return this.processDefinition;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagData setProcessTaskRelations(java.util.List<DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations> processTaskRelations) {
            this.processTaskRelations = processTaskRelations;
            return this;
        }
        public java.util.List<DescribeProcessDefinitionAttributeResponseBodyDagDataProcessTaskRelations> getProcessTaskRelations() {
            return this.processTaskRelations;
        }

        public DescribeProcessDefinitionAttributeResponseBodyDagData setTaskDefinitions(java.util.List<DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions> taskDefinitions) {
            this.taskDefinitions = taskDefinitions;
            return this;
        }
        public java.util.List<DescribeProcessDefinitionAttributeResponseBodyDagDataTaskDefinitions> getTaskDefinitions() {
            return this.taskDefinitions;
        }

    }

}
