// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForGenerateDomainCertificateShrinkRequest extends TeaModel {
    @NameInMap("DomainNames")
    public String domainNamesShrink;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForGenerateDomainCertificateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForGenerateDomainCertificateShrinkRequest self = new SaveBatchTaskForGenerateDomainCertificateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForGenerateDomainCertificateShrinkRequest setDomainNamesShrink(String domainNamesShrink) {
        this.domainNamesShrink = domainNamesShrink;
        return this;
    }
    public String getDomainNamesShrink() {
        return this.domainNamesShrink;
    }

    public SaveBatchTaskForGenerateDomainCertificateShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForGenerateDomainCertificateShrinkRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
