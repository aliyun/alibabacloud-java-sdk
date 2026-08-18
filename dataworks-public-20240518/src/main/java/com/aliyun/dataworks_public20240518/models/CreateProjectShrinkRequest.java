// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProjectShrinkRequest extends TeaModel {
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
    public String aliyunResourceTagsShrink;

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

    public static CreateProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectShrinkRequest self = new CreateProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectShrinkRequest setAliyunResourceGroupId(String aliyunResourceGroupId) {
        this.aliyunResourceGroupId = aliyunResourceGroupId;
        return this;
    }
    public String getAliyunResourceGroupId() {
        return this.aliyunResourceGroupId;
    }

    public CreateProjectShrinkRequest setAliyunResourceTagsShrink(String aliyunResourceTagsShrink) {
        this.aliyunResourceTagsShrink = aliyunResourceTagsShrink;
        return this;
    }
    public String getAliyunResourceTagsShrink() {
        return this.aliyunResourceTagsShrink;
    }

    public CreateProjectShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectShrinkRequest setDevEnvironmentEnabled(Boolean devEnvironmentEnabled) {
        this.devEnvironmentEnabled = devEnvironmentEnabled;
        return this;
    }
    public Boolean getDevEnvironmentEnabled() {
        return this.devEnvironmentEnabled;
    }

    public CreateProjectShrinkRequest setDevRoleDisabled(Boolean devRoleDisabled) {
        this.devRoleDisabled = devRoleDisabled;
        return this;
    }
    public Boolean getDevRoleDisabled() {
        return this.devRoleDisabled;
    }

    public CreateProjectShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateProjectShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectShrinkRequest setPaiTaskEnabled(Boolean paiTaskEnabled) {
        this.paiTaskEnabled = paiTaskEnabled;
        return this;
    }
    public Boolean getPaiTaskEnabled() {
        return this.paiTaskEnabled;
    }

}
