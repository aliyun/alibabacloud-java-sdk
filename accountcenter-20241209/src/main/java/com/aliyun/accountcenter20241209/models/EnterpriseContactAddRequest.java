// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactAddRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AsyncEmailVerify")
    public Boolean asyncEmailVerify;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AsyncMobileVerify")
    public Boolean asyncMobileVerify;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@xxx.xx">xxx@xxx.xx</a></p>
     */
    @NameInMap("ContactEmail")
    public String contactEmail;

    /**
     * <strong>example:</strong>
     * <p>1xxxxxxxxxx</p>
     */
    @NameInMap("ContactMobile")
    public String contactMobile;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ContactPosition")
    public String contactPosition;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("EmailCode")
    public String emailCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MobileCode")
    public String mobileCode;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("OrientedEcId")
    public String orientedEcId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("OrientedLeId")
    public String orientedLeId;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("OrientedNbId")
    public String orientedNbId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SharedContact")
    public Boolean sharedContact;

    public static EnterpriseContactAddRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseContactAddRequest self = new EnterpriseContactAddRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseContactAddRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseContactAddRequest setAsyncEmailVerify(Boolean asyncEmailVerify) {
        this.asyncEmailVerify = asyncEmailVerify;
        return this;
    }
    public Boolean getAsyncEmailVerify() {
        return this.asyncEmailVerify;
    }

    public EnterpriseContactAddRequest setAsyncMobileVerify(Boolean asyncMobileVerify) {
        this.asyncMobileVerify = asyncMobileVerify;
        return this;
    }
    public Boolean getAsyncMobileVerify() {
        return this.asyncMobileVerify;
    }

    public EnterpriseContactAddRequest setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public EnterpriseContactAddRequest setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }

    public EnterpriseContactAddRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public EnterpriseContactAddRequest setContactPosition(String contactPosition) {
        this.contactPosition = contactPosition;
        return this;
    }
    public String getContactPosition() {
        return this.contactPosition;
    }

    public EnterpriseContactAddRequest setEmailCode(String emailCode) {
        this.emailCode = emailCode;
        return this;
    }
    public String getEmailCode() {
        return this.emailCode;
    }

    public EnterpriseContactAddRequest setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
        return this;
    }
    public String getMobileCode() {
        return this.mobileCode;
    }

    public EnterpriseContactAddRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseContactAddRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseContactAddRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseContactAddRequest setSharedContact(Boolean sharedContact) {
        this.sharedContact = sharedContact;
        return this;
    }
    public Boolean getSharedContact() {
        return this.sharedContact;
    }

}
