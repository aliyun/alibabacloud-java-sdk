// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SendTestByTemplateRequest extends TeaModel {
    /**
     * <p>The sender address. The length cannot exceed 60 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>账号+@+域名</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The birthday. The length cannot exceed 30 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>2000/01/01</p>
     */
    @NameInMap("Birthday")
    public String birthday;

    /**
     * <p>The recipient email address. The length cannot exceed 60 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>账号+@+域名</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The gender. The length cannot exceed 30 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>先生</p>
     */
    @NameInMap("Gender")
    public String gender;

    /**
     * <p>The mobile number. The length cannot exceed 30 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1380000****</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The nickname. The length cannot exceed 30 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>昵称</p>
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
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TemplateId")
    public Integer templateId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;age&quot;:&quot;20&quot;,&quot;nickName&quot;:&quot;tom&quot;}</p>
     */
    @NameInMap("TemplateParams")
    public String templateParams;

    /**
     * <p>The user name. The length cannot exceed 30 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>姓名</p>
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

    public SendTestByTemplateRequest setTemplateParams(String templateParams) {
        this.templateParams = templateParams;
        return this;
    }
    public String getTemplateParams() {
        return this.templateParams;
    }

    public SendTestByTemplateRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
