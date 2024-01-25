// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertSettingResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAlertSettingResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Total")
    public Integer total;

    public static DescribeAlertSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSettingResponseBody self = new DescribeAlertSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSettingResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertSettingResponseBody setData(java.util.List<DescribeAlertSettingResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAlertSettingResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAlertSettingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertSettingResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAlertSettingResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeAlertSettingResponseBodyData extends TeaModel {
        @NameInMap("AlarmLevel")
        public String alarmLevel;

        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("AlertSettingId")
        public Long alertSettingId;

        @NameInMap("BusinessGroupIds")
        public String businessGroupIds;

        @NameInMap("BusinessGroupNames")
        public String businessGroupNames;

        @NameInMap("ContactIds")
        public String contactIds;

        @NameInMap("ContactNames")
        public String contactNames;

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

        @NameInMap("TotalBusinessResourceNumber")
        public Long totalBusinessResourceNumber;

        public static DescribeAlertSettingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertSettingResponseBodyData self = new DescribeAlertSettingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertSettingResponseBodyData setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        public DescribeAlertSettingResponseBodyData setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public DescribeAlertSettingResponseBodyData setAlertSettingId(Long alertSettingId) {
            this.alertSettingId = alertSettingId;
            return this;
        }
        public Long getAlertSettingId() {
            return this.alertSettingId;
        }

        public DescribeAlertSettingResponseBodyData setBusinessGroupIds(String businessGroupIds) {
            this.businessGroupIds = businessGroupIds;
            return this;
        }
        public String getBusinessGroupIds() {
            return this.businessGroupIds;
        }

        public DescribeAlertSettingResponseBodyData setBusinessGroupNames(String businessGroupNames) {
            this.businessGroupNames = businessGroupNames;
            return this;
        }
        public String getBusinessGroupNames() {
            return this.businessGroupNames;
        }

        public DescribeAlertSettingResponseBodyData setContactIds(String contactIds) {
            this.contactIds = contactIds;
            return this;
        }
        public String getContactIds() {
            return this.contactIds;
        }

        public DescribeAlertSettingResponseBodyData setContactNames(String contactNames) {
            this.contactNames = contactNames;
            return this;
        }
        public String getContactNames() {
            return this.contactNames;
        }

        public DescribeAlertSettingResponseBodyData setSendDingtalkNotice(Boolean sendDingtalkNotice) {
            this.sendDingtalkNotice = sendDingtalkNotice;
            return this;
        }
        public Boolean getSendDingtalkNotice() {
            return this.sendDingtalkNotice;
        }

        public DescribeAlertSettingResponseBodyData setSendEmailNotice(Boolean sendEmailNotice) {
            this.sendEmailNotice = sendEmailNotice;
            return this;
        }
        public Boolean getSendEmailNotice() {
            return this.sendEmailNotice;
        }

        public DescribeAlertSettingResponseBodyData setSendSmsNotice(Boolean sendSmsNotice) {
            this.sendSmsNotice = sendSmsNotice;
            return this;
        }
        public Boolean getSendSmsNotice() {
            return this.sendSmsNotice;
        }

        public DescribeAlertSettingResponseBodyData setSettingStatus(Long settingStatus) {
            this.settingStatus = settingStatus;
            return this;
        }
        public Long getSettingStatus() {
            return this.settingStatus;
        }

        public DescribeAlertSettingResponseBodyData setStopDuration(Long stopDuration) {
            this.stopDuration = stopDuration;
            return this;
        }
        public Long getStopDuration() {
            return this.stopDuration;
        }

        public DescribeAlertSettingResponseBodyData setTotalBusinessResourceNumber(Long totalBusinessResourceNumber) {
            this.totalBusinessResourceNumber = totalBusinessResourceNumber;
            return this;
        }
        public Long getTotalBusinessResourceNumber() {
            return this.totalBusinessResourceNumber;
        }

    }

}
