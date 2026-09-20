// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateProjectShrinkRequest extends TeaModel {
    /**
     * <p>The idempotency parameter. This parameter can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to disable the development role. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): enables the development role.</li>
     * <li><strong>true</strong>: disables the development role.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableDevelopment")
    public Boolean disableDevelopment;

    /**
     * <p>Specifies whether to allow downloading query results from the IDE. Valid values:</p>
     * <ul>
     * <li><strong>1</strong> (default): allows downloading.</li>
     * <li><strong>0</strong>: does not allow downloading.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsAllowDownload")
    public Integer isAllowDownload;

    /**
     * <p>The detailed description of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>test_describe</p>
     */
    @NameInMap("ProjectDescription")
    public String projectDescription;

    /**
     * <p>The name of the workspace. The name can contain only letters, digits, and underscores (_), and must start with a letter or digit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The mode of the workspace. For more information about the differences between modes, see <a href="https://help.aliyun.com/document_detail/85772.html">Must-read: Differences between simple mode and standard mode</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>2</strong> (default): simple workspace mode.</li>
     * <li><strong>3</strong>: standard workspace mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectMode")
    public Integer projectMode;

    /**
     * <p>The display name of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzbn7pti3****</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The list of tags bound to the workspace.</p>
     */
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
