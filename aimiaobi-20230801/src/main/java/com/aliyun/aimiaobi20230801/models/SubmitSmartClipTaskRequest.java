// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitSmartClipTaskRequest extends TeaModel {
    @NameInMap("EditingConfig")
    public SubmitSmartClipTaskRequestEditingConfig editingConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputConfig")
    public SubmitSmartClipTaskRequestInputConfig inputConfig;

    @NameInMap("OutputConfig")
    public SubmitSmartClipTaskRequestOutputConfig outputConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitSmartClipTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmartClipTaskRequest self = new SubmitSmartClipTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmartClipTaskRequest setEditingConfig(SubmitSmartClipTaskRequestEditingConfig editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public SubmitSmartClipTaskRequestEditingConfig getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitSmartClipTaskRequest setInputConfig(SubmitSmartClipTaskRequestInputConfig inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public SubmitSmartClipTaskRequestInputConfig getInputConfig() {
        return this.inputConfig;
    }

    public SubmitSmartClipTaskRequest setOutputConfig(SubmitSmartClipTaskRequestOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public SubmitSmartClipTaskRequestOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitSmartClipTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SubmitSmartClipTaskRequestEditingConfigTitleConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TopLeft</p>
         */
        @NameInMap("Alignment")
        public String alignment;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TimelineIn")
        public Float timelineIn;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TimelineOut")
        public Float timelineOut;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Y")
        public Float y;

        public static SubmitSmartClipTaskRequestEditingConfigTitleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestEditingConfigTitleConfig self = new SubmitSmartClipTaskRequestEditingConfigTitleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestEditingConfigTitleConfig setAlignment(String alignment) {
            this.alignment = alignment;
            return this;
        }
        public String getAlignment() {
            return this.alignment;
        }

        public SubmitSmartClipTaskRequestEditingConfigTitleConfig setTimelineIn(Float timelineIn) {
            this.timelineIn = timelineIn;
            return this;
        }
        public Float getTimelineIn() {
            return this.timelineIn;
        }

        public SubmitSmartClipTaskRequestEditingConfigTitleConfig setTimelineOut(Float timelineOut) {
            this.timelineOut = timelineOut;
            return this;
        }
        public Float getTimelineOut() {
            return this.timelineOut;
        }

        public SubmitSmartClipTaskRequestEditingConfigTitleConfig setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public SubmitSmartClipTaskRequestEditingConfigTitleConfig setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class SubmitSmartClipTaskRequestEditingConfig extends TeaModel {
        @NameInMap("TitleConfig")
        public SubmitSmartClipTaskRequestEditingConfigTitleConfig titleConfig;

        public static SubmitSmartClipTaskRequestEditingConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestEditingConfig self = new SubmitSmartClipTaskRequestEditingConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestEditingConfig setTitleConfig(SubmitSmartClipTaskRequestEditingConfigTitleConfig titleConfig) {
            this.titleConfig = titleConfig;
            return this;
        }
        public SubmitSmartClipTaskRequestEditingConfigTitleConfig getTitleConfig() {
            return this.titleConfig;
        }

    }

    public static class SubmitSmartClipTaskRequestInputConfigBackgroundMusics extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://default/bucket-name/filepath/video.mp3</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fileKey</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitSmartClipTaskRequestInputConfigBackgroundMusics build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestInputConfigBackgroundMusics self = new SubmitSmartClipTaskRequestInputConfigBackgroundMusics();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestInputConfigBackgroundMusics setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitSmartClipTaskRequestInputConfigBackgroundMusics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitSmartClipTaskRequestInputConfigStickersStickerId extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://default/bucket-name/filepath/sticker.png</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fileKey</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitSmartClipTaskRequestInputConfigStickersStickerId build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestInputConfigStickersStickerId self = new SubmitSmartClipTaskRequestInputConfigStickersStickerId();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestInputConfigStickersStickerId setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitSmartClipTaskRequestInputConfigStickersStickerId setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitSmartClipTaskRequestInputConfigStickers extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("StickerId")
        public SubmitSmartClipTaskRequestInputConfigStickersStickerId stickerId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Y")
        public Double y;

        public static SubmitSmartClipTaskRequestInputConfigStickers build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestInputConfigStickers self = new SubmitSmartClipTaskRequestInputConfigStickers();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestInputConfigStickers setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public SubmitSmartClipTaskRequestInputConfigStickers setStickerId(SubmitSmartClipTaskRequestInputConfigStickersStickerId stickerId) {
            this.stickerId = stickerId;
            return this;
        }
        public SubmitSmartClipTaskRequestInputConfigStickersStickerId getStickerId() {
            return this.stickerId;
        }

        public SubmitSmartClipTaskRequestInputConfigStickers setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public SubmitSmartClipTaskRequestInputConfigStickers setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public SubmitSmartClipTaskRequestInputConfigStickers setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class SubmitSmartClipTaskRequestInputConfigVideoIds extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://default/bucket-name/filepath/video.mp4</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fileKey</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitSmartClipTaskRequestInputConfigVideoIds build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestInputConfigVideoIds self = new SubmitSmartClipTaskRequestInputConfigVideoIds();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestInputConfigVideoIds setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitSmartClipTaskRequestInputConfigVideoIds setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitSmartClipTaskRequestInputConfig extends TeaModel {
        @NameInMap("BackgroundMusics")
        public java.util.List<SubmitSmartClipTaskRequestInputConfigBackgroundMusics> backgroundMusics;

        @NameInMap("SpeechTexts")
        public java.util.List<String> speechTexts;

        @NameInMap("Stickers")
        public java.util.List<SubmitSmartClipTaskRequestInputConfigStickers> stickers;

        @NameInMap("Titles")
        public java.util.List<String> titles;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("VideoIds")
        public java.util.List<SubmitSmartClipTaskRequestInputConfigVideoIds> videoIds;

        public static SubmitSmartClipTaskRequestInputConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestInputConfig self = new SubmitSmartClipTaskRequestInputConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestInputConfig setBackgroundMusics(java.util.List<SubmitSmartClipTaskRequestInputConfigBackgroundMusics> backgroundMusics) {
            this.backgroundMusics = backgroundMusics;
            return this;
        }
        public java.util.List<SubmitSmartClipTaskRequestInputConfigBackgroundMusics> getBackgroundMusics() {
            return this.backgroundMusics;
        }

        public SubmitSmartClipTaskRequestInputConfig setSpeechTexts(java.util.List<String> speechTexts) {
            this.speechTexts = speechTexts;
            return this;
        }
        public java.util.List<String> getSpeechTexts() {
            return this.speechTexts;
        }

        public SubmitSmartClipTaskRequestInputConfig setStickers(java.util.List<SubmitSmartClipTaskRequestInputConfigStickers> stickers) {
            this.stickers = stickers;
            return this;
        }
        public java.util.List<SubmitSmartClipTaskRequestInputConfigStickers> getStickers() {
            return this.stickers;
        }

        public SubmitSmartClipTaskRequestInputConfig setTitles(java.util.List<String> titles) {
            this.titles = titles;
            return this;
        }
        public java.util.List<String> getTitles() {
            return this.titles;
        }

        public SubmitSmartClipTaskRequestInputConfig setVideoIds(java.util.List<SubmitSmartClipTaskRequestInputConfigVideoIds> videoIds) {
            this.videoIds = videoIds;
            return this;
        }
        public java.util.List<SubmitSmartClipTaskRequestInputConfigVideoIds> getVideoIds() {
            return this.videoIds;
        }

    }

    public static class SubmitSmartClipTaskRequestOutputConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>test_{index}.mp4</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("MaxDuration")
        public Integer maxDuration;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SaveToGeneratedContent")
        public Boolean saveToGeneratedContent;

        /**
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static SubmitSmartClipTaskRequestOutputConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartClipTaskRequestOutputConfig self = new SubmitSmartClipTaskRequestOutputConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSmartClipTaskRequestOutputConfig setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public SubmitSmartClipTaskRequestOutputConfig setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SubmitSmartClipTaskRequestOutputConfig setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SubmitSmartClipTaskRequestOutputConfig setMaxDuration(Integer maxDuration) {
            this.maxDuration = maxDuration;
            return this;
        }
        public Integer getMaxDuration() {
            return this.maxDuration;
        }

        public SubmitSmartClipTaskRequestOutputConfig setSaveToGeneratedContent(Boolean saveToGeneratedContent) {
            this.saveToGeneratedContent = saveToGeneratedContent;
            return this;
        }
        public Boolean getSaveToGeneratedContent() {
            return this.saveToGeneratedContent;
        }

        public SubmitSmartClipTaskRequestOutputConfig setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
