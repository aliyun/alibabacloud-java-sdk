// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically execute the task. Default value: false.</p>
     * <ul>
     * <li>true: After the preview is complete (terraform plan), the execution (terraform apply) is automatically performed without manual confirmation.</li>
     * <li>false: After the preview is complete (terraform plan), manual confirmation is required before the execution (terraform apply) starts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoApply")
    public Boolean autoApply;

    /**
     * <p>Specifies whether to automatically destroy resources after creation. Default value: false.</p>
     * <ul>
     * <li>true: After the execution is complete (terraform apply), the destroy operation (terraform destroy) is automatically performed without manual confirmation.</li>
     * <li>false: After the execution is complete (terraform apply), no further action is taken.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoDestroy")
    public Boolean autoDestroy;

    /**
     * <p>The idempotency token. Format: [0-9a-zA-Z-]{1,64}. We recommend that you use a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The task description.</p>
     * 
     * <strong>example:</strong>
     * <p>this is description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The project group information.</p>
     */
    @NameInMap("groupInfo")
    public CreateTaskRequestGroupInfo groupInfo;

    /**
     * <p>Specifies whether to use a state file. Default value: false. This parameter applies to templates that originate from resource export. Only one task can use this parameter at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("initModuleState")
    public Boolean initModuleState;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mod-144fff6b316f4eb737e</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    /**
     * <p>The template version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("moduleVersion")
    public String moduleVersion;

    /**
     * <p>The task name. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>The name can contain letters, digits, Chinese characters, hyphens (-), underscores (_), and periods (.). The name cannot start or end with a hyphen, underscore, or period.</li>
     * <li>The name must be unique among all tasks under the current account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TaskName</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The collection of associated parameter set IDs.</p>
     */
    @NameInMap("parameterSetIds")
    public java.util.List<String> parameterSetIds;

    /**
     * <p>The list of resource protection strategies.</p>
     */
    @NameInMap("protectionStrategy")
    public java.util.List<String> protectionStrategy;

    /**
     * <p>The RAM role. The system assumes this role to execute the template when a new job is triggered. This parameter is required when the job trigger method is not manual.</p>
     * 
     * <strong>example:</strong>
     * <p>RoleName</p>
     */
    @NameInMap("ramRole")
    public String ramRole;

    /**
     * <p>Specifies whether to skip enumeration value validation. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("skipPropertyValidation")
    public Boolean skipPropertyValidation;

    /**
     * <p>Specifies whether to skip region validation. Valid values: true (skip) and false (do not skip).</p>
     */
    @NameInMap("skipRegionValidation")
    public Boolean skipRegionValidation;

    /**
     * <p>The list of tags for the task.</p>
     */
    @NameInMap("tags")
    public java.util.List<CreateTaskRequestTags> tags;

    /**
     * <p>The task configuration. After this parameter is configured, runtime log information is saved to the specified OSS bucket.</p>
     */
    @NameInMap("taskBackend")
    public CreateTaskRequestTaskBackend taskBackend;

    /**
     * <p>The Terraform Provider version. You can call the <strong>ListTerraformProviderVersions</strong> operation to obtain the list of supported versions.</p>
     * 
     * <strong>example:</strong>
     * <p>1.248.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    /**
     * <p>The Terraform version. You can call the <strong>ListAvailableTerraformVersions</strong> operation to obtain the list of supported versions. Default value: 1.5.7.</p>
     * 
     * <strong>example:</strong>
     * <p>1.5.7</p>
     */
    @NameInMap("terraformVersion")
    public String terraformVersion;

    /**
     * <p>The job trigger method. Valid values:</p>
     * <ul>
     * <li>Manual: Manual trigger (default).</li>
     * <li>NewVersion: Triggered when a new template version is published.</li>
     * <li>ParameterSetUpdated: Triggered when the parameter set content changes or the parameter set binding relationship changes.</li>
     * <li>Auto: Automatically triggered when the task\&quot;s own properties change, such as task creation, execution version change, or job trigger strategy change (when changed from another value to Auto).</li>
     * </ul>
     * <p>The <strong>ramRole</strong> parameter is required when the trigger method is not manual.</p>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("triggerStrategy")
    public String triggerStrategy;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setAutoApply(Boolean autoApply) {
        this.autoApply = autoApply;
        return this;
    }
    public Boolean getAutoApply() {
        return this.autoApply;
    }

    public CreateTaskRequest setAutoDestroy(Boolean autoDestroy) {
        this.autoDestroy = autoDestroy;
        return this;
    }
    public Boolean getAutoDestroy() {
        return this.autoDestroy;
    }

    public CreateTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTaskRequest setGroupInfo(CreateTaskRequestGroupInfo groupInfo) {
        this.groupInfo = groupInfo;
        return this;
    }
    public CreateTaskRequestGroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public CreateTaskRequest setInitModuleState(Boolean initModuleState) {
        this.initModuleState = initModuleState;
        return this;
    }
    public Boolean getInitModuleState() {
        return this.initModuleState;
    }

    public CreateTaskRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public CreateTaskRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public CreateTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTaskRequest setParameterSetIds(java.util.List<String> parameterSetIds) {
        this.parameterSetIds = parameterSetIds;
        return this;
    }
    public java.util.List<String> getParameterSetIds() {
        return this.parameterSetIds;
    }

    public CreateTaskRequest setProtectionStrategy(java.util.List<String> protectionStrategy) {
        this.protectionStrategy = protectionStrategy;
        return this;
    }
    public java.util.List<String> getProtectionStrategy() {
        return this.protectionStrategy;
    }

    public CreateTaskRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public CreateTaskRequest setSkipPropertyValidation(Boolean skipPropertyValidation) {
        this.skipPropertyValidation = skipPropertyValidation;
        return this;
    }
    public Boolean getSkipPropertyValidation() {
        return this.skipPropertyValidation;
    }

    public CreateTaskRequest setSkipRegionValidation(Boolean skipRegionValidation) {
        this.skipRegionValidation = skipRegionValidation;
        return this;
    }
    public Boolean getSkipRegionValidation() {
        return this.skipRegionValidation;
    }

    public CreateTaskRequest setTags(java.util.List<CreateTaskRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateTaskRequestTags> getTags() {
        return this.tags;
    }

    public CreateTaskRequest setTaskBackend(CreateTaskRequestTaskBackend taskBackend) {
        this.taskBackend = taskBackend;
        return this;
    }
    public CreateTaskRequestTaskBackend getTaskBackend() {
        return this.taskBackend;
    }

    public CreateTaskRequest setTerraformProviderVersion(String terraformProviderVersion) {
        this.terraformProviderVersion = terraformProviderVersion;
        return this;
    }
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    public CreateTaskRequest setTerraformVersion(String terraformVersion) {
        this.terraformVersion = terraformVersion;
        return this;
    }
    public String getTerraformVersion() {
        return this.terraformVersion;
    }

    public CreateTaskRequest setTriggerStrategy(String triggerStrategy) {
        this.triggerStrategy = triggerStrategy;
        return this;
    }
    public String getTriggerStrategy() {
        return this.triggerStrategy;
    }

    public static class CreateTaskRequestGroupInfo extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>g-5fd38c9b83a86432e2</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-433aeade5d9167608</p>
         */
        @NameInMap("projectId")
        public String projectId;

        public static CreateTaskRequestGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestGroupInfo self = new CreateTaskRequestGroupInfo();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateTaskRequestGroupInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

    public static class CreateTaskRequestTags extends TeaModel {
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

        public static CreateTaskRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestTags self = new CreateTaskRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateTaskRequestTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class CreateTaskRequestTaskBackend extends TeaModel {
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

        public static CreateTaskRequestTaskBackend build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestTaskBackend self = new CreateTaskRequestTaskBackend();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestTaskBackend setBucketEndpoint(String bucketEndpoint) {
            this.bucketEndpoint = bucketEndpoint;
            return this;
        }
        public String getBucketEndpoint() {
            return this.bucketEndpoint;
        }

        public CreateTaskRequestTaskBackend setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public CreateTaskRequestTaskBackend setObjectPath(String objectPath) {
            this.objectPath = objectPath;
            return this;
        }
        public String getObjectPath() {
            return this.objectPath;
        }

    }

}
