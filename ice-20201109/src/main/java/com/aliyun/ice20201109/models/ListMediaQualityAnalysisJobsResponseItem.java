// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaQualityAnalysisJobsResponseItem extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("FinishTime")
    public String finishTime;

    @NameInMap("Input")
    public ListMediaQualityAnalysisJobsResponseItemInput input;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ScheduleConfig")
    public ListMediaQualityAnalysisJobsResponseItemScheduleConfig scheduleConfig;

    @NameInMap("State")
    public String state;

    @NameInMap("TemplateConfig")
    public ListMediaQualityAnalysisJobsResponseItemTemplateConfig templateConfig;

    @NameInMap("UserData")
    public String userData;

    public static ListMediaQualityAnalysisJobsResponseItem build(java.util.Map<String, ?> map) throws Exception {
        ListMediaQualityAnalysisJobsResponseItem self = new ListMediaQualityAnalysisJobsResponseItem();
        return TeaModel.build(map, self);
    }

    public ListMediaQualityAnalysisJobsResponseItem setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ListMediaQualityAnalysisJobsResponseItem setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public ListMediaQualityAnalysisJobsResponseItem setInput(ListMediaQualityAnalysisJobsResponseItemInput input) {
        this.input = input;
        return this;
    }
    public ListMediaQualityAnalysisJobsResponseItemInput getInput() {
        return this.input;
    }

    public ListMediaQualityAnalysisJobsResponseItem setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListMediaQualityAnalysisJobsResponseItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMediaQualityAnalysisJobsResponseItem setScheduleConfig(ListMediaQualityAnalysisJobsResponseItemScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public ListMediaQualityAnalysisJobsResponseItemScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public ListMediaQualityAnalysisJobsResponseItem setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListMediaQualityAnalysisJobsResponseItem setTemplateConfig(ListMediaQualityAnalysisJobsResponseItemTemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public ListMediaQualityAnalysisJobsResponseItemTemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public ListMediaQualityAnalysisJobsResponseItem setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class ListMediaQualityAnalysisJobsResponseItemInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static ListMediaQualityAnalysisJobsResponseItemInput build(java.util.Map<String, ?> map) throws Exception {
            ListMediaQualityAnalysisJobsResponseItemInput self = new ListMediaQualityAnalysisJobsResponseItemInput();
            return TeaModel.build(map, self);
        }

        public ListMediaQualityAnalysisJobsResponseItemInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListMediaQualityAnalysisJobsResponseItemInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMediaQualityAnalysisJobsResponseItemScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Priority")
        public Integer priority;

        public static ListMediaQualityAnalysisJobsResponseItemScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMediaQualityAnalysisJobsResponseItemScheduleConfig self = new ListMediaQualityAnalysisJobsResponseItemScheduleConfig();
            return TeaModel.build(map, self);
        }

        public ListMediaQualityAnalysisJobsResponseItemScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListMediaQualityAnalysisJobsResponseItemScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class ListMediaQualityAnalysisJobsResponseItemTemplateConfig extends TeaModel {
        @NameInMap("TemplateId")
        public String templateId;

        public static ListMediaQualityAnalysisJobsResponseItemTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMediaQualityAnalysisJobsResponseItemTemplateConfig self = new ListMediaQualityAnalysisJobsResponseItemTemplateConfig();
            return TeaModel.build(map, self);
        }

        public ListMediaQualityAnalysisJobsResponseItemTemplateConfig setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
