// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobRequest extends TeaModel {
    /**
     * <p>The job input.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitDynamicImageJobRequestInput input;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleJob</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The job output.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitDynamicImageJobRequestOutput output;

    /**
     * <p>The scheduling configuration.</p>
     */
    @NameInMap("ScheduleConfig")
    public SubmitDynamicImageJobRequestScheduleConfig scheduleConfig;

    /**
     * <p>The snapshot template configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateConfig")
    public SubmitDynamicImageJobRequestTemplateConfig templateConfig;

    /**
     * <p>The user-defined data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SampleKey&quot;: &quot;SampleValue&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitDynamicImageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicImageJobRequest self = new SubmitDynamicImageJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDynamicImageJobRequest setInput(SubmitDynamicImageJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitDynamicImageJobRequestInput getInput() {
        return this.input;
    }

    public SubmitDynamicImageJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitDynamicImageJobRequest setOutput(SubmitDynamicImageJobRequestOutput output) {
        this.output = output;
        return this;
    }
    public SubmitDynamicImageJobRequestOutput getOutput() {
        return this.output;
    }

    public SubmitDynamicImageJobRequest setScheduleConfig(SubmitDynamicImageJobRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public SubmitDynamicImageJobRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public SubmitDynamicImageJobRequest setTemplateConfig(SubmitDynamicImageJobRequestTemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public SubmitDynamicImageJobRequestTemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public SubmitDynamicImageJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitDynamicImageJobRequestInput extends TeaModel {
        /**
         * <p>The input media resource.</p>
         * <ul>
         * <li><p>If <code>Type</code> is set to <code>OSS</code>, specify the OSS URL of the input file.</p>
         * </li>
         * <li><p>If <code>Type</code> is set to <code>Media</code>, specify the media asset ID.</p>
         * </li>
         * </ul>
         * <p>An OSS URL must be in one of the following formats:</p>
         * <ol>
         * <li><p><code>oss://bucket/object</code></p>
         * </li>
         * <li><p><code>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</code></p>
         * </li>
         * </ol>
         * <p>In these formats, <code>bucket</code> is the name of an OSS bucket in the same region as the current project, and <code>object</code> is the file path.</p>
         * <blockquote>
         * <p>The specified OSS bucket must be registered in IMS <a href="https://help.aliyun.com/document_detail/609918.html">storage management</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the job input. Valid values:</p>
         * <ul>
         * <li><p><code>OSS</code>: An Object Storage Service (OSS) file URL.</p>
         * </li>
         * <li><p><code>Media</code>: A media asset ID.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitDynamicImageJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitDynamicImageJobRequestInput self = new SubmitDynamicImageJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitDynamicImageJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitDynamicImageJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitDynamicImageJobRequestOutput extends TeaModel {
        /**
         * <p>The destination OSS URL for the output file. This parameter is required when <code>Type</code> is set to <code>OSS</code>. The URL must be in one of the following formats:</p>
         * <ul>
         * <li><p><code>oss://bucket/object</code></p>
         * </li>
         * <li><p><code>http(s)://bucket.oss-[regionId].aliyuncs.com/object</code></p>
         * </li>
         * </ul>
         * <p>In these formats, <code>bucket</code> is the name of an OSS bucket in the same region as the current project, and <code>object</code> is the file path.</p>
         * <blockquote>
         * <p>The specified OSS bucket must be registered in IMS <a href="https://help.aliyun.com/document_detail/609918.html">storage management</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the job output. Valid values:</p>
         * <ul>
         * <li><p><code>OSS</code>: The output is an OSS file.</p>
         * </li>
         * <li><p><code>Media</code>: The output is a new media asset.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Media</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitDynamicImageJobRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitDynamicImageJobRequestOutput self = new SubmitDynamicImageJobRequestOutput();
            return TeaModel.build(map, self);
        }

        public SubmitDynamicImageJobRequestOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitDynamicImageJobRequestOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitDynamicImageJobRequestScheduleConfig extends TeaModel {
        /**
         * <p>The pipeline ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the job. Valid range: [1, 10]. A higher value indicates a higher priority. Default value: 6.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static SubmitDynamicImageJobRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitDynamicImageJobRequestScheduleConfig self = new SubmitDynamicImageJobRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitDynamicImageJobRequestScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitDynamicImageJobRequestScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class SubmitDynamicImageJobRequestTemplateConfigOverwriteParamsTimeSpan extends TeaModel {
        /**
         * <p>The duration of the video segment to be processed.</p>
         * <ul>
         * <li><p>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</p>
         * </li>
         * <li><p>Valid range: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01:59:59.999 or 32000.23</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The end time of the video segment to be processed. If this parameter is set, the <code>Duration</code> parameter is ignored.</p>
         * <ul>
         * <li><p>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</p>
         * </li>
         * <li><p>Valid range: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01:59:59.999 or 32000.23</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The start time of the video segment to be processed.</p>
         * <ul>
         * <li><p>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</p>
         * </li>
         * <li><p>Valid range: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01:59:59.999 or 32000.23</p>
         */
        @NameInMap("Seek")
        public String seek;

        public static SubmitDynamicImageJobRequestTemplateConfigOverwriteParamsTimeSpan build(java.util.Map<String, ?> map) throws Exception {
            SubmitDynamicImageJobRequestTemplateConfigOverwriteParamsTimeSpan self = new SubmitDynamicImageJobRequestTemplateConfigOverwriteParamsTimeSpan();
            return TeaModel.build(map, self);
        }

        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParamsTimeSpan setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParamsTimeSpan setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParamsTimeSpan setSeek(String seek) {
            this.seek = seek;
            return this;
        }
        public String getSeek() {
            return this.seek;
        }

    }

    public static class SubmitDynamicImageJobRequestTemplateConfigOverwriteParams extends TeaModel {
        /**
         * <p>The animated image format. Valid values:</p>
         * <ul>
         * <li><p><code>gif</code></p>
         * </li>
         * <li><p><code>webp</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gif</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate. Valid range: [1, 60].</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Fps")
        public Integer fps;

        /**
         * <p>The height of the output animated image. Valid range: [128, 4096].</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>Specifies whether to enable adaptive orientation based on the long and short edges of the video. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enables adaptive orientation.</p>
         * </li>
         * <li><p><strong>false</strong>: Disables adaptive orientation.</p>
         * </li>
         * </ul>
         * <p>Default value: <strong>true</strong>.</p>
         * <blockquote>
         * <p>When enabled, this mode sets the output width to the source video\&quot;s long edge and the output height to its short edge. For a portrait video, its height is treated as the long edge and its width as the short edge.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LongShortMode")
        public Boolean longShortMode;

        /**
         * <p>The scan mode. Valid values:</p>
         * <ul>
         * <li><p><strong>interlaced</strong>: Interlaced scanning.</p>
         * </li>
         * <li><p><strong>progressive</strong>: Progressive scanning. This is the default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>progressive</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <p>Specifies the time range of the video to process for the animated image.</p>
         */
        @NameInMap("TimeSpan")
        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParamsTimeSpan timeSpan;

        /**
         * <p>The width of the output animated image. Valid range: [128, 4096].</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static SubmitDynamicImageJobRequestTemplateConfigOverwriteParams build(java.util.Map<String, ?> map) throws Exception {
            SubmitDynamicImageJobRequestTemplateConfigOverwriteParams self = new SubmitDynamicImageJobRequestTemplateConfigOverwriteParams();
            return TeaModel.build(map, self);
        }

        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParams setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParams setFps(Integer fps) {
            this.fps = fps;
            return this;
        }
        public Integer getFps() {
            return this.fps;
        }

        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParams setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParams setLongShortMode(Boolean longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }
        public Boolean getLongShortMode() {
            return this.longShortMode;
        }

        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParams setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParams setTimeSpan(SubmitDynamicImageJobRequestTemplateConfigOverwriteParamsTimeSpan timeSpan) {
            this.timeSpan = timeSpan;
            return this;
        }
        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParamsTimeSpan getTimeSpan() {
            return this.timeSpan;
        }

        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParams setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class SubmitDynamicImageJobRequestTemplateConfig extends TeaModel {
        /**
         * <p>The overwrite parameters.</p>
         */
        @NameInMap("OverwriteParams")
        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParams overwriteParams;

        /**
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static SubmitDynamicImageJobRequestTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitDynamicImageJobRequestTemplateConfig self = new SubmitDynamicImageJobRequestTemplateConfig();
            return TeaModel.build(map, self);
        }

        public SubmitDynamicImageJobRequestTemplateConfig setOverwriteParams(SubmitDynamicImageJobRequestTemplateConfigOverwriteParams overwriteParams) {
            this.overwriteParams = overwriteParams;
            return this;
        }
        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParams getOverwriteParams() {
            return this.overwriteParams;
        }

        public SubmitDynamicImageJobRequestTemplateConfig setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
