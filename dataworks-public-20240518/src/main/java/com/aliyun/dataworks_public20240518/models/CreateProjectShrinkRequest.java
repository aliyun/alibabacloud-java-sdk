// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProjectShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rg-acfmzbn7pti3zff</p>
     */
    @NameInMap("AliyunResourceGroupId")
    public String aliyunResourceGroupId;

    @NameInMap("AliyunResourceTags")
    public String aliyunResourceTagsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DevEnvironmentEnabled")
    public Boolean devEnvironmentEnabled;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DevRoleDisabled")
    public Boolean devRoleDisabled;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sora_finance</p>
     */
    @NameInMap("Name")
    public String name;

    /**
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
