// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainNameCredentialRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Credential")
    public String credential;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CredentialNo")
    public String credentialNo;

    @NameInMap("CredentialType")
    public String credentialType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SaleId")
    public String saleId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveTaskForSubmittingDomainNameCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForSubmittingDomainNameCredentialRequest self = new SaveTaskForSubmittingDomainNameCredentialRequest();
        return TeaModel.build(map, self);
    }

    public SaveTaskForSubmittingDomainNameCredentialRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public SaveTaskForSubmittingDomainNameCredentialRequest setCredentialNo(String credentialNo) {
        this.credentialNo = credentialNo;
        return this;
    }
    public String getCredentialNo() {
        return this.credentialNo;
    }

    public SaveTaskForSubmittingDomainNameCredentialRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public SaveTaskForSubmittingDomainNameCredentialRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveTaskForSubmittingDomainNameCredentialRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveTaskForSubmittingDomainNameCredentialRequest setSaleId(String saleId) {
        this.saleId = saleId;
        return this;
    }
    public String getSaleId() {
        return this.saleId;
    }

    public SaveTaskForSubmittingDomainNameCredentialRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
