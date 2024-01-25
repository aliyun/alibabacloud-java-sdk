// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertSettingByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeAlertSettingByIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeAlertSettingByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSettingByIdResponseBody self = new DescribeAlertSettingByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSettingByIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertSettingByIdResponseBody setData(DescribeAlertSettingByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAlertSettingByIdResponseBodyData getData() {
        return this.data;
    }

    public DescribeAlertSettingByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertSettingByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertSettingByIdResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeAlertSettingByIdResponseBodyData extends TeaModel {
        @NameInMap("AlarmLevel")
        public String alarmLevel;

        @NameInMap("AlertBusinessSettingId")
        public Long alertBusinessSettingId;

        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("DataCreateTime")
        public String dataCreateTime;

        @NameInMap("DataCreateUser")
        public String dataCreateUser;

        @NameInMap("DataModifyTime")
        public String dataModifyTime;

        @NameInMap("DataModifyUser")
        public String dataModifyUser;

        @NameInMap("SendDingtalkNotice")
        public Boolean sendDingtalkNotice;

        @NameInMap("SendEmailNotice")
        public Boolean sendEmailNotice;

        @NameInMap("SendSmsNotice")
        public Boolean sendSmsNotice;

        @NameInMap("SettingStatus")
        public Long settingStatus;

        @NameInMap("StopDuration")
        public Long stopDuration;

        @NameInMap("Uid")
        public Long uid;

        public static DescribeAlertSettingByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertSettingByIdResponseBodyData self = new DescribeAlertSettingByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertSettingByIdResponseBodyData setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        public DescribeAlertSettingByIdResponseBodyData setAlertBusinessSettingId(Long alertBusinessSettingId) {
            this.alertBusinessSettingId = alertBusinessSettingId;
            return this;
        }
        public Long getAlertBusinessSettingId() {
            return this.alertBusinessSettingId;
        }

        public DescribeAlertSettingByIdResponseBodyData setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public DescribeAlertSettingByIdResponseBodyData setDataCreateTime(String dataCreateTime) {
            this.dataCreateTime = dataCreateTime;
            return this;
        }
        public String getDataCreateTime() {
            return this.dataCreateTime;
        }

        public DescribeAlertSettingByIdResponseBodyData setDataCreateUser(String dataCreateUser) {
            this.dataCreateUser = dataCreateUser;
            return this;
        }
        public String getDataCreateUser() {
            return this.dataCreateUser;
        }

        public DescribeAlertSettingByIdResponseBodyData setDataModifyTime(String dataModifyTime) {
            this.dataModifyTime = dataModifyTime;
            return this;
        }
        public String getDataModifyTime() {
            return this.dataModifyTime;
        }

        public DescribeAlertSettingByIdResponseBodyData setDataModifyUser(String dataModifyUser) {
            this.dataModifyUser = dataModifyUser;
            return this;
        }
        public String getDataModifyUser() {
            return this.dataModifyUser;
        }

        public DescribeAlertSettingByIdResponseBodyData setSendDingtalkNotice(Boolean sendDingtalkNotice) {
            this.sendDingtalkNotice = sendDingtalkNotice;
            return this;
        }
        public Boolean getSendDingtalkNotice() {
            return this.sendDingtalkNotice;
        }

        public DescribeAlertSettingByIdResponseBodyData setSendEmailNotice(Boolean sendEmailNotice) {
            this.sendEmailNotice = sendEmailNotice;
            return this;
        }
        public Boolean getSendEmailNotice() {
            return this.sendEmailNotice;
        }

        public DescribeAlertSettingByIdResponseBodyData setSendSmsNotice(Boolean sendSmsNotice) {
            this.sendSmsNotice = sendSmsNotice;
            return this;
        }
        public Boolean getSendSmsNotice() {
            return this.sendSmsNotice;
        }

        public DescribeAlertSettingByIdResponseBodyData setSettingStatus(Long settingStatus) {
            this.settingStatus = settingStatus;
            return this;
        }
        public Long getSettingStatus() {
            return this.settingStatus;
        }

        public DescribeAlertSettingByIdResponseBodyData setStopDuration(Long stopDuration) {
            this.stopDuration = stopDuration;
            return this;
        }
        public Long getStopDuration() {
            return this.stopDuration;
        }

        public DescribeAlertSettingByIdResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

}
