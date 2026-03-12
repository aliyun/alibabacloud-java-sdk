// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveContactTemplateCredentialRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactTemplateId")
    public Long contactTemplateId;

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

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveContactTemplateCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveContactTemplateCredentialRequest self = new SaveContactTemplateCredentialRequest();
        return TeaModel.build(map, self);
    }

    public SaveContactTemplateCredentialRequest setContactTemplateId(Long contactTemplateId) {
        this.contactTemplateId = contactTemplateId;
        return this;
    }
    public Long getContactTemplateId() {
        return this.contactTemplateId;
    }

    public SaveContactTemplateCredentialRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public SaveContactTemplateCredentialRequest setCredentialNo(String credentialNo) {
        this.credentialNo = credentialNo;
        return this;
    }
    public String getCredentialNo() {
        return this.credentialNo;
    }

    public SaveContactTemplateCredentialRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveContactTemplateCredentialRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
