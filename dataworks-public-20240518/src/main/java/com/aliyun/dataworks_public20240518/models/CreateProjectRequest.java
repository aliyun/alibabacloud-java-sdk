// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud resource group to which the workspace belongs. You can log on to the <a href="https://resourcemanager.console.aliyun.com/resource-groups">Resource Management console</a> and go to the resource group list page to obtain the ID.</p>
     * <p>This parameter is used to manage the DataWorks workspace that you create within the specified Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzbn7****</p>
     */
    @NameInMap("AliyunResourceGroupId")
    public String aliyunResourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("AliyunResourceTags")
    public java.util.List<CreateProjectRequestAliyunResourceTags> aliyunResourceTags;

    /**
     * <p>The description of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>Financial analysis group project data development</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the development environment. Valid values:</p>
     * <ul>
     * <li><p>true: The development environment is enabled for the workspace, which supports isolation between the development and production environments.</p>
     * </li>
     * <li><p>false: Only the production environment is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DevEnvironmentEnabled")
    public Boolean devEnvironmentEnabled;

    /**
     * <p>Specifies whether to disable the development role. Valid values:</p>
     * <ul>
     * <li><p>false: The development role is enabled. This is the default value.</p>
     * </li>
     * <li><p>true: The development role is disabled.</p>
     * </li>
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
     * 
     * <strong>example:</strong>
     * <p>Sora financial analysis</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The workspace name.</p>
     * <p>Constraints:</p>
     * <ul>
     * <li><p>The workspace name must be unique within the region.</p>
     * </li>
     * <li><p>The name must start with a letter and can contain only letters, digits, and underscores (_).</p>
     * </li>
     * <li><p>The name must be 3 to 28 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sora_finance</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to enable PAI task scheduling. Valid values:</p>
     * <ul>
     * <li><p>true: You can create Machine Learning Platform for AI (PAI) nodes in the DataWorks workspace and run them on a periodic schedule based on the node configurations.</p>
     * </li>
     * <li><p>false: PAI task scheduling is disabled.</p>
     * </li>
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
