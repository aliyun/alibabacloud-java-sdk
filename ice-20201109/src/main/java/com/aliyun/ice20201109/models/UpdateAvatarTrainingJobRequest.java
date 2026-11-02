// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAvatarTrainingJobRequest extends TeaModel {
    /**
     * <p>The description of the digital human. The description can be up to 1,000 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a digital human, intended for use in a certain scenario.</p>
     */
    @NameInMap("AvatarDescription")
    public String avatarDescription;

    /**
     * <p>The name of the digital human. The name can be up to 7 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>The name of the digital human.</p>
     */
    @NameInMap("AvatarName")
    public String avatarName;

    /**
     * <p>The ID of the digital human training task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The media asset ID of the profile picture. The ID must be 32 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
     */
    @NameInMap("Portrait")
    public String portrait;

    /**
     * <p>The URL of the thumbnail.</p>
     * <ul>
     * <li>The thumbnail is uploaded to this URL after the training succeeds.</li>
     * <li>The URL must be a valid public Object Storage Service (OSS) URL within your account.</li>
     * <li>The URL can be up to 512 characters in length.</li>
     * <li>The URL cannot be updated after the training succeeds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png">https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png</a></p>
     */
    @NameInMap("Thumbnail")
    public String thumbnail;

    /**
     * <p>Specifies whether the uploaded video supports a transparent channel.</p>
     * <p>You can modify this parameter only for tasks in the Initialized or Training Failed state.
     * <notice>Make sure that this setting matches the properties of the submitted training video. Otherwise, the synthesized digital human may behave abnormally.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Transparent")
    public Boolean transparent;

    /**
     * <p>The media asset ID of the training video.</p>
     * <ul>
     * <li>The ID must be 32 characters in length.</li>
     * <li>The MP4, MOV, and WebM formats are supported.</li>
     * <li>The video duration must be between 5 and 15 minutes.</li>
     * <li>The video resolution must be 1920 × 1080 or 1080 × 1920.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
     */
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
