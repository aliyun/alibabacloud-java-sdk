// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountChangeSecurityEmailRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

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
    @NameInMap("SecurityEmail")
    public String securityEmail;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VerifyCode")
    public String verifyCode;

    public static EnterpriseAccountChangeSecurityEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountChangeSecurityEmailRequest self = new EnterpriseAccountChangeSecurityEmailRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountChangeSecurityEmailRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseAccountChangeSecurityEmailRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseAccountChangeSecurityEmailRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseAccountChangeSecurityEmailRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseAccountChangeSecurityEmailRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public EnterpriseAccountChangeSecurityEmailRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseAccountChangeSecurityEmailRequest setSecurityEmail(String securityEmail) {
        this.securityEmail = securityEmail;
        return this;
    }
    public String getSecurityEmail() {
        return this.securityEmail;
    }

    public EnterpriseAccountChangeSecurityEmailRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
