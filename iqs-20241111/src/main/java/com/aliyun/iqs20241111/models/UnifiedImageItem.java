// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedImageItem extends TeaModel {
    @NameInMap("height")
    public Integer height;

    @NameInMap("hostPageUrl")
    public String hostPageUrl;

    @NameInMap("imageUrl")
    public String imageUrl;

    @NameInMap("publishedTime")
    public String publishedTime;

    @NameInMap("title")
    public String title;

    @NameInMap("width")
    public Integer width;

    public static UnifiedImageItem build(java.util.Map<String, ?> map) throws Exception {
        UnifiedImageItem self = new UnifiedImageItem();
        return TeaModel.build(map, self);
    }

    public UnifiedImageItem setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public UnifiedImageItem setHostPageUrl(String hostPageUrl) {
        this.hostPageUrl = hostPageUrl;
        return this;
    }
    public String getHostPageUrl() {
        return this.hostPageUrl;
    }

    public UnifiedImageItem setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public UnifiedImageItem setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
        return this;
    }
    public String getPublishedTime() {
        return this.publishedTime;
    }

    public UnifiedImageItem setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UnifiedImageItem setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
