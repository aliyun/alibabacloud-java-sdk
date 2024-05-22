// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSyncMediaInfoJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitSyncMediaInfoJobRequestInput input;

    @NameInMap("Name")
    public String name;

    @NameInMap("ScheduleConfig")
    public SubmitSyncMediaInfoJobRequestScheduleConfig scheduleConfig;

    @NameInMap("UserData")
    public String userData;

    public static SubmitSyncMediaInfoJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSyncMediaInfoJobRequest self = new SubmitSyncMediaInfoJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSyncMediaInfoJobRequest setInput(SubmitSyncMediaInfoJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitSyncMediaInfoJobRequestInput getInput() {
        return this.input;
    }

    public SubmitSyncMediaInfoJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitSyncMediaInfoJobRequest setScheduleConfig(SubmitSyncMediaInfoJobRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public SubmitSyncMediaInfoJobRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public SubmitSyncMediaInfoJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitSyncMediaInfoJobRequestInput extends TeaModel {
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

        public static SubmitSyncMediaInfoJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitSyncMediaInfoJobRequestInput self = new SubmitSyncMediaInfoJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitSyncMediaInfoJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitSyncMediaInfoJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitSyncMediaInfoJobRequestScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Priority")
        public Integer priority;

        public static SubmitSyncMediaInfoJobRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSyncMediaInfoJobRequestScheduleConfig self = new SubmitSyncMediaInfoJobRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSyncMediaInfoJobRequestScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitSyncMediaInfoJobRequestScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
