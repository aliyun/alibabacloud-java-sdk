// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class Update2dAvatarRequest extends TeaModel {
    @NameInMap("Callback")
    public Boolean callback;

    @NameInMap("Code")
    public String code;

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

    public static Update2dAvatarRequest build(java.util.Map<String, ?> map) throws Exception {
        Update2dAvatarRequest self = new Update2dAvatarRequest();
        return TeaModel.build(map, self);
    }

    public Update2dAvatarRequest setCallback(Boolean callback) {
        this.callback = callback;
        return this;
    }
    public Boolean getCallback() {
        return this.callback;
    }

    public Update2dAvatarRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Update2dAvatarRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Update2dAvatarRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public Update2dAvatarRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Update2dAvatarRequest setOrientation(Integer orientation) {
        this.orientation = orientation;
        return this;
    }
    public Integer getOrientation() {
        return this.orientation;
    }

    public Update2dAvatarRequest setPortrait(String portrait) {
        this.portrait = portrait;
        return this;
    }
    public String getPortrait() {
        return this.portrait;
    }

    public Update2dAvatarRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public Update2dAvatarRequest setTransparent(Boolean transparent) {
        this.transparent = transparent;
        return this;
    }
    public Boolean getTransparent() {
        return this.transparent;
    }

    public Update2dAvatarRequest setVideo(String video) {
        this.video = video;
        return this;
    }
    public String getVideo() {
        return this.video;
    }

}
