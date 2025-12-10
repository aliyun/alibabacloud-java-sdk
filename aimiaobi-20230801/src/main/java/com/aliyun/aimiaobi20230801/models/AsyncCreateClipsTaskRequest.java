// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncCreateClipsTaskRequest extends TeaModel {
    @NameInMap("CloseMusic")
    public Boolean closeMusic;

    @NameInMap("CloseSubtitle")
    public Boolean closeSubtitle;

    @NameInMap("CloseVoice")
    public Boolean closeVoice;

    @NameInMap("ColorWords")
    public java.util.List<AsyncCreateClipsTaskRequestColorWords> colorWords;

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
    public java.util.List<AsyncCreateClipsTaskRequestStickers> stickers;

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

    public static AsyncCreateClipsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncCreateClipsTaskRequest self = new AsyncCreateClipsTaskRequest();
        return TeaModel.build(map, self);
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

    public AsyncCreateClipsTaskRequest setColorWords(java.util.List<AsyncCreateClipsTaskRequestColorWords> colorWords) {
        this.colorWords = colorWords;
        return this;
    }
    public java.util.List<AsyncCreateClipsTaskRequestColorWords> getColorWords() {
        return this.colorWords;
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
        @NameInMap("Content")
        public String content;

        @NameInMap("EffectColorStyle")
        public String effectColorStyle;

        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TimelineIn")
        public Integer timelineIn;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TimelineOut")
        public Integer timelineOut;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Float x;

        /**
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

    public static class AsyncCreateClipsTaskRequestStickers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DyncFrames")
        public Integer dyncFrames;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TimelineIn")
        public Integer timelineIn;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx/xxx.gif">http://xxx/xxx.gif</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Width")
        public Integer width;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("X")
        public Float x;

        /**
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
