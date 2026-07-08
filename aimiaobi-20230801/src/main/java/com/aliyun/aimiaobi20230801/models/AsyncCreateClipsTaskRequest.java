// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncCreateClipsTaskRequest extends TeaModel {
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
    public java.util.List<AsyncCreateClipsTaskRequestColorWords> colorWords;

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
    public java.util.List<AsyncCreateClipsTaskRequestHighDefSourceVideos> highDefSourceVideos;

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
    public java.util.List<AsyncCreateClipsTaskRequestStickers> stickers;

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

    public static AsyncCreateClipsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncCreateClipsTaskRequest self = new AsyncCreateClipsTaskRequest();
        return TeaModel.build(map, self);
    }

    public AsyncCreateClipsTaskRequest setAdaptMode(String adaptMode) {
        this.adaptMode = adaptMode;
        return this;
    }
    public String getAdaptMode() {
        return this.adaptMode;
    }

    public AsyncCreateClipsTaskRequest setAlignment(String alignment) {
        this.alignment = alignment;
        return this;
    }
    public String getAlignment() {
        return this.alignment;
    }

    public AsyncCreateClipsTaskRequest setCloseMusic(Boolean closeMusic) {
        this.closeMusic = closeMusic;
        return this;
    }
    public Boolean getCloseMusic() {
        return this.closeMusic;
    }

    public AsyncCreateClipsTaskRequest setCloseSubtitle(Boolean closeSubtitle) {
        this.closeSubtitle = closeSubtitle;
        return this;
    }
    public Boolean getCloseSubtitle() {
        return this.closeSubtitle;
    }

    public AsyncCreateClipsTaskRequest setCloseVoice(Boolean closeVoice) {
        this.closeVoice = closeVoice;
        return this;
    }
    public Boolean getCloseVoice() {
        return this.closeVoice;
    }

    public AsyncCreateClipsTaskRequest setClosingCreditsUrl(String closingCreditsUrl) {
        this.closingCreditsUrl = closingCreditsUrl;
        return this;
    }
    public String getClosingCreditsUrl() {
        return this.closingCreditsUrl;
    }

    public AsyncCreateClipsTaskRequest setColorWords(java.util.List<AsyncCreateClipsTaskRequestColorWords> colorWords) {
        this.colorWords = colorWords;
        return this;
    }
    public java.util.List<AsyncCreateClipsTaskRequestColorWords> getColorWords() {
        return this.colorWords;
    }

    public AsyncCreateClipsTaskRequest setCosyVoiceAppKey(String cosyVoiceAppKey) {
        this.cosyVoiceAppKey = cosyVoiceAppKey;
        return this;
    }
    public String getCosyVoiceAppKey() {
        return this.cosyVoiceAppKey;
    }

    public AsyncCreateClipsTaskRequest setCosyVoiceToken(String cosyVoiceToken) {
        this.cosyVoiceToken = cosyVoiceToken;
        return this;
    }
    public String getCosyVoiceToken() {
        return this.cosyVoiceToken;
    }

    public AsyncCreateClipsTaskRequest setCustomVoiceStyle(String customVoiceStyle) {
        this.customVoiceStyle = customVoiceStyle;
        return this;
    }
    public String getCustomVoiceStyle() {
        return this.customVoiceStyle;
    }

    public AsyncCreateClipsTaskRequest setCustomVoiceUrl(String customVoiceUrl) {
        this.customVoiceUrl = customVoiceUrl;
        return this;
    }
    public String getCustomVoiceUrl() {
        return this.customVoiceUrl;
    }

    public AsyncCreateClipsTaskRequest setCustomVoiceVolume(Integer customVoiceVolume) {
        this.customVoiceVolume = customVoiceVolume;
        return this;
    }
    public Integer getCustomVoiceVolume() {
        return this.customVoiceVolume;
    }

    public AsyncCreateClipsTaskRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public AsyncCreateClipsTaskRequest setHighDefSourceVideos(java.util.List<AsyncCreateClipsTaskRequestHighDefSourceVideos> highDefSourceVideos) {
        this.highDefSourceVideos = highDefSourceVideos;
        return this;
    }
    public java.util.List<AsyncCreateClipsTaskRequestHighDefSourceVideos> getHighDefSourceVideos() {
        return this.highDefSourceVideos;
    }

    public AsyncCreateClipsTaskRequest setMusicStyle(String musicStyle) {
        this.musicStyle = musicStyle;
        return this;
    }
    public String getMusicStyle() {
        return this.musicStyle;
    }

    public AsyncCreateClipsTaskRequest setMusicUrl(String musicUrl) {
        this.musicUrl = musicUrl;
        return this;
    }
    public String getMusicUrl() {
        return this.musicUrl;
    }

    public AsyncCreateClipsTaskRequest setMusicVolume(Integer musicVolume) {
        this.musicVolume = musicVolume;
        return this;
    }
    public Integer getMusicVolume() {
        return this.musicVolume;
    }

    public AsyncCreateClipsTaskRequest setOpeningCreditsUrl(String openingCreditsUrl) {
        this.openingCreditsUrl = openingCreditsUrl;
        return this;
    }
    public String getOpeningCreditsUrl() {
        return this.openingCreditsUrl;
    }

    public AsyncCreateClipsTaskRequest setStickers(java.util.List<AsyncCreateClipsTaskRequestStickers> stickers) {
        this.stickers = stickers;
        return this;
    }
    public java.util.List<AsyncCreateClipsTaskRequestStickers> getStickers() {
        return this.stickers;
    }

    public AsyncCreateClipsTaskRequest setSubtitleFontSize(Integer subtitleFontSize) {
        this.subtitleFontSize = subtitleFontSize;
        return this;
    }
    public Integer getSubtitleFontSize() {
        return this.subtitleFontSize;
    }

    public AsyncCreateClipsTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AsyncCreateClipsTaskRequest setTextWidth(String textWidth) {
        this.textWidth = textWidth;
        return this;
    }
    public String getTextWidth() {
        return this.textWidth;
    }

    public AsyncCreateClipsTaskRequest setVoiceStyle(String voiceStyle) {
        this.voiceStyle = voiceStyle;
        return this;
    }
    public String getVoiceStyle() {
        return this.voiceStyle;
    }

    public AsyncCreateClipsTaskRequest setVoiceVolume(Integer voiceVolume) {
        this.voiceVolume = voiceVolume;
        return this;
    }
    public Integer getVoiceVolume() {
        return this.voiceVolume;
    }

    public AsyncCreateClipsTaskRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public AsyncCreateClipsTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class AsyncCreateClipsTaskRequestColorWords extends TeaModel {
        /**
         * <p>The content of the animated text.</p>
         * 
         * <strong>example:</strong>
         * <p>花字内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The style of the animated text.</p>
         * 
         * <strong>example:</strong>
         * <p>CS0002-000007
         * 参考：<a href="https://help.aliyun.com/zh/ims/developer-reference/flower-effect-example?spm=a2c4g.11186623.0.0.6ee43d29lo1EWu#88bc5f6046mg2">https://help.aliyun.com/zh/ims/developer-reference/flower-effect-example?spm=a2c4g.11186623.0.0.6ee43d29lo1EWu#88bc5f6046mg2</a></p>
         */
        @NameInMap("EffectColorStyle")
        public String effectColorStyle;

        /**
         * <p>The font size of the animated text.</p>
         * 
         * <strong>example:</strong>
         * <p>默认120</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>The start time of the animated text, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TimelineIn")
        public Integer timelineIn;

        /**
         * <p>The end time of the animated text, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TimelineOut")
        public Integer timelineOut;

        /**
         * <p>The X coordinate of the animated text position.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The Y coordinate of the animated text position.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Y")
        public Float y;

        public static AsyncCreateClipsTaskRequestColorWords build(java.util.Map<String, ?> map) throws Exception {
            AsyncCreateClipsTaskRequestColorWords self = new AsyncCreateClipsTaskRequestColorWords();
            return TeaModel.build(map, self);
        }

        public AsyncCreateClipsTaskRequestColorWords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AsyncCreateClipsTaskRequestColorWords setEffectColorStyle(String effectColorStyle) {
            this.effectColorStyle = effectColorStyle;
            return this;
        }
        public String getEffectColorStyle() {
            return this.effectColorStyle;
        }

        public AsyncCreateClipsTaskRequestColorWords setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public AsyncCreateClipsTaskRequestColorWords setTimelineIn(Integer timelineIn) {
            this.timelineIn = timelineIn;
            return this;
        }
        public Integer getTimelineIn() {
            return this.timelineIn;
        }

        public AsyncCreateClipsTaskRequestColorWords setTimelineOut(Integer timelineOut) {
            this.timelineOut = timelineOut;
            return this;
        }
        public Integer getTimelineOut() {
            return this.timelineOut;
        }

        public AsyncCreateClipsTaskRequestColorWords setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public AsyncCreateClipsTaskRequestColorWords setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class AsyncCreateClipsTaskRequestHighDefSourceVideos extends TeaModel {
        /**
         * <p>The ID of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>00d59b6de13971f0bcd84531949c0102</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        /**
         * <p>The name of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>video001.mp4</p>
         */
        @NameInMap("VideoName")
        public String videoName;

        /**
         * <p>The URL of the video.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://fotor-cn-cutout.oss-cn-shanghai.aliyuncs.com/cutout_tmp/01ba219486f043b4b339e7080e5cf11d.mp4">http://fotor-cn-cutout.oss-cn-shanghai.aliyuncs.com/cutout_tmp/01ba219486f043b4b339e7080e5cf11d.mp4</a></p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static AsyncCreateClipsTaskRequestHighDefSourceVideos build(java.util.Map<String, ?> map) throws Exception {
            AsyncCreateClipsTaskRequestHighDefSourceVideos self = new AsyncCreateClipsTaskRequestHighDefSourceVideos();
            return TeaModel.build(map, self);
        }

        public AsyncCreateClipsTaskRequestHighDefSourceVideos setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public AsyncCreateClipsTaskRequestHighDefSourceVideos setVideoName(String videoName) {
            this.videoName = videoName;
            return this;
        }
        public String getVideoName() {
            return this.videoName;
        }

        public AsyncCreateClipsTaskRequestHighDefSourceVideos setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class AsyncCreateClipsTaskRequestStickers extends TeaModel {
        /**
         * <p>The display duration of the sticker, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The number of dynamic frames in the GIF file.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DyncFrames")
        public Integer dyncFrames;

        /**
         * <p>The height of the sticker.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The start time of the sticker, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TimelineIn")
        public Integer timelineIn;

        /**
         * <p>The public URL of the GIF file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx/xxx.gif">http://xxx/xxx.gif</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The width of the sticker.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Width")
        public Integer width;

        /**
         * <p>The X coordinate of the sticker position.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The Y coordinate of the sticker position.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Y")
        public Float y;

        public static AsyncCreateClipsTaskRequestStickers build(java.util.Map<String, ?> map) throws Exception {
            AsyncCreateClipsTaskRequestStickers self = new AsyncCreateClipsTaskRequestStickers();
            return TeaModel.build(map, self);
        }

        public AsyncCreateClipsTaskRequestStickers setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public AsyncCreateClipsTaskRequestStickers setDyncFrames(Integer dyncFrames) {
            this.dyncFrames = dyncFrames;
            return this;
        }
        public Integer getDyncFrames() {
            return this.dyncFrames;
        }

        public AsyncCreateClipsTaskRequestStickers setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public AsyncCreateClipsTaskRequestStickers setTimelineIn(Integer timelineIn) {
            this.timelineIn = timelineIn;
            return this;
        }
        public Integer getTimelineIn() {
            return this.timelineIn;
        }

        public AsyncCreateClipsTaskRequestStickers setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public AsyncCreateClipsTaskRequestStickers setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public AsyncCreateClipsTaskRequestStickers setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public AsyncCreateClipsTaskRequestStickers setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

}
