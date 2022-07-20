// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSyncMediaInfoJobRequest extends TeaModel {
    // 任务输入
    @NameInMap("Input")
    public SubmitSyncMediaInfoJobRequestInput input;

    // 任务名字
    @NameInMap("Name")
    public String name;

    // 调度参数
    @NameInMap("ScheduleConfig")
    public SubmitSyncMediaInfoJobRequestScheduleConfig scheduleConfig;

    // 用户数据
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
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
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
        // 管道 id
        @NameInMap("PipelineId")
        public String pipelineId;

        // 任务优先级，取值范围：1~10
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
