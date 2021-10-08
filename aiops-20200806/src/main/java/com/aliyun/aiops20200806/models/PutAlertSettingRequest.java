// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertSettingRequest extends TeaModel {
    @NameInMap("SendDingtalkNotice")
    public Boolean sendDingtalkNotice;

    @NameInMap("SendSmsNotice")
    public Boolean sendSmsNotice;

    @NameInMap("ContactIdsJson")
    public String contactIdsJson;

    @NameInMap("ContactGroupIdsJson")
    public String contactGroupIdsJson;

    @NameInMap("SendEmailNotice")
    public Boolean sendEmailNotice;

    // 废弃
    @NameInMap("CustomerUid")
    public Long customerUid;

    @NameInMap("AlertSettingId")
    public Long alertSettingId;

    @NameInMap("AlertName")
    public String alertName;

    @NameInMap("BusinessGroupIdsJson")
    public String businessGroupIdsJson;

    @NameInMap("StopDuration")
    public Long stopDuration;

    @NameInMap("OperaUid")
    public String operaUid;

    public static PutAlertSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAlertSettingRequest self = new PutAlertSettingRequest();
        return TeaModel.build(map, self);
    }

    public PutAlertSettingRequest setSendDingtalkNotice(Boolean sendDingtalkNotice) {
        this.sendDingtalkNotice = sendDingtalkNotice;
        return this;
    }
    public Boolean getSendDingtalkNotice() {
        return this.sendDingtalkNotice;
    }

    public PutAlertSettingRequest setSendSmsNotice(Boolean sendSmsNotice) {
        this.sendSmsNotice = sendSmsNotice;
        return this;
    }
    public Boolean getSendSmsNotice() {
        return this.sendSmsNotice;
    }

    public PutAlertSettingRequest setContactIdsJson(String contactIdsJson) {
        this.contactIdsJson = contactIdsJson;
        return this;
    }
    public String getContactIdsJson() {
        return this.contactIdsJson;
    }

    public PutAlertSettingRequest setContactGroupIdsJson(String contactGroupIdsJson) {
        this.contactGroupIdsJson = contactGroupIdsJson;
        return this;
    }
    public String getContactGroupIdsJson() {
        return this.contactGroupIdsJson;
    }

    public PutAlertSettingRequest setSendEmailNotice(Boolean sendEmailNotice) {
        this.sendEmailNotice = sendEmailNotice;
        return this;
    }
    public Boolean getSendEmailNotice() {
        return this.sendEmailNotice;
    }

    public PutAlertSettingRequest setCustomerUid(Long customerUid) {
        this.customerUid = customerUid;
        return this;
    }
    public Long getCustomerUid() {
        return this.customerUid;
    }

    public PutAlertSettingRequest setAlertSettingId(Long alertSettingId) {
        this.alertSettingId = alertSettingId;
        return this;
    }
    public Long getAlertSettingId() {
        return this.alertSettingId;
    }

    public PutAlertSettingRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public PutAlertSettingRequest setBusinessGroupIdsJson(String businessGroupIdsJson) {
        this.businessGroupIdsJson = businessGroupIdsJson;
        return this;
    }
    public String getBusinessGroupIdsJson() {
        return this.businessGroupIdsJson;
    }

    public PutAlertSettingRequest setStopDuration(Long stopDuration) {
        this.stopDuration = stopDuration;
        return this;
    }
    public Long getStopDuration() {
        return this.stopDuration;
    }

    public PutAlertSettingRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
