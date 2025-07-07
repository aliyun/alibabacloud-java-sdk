// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountChangeSecurityMobileRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("EncryptTicket")
    public String encryptTicket;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NewMobile")
    public String newMobile;

    @NameInMap("OrientedEcId")
    public String orientedEcId;

    @NameInMap("OrientedLeId")
    public String orientedLeId;

    @NameInMap("OrientedNbId")
    public String orientedNbId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Pk")
    public String pk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VerificationCode")
    public String verificationCode;

    public static EnterpriseAccountChangeSecurityMobileRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountChangeSecurityMobileRequest self = new EnterpriseAccountChangeSecurityMobileRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountChangeSecurityMobileRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseAccountChangeSecurityMobileRequest setEncryptTicket(String encryptTicket) {
        this.encryptTicket = encryptTicket;
        return this;
    }
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    public EnterpriseAccountChangeSecurityMobileRequest setNewMobile(String newMobile) {
        this.newMobile = newMobile;
        return this;
    }
    public String getNewMobile() {
        return this.newMobile;
    }

    public EnterpriseAccountChangeSecurityMobileRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseAccountChangeSecurityMobileRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseAccountChangeSecurityMobileRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseAccountChangeSecurityMobileRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public EnterpriseAccountChangeSecurityMobileRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseAccountChangeSecurityMobileRequest setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }
    public String getVerificationCode() {
        return this.verificationCode;
    }

}
