// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitSnapshotJobRequestInput input;

    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitSnapshotJobRequestOutput output;

    @NameInMap("ScheduleConfig")
    public SubmitSnapshotJobRequestScheduleConfig scheduleConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateConfig")
    public SubmitSnapshotJobRequestTemplateConfig templateConfig;

    @NameInMap("UserData")
    public String userData;

    public static SubmitSnapshotJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSnapshotJobRequest self = new SubmitSnapshotJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSnapshotJobRequest setInput(SubmitSnapshotJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitSnapshotJobRequestInput getInput() {
        return this.input;
    }

    public SubmitSnapshotJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitSnapshotJobRequest setOutput(SubmitSnapshotJobRequestOutput output) {
        this.output = output;
        return this;
    }
    public SubmitSnapshotJobRequestOutput getOutput() {
        return this.output;
    }

    public SubmitSnapshotJobRequest setScheduleConfig(SubmitSnapshotJobRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public SubmitSnapshotJobRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public SubmitSnapshotJobRequest setTemplateConfig(SubmitSnapshotJobRequestTemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public SubmitSnapshotJobRequestTemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public SubmitSnapshotJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitSnapshotJobRequestInput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitSnapshotJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobRequestInput self = new SubmitSnapshotJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitSnapshotJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitSnapshotJobRequestOutput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitSnapshotJobRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobRequestOutput self = new SubmitSnapshotJobRequestOutput();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobRequestOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitSnapshotJobRequestOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitSnapshotJobRequestScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        public String pipelineId;

        public static SubmitSnapshotJobRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobRequestScheduleConfig self = new SubmitSnapshotJobRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobRequestScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

    }

    public static class SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig extends TeaModel {
        @NameInMap("CellHeight")
        public Integer cellHeight;

        @NameInMap("CellWidth")
        public Integer cellWidth;

        @NameInMap("Color")
        public String color;

        @NameInMap("Columns")
        public Integer columns;

        @NameInMap("Lines")
        public Integer lines;

        @NameInMap("Margin")
        public Integer margin;

        @NameInMap("Padding")
        public Integer padding;

        public static SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig self = new SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig setCellHeight(Integer cellHeight) {
            this.cellHeight = cellHeight;
            return this;
        }
        public Integer getCellHeight() {
            return this.cellHeight;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig setCellWidth(Integer cellWidth) {
            this.cellWidth = cellWidth;
            return this;
        }
        public Integer getCellWidth() {
            return this.cellWidth;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig setColumns(Integer columns) {
            this.columns = columns;
            return this;
        }
        public Integer getColumns() {
            return this.columns;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig setLines(Integer lines) {
            this.lines = lines;
            return this;
        }
        public Integer getLines() {
            return this.lines;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig setMargin(Integer margin) {
            this.margin = margin;
            return this;
        }
        public Integer getMargin() {
            return this.margin;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig setPadding(Integer padding) {
            this.padding = padding;
            return this;
        }
        public Integer getPadding() {
            return this.padding;
        }

    }

    public static class SubmitSnapshotJobRequestTemplateConfigOverwriteParams extends TeaModel {
        @NameInMap("BlackLevel")
        public Integer blackLevel;

        @NameInMap("Count")
        public Long count;

        @NameInMap("FrameType")
        public String frameType;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Interval")
        public Long interval;

        @NameInMap("IsSptFrag")
        public Boolean isSptFrag;

        @NameInMap("PixelBlackThreshold")
        public Integer pixelBlackThreshold;

        @NameInMap("SpriteSnapshotConfig")
        public SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig spriteSnapshotConfig;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Type")
        public String type;

        @NameInMap("Width")
        public Integer width;

        public static SubmitSnapshotJobRequestTemplateConfigOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobRequestTemplateConfigOverwriteParams self = new SubmitSnapshotJobRequestTemplateConfigOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams setBlackLevel(Integer blackLevel) {
            this.blackLevel = blackLevel;
            return this;
        }
        public Integer getBlackLevel() {
            return this.blackLevel;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams setFrameType(String frameType) {
            this.frameType = frameType;
            return this;
        }
        public String getFrameType() {
            return this.frameType;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams setIsSptFrag(Boolean isSptFrag) {
            this.isSptFrag = isSptFrag;
            return this;
        }
        public Boolean getIsSptFrag() {
            return this.isSptFrag;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams setPixelBlackThreshold(Integer pixelBlackThreshold) {
            this.pixelBlackThreshold = pixelBlackThreshold;
            return this;
        }
        public Integer getPixelBlackThreshold() {
            return this.pixelBlackThreshold;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams setSpriteSnapshotConfig(SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig spriteSnapshotConfig) {
            this.spriteSnapshotConfig = spriteSnapshotConfig;
            return this;
        }
        public SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig getSpriteSnapshotConfig() {
            return this.spriteSnapshotConfig;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class SubmitSnapshotJobRequestTemplateConfig extends TeaModel {
        @NameInMap("OverwriteParams")
        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams overwriteParams;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitSnapshotJobRequestTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSnapshotJobRequestTemplateConfig self = new SubmitSnapshotJobRequestTemplateConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSnapshotJobRequestTemplateConfig setOverwriteParams(SubmitSnapshotJobRequestTemplateConfigOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitSnapshotJobRequestTemplateConfig setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
