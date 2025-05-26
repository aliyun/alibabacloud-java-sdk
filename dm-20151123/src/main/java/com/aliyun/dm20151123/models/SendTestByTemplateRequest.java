// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SendTestByTemplateRequest extends TeaModel {
    /**
     * <p>Sender address, with a maximum length of 60 characters</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.com">test@example.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Birthday, with a maximum length of 30 characters</p>
     * 
     * <strong>example:</strong>
     * <p>2000/01/01</p>
     */
    @NameInMap("Birthday")
    public String birthday;

    /**
     * <p>Recipient address, with a maximum length of 60 characters</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test1@example.com">test1@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Gender, with a maximum length of 30 characters</p>
     * 
     * <strong>example:</strong>
     * <p>doctor</p>
     */
    @NameInMap("Gender")
    public String gender;

    /**
     * <p>Mobile, with a maximum length of 30 characters</p>
     * 
     * <strong>example:</strong>
     * <p>1380000****</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>NickName, with a maximum length of 30 characters</p>
     * 
     * <strong>example:</strong>
     * <p>LC</p>
     */
    @NameInMap("NickName")
    public String nickName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Template ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TemplateId")
    public Integer templateId;

    /**
     * <p>UserName, with a maximum length of 30 characters</p>
     * 
     * <strong>example:</strong>
     * <p>Lucy</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static SendTestByTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SendTestByTemplateRequest self = new SendTestByTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SendTestByTemplateRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public SendTestByTemplateRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public SendTestByTemplateRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SendTestByTemplateRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public SendTestByTemplateRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public SendTestByTemplateRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public SendTestByTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendTestByTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendTestByTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendTestByTemplateRequest setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }
    public Integer getTemplateId() {
        return this.templateId;
    }

    public SendTestByTemplateRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
