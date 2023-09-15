// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForGenerateDomainCertificateRequest extends TeaModel {
    @NameInMap("DomainNames")
    public java.util.List<String> domainNames;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForGenerateDomainCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForGenerateDomainCertificateRequest self = new SaveBatchTaskForGenerateDomainCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForGenerateDomainCertificateRequest setDomainNames(java.util.List<String> domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public java.util.List<String> getDomainNames() {
        return this.domainNames;
    }

    public SaveBatchTaskForGenerateDomainCertificateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForGenerateDomainCertificateRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
