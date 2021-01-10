// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateTaskGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

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

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Day")
    public java.util.List<Integer> day;

    @NameInMap("VideoUrl")
    public java.util.List<String> videoUrl;

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

    public CreateTaskGroupRequest setVideoUrl(java.util.List<String> videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public java.util.List<String> getVideoUrl() {
        return this.videoUrl;
    }

}
