// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsCacheDomainRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DeleteDnsCacheDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsCacheDomainRequest self = new DeleteDnsCacheDomainRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDnsCacheDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteDnsCacheDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
