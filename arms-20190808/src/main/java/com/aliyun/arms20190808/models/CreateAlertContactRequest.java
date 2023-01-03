// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactRequest extends TeaModel {
    // The name of the alert contact.
    @NameInMap("ContactName")
    public String contactName;

    // The webhook URL of the DingTalk chatbot. For more information about how to obtain the URL, see [Configure a DingTalk chatbot to send alert notifications](https://www.alibabacloud.com/help/zh/doc-detail/106247.htm). You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
    // 
    // >  Enter `alert` in the custom keyword field of DingTalk chatbot security settings.
    @NameInMap("DingRobotWebhookUrl")
    public String dingRobotWebhookUrl;

    // The email address of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
    @NameInMap("Email")
    public String email;

    // The mobile number of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
    @NameInMap("PhoneNum")
    public String phoneNum;

    // The ID of the region. Set the value to `cn-hangzhou`.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // Specifies whether the alert contact receives system notifications. Valid values:
    // 
    // *   `true`: receives system notifications.
    // *   `false`: does not receive system notifications.
    @NameInMap("SystemNoc")
    public Boolean systemNoc;

    public static CreateAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactRequest self = new CreateAlertContactRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateAlertContactRequest setDingRobotWebhookUrl(String dingRobotWebhookUrl) {
        this.dingRobotWebhookUrl = dingRobotWebhookUrl;
        return this;
    }
    public String getDingRobotWebhookUrl() {
        return this.dingRobotWebhookUrl;
    }

    public CreateAlertContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateAlertContactRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public CreateAlertContactRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAlertContactRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAlertContactRequest setSystemNoc(Boolean systemNoc) {
        this.systemNoc = systemNoc;
        return this;
    }
    public Boolean getSystemNoc() {
        return this.systemNoc;
    }

}
