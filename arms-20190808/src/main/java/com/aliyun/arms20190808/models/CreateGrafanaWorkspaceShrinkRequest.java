// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateGrafanaWorkspaceShrinkRequest extends TeaModel {
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
    public String tagsShrink;

    public static CreateGrafanaWorkspaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGrafanaWorkspaceShrinkRequest self = new CreateGrafanaWorkspaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateGrafanaWorkspaceShrinkRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public CreateGrafanaWorkspaceShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGrafanaWorkspaceShrinkRequest setGrafanaVersion(String grafanaVersion) {
        this.grafanaVersion = grafanaVersion;
        return this;
    }
    public String getGrafanaVersion() {
        return this.grafanaVersion;
    }

    public CreateGrafanaWorkspaceShrinkRequest setGrafanaWorkspaceEdition(String grafanaWorkspaceEdition) {
        this.grafanaWorkspaceEdition = grafanaWorkspaceEdition;
        return this;
    }
    public String getGrafanaWorkspaceEdition() {
        return this.grafanaWorkspaceEdition;
    }

    public CreateGrafanaWorkspaceShrinkRequest setGrafanaWorkspaceName(String grafanaWorkspaceName) {
        this.grafanaWorkspaceName = grafanaWorkspaceName;
        return this;
    }
    public String getGrafanaWorkspaceName() {
        return this.grafanaWorkspaceName;
    }

    public CreateGrafanaWorkspaceShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateGrafanaWorkspaceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGrafanaWorkspaceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateGrafanaWorkspaceShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
