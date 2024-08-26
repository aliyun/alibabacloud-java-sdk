// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class RegistrantProfileRealNameVerificationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dGVzdA==</p>
     */
    @NameInMap("IdentityCredential")
    public String identityCredential;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43012512345678****</p>
     */
    @NameInMap("IdentityCredentialNo")
    public String identityCredentialNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SFZ</p>
     */
    @NameInMap("IdentityCredentialType")
    public String identityCredentialType;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("RegistrantProfileID")
    public Long registrantProfileID;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static RegistrantProfileRealNameVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        RegistrantProfileRealNameVerificationRequest self = new RegistrantProfileRealNameVerificationRequest();
        return TeaModel.build(map, self);
    }

    public RegistrantProfileRealNameVerificationRequest setIdentityCredential(String identityCredential) {
        this.identityCredential = identityCredential;
        return this;
    }
    public String getIdentityCredential() {
        return this.identityCredential;
    }

    public RegistrantProfileRealNameVerificationRequest setIdentityCredentialNo(String identityCredentialNo) {
        this.identityCredentialNo = identityCredentialNo;
        return this;
    }
    public String getIdentityCredentialNo() {
        return this.identityCredentialNo;
    }

    public RegistrantProfileRealNameVerificationRequest setIdentityCredentialType(String identityCredentialType) {
        this.identityCredentialType = identityCredentialType;
        return this;
    }
    public String getIdentityCredentialType() {
        return this.identityCredentialType;
    }

    public RegistrantProfileRealNameVerificationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public RegistrantProfileRealNameVerificationRequest setRegistrantProfileID(Long registrantProfileID) {
        this.registrantProfileID = registrantProfileID;
        return this;
    }
    public Long getRegistrantProfileID() {
        return this.registrantProfileID;
    }

    public RegistrantProfileRealNameVerificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
