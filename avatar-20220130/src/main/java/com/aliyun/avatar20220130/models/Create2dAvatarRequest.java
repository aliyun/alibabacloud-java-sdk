// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class Create2dAvatarRequest extends TeaModel {
    @NameInMap("Callback")
    public Boolean callback;

    @NameInMap("Description")
    public String description;

    @NameInMap("Image")
    public String image;

    @NameInMap("Name")
    public String name;

    @NameInMap("Orientation")
    public Integer orientation;

    @NameInMap("Portrait")
    public String portrait;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Transparent")
    public Boolean transparent;

    @NameInMap("Video")
    public String video;

    public static Create2dAvatarRequest build(java.util.Map<String, ?> map) throws Exception {
        Create2dAvatarRequest self = new Create2dAvatarRequest();
        return TeaModel.build(map, self);
    }

    public Create2dAvatarRequest setCallback(Boolean callback) {
        this.callback = callback;
        return this;
    }
    public Boolean getCallback() {
        return this.callback;
    }

    public Create2dAvatarRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Create2dAvatarRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public Create2dAvatarRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Create2dAvatarRequest setOrientation(Integer orientation) {
        this.orientation = orientation;
        return this;
    }
    public Integer getOrientation() {
        return this.orientation;
    }

    public Create2dAvatarRequest setPortrait(String portrait) {
        this.portrait = portrait;
        return this;
    }
    public String getPortrait() {
        return this.portrait;
    }

    public Create2dAvatarRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public Create2dAvatarRequest setTransparent(Boolean transparent) {
        this.transparent = transparent;
        return this;
    }
    public Boolean getTransparent() {
        return this.transparent;
    }

    public Create2dAvatarRequest setVideo(String video) {
        this.video = video;
        return this;
    }
    public String getVideo() {
        return this.video;
    }

}
