// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ModelApiDomainInfo extends TeaModel {
    /**
     * <p>Indicates whether it is the default domain name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("default")
    public Boolean _default;

    /**
     * <p>The domain name ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-d00000000000000000000</p>
     */
    @NameInMap("domainId")
    public String domainId;

    /**
     * <p>The domain name scope.</p>
     * 
     * <strong>example:</strong>
     * <p>Dedicated</p>
     */
    @NameInMap("domainScope")
    public String domainScope;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>api.example.com</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The access protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    public static ModelApiDomainInfo build(java.util.Map<String, ?> map) throws Exception {
        ModelApiDomainInfo self = new ModelApiDomainInfo();
        return TeaModel.build(map, self);
    }

    public ModelApiDomainInfo set_default(Boolean _default) {
        this._default = _default;
        return this;
    }
    public Boolean get_default() {
        return this._default;
    }

    public ModelApiDomainInfo setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public ModelApiDomainInfo setDomainScope(String domainScope) {
        this.domainScope = domainScope;
        return this;
    }
    public String getDomainScope() {
        return this.domainScope;
    }

    public ModelApiDomainInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelApiDomainInfo setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
