// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncCreateClipsTaskShrinkRequest extends TeaModel {
    @NameInMap("CloseMusic")
    public Boolean closeMusic;

    @NameInMap("CloseSubtitle")
    public Boolean closeSubtitle;

    @NameInMap("CloseVoice")
    public Boolean closeVoice;

    @NameInMap("ColorWords")
    public String colorWordsShrink;

    /**
     * <strong>example:</strong>
     * <p><a href="http://xxx/xxx.mp4">http://xxx/xxx.mp4</a></p>
     */
    @NameInMap("CustomVoiceUrl")
    public String customVoiceUrl;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CustomVoiceVolume")
    public Integer customVoiceVolume;

    /**
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <strong>example:</strong>
     * <p><a href="http://music.mp4">http://music.mp4</a></p>
     */
    @NameInMap("MusicUrl")
    public String musicUrl;

    @NameInMap("MusicVolume")
    public Integer musicVolume;

    @NameInMap("Stickers")
    public String stickersShrink;

    @NameInMap("SubtitleFontSize")
    public Integer subtitleFontSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17a299a9-f223-4707-b0dd-4c22519bddf5</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("VoiceStyle")
    public String voiceStyle;

    @NameInMap("VoiceVolume")
    public Integer voiceVolume;

    /**
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("Width")
    public Integer width;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-ipe7d81yq4sl5jmk</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AsyncCreateClipsTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncCreateClipsTaskShrinkRequest self = new AsyncCreateClipsTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AsyncCreateClipsTaskShrinkRequest setCloseMusic(Boolean closeMusic) {
        this.closeMusic = closeMusic;
        return this;
    }
    public Boolean getCloseMusic() {
        return this.closeMusic;
    }

    public AsyncCreateClipsTaskShrinkRequest setCloseSubtitle(Boolean closeSubtitle) {
        this.closeSubtitle = closeSubtitle;
        return this;
    }
    public Boolean getCloseSubtitle() {
        return this.closeSubtitle;
    }

    public AsyncCreateClipsTaskShrinkRequest setCloseVoice(Boolean closeVoice) {
        this.closeVoice = closeVoice;
        return this;
    }
    public Boolean getCloseVoice() {
        return this.closeVoice;
    }

    public AsyncCreateClipsTaskShrinkRequest setColorWordsShrink(String colorWordsShrink) {
        this.colorWordsShrink = colorWordsShrink;
        return this;
    }
    public String getColorWordsShrink() {
        return this.colorWordsShrink;
    }

    public AsyncCreateClipsTaskShrinkRequest setCustomVoiceUrl(String customVoiceUrl) {
        this.customVoiceUrl = customVoiceUrl;
        return this;
    }
    public String getCustomVoiceUrl() {
        return this.customVoiceUrl;
    }

    public AsyncCreateClipsTaskShrinkRequest setCustomVoiceVolume(Integer customVoiceVolume) {
        this.customVoiceVolume = customVoiceVolume;
        return this;
    }
    public Integer getCustomVoiceVolume() {
        return this.customVoiceVolume;
    }

    public AsyncCreateClipsTaskShrinkRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public AsyncCreateClipsTaskShrinkRequest setMusicUrl(String musicUrl) {
        this.musicUrl = musicUrl;
        return this;
    }
    public String getMusicUrl() {
        return this.musicUrl;
    }

    public AsyncCreateClipsTaskShrinkRequest setMusicVolume(Integer musicVolume) {
        this.musicVolume = musicVolume;
        return this;
    }
    public Integer getMusicVolume() {
        return this.musicVolume;
    }

    public AsyncCreateClipsTaskShrinkRequest setStickersShrink(String stickersShrink) {
        this.stickersShrink = stickersShrink;
        return this;
    }
    public String getStickersShrink() {
        return this.stickersShrink;
    }

    public AsyncCreateClipsTaskShrinkRequest setSubtitleFontSize(Integer subtitleFontSize) {
        this.subtitleFontSize = subtitleFontSize;
        return this;
    }
    public Integer getSubtitleFontSize() {
        return this.subtitleFontSize;
    }

    public AsyncCreateClipsTaskShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AsyncCreateClipsTaskShrinkRequest setVoiceStyle(String voiceStyle) {
        this.voiceStyle = voiceStyle;
        return this;
    }
    public String getVoiceStyle() {
        return this.voiceStyle;
    }

    public AsyncCreateClipsTaskShrinkRequest setVoiceVolume(Integer voiceVolume) {
        this.voiceVolume = voiceVolume;
        return this;
    }
    public Integer getVoiceVolume() {
        return this.voiceVolume;
    }

    public AsyncCreateClipsTaskShrinkRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public AsyncCreateClipsTaskShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
