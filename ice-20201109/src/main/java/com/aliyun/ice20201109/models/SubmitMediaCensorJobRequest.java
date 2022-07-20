// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaCensorJobRequest extends TeaModel {
    @NameInMap("Barrages")
    public String barrages;

    @NameInMap("CoverImages")
    public String coverImages;

    @NameInMap("Description")
    public String description;

    @NameInMap("Input")
    public SubmitMediaCensorJobRequestInput input;

    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("Output")
    public String output;

    @NameInMap("ScheduleConfig")
    public SubmitMediaCensorJobRequestScheduleConfig scheduleConfig;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserData")
    public String userData;

    public static SubmitMediaCensorJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaCensorJobRequest self = new SubmitMediaCensorJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaCensorJobRequest setBarrages(String barrages) {
        this.barrages = barrages;
        return this;
    }
    public String getBarrages() {
        return this.barrages;
    }

    public SubmitMediaCensorJobRequest setCoverImages(String coverImages) {
        this.coverImages = coverImages;
        return this;
    }
    public String getCoverImages() {
        return this.coverImages;
    }

    public SubmitMediaCensorJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitMediaCensorJobRequest setInput(SubmitMediaCensorJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitMediaCensorJobRequestInput getInput() {
        return this.input;
    }

    public SubmitMediaCensorJobRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SubmitMediaCensorJobRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitMediaCensorJobRequest setScheduleConfig(SubmitMediaCensorJobRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public SubmitMediaCensorJobRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public SubmitMediaCensorJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitMediaCensorJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitMediaCensorJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitMediaCensorJobRequestInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static SubmitMediaCensorJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaCensorJobRequestInput self = new SubmitMediaCensorJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitMediaCensorJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitMediaCensorJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitMediaCensorJobRequestScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Priority")
        public Integer priority;

        public static SubmitMediaCensorJobRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaCensorJobRequestScheduleConfig self = new SubmitMediaCensorJobRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitMediaCensorJobRequestScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitMediaCensorJobRequestScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
