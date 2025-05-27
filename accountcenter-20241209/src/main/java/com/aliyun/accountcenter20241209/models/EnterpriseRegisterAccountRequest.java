// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRegisterAccountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>资方支付平台</p>
     */
    @NameInMap("Alias")
    public String alias;

    @NameInMap("EncryptPassword")
    public String encryptPassword;

    @NameInMap("EncryptTicket")
    public String encryptTicket;

    @NameInMap("LoginEmail")
    public String loginEmail;

    /**
     * <strong>example:</strong>
     * <p>668514d8083f058f78f7199a</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("OrientedEcId")
    public String orientedEcId;

    @NameInMap("OrientedLeId")
    public String orientedLeId;

    @NameInMap("OrientedNbId")
    public String orientedNbId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A93073FC-1E86-58BA-AB83-54DA6BDB4F03</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowCompleteInfo")
    public Boolean showCompleteInfo;

    @NameInMap("SiteNick")
    public String siteNick;

    public static EnterpriseRegisterAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRegisterAccountRequest self = new EnterpriseRegisterAccountRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseRegisterAccountRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public EnterpriseRegisterAccountRequest setEncryptPassword(String encryptPassword) {
        this.encryptPassword = encryptPassword;
        return this;
    }
    public String getEncryptPassword() {
        return this.encryptPassword;
    }

    public EnterpriseRegisterAccountRequest setEncryptTicket(String encryptTicket) {
        this.encryptTicket = encryptTicket;
        return this;
    }
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    public EnterpriseRegisterAccountRequest setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
        return this;
    }
    public String getLoginEmail() {
        return this.loginEmail;
    }

    public EnterpriseRegisterAccountRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public EnterpriseRegisterAccountRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseRegisterAccountRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseRegisterAccountRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseRegisterAccountRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseRegisterAccountRequest setShowCompleteInfo(Boolean showCompleteInfo) {
        this.showCompleteInfo = showCompleteInfo;
        return this;
    }
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

    public EnterpriseRegisterAccountRequest setSiteNick(String siteNick) {
        this.siteNick = siteNick;
        return this;
    }
    public String getSiteNick() {
        return this.siteNick;
    }

}
