// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncCreateClipsTaskRequest extends TeaModel {
    @NameInMap("ColorWords")
    public java.util.List<AsyncCreateClipsTaskRequestColorWords> colorWords;

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

    public AsyncCreateClipsTaskRequest setColorWords(java.util.List<AsyncCreateClipsTaskRequestColorWords> colorWords) {
        this.colorWords = colorWords;
        return this;
    }
    public java.util.List<AsyncCreateClipsTaskRequestColorWords> getColorWords() {
        return this.colorWords;
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

}
