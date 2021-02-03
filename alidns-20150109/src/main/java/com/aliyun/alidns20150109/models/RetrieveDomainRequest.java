// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RetrieveDomainRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static RetrieveDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrieveDomainRequest self = new RetrieveDomainRequest();
        return TeaModel.build(map, self);
    }

    public RetrieveDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public RetrieveDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
