// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateAvatarTrainingJobRequest extends TeaModel {
    @NameInMap("AvatarDescription")
    public String avatarDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AvatarName")
    public String avatarName;

    /**
     * <strong>example:</strong>
     * <p>2DAvatar</p>
     */
    @NameInMap("AvatarType")
    public String avatarType;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
     */
    @NameInMap("Portrait")
    public String portrait;

    /**
     * <strong>example:</strong>
     * <p><a href="https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png">https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png</a></p>
     */
    @NameInMap("Thumbnail")
    public String thumbnail;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Transparent")
    public Boolean transparent;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
     */
    @NameInMap("Video")
    public String video;

    public static CreateAvatarTrainingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAvatarTrainingJobRequest self = new CreateAvatarTrainingJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateAvatarTrainingJobRequest setAvatarDescription(String avatarDescription) {
        this.avatarDescription = avatarDescription;
        return this;
    }
    public String getAvatarDescription() {
        return this.avatarDescription;
    }

    public CreateAvatarTrainingJobRequest setAvatarName(String avatarName) {
        this.avatarName = avatarName;
        return this;
    }
    public String getAvatarName() {
        return this.avatarName;
    }

    public CreateAvatarTrainingJobRequest setAvatarType(String avatarType) {
        this.avatarType = avatarType;
        return this;
    }
    public String getAvatarType() {
        return this.avatarType;
    }

    public CreateAvatarTrainingJobRequest setPortrait(String portrait) {
        this.portrait = portrait;
        return this;
    }
    public String getPortrait() {
        return this.portrait;
    }

    public CreateAvatarTrainingJobRequest setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public CreateAvatarTrainingJobRequest setTransparent(Boolean transparent) {
        this.transparent = transparent;
        return this;
    }
    public Boolean getTransparent() {
        return this.transparent;
    }

    public CreateAvatarTrainingJobRequest setVideo(String video) {
        this.video = video;
        return this;
    }
    public String getVideo() {
        return this.video;
    }

}
