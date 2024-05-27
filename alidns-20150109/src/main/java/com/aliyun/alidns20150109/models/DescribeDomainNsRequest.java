// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainNsRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeDomainNsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainNsRequest self = new DescribeDomainNsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainNsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainNsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
