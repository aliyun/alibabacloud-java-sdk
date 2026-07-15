// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketPortalDomainConfig extends TeaModel {
    /**
     * <p>The domain name address.</p>
     * 
     * <strong>example:</strong>
     * <p>portal.example.com</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The request protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTPS</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The domain name type.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("type")
    public String type;

    public static HiMarketPortalDomainConfig build(java.util.Map<String, ?> map) throws Exception {
        HiMarketPortalDomainConfig self = new HiMarketPortalDomainConfig();
        return TeaModel.build(map, self);
    }

    public HiMarketPortalDomainConfig setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public HiMarketPortalDomainConfig setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public HiMarketPortalDomainConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
