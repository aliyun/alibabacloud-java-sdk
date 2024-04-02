// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeNotificationSettingResponseBody extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("RealtimeMessageList")
    public java.util.List<String> realtimeMessageList;

    @NameInMap("ReminderModeList")
    public java.util.List<String> reminderModeList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScheduleMessageTime")
    public Integer scheduleMessageTime;

    @NameInMap("ScheduleMessageTimeZone")
    public Integer scheduleMessageTimeZone;

    public static DescribeNotificationSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotificationSettingResponseBody self = new DescribeNotificationSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNotificationSettingResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public DescribeNotificationSettingResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public DescribeNotificationSettingResponseBody setRealtimeMessageList(java.util.List<String> realtimeMessageList) {
        this.realtimeMessageList = realtimeMessageList;
        return this;
    }
    public java.util.List<String> getRealtimeMessageList() {
        return this.realtimeMessageList;
    }

    public DescribeNotificationSettingResponseBody setReminderModeList(java.util.List<String> reminderModeList) {
        this.reminderModeList = reminderModeList;
        return this;
    }
    public java.util.List<String> getReminderModeList() {
        return this.reminderModeList;
    }

    public DescribeNotificationSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNotificationSettingResponseBody setScheduleMessageTime(Integer scheduleMessageTime) {
        this.scheduleMessageTime = scheduleMessageTime;
        return this;
    }
    public Integer getScheduleMessageTime() {
        return this.scheduleMessageTime;
    }

    public DescribeNotificationSettingResponseBody setScheduleMessageTimeZone(Integer scheduleMessageTimeZone) {
        this.scheduleMessageTimeZone = scheduleMessageTimeZone;
        return this;
    }
    public Integer getScheduleMessageTimeZone() {
        return this.scheduleMessageTimeZone;
    }

}
