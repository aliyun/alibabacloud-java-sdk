// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaLiveChannelShrinkRequest extends TeaModel {
    /**
     * <p>The audio settings.</p>
     */
    @NameInMap("AudioSettings")
    public String audioSettingsShrink;

    /**
     * <p>The associated inputs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputAttachments")
    public String inputAttachmentsShrink;

    /**
     * <p>The name of the channel. Letters, digits, hyphens (-), and underscores (_) are supported. It can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mych</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output groups.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutputGroups")
    public String outputGroupsShrink;

    /**
     * <p>The video settings.</p>
     */
    @NameInMap("VideoSettings")
    public String videoSettingsShrink;

    public static CreateMediaLiveChannelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaLiveChannelShrinkRequest self = new CreateMediaLiveChannelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMediaLiveChannelShrinkRequest setAudioSettingsShrink(String audioSettingsShrink) {
        this.audioSettingsShrink = audioSettingsShrink;
        return this;
    }
    public String getAudioSettingsShrink() {
        return this.audioSettingsShrink;
    }

    public CreateMediaLiveChannelShrinkRequest setInputAttachmentsShrink(String inputAttachmentsShrink) {
        this.inputAttachmentsShrink = inputAttachmentsShrink;
        return this;
    }
    public String getInputAttachmentsShrink() {
        return this.inputAttachmentsShrink;
    }

    public CreateMediaLiveChannelShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMediaLiveChannelShrinkRequest setOutputGroupsShrink(String outputGroupsShrink) {
        this.outputGroupsShrink = outputGroupsShrink;
        return this;
    }
    public String getOutputGroupsShrink() {
        return this.outputGroupsShrink;
    }

    public CreateMediaLiveChannelShrinkRequest setVideoSettingsShrink(String videoSettingsShrink) {
        this.videoSettingsShrink = videoSettingsShrink;
        return this;
    }
    public String getVideoSettingsShrink() {
        return this.videoSettingsShrink;
    }

}
