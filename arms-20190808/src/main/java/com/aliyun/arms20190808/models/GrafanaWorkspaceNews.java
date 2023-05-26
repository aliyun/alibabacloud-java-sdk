// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceNews extends TeaModel {
    @NameInMap("date")
    public Long date;

    @NameInMap("description")
    public String description;

    @NameInMap("image")
    public String image;

    @NameInMap("link")
    public String link;

    @NameInMap("title")
    public String title;

    public static GrafanaWorkspaceNews build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceNews self = new GrafanaWorkspaceNews();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceNews setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public GrafanaWorkspaceNews setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GrafanaWorkspaceNews setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public GrafanaWorkspaceNews setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public GrafanaWorkspaceNews setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
