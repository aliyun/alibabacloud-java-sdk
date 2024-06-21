// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactRequest extends TeaModel {
    /**
     * <p>The ID of the alert contact.</p>
     * <ul>
     * <li>If you do not specify this parameter, a new alert contact is created.</li>
     * <li>If you specify this parameter, the specified alert contact is modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <p>The name of the alert contact.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>JohnDoe</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("CorpUserId")
    public String corpUserId;

    /**
     * <p>The webhook URL of the DingTalk chatbot.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=69d4e0">https://oapi.dingtalk.com/robot/send?access_token=69d4e0</a>******</p>
     */
    @NameInMap("DingRobotUrl")
    public String dingRobotUrl;

    /**
     * <p>The email address of the alert contact.</p>
     * <blockquote>
     * <p>You must specify at least one of the <strong>Phone</strong> and <strong>Email</strong> parameters. Each mobile number or email address can be used for only one alert contact.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Specifies whether the email address is verified.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsEmailVerify")
    public Boolean isEmailVerify;

    /**
     * <p>The mobile number of the alert contact.</p>
     * <blockquote>
     * <p>You must specify at least one of the <strong>Phone</strong> and <strong>Email</strong> parameters. Each mobile number or email address can be used for only one alert contact.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1381111****</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The operation that you want to perform if phone calls fail to be answered. Valid values:</p>
     * <ul>
     * <li>0: No operation is performed.</li>
     * <li>1: A phone call is made again.</li>
     * <li>2: A text message is sent.</li>
     * <li>3 (default value): The global default value is used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ReissueSendNotice")
    public Long reissueSendNotice;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
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

    public CreateOrUpdateContactRequest setCorpUserId(String corpUserId) {
        this.corpUserId = corpUserId;
        return this;
    }
    public String getCorpUserId() {
        return this.corpUserId;
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
