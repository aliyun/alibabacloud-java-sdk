// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateTaskGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Day")
    public java.util.List<Integer> day;

    @NameInMap("ExpireAt")
    public String expireAt;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RunnableTimeFrom")
    public String runnableTimeFrom;

    @NameInMap("RunnableTimeTo")
    public String runnableTimeTo;

    @NameInMap("TriggerPeriod")
    public String triggerPeriod;

    @NameInMap("VideoInfo")
    public java.util.List<CreateTaskGroupRequestVideoInfo> videoInfo;

    @NameInMap("VideoMetaUrl")
    public java.util.List<String> videoMetaUrl;

    public static CreateTaskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskGroupRequest self = new CreateTaskGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateTaskGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTaskGroupRequest setDay(java.util.List<Integer> day) {
        this.day = day;
        return this;
    }
    public java.util.List<Integer> getDay() {
        return this.day;
    }

    public CreateTaskGroupRequest setExpireAt(String expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public String getExpireAt() {
        return this.expireAt;
    }

    public CreateTaskGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateTaskGroupRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public CreateTaskGroupRequest setRunnableTimeFrom(String runnableTimeFrom) {
        this.runnableTimeFrom = runnableTimeFrom;
        return this;
    }
    public String getRunnableTimeFrom() {
        return this.runnableTimeFrom;
    }

    public CreateTaskGroupRequest setRunnableTimeTo(String runnableTimeTo) {
        this.runnableTimeTo = runnableTimeTo;
        return this;
    }
    public String getRunnableTimeTo() {
        return this.runnableTimeTo;
    }

    public CreateTaskGroupRequest setTriggerPeriod(String triggerPeriod) {
        this.triggerPeriod = triggerPeriod;
        return this;
    }
    public String getTriggerPeriod() {
        return this.triggerPeriod;
    }

    public CreateTaskGroupRequest setVideoInfo(java.util.List<CreateTaskGroupRequestVideoInfo> videoInfo) {
        this.videoInfo = videoInfo;
        return this;
    }
    public java.util.List<CreateTaskGroupRequestVideoInfo> getVideoInfo() {
        return this.videoInfo;
    }

    public CreateTaskGroupRequest setVideoMetaUrl(java.util.List<String> videoMetaUrl) {
        this.videoMetaUrl = videoMetaUrl;
        return this;
    }
    public java.util.List<String> getVideoMetaUrl() {
        return this.videoMetaUrl;
    }

    public static class CreateTaskGroupRequestVideoInfo extends TeaModel {
        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("VideoMetaUrl")
        public String videoMetaUrl;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static CreateTaskGroupRequestVideoInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskGroupRequestVideoInfo self = new CreateTaskGroupRequestVideoInfo();
            return TeaModel.build(map, self);
        }

        public CreateTaskGroupRequestVideoInfo setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CreateTaskGroupRequestVideoInfo setVideoMetaUrl(String videoMetaUrl) {
            this.videoMetaUrl = videoMetaUrl;
            return this;
        }
        public String getVideoMetaUrl() {
            return this.videoMetaUrl;
        }

        public CreateTaskGroupRequestVideoInfo setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
