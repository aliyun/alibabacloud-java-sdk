// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UnbindInstanceDomainsRequest extends TeaModel {
    /**
     * <p>The domain names.</p>
     * <p>Separate multiple domain names with commas (,). Up to 100 domain names can be entered.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com,example.net</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static UnbindInstanceDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindInstanceDomainsRequest self = new UnbindInstanceDomainsRequest();
        return TeaModel.build(map, self);
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

    public UnbindInstanceDomainsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
