// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAvatarTrainingJobRequest extends TeaModel {
    @NameInMap("AvatarDescription")
    public String avatarDescription;

    @NameInMap("AvatarName")
    public String avatarName;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Portrait")
    public String portrait;

    @NameInMap("Thumbnail")
    public String thumbnail;

    @NameInMap("Transparent")
    public Boolean transparent;

    @NameInMap("Video")
    public String video;

    public static UpdateAvatarTrainingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAvatarTrainingJobRequest self = new UpdateAvatarTrainingJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAvatarTrainingJobRequest setAvatarDescription(String avatarDescription) {
        this.avatarDescription = avatarDescription;
        return this;
    }
    public String getAvatarDescription() {
        return this.avatarDescription;
    }

    public UpdateAvatarTrainingJobRequest setAvatarName(String avatarName) {
        this.avatarName = avatarName;
        return this;
    }
    public String getAvatarName() {
        return this.avatarName;
    }

    public UpdateAvatarTrainingJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateAvatarTrainingJobRequest setPortrait(String portrait) {
        this.portrait = portrait;
        return this;
    }
    public String getPortrait() {
        return this.portrait;
    }

    public UpdateAvatarTrainingJobRequest setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public UpdateAvatarTrainingJobRequest setTransparent(Boolean transparent) {
        this.transparent = transparent;
        return this;
    }
    public Boolean getTransparent() {
        return this.transparent;
    }

    public UpdateAvatarTrainingJobRequest setVideo(String video) {
        this.video = video;
        return this;
    }
    public String getVideo() {
        return this.video;
    }

}
