// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("IdentityCredential")
    public String identityCredential;

    @NameInMap("IdentityCredentialNo")
    public String identityCredentialNo;

    @NameInMap("IdentityCredentialType")
    public String identityCredentialType;

    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    public static SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest self = new SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest();
        return TeaModel.build(map, self);
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest setIdentityCredential(String identityCredential) {
        this.identityCredential = identityCredential;
        return this;
    }
    public String getIdentityCredential() {
        return this.identityCredential;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest setIdentityCredentialNo(String identityCredentialNo) {
        this.identityCredentialNo = identityCredentialNo;
        return this;
    }
    public String getIdentityCredentialNo() {
        return this.identityCredentialNo;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest setIdentityCredentialType(String identityCredentialType) {
        this.identityCredentialType = identityCredentialType;
        return this;
    }
    public String getIdentityCredentialType() {
        return this.identityCredentialType;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

}
