// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateNotificationSettingRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RealtimeMessageList")
    public String realtimeMessageList;

    @NameInMap("ReminderModeList")
    public String reminderModeList;

    @NameInMap("ScheduleMessageTime")
    public Integer scheduleMessageTime;

    @NameInMap("ScheduleMessageTimeZone")
    public Integer scheduleMessageTimeZone;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static UpdateNotificationSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNotificationSettingRequest self = new UpdateNotificationSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNotificationSettingRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateNotificationSettingRequest setRealtimeMessageList(String realtimeMessageList) {
        this.realtimeMessageList = realtimeMessageList;
        return this;
    }
    public String getRealtimeMessageList() {
        return this.realtimeMessageList;
    }

    public UpdateNotificationSettingRequest setReminderModeList(String reminderModeList) {
        this.reminderModeList = reminderModeList;
        return this;
    }
    public String getReminderModeList() {
        return this.reminderModeList;
    }

    public UpdateNotificationSettingRequest setScheduleMessageTime(Integer scheduleMessageTime) {
        this.scheduleMessageTime = scheduleMessageTime;
        return this;
    }
    public Integer getScheduleMessageTime() {
        return this.scheduleMessageTime;
    }

    public UpdateNotificationSettingRequest setScheduleMessageTimeZone(Integer scheduleMessageTimeZone) {
        this.scheduleMessageTimeZone = scheduleMessageTimeZone;
        return this;
    }
    public Integer getScheduleMessageTimeZone() {
        return this.scheduleMessageTimeZone;
    }

    public UpdateNotificationSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
