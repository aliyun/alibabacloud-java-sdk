// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactRequest extends TeaModel {
    // The ID of the alert contact.
    // 
    // *   If you do not specify this parameter, an alert contact is created.
    // *   If you specify this parameter, the specified alert contact is modified.
    @NameInMap("ContactId")
    public Long contactId;

    // The name of the alert contact.
    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("DingRobotUrl")
    public String dingRobotUrl;

    // The email address of the alert contact.
    // 
    // > You must specify at least one of the **Phone** and **Email** parameters. Each mobile number or email address can be used for only one alert contact.
    @NameInMap("Email")
    public String email;

    @NameInMap("IsEmailVerify")
    public Boolean isEmailVerify;

    // The mobile number of the alert contact.
    // 
    // > You must specify at least one of the **Phone** and **Email** parameters. Each mobile number or email address can be used for only one alert contact.
    @NameInMap("Phone")
    public String phone;

    // The method to resend notifications if phone notifications fail. Valid values:
    // 
    // *   0: do not resend notifications
    // *   1: make a phone call again
    // *   2: send a text message
    // *   3 (default value): use the global default value
    @NameInMap("ReissueSendNotice")
    public Long reissueSendNotice;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateOrUpdateContactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateContactRequest self = new CreateOrUpdateContactRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateContactRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public CreateOrUpdateContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateOrUpdateContactRequest setDingRobotUrl(String dingRobotUrl) {
        this.dingRobotUrl = dingRobotUrl;
        return this;
    }
    public String getDingRobotUrl() {
        return this.dingRobotUrl;
    }

    public CreateOrUpdateContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateOrUpdateContactRequest setIsEmailVerify(Boolean isEmailVerify) {
        this.isEmailVerify = isEmailVerify;
        return this;
    }
    public Boolean getIsEmailVerify() {
        return this.isEmailVerify;
    }

    public CreateOrUpdateContactRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateOrUpdateContactRequest setReissueSendNotice(Long reissueSendNotice) {
        this.reissueSendNotice = reissueSendNotice;
        return this;
    }
    public Long getReissueSendNotice() {
        return this.reissueSendNotice;
    }

    public CreateOrUpdateContactRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
