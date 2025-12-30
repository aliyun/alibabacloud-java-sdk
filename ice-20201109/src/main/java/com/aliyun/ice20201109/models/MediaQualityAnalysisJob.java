// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaQualityAnalysisJob extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("FinishTime")
    public String finishTime;

    @NameInMap("Input")
    public MediaQualityAnalysisJobInput input;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ScheduleConfig")
    public MediaQualityAnalysisJobScheduleConfig scheduleConfig;

    @NameInMap("State")
    public String state;

    @NameInMap("TemplateConfig")
    public MediaQualityAnalysisJobTemplateConfig templateConfig;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("VqaResult")
    public MediaQualityAnalysisJobVqaResult vqaResult;

    public static MediaQualityAnalysisJob build(java.util.Map<String, ?> map) throws Exception {
        MediaQualityAnalysisJob self = new MediaQualityAnalysisJob();
        return TeaModel.build(map, self);
    }

    public MediaQualityAnalysisJob setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public MediaQualityAnalysisJob setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public MediaQualityAnalysisJob setInput(MediaQualityAnalysisJobInput input) {
        this.input = input;
        return this;
    }
    public MediaQualityAnalysisJobInput getInput() {
        return this.input;
    }

    public MediaQualityAnalysisJob setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public MediaQualityAnalysisJob setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MediaQualityAnalysisJob setScheduleConfig(MediaQualityAnalysisJobScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public MediaQualityAnalysisJobScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public MediaQualityAnalysisJob setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public MediaQualityAnalysisJob setTemplateConfig(MediaQualityAnalysisJobTemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public MediaQualityAnalysisJobTemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public MediaQualityAnalysisJob setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public MediaQualityAnalysisJob setVqaResult(MediaQualityAnalysisJobVqaResult vqaResult) {
        this.vqaResult = vqaResult;
        return this;
    }
    public MediaQualityAnalysisJobVqaResult getVqaResult() {
        return this.vqaResult;
    }

    public static class MediaQualityAnalysisJobInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static MediaQualityAnalysisJobInput build(java.util.Map<String, ?> map) throws Exception {
            MediaQualityAnalysisJobInput self = new MediaQualityAnalysisJobInput();
            return TeaModel.build(map, self);
        }

        public MediaQualityAnalysisJobInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public MediaQualityAnalysisJobInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MediaQualityAnalysisJobScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Priority")
        public Integer priority;

        public static MediaQualityAnalysisJobScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            MediaQualityAnalysisJobScheduleConfig self = new MediaQualityAnalysisJobScheduleConfig();
            return TeaModel.build(map, self);
        }

        public MediaQualityAnalysisJobScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public MediaQualityAnalysisJobScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class MediaQualityAnalysisJobTemplateConfig extends TeaModel {
        @NameInMap("TemplateId")
        public String templateId;

        public static MediaQualityAnalysisJobTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            MediaQualityAnalysisJobTemplateConfig self = new MediaQualityAnalysisJobTemplateConfig();
            return TeaModel.build(map, self);
        }

        public MediaQualityAnalysisJobTemplateConfig setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
