// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud resource group to which the workspace belongs. You can log on to the <a href="https://resourcemanager.console.aliyun.com/resource-groups">Resource Management console</a> and go to the Resource Group page to query the ID.</p>
     * <p>You can configure this parameter to specify an Alibaba Cloud resource group that you want to use to manage the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzbn7pti3zff</p>
     */
    @NameInMap("AliyunResourceGroupId")
    public String aliyunResourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("AliyunResourceTags")
    public java.util.List<CreateProjectRequestAliyunResourceTags> aliyunResourceTags;

    /**
     * <p>The description of the workspace.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the development environment. Valid values:</p>
     * <ul>
     * <li>true : enables the development environment. In this case, the development environment is isolated from the production environment in the workspace.</li>
     * <li>false: disables the development environment. In this case, only the production environment is used in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DevEnvironmentEnabled")
    public Boolean devEnvironmentEnabled;

    /**
     * <p>Specifies whether to disable the Develop role. Valid values:</p>
     * <ul>
     * <li>false (default)</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DevRoleDisabled")
    public Boolean devRoleDisabled;

    /**
     * <p>The display name of the workspace.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The name of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sora_finance</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to enable scheduling of Platform for AI (PAI) tasks. Valid values:</p>
     * <ul>
     * <li>true: enables scheduling of PAI tasks. In this case, you can create a PAI node in a DataWorks workspace and configure scheduling properties for the node to implement periodic scheduling of PAI tasks.</li>
     * <li>false: disables scheduling of PAI tasks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PaiTaskEnabled")
    public Boolean paiTaskEnabled;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setAliyunResourceGroupId(String aliyunResourceGroupId) {
        this.aliyunResourceGroupId = aliyunResourceGroupId;
        return this;
    }
    public String getAliyunResourceGroupId() {
        return this.aliyunResourceGroupId;
    }

    public CreateProjectRequest setAliyunResourceTags(java.util.List<CreateProjectRequestAliyunResourceTags> aliyunResourceTags) {
        this.aliyunResourceTags = aliyunResourceTags;
        return this;
    }
    public java.util.List<CreateProjectRequestAliyunResourceTags> getAliyunResourceTags() {
        return this.aliyunResourceTags;
    }

    public CreateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectRequest setDevEnvironmentEnabled(Boolean devEnvironmentEnabled) {
        this.devEnvironmentEnabled = devEnvironmentEnabled;
        return this;
    }
    public Boolean getDevEnvironmentEnabled() {
        return this.devEnvironmentEnabled;
    }

    public CreateProjectRequest setDevRoleDisabled(Boolean devRoleDisabled) {
        this.devRoleDisabled = devRoleDisabled;
        return this;
    }
    public Boolean getDevRoleDisabled() {
        return this.devRoleDisabled;
    }

    public CreateProjectRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectRequest setPaiTaskEnabled(Boolean paiTaskEnabled) {
        this.paiTaskEnabled = paiTaskEnabled;
        return this;
    }
    public Boolean getPaiTaskEnabled() {
        return this.paiTaskEnabled;
    }

    public static class CreateProjectRequestAliyunResourceTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>batch</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>blue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateProjectRequestAliyunResourceTags build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestAliyunResourceTags self = new CreateProjectRequestAliyunResourceTags();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestAliyunResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateProjectRequestAliyunResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
