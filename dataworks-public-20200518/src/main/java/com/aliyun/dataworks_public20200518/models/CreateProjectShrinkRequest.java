// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateProjectShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DisableDevelopment")
    public Boolean disableDevelopment;

    @NameInMap("IsAllowDownload")
    public Integer isAllowDownload;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectDescription")
    public String projectDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("ProjectMode")
    public Integer projectMode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    @NameInMap("Tags")
    public String tagsShrink;

    public static CreateProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectShrinkRequest self = new CreateProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProjectShrinkRequest setDisableDevelopment(Boolean disableDevelopment) {
        this.disableDevelopment = disableDevelopment;
        return this;
    }
    public Boolean getDisableDevelopment() {
        return this.disableDevelopment;
    }

    public CreateProjectShrinkRequest setIsAllowDownload(Integer isAllowDownload) {
        this.isAllowDownload = isAllowDownload;
        return this;
    }
    public Integer getIsAllowDownload() {
        return this.isAllowDownload;
    }

    public CreateProjectShrinkRequest setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
        return this;
    }
    public String getProjectDescription() {
        return this.projectDescription;
    }

    public CreateProjectShrinkRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public CreateProjectShrinkRequest setProjectMode(Integer projectMode) {
        this.projectMode = projectMode;
        return this;
    }
    public Integer getProjectMode() {
        return this.projectMode;
    }

    public CreateProjectShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateProjectShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateProjectShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
