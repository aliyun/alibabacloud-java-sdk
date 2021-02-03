// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UnbindInstanceDomainsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainNames")
    @Validation(required = true)
    public String domainNames;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static UnbindInstanceDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindInstanceDomainsRequest self = new UnbindInstanceDomainsRequest();
        return TeaModel.build(map, self);
    }

    public UnbindInstanceDomainsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UnbindInstanceDomainsRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public UnbindInstanceDomainsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
