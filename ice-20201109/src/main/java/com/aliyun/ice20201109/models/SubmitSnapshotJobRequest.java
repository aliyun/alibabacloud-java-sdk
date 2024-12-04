// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobRequest extends TeaModel {
    /**
     * <p>The snapshot input.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitSnapshotJobRequestInput input;

    /**
     * <p>The name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleJob</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The snapshot output.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitSnapshotJobRequestOutput output;

    /**
     * <p>The scheduling settings.</p>
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
     * <p>The user-defined data.</p>
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
         * <p>The input file. If Type is set to OSS, the URL of an OSS object is returned. If Type is set to Media, the ID of a media asset is returned. The URL of an OSS object can be in one of the following formats:</p>
         * <ol>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object In the URL, bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object URL in OSS.</li>
         * </ol>
         * <blockquote>
         * <p> Before you use the OSS bucket in the URL, you must add the bucket on the <a href="https://help.aliyun.com/document_detail/609918.html">Storage Management</a> page of the Intelligent Media Services (IMS) console.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input file. Valid values:</p>
         * <ol>
         * <li>OSS: an Object Storage Service (OSS) object.</li>
         * <li>Media: a media asset.</li>
         * </ol>
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
         * <p>The output file. If Type is set to OSS, the URL of an OSS object is returned. If Type is set to Media, the ID of a media asset is returned. The URL of an OSS object can be in one of the following formats:</p>
         * <ol>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</li>
         * </ol>
         * <p>In the URL, bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object URL in OSS. If multiple static snapshots were captured, the object must contain the &quot;{Count}&quot; placeholder. In the case of a sprite, the object must contain the &quot;{TileCount}&quot; placeholder. The suffix of the WebVTT snapshot objects must be &quot;.vtt&quot;.</p>
         * <blockquote>
         * <p> Before you use the OSS bucket in the URL, you must add the bucket on the <a href="https://help.aliyun.com/document_detail/609918.html">Storage Management</a> page of the IMS console.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/output-{Count}.jpg</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the output file. Valid values:</p>
         * <ol>
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
         * </ol>
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
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue that is used to run the job.</p>
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
         * <p>The height of a single snapshot before tiling. The default value is the height of the output snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
        @NameInMap("CellHeight")
        public Integer cellHeight;

        /**
         * <p>The width of a single snapshot before tiling. The default value is the width of the output snapshot.</p>
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
         * <p>The number of columns that the image sprite contains.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Columns")
        public Integer columns;

        /**
         * <p>The number of rows that the image sprite contains.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Lines")
        public Integer lines;

        /**
         * <p>The width of the frame. Default value: 0. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Margin")
        public Integer margin;

        /**
         * <p>The spacing between two adjacent snapshots. Default value: 0. Unit: pixels.</p>
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
         * <p>The threshold that is used to filter out black frames for the first snapshot to be captured. This feature is available if you request the system to capture multiple snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("BlackLevel")
        public Integer blackLevel;

        /**
         * <p>The number of snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The type of the frame.</p>
         * 
         * <strong>example:</strong>
         * <p>intra</p>
         */
        @NameInMap("FrameType")
        public String frameType;

        /**
         * <p>The height of a captured snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The interval at which snapshots are captured.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Interval")
        public Long interval;

        /**
         * <p>The WebVTT snapshot configuration that specifies whether to merge the output snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSptFrag")
        public Boolean isSptFrag;

        /**
         * <p>The color value threshold that determines whether a pixel is black.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("PixelBlackThreshold")
        public Integer pixelBlackThreshold;

        /**
         * <p>The configuration of the sprite snapshot.</p>
         */
        @NameInMap("SpriteSnapshotConfig")
        public SubmitSnapshotJobRequestTemplateConfigOverwriteParamsSpriteSnapshotConfig spriteSnapshotConfig;

        /**
         * <p>The point in time at which the system starts to capture snapshots in the input video.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The snapshot type. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Sprite</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The width of a captured snapshot.</p>
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
         * <p>The parameters that are used to overwrite the corresponding parameters.</p>
         */
        @NameInMap("OverwriteParams")
        public SubmitSnapshotJobRequestTemplateConfigOverwriteParams overwriteParams;

        /**
         * <p>The template ID.</p>
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
