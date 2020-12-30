// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class RegistrantProfileRealNameVerificationRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegistrantProfileID")
    public Long registrantProfileID;

    @NameInMap("IdentityCredential")
    public String identityCredential;

    @NameInMap("IdentityCredentialNo")
    public String identityCredentialNo;

    @NameInMap("IdentityCredentialType")
    public String identityCredentialType;

    public static RegistrantProfileRealNameVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        RegistrantProfileRealNameVerificationRequest self = new RegistrantProfileRealNameVerificationRequest();
        return TeaModel.build(map, self);
    }

    public RegistrantProfileRealNameVerificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
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

}
