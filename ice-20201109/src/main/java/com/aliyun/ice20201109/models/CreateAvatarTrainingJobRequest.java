// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateAvatarTrainingJobRequest extends TeaModel {
    @NameInMap("AvatarDescription")
    public String avatarDescription;

    @NameInMap("AvatarName")
    public String avatarName;

    @NameInMap("AvatarType")
    public String avatarType;

    @NameInMap("Portrait")
    public String portrait;

    @NameInMap("Thumbnail")
    public String thumbnail;

    @NameInMap("Transparent")
    public Boolean transparent;

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
