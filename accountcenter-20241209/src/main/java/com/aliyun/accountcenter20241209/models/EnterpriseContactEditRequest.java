// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactEditRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Specifies whether to asynchronously verify the email address. Set this parameter to true for API calls. Otherwise, the verification code is synchronously and strictly verified. Call SendAsyncEmailCaptcha to send a verification link.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AsyncEmailVerify")
    public Boolean asyncEmailVerify;

    /**
     * <p>Specifies whether to asynchronously verify the mobile phone number. Set this parameter to true for API calls. Otherwise, the verification code is synchronously and strictly verified. Call SendAsyncMobileCaptcha to send a verification link.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AsyncMobileVerify")
    public Boolean asyncMobileVerify;

    /**
     * <p>The email address of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@xxx.xx">xxx@xxx.xx</a></p>
     */
    @NameInMap("ContactEmail")
    public String contactEmail;

    /**
     * <p>The ID of the contact to modify. You can invoke the EnterpriseContactQueryPageList operation to perform a paged query of account contact information.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <p>The mobile phone number of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>1xxxxxxxxxx</p>
     */
    @NameInMap("ContactMobile")
    public String contactMobile;

    /**
     * <p>The name of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The position of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ContactPosition")
    public String contactPosition;

    /**
     * <p>The email verification code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("EmailCode")
    public String emailCode;

    /**
     * <p>The SMS verification code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MobileCode")
    public String mobileCode;

    /**
     * <p>The entity ID of the cross-enterprise management object.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("OrientedEcId")
    public String orientedEcId;

    /**
     * <p>The ID of the enterprise to which you have switched.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("OrientedLeId")
    public String orientedLeId;

    /**
     * <p>The sales channel ID of the cross-enterprise management object.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("OrientedNbId")
    public String orientedNbId;

    /**
     * <p>Specifies whether the contact is a public contact. This operation sets this parameter to true by default.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SharedContact")
    public Boolean sharedContact;

    public static EnterpriseContactEditRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseContactEditRequest self = new EnterpriseContactEditRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseContactEditRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseContactEditRequest setAsyncEmailVerify(Boolean asyncEmailVerify) {
        this.asyncEmailVerify = asyncEmailVerify;
        return this;
    }
    public Boolean getAsyncEmailVerify() {
        return this.asyncEmailVerify;
    }

    public EnterpriseContactEditRequest setAsyncMobileVerify(Boolean asyncMobileVerify) {
        this.asyncMobileVerify = asyncMobileVerify;
        return this;
    }
    public Boolean getAsyncMobileVerify() {
        return this.asyncMobileVerify;
    }

    public EnterpriseContactEditRequest setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public EnterpriseContactEditRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public EnterpriseContactEditRequest setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }

    public EnterpriseContactEditRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public EnterpriseContactEditRequest setContactPosition(String contactPosition) {
        this.contactPosition = contactPosition;
        return this;
    }
    public String getContactPosition() {
        return this.contactPosition;
    }

    public EnterpriseContactEditRequest setEmailCode(String emailCode) {
        this.emailCode = emailCode;
        return this;
    }
    public String getEmailCode() {
        return this.emailCode;
    }

    public EnterpriseContactEditRequest setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
        return this;
    }
    public String getMobileCode() {
        return this.mobileCode;
    }

    public EnterpriseContactEditRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseContactEditRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseContactEditRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseContactEditRequest setSharedContact(Boolean sharedContact) {
        this.sharedContact = sharedContact;
        return this;
    }
    public Boolean getSharedContact() {
        return this.sharedContact;
    }

}
