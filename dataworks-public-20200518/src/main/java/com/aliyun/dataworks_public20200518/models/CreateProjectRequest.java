// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>This parameter is required.</p>
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
