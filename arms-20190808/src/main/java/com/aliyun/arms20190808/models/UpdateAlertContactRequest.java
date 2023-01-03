// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateAlertContactRequest extends TeaModel {
    // The ID of the alert contact to be updated. You can call the SearchAlertContact operation to query the contact ID. For more information, see [SearchAlertContact](~~130703~~).
    @NameInMap("ContactId")
    public Long contactId;

    // The new name of the alert contact.
    @NameInMap("ContactName")
    public String contactName;

    // The new webhook URL of the DingTalk bot. For more information, see [Configure a DingTalk chatbot to send alert notifications](~~106247~~). You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
    // 
    // >  If you do not specify this parameter, the original webhook URL of the DingTalk bot is deleted. If you specify this parameter, the original webhook URL of the DingTalk bot is updated.
    @NameInMap("DingRobotWebhookUrl")
    public String dingRobotWebhookUrl;

    // The new email address of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
    // 
    // >  If you do not specify this parameter, the original email address of the alert contact is deleted. If you specify this parameter, the original email address of the alert contact is updated.
    @NameInMap("Email")
    public String email;

    // The new mobile phone number of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
    // 
    // >  If you do not specify this parameter, the original mobile phone number of the alert contact is deleted. If you specify this parameter, the original mobile phone number of the alert contact is updated.
    @NameInMap("PhoneNum")
    public String phoneNum;

    // The ID of the region. Set the value to `cn-hangzhou`.
    @NameInMap("RegionId")
    public String regionId;

    // Specifies whether the alert contact receives system notifications. Valid values:
    // 
    // *   `true`: receives system notifications.
    // *   `false`: does not receive system notifications.
    @NameInMap("SystemNoc")
    public Boolean systemNoc;

    public static UpdateAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertContactRequest self = new UpdateAlertContactRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertContactRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public UpdateAlertContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public UpdateAlertContactRequest setDingRobotWebhookUrl(String dingRobotWebhookUrl) {
        this.dingRobotWebhookUrl = dingRobotWebhookUrl;
        return this;
    }
    public String getDingRobotWebhookUrl() {
        return this.dingRobotWebhookUrl;
    }

    public UpdateAlertContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateAlertContactRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public UpdateAlertContactRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAlertContactRequest setSystemNoc(Boolean systemNoc) {
        this.systemNoc = systemNoc;
        return this;
    }
    public Boolean getSystemNoc() {
        return this.systemNoc;
    }

}
