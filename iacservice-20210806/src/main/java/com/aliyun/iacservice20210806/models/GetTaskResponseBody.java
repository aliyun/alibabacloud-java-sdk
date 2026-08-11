// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C24C498A-09CF-54D3-8972-8DC074CF8614</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The task information.</p>
     */
    @NameInMap("task")
    public GetTaskResponseBodyTask task;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setTask(GetTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetTaskResponseBodyTaskGroupInfo extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>g-59d8d22e78792ffe3d3eb6154d727</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-433aead756057fff47ecbfd94d76</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("projectName")
        public String projectName;

        public static GetTaskResponseBodyTaskGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskGroupInfo self = new GetTaskResponseBodyTaskGroupInfo();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetTaskResponseBodyTaskGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetTaskResponseBodyTaskGroupInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetTaskResponseBodyTaskGroupInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class GetTaskResponseBodyTaskTags extends TeaModel {
        /**
         * <p>The tag key of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static GetTaskResponseBodyTaskTags build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskTags self = new GetTaskResponseBodyTaskTags();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetTaskResponseBodyTaskTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetTaskResponseBodyTaskTaskBackend extends TeaModel {
        /**
         * <p>The endpoint information.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-cn-beijing.aliyuncs.com</p>
         */
        @NameInMap("bucketEndpoint")
        public String bucketEndpoint;

        /**
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>iac-runtime-test</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The object path.</p>
         * 
         * <strong>example:</strong>
         * <p>/log</p>
         */
        @NameInMap("objectPath")
        public String objectPath;

        public static GetTaskResponseBodyTaskTaskBackend build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTaskTaskBackend self = new GetTaskResponseBodyTaskTaskBackend();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTaskTaskBackend setBucketEndpoint(String bucketEndpoint) {
            this.bucketEndpoint = bucketEndpoint;
            return this;
        }
        public String getBucketEndpoint() {
            return this.bucketEndpoint;
        }

        public GetTaskResponseBodyTaskTaskBackend setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetTaskResponseBodyTaskTaskBackend setObjectPath(String objectPath) {
            this.objectPath = objectPath;
            return this;
        }
        public String getObjectPath() {
            return this.objectPath;
        }

    }

    public static class GetTaskResponseBodyTask extends TeaModel {
        /**
         * <p>Indicates whether the task is automatically executed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoApply")
        public Boolean autoApply;

        /**
         * <p>Indicates whether automatic deletion is enabled. When enabled, resources are automatically destroyed after the task is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("autoDestroy")
        public Boolean autoDestroy;

        /**
         * <p>The time when the task was created, in UTC in the ISO 8601 format of YYYY-MM-DDTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-15T02:44:37Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The job ID of the current task.</p>
         * 
         * <strong>example:</strong>
         * <p>job-absdf</p>
         */
        @NameInMap("currentJobId")
        public String currentJobId;

        /**
         * <p>The current job status.</p>
         * 
         * <strong>example:</strong>
         * <p>Planned</p>
         */
        @NameInMap("currentJobStatus")
        public String currentJobStatus;

        /**
         * <p>Indicates whether deletion protection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("deletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The group information.</p>
         */
        @NameInMap("groupInfo")
        public GetTaskResponseBodyTaskGroupInfo groupInfo;

        /**
         * <p>Specifies whether to use a state file. Default value: false. This parameter applies to templates that originate from resource export. Only one task can use this parameter at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("initModuleState")
        public Boolean initModuleState;

        /**
         * <p>The latest version number of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>v3</p>
         */
        @NameInMap("latestModuleVersion")
        public String latestModuleVersion;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mod-4267dcfbf1b6d14625614ddbe15</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>moduleName</p>
         */
        @NameInMap("moduleName")
        public String moduleName;

        /**
         * <p>The template version.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>TaskName</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The list of resource protection strategies.</p>
         */
        @NameInMap("protectionStrategy")
        public java.util.List<String> protectionStrategy;

        /**
         * <p>The RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>role</p>
         */
        @NameInMap("ramRole")
        public String ramRole;

        /**
         * <p>Specifies whether to skip enumeration value validation. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("skipPropertyValidation")
        public Boolean skipPropertyValidation;

        /**
         * <p>Specifies whether to skip region validation. Valid values: true and false.</p>
         */
        @NameInMap("skipRegionValidation")
        public Boolean skipRegionValidation;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Available: the task is available and no job is running.</li>
         * <li>Running: the task is running and a job is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The list of task tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<GetTaskResponseBodyTaskTags> tags;

        /**
         * <p>The task backend configuration. After this parameter is configured, runtime log information is saved to the specified OSS bucket.</p>
         */
        @NameInMap("taskBackend")
        public GetTaskResponseBodyTaskTaskBackend taskBackend;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-433aead756057154bda7f1c2e98</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The task output path.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("taskOutputPath")
        public String taskOutputPath;

        /**
         * <p>The Terraform version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5.7</p>
         */
        @NameInMap("terraformVersion")
        public String terraformVersion;

        /**
         * <p>The job trigger method. Valid values:</p>
         * <ul>
         * <li>Manual: manually triggered (default).</li>
         * <li>NewVersion: triggered when a new template version is published.</li>
         * <li>ParameterSetUpdated: triggered when the parameter set content changes or the parameter set attach relationship changes.</li>
         * <li>Auto: automatically triggered when the task properties change, such as task creation, execution version change, or job trigger policy change (when changed from another value to Auto).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        public static GetTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTask self = new GetTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTask setAutoApply(Boolean autoApply) {
            this.autoApply = autoApply;
            return this;
        }
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        public GetTaskResponseBodyTask setAutoDestroy(Boolean autoDestroy) {
            this.autoDestroy = autoDestroy;
            return this;
        }
        public Boolean getAutoDestroy() {
            return this.autoDestroy;
        }

        public GetTaskResponseBodyTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTaskResponseBodyTask setCurrentJobId(String currentJobId) {
            this.currentJobId = currentJobId;
            return this;
        }
        public String getCurrentJobId() {
            return this.currentJobId;
        }

        public GetTaskResponseBodyTask setCurrentJobStatus(String currentJobStatus) {
            this.currentJobStatus = currentJobStatus;
            return this;
        }
        public String getCurrentJobStatus() {
            return this.currentJobStatus;
        }

        public GetTaskResponseBodyTask setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public GetTaskResponseBodyTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTaskResponseBodyTask setGroupInfo(GetTaskResponseBodyTaskGroupInfo groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public GetTaskResponseBodyTaskGroupInfo getGroupInfo() {
            return this.groupInfo;
        }

        public GetTaskResponseBodyTask setInitModuleState(Boolean initModuleState) {
            this.initModuleState = initModuleState;
            return this;
        }
        public Boolean getInitModuleState() {
            return this.initModuleState;
        }

        public GetTaskResponseBodyTask setLatestModuleVersion(String latestModuleVersion) {
            this.latestModuleVersion = latestModuleVersion;
            return this;
        }
        public String getLatestModuleVersion() {
            return this.latestModuleVersion;
        }

        public GetTaskResponseBodyTask setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public GetTaskResponseBodyTask setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetTaskResponseBodyTask setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public GetTaskResponseBodyTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskResponseBodyTask setProtectionStrategy(java.util.List<String> protectionStrategy) {
            this.protectionStrategy = protectionStrategy;
            return this;
        }
        public java.util.List<String> getProtectionStrategy() {
            return this.protectionStrategy;
        }

        public GetTaskResponseBodyTask setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public GetTaskResponseBodyTask setSkipPropertyValidation(Boolean skipPropertyValidation) {
            this.skipPropertyValidation = skipPropertyValidation;
            return this;
        }
        public Boolean getSkipPropertyValidation() {
            return this.skipPropertyValidation;
        }

        public GetTaskResponseBodyTask setSkipRegionValidation(Boolean skipRegionValidation) {
            this.skipRegionValidation = skipRegionValidation;
            return this;
        }
        public Boolean getSkipRegionValidation() {
            return this.skipRegionValidation;
        }

        public GetTaskResponseBodyTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskResponseBodyTask setTags(java.util.List<GetTaskResponseBodyTaskTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetTaskResponseBodyTaskTags> getTags() {
            return this.tags;
        }

        public GetTaskResponseBodyTask setTaskBackend(GetTaskResponseBodyTaskTaskBackend taskBackend) {
            this.taskBackend = taskBackend;
            return this;
        }
        public GetTaskResponseBodyTaskTaskBackend getTaskBackend() {
            return this.taskBackend;
        }

        public GetTaskResponseBodyTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskResponseBodyTask setTaskOutputPath(String taskOutputPath) {
            this.taskOutputPath = taskOutputPath;
            return this;
        }
        public String getTaskOutputPath() {
            return this.taskOutputPath;
        }

        public GetTaskResponseBodyTask setTerraformVersion(String terraformVersion) {
            this.terraformVersion = terraformVersion;
            return this;
        }
        public String getTerraformVersion() {
            return this.terraformVersion;
        }

        public GetTaskResponseBodyTask setTriggerStrategy(String triggerStrategy) {
            this.triggerStrategy = triggerStrategy;
            return this;
        }
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

    }

}
