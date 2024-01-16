// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateGrafanaWorkspaceRequest extends TeaModel {
    @NameInMap("AliyunLang")
    public String aliyunLang;

    @NameInMap("Description")
    public String description;

    @NameInMap("GrafanaVersion")
    public String grafanaVersion;

    @NameInMap("GrafanaWorkspaceEdition")
    public String grafanaWorkspaceEdition;

    @NameInMap("GrafanaWorkspaceName")
    public String grafanaWorkspaceName;

    @NameInMap("Password")
    public String password;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<CreateGrafanaWorkspaceRequestTags> tags;

    public static CreateGrafanaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGrafanaWorkspaceRequest self = new CreateGrafanaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateGrafanaWorkspaceRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public CreateGrafanaWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGrafanaWorkspaceRequest setGrafanaVersion(String grafanaVersion) {
        this.grafanaVersion = grafanaVersion;
        return this;
    }
    public String getGrafanaVersion() {
        return this.grafanaVersion;
    }

    public CreateGrafanaWorkspaceRequest setGrafanaWorkspaceEdition(String grafanaWorkspaceEdition) {
        this.grafanaWorkspaceEdition = grafanaWorkspaceEdition;
        return this;
    }
    public String getGrafanaWorkspaceEdition() {
        return this.grafanaWorkspaceEdition;
    }

    public CreateGrafanaWorkspaceRequest setGrafanaWorkspaceName(String grafanaWorkspaceName) {
        this.grafanaWorkspaceName = grafanaWorkspaceName;
        return this;
    }
    public String getGrafanaWorkspaceName() {
        return this.grafanaWorkspaceName;
    }

    public CreateGrafanaWorkspaceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateGrafanaWorkspaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGrafanaWorkspaceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateGrafanaWorkspaceRequest setTags(java.util.List<CreateGrafanaWorkspaceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateGrafanaWorkspaceRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateGrafanaWorkspaceRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateGrafanaWorkspaceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateGrafanaWorkspaceRequestTags self = new CreateGrafanaWorkspaceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateGrafanaWorkspaceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateGrafanaWorkspaceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
