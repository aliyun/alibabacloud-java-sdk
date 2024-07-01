// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IdentityCredential")
    public String identityCredential;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IdentityCredentialNo")
    public String identityCredentialNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IdentityCredentialType")
    public String identityCredentialType;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest self = new SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest();
        return TeaModel.build(map, self);
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
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

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
