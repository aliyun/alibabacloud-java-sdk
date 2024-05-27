// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class BindInstanceDomainsRequest extends TeaModel {
    /**
     * <p>The domain names.</p>
     * <br>
     * <p>>  Separate multiple domain names with commas (,). Up to 100 domain names can be entered.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static BindInstanceDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        BindInstanceDomainsRequest self = new BindInstanceDomainsRequest();
        return TeaModel.build(map, self);
    }

    public BindInstanceDomainsRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BindInstanceDomainsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BindInstanceDomainsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
