// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoApply")
    public Boolean autoApply;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoDestroy")
    public Boolean autoDestroy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("groupInfo")
    public CreateTaskRequestGroupInfo groupInfo;

    @NameInMap("initModuleState")
    public Boolean initModuleState;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mod-148e7853433574fff6b316f4eb737e</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("moduleVersion")
    public String moduleVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("protectionStrategy")
    public java.util.List<String> protectionStrategy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ramRole")
    public String ramRole;

    @NameInMap("skipPropertyValidation")
    public Boolean skipPropertyValidation;

    @NameInMap("taskBackend")
    public CreateTaskRequestTaskBackend taskBackend;

    /**
     * <strong>example:</strong>
     * <p>1.2.6</p>
     */
    @NameInMap("terraformVersion")
    public String terraformVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Always</p>
     */
    @NameInMap("triggerStrategy")
    public String triggerStrategy;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("triggerValue")
    public String triggerValue;

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

    public CreateTaskRequest setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
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

    public CreateTaskRequest setTaskBackend(CreateTaskRequestTaskBackend taskBackend) {
        this.taskBackend = taskBackend;
        return this;
    }
    public CreateTaskRequestTaskBackend getTaskBackend() {
        return this.taskBackend;
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

    public CreateTaskRequest setTriggerValue(String triggerValue) {
        this.triggerValue = triggerValue;
        return this;
    }
    public String getTriggerValue() {
        return this.triggerValue;
    }

    public static class CreateTaskRequestGroupInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>g-5fd38c9b92d541a7083a86432e2</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>project-433aead7560572057e5d9167608</p>
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

    public static class CreateTaskRequestTaskBackend extends TeaModel {
        @NameInMap("bucketEndpoint")
        public String bucketEndpoint;

        @NameInMap("bucketName")
        public String bucketName;

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
