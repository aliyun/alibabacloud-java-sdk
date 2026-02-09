// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedImageItem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1330</p>
     */
    @NameInMap("height")
    public Integer height;

    /**
     * <strong>example:</strong>
     * <p><a href="http://mbd.baidu.com/newspage/data/dtlandingsuper?nid=dt_4541580238898912926">http://mbd.baidu.com/newspage/data/dtlandingsuper?nid=dt_4541580238898912926</a></p>
     */
    @NameInMap("hostPageUrl")
    public String hostPageUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="http://pic.rmb.bdstatic.com/bjh/bb87f566c0c/241218/f7936f25837b20211e5ef88d7980c143.jpeg">http://pic.rmb.bdstatic.com/bjh/bb87f566c0c/241218/f7936f25837b20211e5ef88d7980c143.jpeg</a></p>
     */
    @NameInMap("imageUrl")
    public String imageUrl;

    /**
     * <strong>example:</strong>
     * <p>2022-07-05T00:54:42+08:00</p>
     */
    @NameInMap("publishedTime")
    public String publishedTime;

    @NameInMap("title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
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
