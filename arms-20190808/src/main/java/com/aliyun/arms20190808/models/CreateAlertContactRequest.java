// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactRequest extends TeaModel {
    /**
     * <p>The name of the alert contact.</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The webhook URL of the DingTalk chatbot. For more information about how to obtain the URL, see [Configure a DingTalk chatbot to send alert notifications](https://www.alibabacloud.com/help/zh/doc-detail/106247.htm). You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.</p>
     * <br>
     * <p>>  Enter `alert` in the custom keyword field of DingTalk chatbot security settings.</p>
     */
    @NameInMap("DingRobotWebhookUrl")
    public String dingRobotWebhookUrl;

    /**
     * <p>The email address of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The mobile number of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.</p>
     */
    @NameInMap("PhoneNum")
    public String phoneNum;

    /**
     * <p>The ID of the region. Set the value to `cn-hangzhou`.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. You can obtain the resource group ID in the **Resource Management** console.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether the alert contact receives system notifications. Valid values:</p>
     * <br>
     * <p>*   `true`: The alert contact receives system notifications.</p>
     * <p>*   `false`: The alert contact does not receive system notifications.</p>
     */
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
