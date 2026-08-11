// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class AccountContactAddRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Specifies whether to asynchronously verify the email address. Set this parameter to true for API calls. Otherwise, the verification code is synchronously verified. Call the SendAsyncEmailCaptcha operation to send a verification link.</p>
     */
    @NameInMap("AsyncEmailVerify")
    public Boolean asyncEmailVerify;

    /**
     * <p>Specifies whether to asynchronously verify the mobile number. Set this parameter to true for API calls. Otherwise, the verification code is synchronously verified. Call the SendAsyncMobileCaptcha operation to send a verification link.</p>
     */
    @NameInMap("AsyncMobileVerify")
    public Boolean asyncMobileVerify;

    /**
     * <p>The email address of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@xxx.xxx">xxx@xxx.xxx</a></p>
     */
    @NameInMap("ContactEmail")
    public String contactEmail;

    /**
     * <p>The mobile number of the contact.</p>
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
     * <p>The position of the contact. Valid values:</p>
     * <ul>
     * <li>TECH_MANAGER: technical manager</li>
     * <li>MAINTAIN_MANAGER: O&amp;M manager</li>
     * <li>PROJECT_MANAGER: project manager</li>
     * <li>FINANCE_MANAGER: finance manager</li>
     * <li>OTHER: other.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
     * <p>Specifies whether the contact is a shared contact. This parameter is set to false by default in this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SharedContact")
    public Boolean sharedContact;

    public static AccountContactAddRequest build(java.util.Map<String, ?> map) throws Exception {
        AccountContactAddRequest self = new AccountContactAddRequest();
        return TeaModel.build(map, self);
    }

    public AccountContactAddRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AccountContactAddRequest setAsyncEmailVerify(Boolean asyncEmailVerify) {
        this.asyncEmailVerify = asyncEmailVerify;
        return this;
    }
    public Boolean getAsyncEmailVerify() {
        return this.asyncEmailVerify;
    }

    public AccountContactAddRequest setAsyncMobileVerify(Boolean asyncMobileVerify) {
        this.asyncMobileVerify = asyncMobileVerify;
        return this;
    }
    public Boolean getAsyncMobileVerify() {
        return this.asyncMobileVerify;
    }

    public AccountContactAddRequest setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public AccountContactAddRequest setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }

    public AccountContactAddRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public AccountContactAddRequest setContactPosition(String contactPosition) {
        this.contactPosition = contactPosition;
        return this;
    }
    public String getContactPosition() {
        return this.contactPosition;
    }

    public AccountContactAddRequest setEmailCode(String emailCode) {
        this.emailCode = emailCode;
        return this;
    }
    public String getEmailCode() {
        return this.emailCode;
    }

    public AccountContactAddRequest setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
        return this;
    }
    public String getMobileCode() {
        return this.mobileCode;
    }

    public AccountContactAddRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public AccountContactAddRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public AccountContactAddRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public AccountContactAddRequest setSharedContact(Boolean sharedContact) {
        this.sharedContact = sharedContact;
        return this;
    }
    public Boolean getSharedContact() {
        return this.sharedContact;
    }

}
