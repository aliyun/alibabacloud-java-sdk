// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaLiveChannelShrinkRequest extends TeaModel {
    /**
     * <p>The audio settings.</p>
     */
    @NameInMap("AudioSettings")
    public String audioSettingsShrink;

    /**
     * <p>The channel ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SEGK5KA6KYKAWQQH</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The input attachment settings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputAttachments")
    public String inputAttachmentsShrink;

    /**
     * <p>The channel name. The name can contain letters, digits, hyphens (-), and underscores (_). The name can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mych</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output group configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutputGroups")
    public String outputGroupsShrink;

    /**
     * <p>The video settings.</p>
     */
    @NameInMap("VideoSettings")
    public String videoSettingsShrink;

    public static UpdateMediaLiveChannelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaLiveChannelShrinkRequest self = new UpdateMediaLiveChannelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaLiveChannelShrinkRequest setAudioSettingsShrink(String audioSettingsShrink) {
        this.audioSettingsShrink = audioSettingsShrink;
        return this;
    }
    public String getAudioSettingsShrink() {
        return this.audioSettingsShrink;
    }

    public UpdateMediaLiveChannelShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateMediaLiveChannelShrinkRequest setInputAttachmentsShrink(String inputAttachmentsShrink) {
        this.inputAttachmentsShrink = inputAttachmentsShrink;
        return this;
    }
    public String getInputAttachmentsShrink() {
        return this.inputAttachmentsShrink;
    }

    public UpdateMediaLiveChannelShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMediaLiveChannelShrinkRequest setOutputGroupsShrink(String outputGroupsShrink) {
        this.outputGroupsShrink = outputGroupsShrink;
        return this;
    }
    public String getOutputGroupsShrink() {
        return this.outputGroupsShrink;
    }

    public UpdateMediaLiveChannelShrinkRequest setVideoSettingsShrink(String videoSettingsShrink) {
        this.videoSettingsShrink = videoSettingsShrink;
        return this;
    }
    public String getVideoSettingsShrink() {
        return this.videoSettingsShrink;
    }

}
