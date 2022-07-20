// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaInfoJobRequest extends TeaModel {
    // 任务输入
    @NameInMap("Input")
    public SubmitMediaInfoJobRequestInput input;

    // 任务名字
    @NameInMap("Name")
    public String name;

    // 调度参数
    @NameInMap("ScheduleConfig")
    public SubmitMediaInfoJobRequestScheduleConfig scheduleConfig;

    // 用户数据
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
        // 媒体值：
        //       type 为 OSS 时，为 url, 支持 oss 协议和 http 协议；
        //       type 为 Media 时，为媒资 id。
        @NameInMap("Media")
        public String media;

        // 媒体对象类型 - OSS: oss文件, Media: 媒资 ID
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
        // 管道 id
        @NameInMap("PipelineId")
        public String pipelineId;

        // 任务优先级，取值范围：1~10
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
