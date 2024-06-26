// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaInfoJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitMediaInfoJobRequestInput input;

    /**
     * <strong>example:</strong>
     * <p>job-name</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("ScheduleConfig")
    public SubmitMediaInfoJobRequestScheduleConfig scheduleConfig;

    /**
     * <strong>example:</strong>
     * <p>user-data</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitMediaInfoJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaInfoJobRequest self = new SubmitMediaInfoJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaInfoJobRequest setInput(SubmitMediaInfoJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitMediaInfoJobRequestInput getInput() {
        return this.input;
    }

    public SubmitMediaInfoJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitMediaInfoJobRequest setScheduleConfig(SubmitMediaInfoJobRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public SubmitMediaInfoJobRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public SubmitMediaInfoJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitMediaInfoJobRequestInput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitMediaInfoJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobRequestInput self = new SubmitMediaInfoJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitMediaInfoJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitMediaInfoJobRequestScheduleConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>e37ebee5d98b4781897f6086e89f9c56</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static SubmitMediaInfoJobRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobRequestScheduleConfig self = new SubmitMediaInfoJobRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobRequestScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitMediaInfoJobRequestScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
