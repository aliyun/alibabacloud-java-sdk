// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobRequest extends TeaModel {
    /**
     * <p>The input of the job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitDynamicImageJobRequestInput input;

    /**
     * <p>The name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleJob</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output of the job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitDynamicImageJobRequestOutput output;

    /**
     * <p>The scheduling settings.</p>
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
         * <p>The input file. If Type is set to OSS, set this parameter to the URL of an OSS object. If Type is set to Media, set this parameter to the ID of a media asset. The URL of an OSS object can be in one of the following formats:</p>
         * <ol>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</li>
         * </ol>
         * <p>In the URL, bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object URL in OSS.</p>
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
         * <p>The output file. The file can be an OSS object or a media asset. The URL of an OSS object can be in one of the following formats:</p>
         * <ul>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[regionId].aliyuncs.com/object</li>
         * </ul>
         * <p>In the URL, bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object URL in OSS.</p>
         * <blockquote>
         * <p> Before you use the OSS bucket in the URL, you must add the bucket on the <a href="https://help.aliyun.com/document_detail/609918.html">Storage Management</a> page of the IMS console.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
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
         * <p>The ID of the MPS queue to which the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority. Valid values: 1 to 10. Default value: 6. A greater value specifies a higher priority.</p>
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
         * <p>The length of the clip.</p>
         * <ul>
         * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
         * <li>Valid values: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01:59:59.999 or 32000.23</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The length of the ending part of the original clip to be cropped out. If you specify this parameter, the Duration parameter becomes invalid.</p>
         * <ul>
         * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
         * <li>Valid values: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01:59:59.999 or 32000.23</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The start point of the clip.</p>
         * <ul>
         * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
         * <li>Valid values: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</li>
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
         * <p>The format of the animated image. Valid values:</p>
         * <ul>
         * <li><strong>gif</strong></li>
         * <li><strong>webp</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gif</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate. Valid values: [1,60].</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Fps")
        public Integer fps;

        /**
         * <p>The height of the animated image. Valid values: [128,4096].</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>Specifies whether to enable the auto-rotate screen feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>Default value: <strong>true</strong>.</p>
         * <blockquote>
         * <p> If this feature is enabled, the width of the output video corresponds to the long side of the input video, which is the height of the input video in portrait mode. The height of the output video corresponds to the short side of the input video, which is the width of the input video in portrait mode.</p>
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
         * <li><strong>interlaced</strong></li>
         * <li><strong>progressive</strong> This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>progressive</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <p>The timeline parameters.</p>
         */
        @NameInMap("TimeSpan")
        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParamsTimeSpan timeSpan;

        /**
         * <p>The width of the animated image. Valid values: [128,4096].</p>
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
         * <p>The parameters that are used to overwrite the corresponding parameters.</p>
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
