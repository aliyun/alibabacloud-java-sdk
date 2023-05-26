// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactRequest extends TeaModel {
    /**
     * <p>The ID of the alert contact.</p>
     * <br>
     * <p>*   If you do not specify this parameter, a new alert contact is created.</p>
     * <p>*   If you specify this parameter, the specified alert contact is modified.</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <p>The name of the alert contact.</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The webhook URL of the DingTalk chatbot.</p>
     */
    @NameInMap("DingRobotUrl")
    public String dingRobotUrl;

    /**
     * <p>The email address of the alert contact.</p>
     * <br>
     * <p>> You must specify at least one of the **Phone** and **Email** parameters. Each mobile number or email address can be used for only one alert contact.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Specifies whether the email address is verified.</p>
     */
    @NameInMap("IsEmailVerify")
    public Boolean isEmailVerify;

    /**
     * <p>The mobile number of the alert contact.</p>
     * <br>
     * <p>> You must specify at least one of the **Phone** and **Email** parameters. Each mobile number or email address can be used for only one alert contact.</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The operation that you want to perform if phone calls fail to be answered. Valid values:</p>
     * <br>
     * <p>*   0: No operation is performed.</p>
     * <p>*   1: A phone call is made again.</p>
     * <p>*   2: A text message is sent.</p>
     * <p>*   3 (default value): The global default value is used.</p>
     */
    @NameInMap("ReissueSendNotice")
    public Long reissueSendNotice;

    /**
     * <p>The resource group ID.</p>
     */
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
