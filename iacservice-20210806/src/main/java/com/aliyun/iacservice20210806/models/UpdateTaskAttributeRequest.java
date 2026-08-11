// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateTaskAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically execute the node. Default value: false.</p>
     * <ul>
     * <li>true: After the preview is complete (terraform plan), the execution (terraform apply) is automatically performed without manual confirmation.</li>
     * <li>false: After the preview is complete (terraform plan), manual confirmation is required before the execution (terraform apply) starts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>The idempotency token. Format: [0-9a-zA-Z-]{1,64}. Use a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The description.</p>
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
    public UpdateTaskAttributeRequestGroupInfo groupInfo;

    /**
     * <p>Specifies whether to use a state file. Default value: false. This parameter applies to templates that originate from resource export. Only one node can use this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("initModuleState")
    public Boolean initModuleState;

    /**
     * <p>The template version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("moduleVersion")
    public String moduleVersion;

    /**
     * <p>The node name. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>The name can contain letters, digits, Chinese characters, hyphens (-), underscores (_), and periods (.). The name cannot start or end with a hyphen, underscore, or period.</li>
     * <li>The name must be unique among all node resources within the current account.</li>
     * </ul>
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
     * <p>The RAM role. The system assumes this role to execute the template when a new job is triggered. This parameter is required when the job trigger method is not manual.</p>
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
     * <p>Specifies whether to skip region validation. Valid values: true indicates skipping, false indicates not skipping.</p>
     */
    @NameInMap("skipRegionValidation")
    public Boolean skipRegionValidation;

    /**
     * <p>The list of tags for the node.</p>
     */
    @NameInMap("tags")
    public java.util.List<UpdateTaskAttributeRequestTags> tags;

    /**
     * <p>The Terraform Provider version. Use the <strong>ListTerraformProviderVersions</strong> API to query the list of supported versions.</p>
     * 
     * <strong>example:</strong>
     * <p>1.248.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    /**
     * <p>The Terraform version. Use the <strong>ListAvailableTerraformVersions</strong> API to obtain the list of supported versions. Default value: 1.5.7.</p>
     * 
     * <strong>example:</strong>
     * <p>1.5.7</p>
     */
    @NameInMap("terraformVersion")
    public String terraformVersion;

    /**
     * <p>The job trigger method.</p>
     * <ul>
     * <li>Manual: manual trigger (default).</li>
     * <li>NewVersion: triggered when a new template version is published.</li>
     * <li>ParameterSetUpdated: triggered when the parameter set content changes or the parameter set attach relationship changes.</li>
     * <li>Auto: automatically triggered when the node properties change, such as creating a node, changing the execution version, or changing the job trigger policy (when changed from another method to Auto).</li>
     * </ul>
     * <p>The <strong>ramRole</strong> parameter is required for non-manual triggers.</p>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("triggerStrategy")
    public String triggerStrategy;

    public static UpdateTaskAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskAttributeRequest self = new UpdateTaskAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskAttributeRequest setAutoApply(Boolean autoApply) {
        this.autoApply = autoApply;
        return this;
    }
    public Boolean getAutoApply() {
        return this.autoApply;
    }

    public UpdateTaskAttributeRequest setAutoDestroy(Boolean autoDestroy) {
        this.autoDestroy = autoDestroy;
        return this;
    }
    public Boolean getAutoDestroy() {
        return this.autoDestroy;
    }

    public UpdateTaskAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTaskAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTaskAttributeRequest setGroupInfo(UpdateTaskAttributeRequestGroupInfo groupInfo) {
        this.groupInfo = groupInfo;
        return this;
    }
    public UpdateTaskAttributeRequestGroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public UpdateTaskAttributeRequest setInitModuleState(Boolean initModuleState) {
        this.initModuleState = initModuleState;
        return this;
    }
    public Boolean getInitModuleState() {
        return this.initModuleState;
    }

    public UpdateTaskAttributeRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public UpdateTaskAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTaskAttributeRequest setProtectionStrategy(java.util.List<String> protectionStrategy) {
        this.protectionStrategy = protectionStrategy;
        return this;
    }
    public java.util.List<String> getProtectionStrategy() {
        return this.protectionStrategy;
    }

    public UpdateTaskAttributeRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public UpdateTaskAttributeRequest setSkipPropertyValidation(Boolean skipPropertyValidation) {
        this.skipPropertyValidation = skipPropertyValidation;
        return this;
    }
    public Boolean getSkipPropertyValidation() {
        return this.skipPropertyValidation;
    }

    public UpdateTaskAttributeRequest setSkipRegionValidation(Boolean skipRegionValidation) {
        this.skipRegionValidation = skipRegionValidation;
        return this;
    }
    public Boolean getSkipRegionValidation() {
        return this.skipRegionValidation;
    }

    public UpdateTaskAttributeRequest setTags(java.util.List<UpdateTaskAttributeRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateTaskAttributeRequestTags> getTags() {
        return this.tags;
    }

    public UpdateTaskAttributeRequest setTerraformProviderVersion(String terraformProviderVersion) {
        this.terraformProviderVersion = terraformProviderVersion;
        return this;
    }
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    public UpdateTaskAttributeRequest setTerraformVersion(String terraformVersion) {
        this.terraformVersion = terraformVersion;
        return this;
    }
    public String getTerraformVersion() {
        return this.terraformVersion;
    }

    public UpdateTaskAttributeRequest setTriggerStrategy(String triggerStrategy) {
        this.triggerStrategy = triggerStrategy;
        return this;
    }
    public String getTriggerStrategy() {
        return this.triggerStrategy;
    }

    public static class UpdateTaskAttributeRequestGroupInfo extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>g-433aead7560571e66e31274ffd3</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-433aead75605713865c386cb9d</p>
         */
        @NameInMap("projectId")
        public String projectId;

        public static UpdateTaskAttributeRequestGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAttributeRequestGroupInfo self = new UpdateTaskAttributeRequestGroupInfo();
            return TeaModel.build(map, self);
        }

        public UpdateTaskAttributeRequestGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public UpdateTaskAttributeRequestGroupInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

    public static class UpdateTaskAttributeRequestTags extends TeaModel {
        /**
         * <p>The tag key of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static UpdateTaskAttributeRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskAttributeRequestTags self = new UpdateTaskAttributeRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateTaskAttributeRequestTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateTaskAttributeRequestTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
