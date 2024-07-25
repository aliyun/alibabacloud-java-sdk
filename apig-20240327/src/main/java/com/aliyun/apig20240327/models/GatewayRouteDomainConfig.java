// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GatewayRouteDomainConfig extends TeaModel {
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    public static GatewayRouteDomainConfig build(java.util.Map<String, ?> map) throws Exception {
        GatewayRouteDomainConfig self = new GatewayRouteDomainConfig();
        return TeaModel.build(map, self);
    }

    public GatewayRouteDomainConfig setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

}
