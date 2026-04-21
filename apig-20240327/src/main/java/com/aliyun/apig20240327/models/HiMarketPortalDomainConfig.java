// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketPortalDomainConfig extends TeaModel {
    @NameInMap("domain")
    public String domain;

    @NameInMap("protocol")
    public String protocol;

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
