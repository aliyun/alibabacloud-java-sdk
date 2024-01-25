// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertSettingRequest extends TeaModel {
    @NameInMap("AlarmLevel")
    public String alarmLevel;

    @NameInMap("AlertName")
    public String alertName;

    @NameInMap("AlertSettingId")
    public Long alertSettingId;

    @NameInMap("AlertSilenceConfig")
    public String alertSilenceConfig;

    @NameInMap("BusinessGroupIdsJson")
    public String businessGroupIdsJson;

    @NameInMap("ContactGroupIdsJson")
    public String contactGroupIdsJson;

    @NameInMap("ContactIdsJson")
    public String contactIdsJson;

    @NameInMap("CustomerUid")
    public Long customerUid;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("SendDingtalkNotice")
    public Boolean sendDingtalkNotice;

    @NameInMap("SendEmailNotice")
    public Boolean sendEmailNotice;

    @NameInMap("SendSmsNotice")
    public Boolean sendSmsNotice;

    @NameInMap("StopDuration")
    public Long stopDuration;

    public static PutAlertSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAlertSettingRequest self = new PutAlertSettingRequest();
        return TeaModel.build(map, self);
    }

    public PutAlertSettingRequest setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public String getAlarmLevel() {
        return this.alarmLevel;
    }

    public PutAlertSettingRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public PutAlertSettingRequest setAlertSettingId(Long alertSettingId) {
        this.alertSettingId = alertSettingId;
        return this;
    }
    public Long getAlertSettingId() {
        return this.alertSettingId;
    }

    public PutAlertSettingRequest setAlertSilenceConfig(String alertSilenceConfig) {
        this.alertSilenceConfig = alertSilenceConfig;
        return this;
    }
    public String getAlertSilenceConfig() {
        return this.alertSilenceConfig;
    }

    public PutAlertSettingRequest setBusinessGroupIdsJson(String businessGroupIdsJson) {
        this.businessGroupIdsJson = businessGroupIdsJson;
        return this;
    }
    public String getBusinessGroupIdsJson() {
        return this.businessGroupIdsJson;
    }

    public PutAlertSettingRequest setContactGroupIdsJson(String contactGroupIdsJson) {
        this.contactGroupIdsJson = contactGroupIdsJson;
        return this;
    }
    public String getContactGroupIdsJson() {
        return this.contactGroupIdsJson;
    }

    public PutAlertSettingRequest setContactIdsJson(String contactIdsJson) {
        this.contactIdsJson = contactIdsJson;
        return this;
    }
    public String getContactIdsJson() {
        return this.contactIdsJson;
    }

    public PutAlertSettingRequest setCustomerUid(Long customerUid) {
        this.customerUid = customerUid;
        return this;
    }
    public Long getCustomerUid() {
        return this.customerUid;
    }

    public PutAlertSettingRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public PutAlertSettingRequest setSendDingtalkNotice(Boolean sendDingtalkNotice) {
        this.sendDingtalkNotice = sendDingtalkNotice;
        return this;
    }
    public Boolean getSendDingtalkNotice() {
        return this.sendDingtalkNotice;
    }

    public PutAlertSettingRequest setSendEmailNotice(Boolean sendEmailNotice) {
        this.sendEmailNotice = sendEmailNotice;
        return this;
    }
    public Boolean getSendEmailNotice() {
        return this.sendEmailNotice;
    }

    public PutAlertSettingRequest setSendSmsNotice(Boolean sendSmsNotice) {
        this.sendSmsNotice = sendSmsNotice;
        return this;
    }
    public Boolean getSendSmsNotice() {
        return this.sendSmsNotice;
    }

    public PutAlertSettingRequest setStopDuration(Long stopDuration) {
        this.stopDuration = stopDuration;
        return this;
    }
    public Long getStopDuration() {
        return this.stopDuration;
    }

}
