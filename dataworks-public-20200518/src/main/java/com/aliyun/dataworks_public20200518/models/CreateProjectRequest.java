// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. This parameter can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to disable the Develop role. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableDevelopment")
    public Boolean disableDevelopment;

    /**
     * <p>Specifies whether to allow you to download the query result from DataStudio. Valid values:</p>
     * <ul>
     * <li><strong>1</strong> (default): allows you to download the query result from DataStudio.</li>
     * <li><strong>0</strong>: does not allow you to download the query result from DataStudio.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsAllowDownload")
    public Integer isAllowDownload;

    /**
     * <p>The description of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>test_describe</p>
     */
    @NameInMap("ProjectDescription")
    public String projectDescription;

    /**
     * <p>The name of the workspace. The name can contain only letters, digits, and underscores (_) and must start with a letter or digit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The mode of the workspace. For more information about the differences between the modes of workspaces, see <a href="https://help.aliyun.com/document_detail/85772.html">Differences between workspaces in basic mode and workspaces in standard mode</a>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>2</strong> (default): basic mode</li>
     * <li><strong>3</strong>: standard mode</li>
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
     * <p>The tags added to the workspace.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateProjectRequestTags> tags;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProjectRequest setDisableDevelopment(Boolean disableDevelopment) {
        this.disableDevelopment = disableDevelopment;
        return this;
    }
    public Boolean getDisableDevelopment() {
        return this.disableDevelopment;
    }

    public CreateProjectRequest setIsAllowDownload(Integer isAllowDownload) {
        this.isAllowDownload = isAllowDownload;
        return this;
    }
    public Integer getIsAllowDownload() {
        return this.isAllowDownload;
    }

    public CreateProjectRequest setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
        return this;
    }
    public String getProjectDescription() {
        return this.projectDescription;
    }

    public CreateProjectRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public CreateProjectRequest setProjectMode(Integer projectMode) {
        this.projectMode = projectMode;
        return this;
    }
    public Integer getProjectMode() {
        return this.projectMode;
    }

    public CreateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateProjectRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateProjectRequest setTags(java.util.List<CreateProjectRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateProjectRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateProjectRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateProjectRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTags self = new CreateProjectRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateProjectRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
