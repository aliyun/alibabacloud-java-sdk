// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitDynamicImageJobRequestInput input;

    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitDynamicImageJobRequestOutput output;

    @NameInMap("ScheduleConfig")
    public SubmitDynamicImageJobRequestScheduleConfig scheduleConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateConfig")
    public SubmitDynamicImageJobRequestTemplateConfig templateConfig;

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
         * <p>This parameter is required.</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>This parameter is required.</p>
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
        @NameInMap("PipelineId")
        public String pipelineId;

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
        @NameInMap("Duration")
        public String duration;

        @NameInMap("End")
        public String end;

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
        @NameInMap("Format")
        public String format;

        @NameInMap("Fps")
        public Integer fps;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("LongShortMode")
        public Boolean longShortMode;

        @NameInMap("ScanMode")
        public String scanMode;

        @NameInMap("TimeSpan")
        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParamsTimeSpan timeSpan;

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
        @NameInMap("OverwriteParams")
        public SubmitDynamicImageJobRequestTemplateConfigOverwriteParams overwriteParams;

        /**
         * <p>This parameter is required.</p>
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
