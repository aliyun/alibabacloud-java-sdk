// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetDiscoveryEndpointsOutput extends TeaModel {
    @NameInMap("credentialName")
    public String credentialName;

    @NameInMap("discoveryEndpoints")
    public java.util.List<DiscoveryEndpoint> discoveryEndpoints;

    public static GetDiscoveryEndpointsOutput build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveryEndpointsOutput self = new GetDiscoveryEndpointsOutput();
        return TeaModel.build(map, self);
    }

    public GetDiscoveryEndpointsOutput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public GetDiscoveryEndpointsOutput setDiscoveryEndpoints(java.util.List<DiscoveryEndpoint> discoveryEndpoints) {
        this.discoveryEndpoints = discoveryEndpoints;
        return this;
    }
    public java.util.List<DiscoveryEndpoint> getDiscoveryEndpoints() {
        return this.discoveryEndpoints;
    }

}
