// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncCreateClipsTaskShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AutoWrap：自动换行</p>
     * <p>AutoScale：自动缩放</p>
     * <p>AutoWrapAtSpaces：只在空格位置自动换行（适用于纯英文字幕自动换行场景）</p>
     */
    @NameInMap("AdaptMode")
    public String adaptMode;

    /**
     * <strong>example:</strong>
     * <p>支持设置：</p>
     * <p>TopLeft：视频左上角</p>
     * <p>TopCenter：视频竖直中轴线上侧</p>
     * <p>TopRight：视频右上角</p>
     * <p>CenterLeft：视频水平中轴线左侧</p>
     * <p>CenterCenter：视频中心位置</p>
     * <p>CenterRight：视频水平中轴线右侧</p>
     * <p>BottomLeft：视频左下角</p>
     * <p>BottomCenter：视频竖直中轴线下侧</p>
     * <p>BottomRight：视频右下角</p>
     * <p>若需要在不同对齐方式下准确定位字幕位置，建议设置以下对齐方式：</p>
     * <p>Left，左对齐，X、Y传入字幕左上角顶点相对于视频左上角的坐标</p>
     * <p>Center，居中对齐，X、Y传入字幕中轴线上边界交点相对于视频左上角的坐标</p>
     * <p>Right，右对齐，X、Y传入字幕右上角顶点相对于视频左上角的坐标</p>
     */
    @NameInMap("Alignment")
    public String alignment;

    /**
     * <p>Specifies whether to disable the background music.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CloseMusic")
    public Boolean closeMusic;

    /**
     * <p>Specifies whether to disable the subtitles.</p>
     */
    @NameInMap("CloseSubtitle")
    public Boolean closeSubtitle;

    /**
     * <p>Specifies whether to disable the narration voice.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CloseVoice")
    public Boolean closeVoice;

    /**
     * <p>The URL of the closing credits video.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxx/xxx.mp4">http://xxx/xxx.mp4</a></p>
     */
    @NameInMap("ClosingCreditsUrl")
    public String closingCreditsUrl;

    /**
     * <p>The array of animated text elements.</p>
     */
    @NameInMap("ColorWords")
    public String colorWordsShrink;

    /**
     * <p>The AppKey of CosyVoice.</p>
     * 
     * <strong>example:</strong>
     * <p>ddgsase</p>
     */
    @NameInMap("CosyVoiceAppKey")
    public String cosyVoiceAppKey;

    /**
     * <p>The token of CosyVoice.</p>
     * 
     * <strong>example:</strong>
     * <p>xxsfazs</p>
     */
    @NameInMap("CosyVoiceToken")
    public String cosyVoiceToken;

    /**
     * <p>The voice tone of CosyVoice.</p>
     * 
     * <strong>example:</strong>
     * <p>longxian_normal</p>
     */
    @NameInMap("CustomVoiceStyle")
    public String customVoiceStyle;

    /**
     * <p>The URL of the custom audio track.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxx/xxx.mp4">http://xxx/xxx.mp4</a></p>
     */
    @NameInMap("CustomVoiceUrl")
    public String customVoiceUrl;

    /**
     * <p>The volume of the custom audio track.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CustomVoiceVolume")
    public Integer customVoiceVolume;

    /**
     * <p>The height of the video.</p>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>The list of high-definition video structures.</p>
     */
    @NameInMap("HighDefSourceVideos")
    public String highDefSourceVideosShrink;

    /**
     * <p>The type of recommended music.</p>
     * 
     * <strong>example:</strong>
     * <p>浪漫, 美食,国风,轻快,动感,舒缓,搞怪,时尚</p>
     */
    @NameInMap("MusicStyle")
    public String musicStyle;

    /**
     * <p>The URL of the background music.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://music.mp4">http://music.mp4</a></p>
     */
    @NameInMap("MusicUrl")
    public String musicUrl;

    /**
     * <p>The volume of the background music.</p>
     * 
     * <strong>example:</strong>
     * <p>0-10，默认5</p>
     */
    @NameInMap("MusicVolume")
    public Integer musicVolume;

    /**
     * <p>The URL of the opening credits video.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxx/xxx.mp4">http://xxx/xxx.mp4</a></p>
     */
    @NameInMap("OpeningCreditsUrl")
    public String openingCreditsUrl;

    /**
     * <p>The array of sticker structures.</p>
     */
    @NameInMap("Stickers")
    public String stickersShrink;

    /**
     * <p>The font size of the subtitles.</p>
     * 
     * <strong>example:</strong>
     * <p>默认120</p>
     */
    @NameInMap("SubtitleFontSize")
    public Integer subtitleFontSize;

    /**
     * <p>The unique ID of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17a299a9-f223-4707-b0dd-4c22519bddf5</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>将按照该值设置文本框宽度进行自动换行或缩放。不填写时，会按照视频宽度进行自动换行或缩放。当值大于0小于等于1时，表示相对输出视频的宽度，当值大于1时，表示绝对像素值。</p>
     */
    @NameInMap("TextWidth")
    public String textWidth;

    /**
     * <p>The type of narration voice.</p>
     * 
     * <strong>example:</strong>
     * <p>甜美女声
     * 中国台湾话女声
     * 舌尖男声
     * 新闻男声
     * 激昂解说
     * 标准女声
     * 悬疑解说
     * 广告男声
     * 温柔女声
     * 资讯女声
     * 新闻女声
     * 萝莉女声
     * 磁性男声</p>
     */
    @NameInMap("VoiceStyle")
    public String voiceStyle;

    /**
     * <p>The volume of the narration voice.</p>
     * 
     * <strong>example:</strong>
     * <p>0-10，默认5</p>
     */
    @NameInMap("VoiceVolume")
    public Integer voiceVolume;

    /**
     * <p>The width of the video.</p>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("Width")
    public Integer width;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/2782167.html">Bailian workspace ID</a>.</p>
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

    public AsyncCreateClipsTaskShrinkRequest setAdaptMode(String adaptMode) {
        this.adaptMode = adaptMode;
        return this;
    }
    public String getAdaptMode() {
        return this.adaptMode;
    }

    public AsyncCreateClipsTaskShrinkRequest setAlignment(String alignment) {
        this.alignment = alignment;
        return this;
    }
    public String getAlignment() {
        return this.alignment;
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

    public AsyncCreateClipsTaskShrinkRequest setClosingCreditsUrl(String closingCreditsUrl) {
        this.closingCreditsUrl = closingCreditsUrl;
        return this;
    }
    public String getClosingCreditsUrl() {
        return this.closingCreditsUrl;
    }

    public AsyncCreateClipsTaskShrinkRequest setColorWordsShrink(String colorWordsShrink) {
        this.colorWordsShrink = colorWordsShrink;
        return this;
    }
    public String getColorWordsShrink() {
        return this.colorWordsShrink;
    }

    public AsyncCreateClipsTaskShrinkRequest setCosyVoiceAppKey(String cosyVoiceAppKey) {
        this.cosyVoiceAppKey = cosyVoiceAppKey;
        return this;
    }
    public String getCosyVoiceAppKey() {
        return this.cosyVoiceAppKey;
    }

    public AsyncCreateClipsTaskShrinkRequest setCosyVoiceToken(String cosyVoiceToken) {
        this.cosyVoiceToken = cosyVoiceToken;
        return this;
    }
    public String getCosyVoiceToken() {
        return this.cosyVoiceToken;
    }

    public AsyncCreateClipsTaskShrinkRequest setCustomVoiceStyle(String customVoiceStyle) {
        this.customVoiceStyle = customVoiceStyle;
        return this;
    }
    public String getCustomVoiceStyle() {
        return this.customVoiceStyle;
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

    public AsyncCreateClipsTaskShrinkRequest setHighDefSourceVideosShrink(String highDefSourceVideosShrink) {
        this.highDefSourceVideosShrink = highDefSourceVideosShrink;
        return this;
    }
    public String getHighDefSourceVideosShrink() {
        return this.highDefSourceVideosShrink;
    }

    public AsyncCreateClipsTaskShrinkRequest setMusicStyle(String musicStyle) {
        this.musicStyle = musicStyle;
        return this;
    }
    public String getMusicStyle() {
        return this.musicStyle;
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

    public AsyncCreateClipsTaskShrinkRequest setOpeningCreditsUrl(String openingCreditsUrl) {
        this.openingCreditsUrl = openingCreditsUrl;
        return this;
    }
    public String getOpeningCreditsUrl() {
        return this.openingCreditsUrl;
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

    public AsyncCreateClipsTaskShrinkRequest setTextWidth(String textWidth) {
        this.textWidth = textWidth;
        return this;
    }
    public String getTextWidth() {
        return this.textWidth;
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
