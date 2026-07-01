// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobRequest extends TeaModel {
    /**
     * <p>The input for the snapshot job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitSnapshotJobRequestInput input;

    /**
     * <p>The name of the snapshot job.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleJob</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output destination for the snapshot job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitSnapshotJobRequestOutput output;

    /**
     * <p>The scheduling configuration.</p>
     */
    @NameInMap("ScheduleConfig")
    public SubmitSnapshotJobRequestScheduleConfig scheduleConfig;

    /**
     * <p>The snapshot template configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateConfig")
    public SubmitSnapshotJobRequestTemplateConfig templateConfig;

    /**
     * <p>Custom user data, passed as a JSON-formatted string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test parameter&quot;: &quot;test value&quot;}</p>
     */
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
         * <p>The input media asset.</p>
         * <ul>
         * <li><p>If <code>Type</code> is <code>OSS</code>, specify the OSS URL of the input file.</p>
         * </li>
         * <li><p>If <code>Type</code> is <code>Media</code>, specify the ID of the media asset.</p>
         * </li>
         * </ul>
         * <p>The OSS URL must be in one of the following formats:</p>
         * <ol>
         * <li><p><code>oss://bucket/object</code></p>
         * </li>
         * <li><p><code>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</code>
         * <br>In these formats, <code>bucket</code> is the name of an OSS bucket located in the same region as the current project, and <code>object</code> is the file path.<br></p>
         * </li>
         * </ol>
         * <blockquote>
         * <p>The OSS bucket specified in the URL must be added to IMS <a href="https://help.aliyun.com/document_detail/609918.html">storage management</a> before use.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input. Valid values:</p>
         * <ul>
         * <li><p><code>OSS</code>: an OSS file URL.</p>
         * </li>
         * <li><p><code>Media</code>: a media asset ID.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Media</p>
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
         * <p>The output media asset.</p>
         * <ul>
         * <li><p>If <code>Type</code> is <code>OSS</code>, specify the OSS URL for the output file.</p>
         * </li>
         * <li><p>If <code>Type</code> is <code>Media</code>, specify the ID of the output media asset.</p>
         * </li>
         * </ul>
         * <p>The OSS URL must be in one of the following formats:</p>
         * <ol>
         * <li><p><code>oss://bucket/object</code></p>
         * </li>
         * <li><p><code>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</code></p>
         * </li>
         * </ol>
         * <p>In these formats, <code>bucket</code> is the name of an OSS bucket located in the same region as the current project, and <code>object</code> is the file path.</p>
         * <ul>
         * <li><p>When capturing multiple static snapshots, the <code>object</code> must contain the <code>{Count}</code> placeholder.</p>
         * </li>
         * <li><p>When capturing a sprite, the <code>object</code> must contain the <code>{TileCount}</code> placeholder.</p>
         * </li>
         * <li><p>For WebVTT snapshots, the filename in the <code>object</code> path must end with <code>.vtt</code>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The OSS bucket specified in the URL must be added to IMS <a href="https://help.aliyun.com/document_detail/609918.html">storage management</a> before use.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/output-{Count}.jpg</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the output. Valid values:</p>
         * <ul>
         * <li><p><code>OSS</code>: an OSS file URL.</p>
         * </li>
         * <li><p><code>Media</code>: a media asset ID.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
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
        /**
         * <p>The pipeline ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
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
        /**
         * <p>The height of each tile. Default: the height of the output snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
        @NameInMap("CellHeight")
        public Integer cellHeight;

        /**
         * <p>The width of each tile. Default: the width of the output snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("CellWidth")
        public Integer cellWidth;

        /**
         * <p>The background color.</p>
         * 
         * <strong>example:</strong>
         * <p>#000000</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The number of columns in the sprite grid.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Columns")
        public Integer columns;

        /**
         * <p>The number of rows in the sprite grid.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Lines")
        public Integer lines;

        /**
         * <p>The margin around the sprite, in pixels. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Margin")
        public Integer margin;

        /**
         * <p>The padding between tiles, in pixels. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
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
        /**
         * <p>The threshold for detecting and filtering black content in the first frame. This applies only to multi-frame snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("BlackLevel")
        public Integer blackLevel;

        /**
         * <p>The number of snapshots to capture.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The frame type.</p>
         * 
         * <strong>example:</strong>
         * <p>intra</p>
         */
        @NameInMap("FrameType")
        public String frameType;

        /**
         * <p>The output image height.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The interval between snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        public Long interval;

        /**
         * <p>Specifies whether to stitch snapshots into a single sprite. This applies only to WebVTT snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSptFrag")
        public Boolean isSptFrag;

        /**
         * <p>The threshold for determining whether a pixel is black.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("PixelBlackThreshold")
        public Integer pixelBlackThreshold;

        /**
         * <p>The sprite configuration.</p>
         */
        @NameInMap("SpriteSnapshotConfig")
        public SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig spriteSnapshotConfig;

        /**
         * <p>The start time for capturing snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The snapshot type.</p>
         * 
         * <strong>example:</strong>
         * <p>Sprite</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The output image width.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
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
        /**
         * <p>Parameters used to override settings in the specified template.</p>
         */
        @NameInMap("OverwriteParams")
        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams overwriteParams;

        /**
         * <p>The snapshot template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
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
