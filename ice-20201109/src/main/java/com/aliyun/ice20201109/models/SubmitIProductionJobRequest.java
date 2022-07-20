// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobRequest extends TeaModel {
    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("Input")
    public SubmitIProductionJobRequestInput input;

    @NameInMap("JobParams")
    public String jobParams;

    @NameInMap("Name")
    public String name;

    @NameInMap("Output")
    public SubmitIProductionJobRequestOutput output;

    @NameInMap("ScheduleConfig")
    public SubmitIProductionJobRequestScheduleConfig scheduleConfig;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("UserData")
    public String userData;

    public static SubmitIProductionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIProductionJobRequest self = new SubmitIProductionJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIProductionJobRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public SubmitIProductionJobRequest setInput(SubmitIProductionJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitIProductionJobRequestInput getInput() {
        return this.input;
    }

    public SubmitIProductionJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitIProductionJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitIProductionJobRequest setOutput(SubmitIProductionJobRequestOutput output) {
        this.output = output;
        return this;
    }
    public SubmitIProductionJobRequestOutput getOutput() {
        return this.output;
    }

    public SubmitIProductionJobRequest setScheduleConfig(SubmitIProductionJobRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public SubmitIProductionJobRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public SubmitIProductionJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitIProductionJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitIProductionJobRequestInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static SubmitIProductionJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitIProductionJobRequestInput self = new SubmitIProductionJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitIProductionJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitIProductionJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitIProductionJobRequestOutput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static SubmitIProductionJobRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitIProductionJobRequestOutput self = new SubmitIProductionJobRequestOutput();
            return TeaModel.build(map, self);
        }

        public SubmitIProductionJobRequestOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitIProductionJobRequestOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitIProductionJobRequestScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Priority")
        public Integer priority;

        public static SubmitIProductionJobRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitIProductionJobRequestScheduleConfig self = new SubmitIProductionJobRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitIProductionJobRequestScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitIProductionJobRequestScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
