// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceIntegrationPreview extends TeaModel {
    @NameInMap("id")
    public String id;

    @NameInMap("image")
    public String image;

    @NameInMap("name")
    public String name;

    @NameInMap("thumbnail")
    public String thumbnail;

    public static GrafanaWorkspaceIntegrationPreview build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceIntegrationPreview self = new GrafanaWorkspaceIntegrationPreview();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceIntegrationPreview setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GrafanaWorkspaceIntegrationPreview setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public GrafanaWorkspaceIntegrationPreview setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GrafanaWorkspaceIntegrationPreview setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

}
