// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateAvatarTrainingJobRequest extends TeaModel {
    /**
     * <p>The description of the digital human. The description can be up to 1000 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a digital human used for a specific scenario.</p>
     */
    @NameInMap("AvatarDescription")
    public String avatarDescription;

    /**
     * <p>The name of the digital human. The name can be up to 7 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Decimal</p>
     */
    @NameInMap("AvatarName")
    public String avatarName;

    /**
     * <p>The type of the digital human.</p>
     * 
     * <strong>example:</strong>
     * <p>2DAvatar</p>
     */
    @NameInMap("AvatarType")
    public String avatarType;

    /**
     * <ul>
     * <li>The media asset ID of the avatar image. The ID is 32 characters in length.</li>
     * <li>If you subsequently call SubmitAvatarTrainingJob to submit the training, this field is required.</li>
     * <li>The image must have equal width and height.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
     */
    @NameInMap("Portrait")
    public String portrait;

    /**
     * <p>The thumbnail URL.</p>
     * <ul>
     * <li>After training succeeds, the thumbnail is uploaded to this address.</li>
     * <li>The URL must be a valid public OSS URL under the current user.</li>
     * <li>The URL can be up to 512 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png">https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png</a></p>
     */
    @NameInMap("Thumbnail")
    public String thumbnail;

    /**
     * <p>Specifies whether the training video supports a transparent channel.</p>
     * <blockquote>
     * <p>Notice: Make sure that this setting is consistent with the submitted training video. Otherwise, the synthesized digital human may be abnormal.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Transparent")
    public Boolean transparent;

    /**
     * <p>The media asset ID of the training video.</p>
     * <ul>
     * <li>The ID is 32 characters in length.</li>
     * <li>Supported formats: mp4, mov, and webm.</li>
     * <li>The duration of the material must be between 5 minutes and 15 minutes.</li>
     * <li>The resolution of the material must be 1920 × 1080 or 1080 × 1920.</li>
     * <li>If you subsequently call SubmitAvatarTrainingJob to submit the training, this field is required.</li>
     * </ul>
     * 
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
