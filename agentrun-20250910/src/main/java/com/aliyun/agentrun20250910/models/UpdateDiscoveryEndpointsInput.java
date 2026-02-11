// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateDiscoveryEndpointsInput extends TeaModel {
    @NameInMap("discoveryEndpoints")
    public java.util.List<DiscoveryEndpoint> discoveryEndpoints;

    public static UpdateDiscoveryEndpointsInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateDiscoveryEndpointsInput self = new UpdateDiscoveryEndpointsInput();
        return TeaModel.build(map, self);
    }

    public UpdateDiscoveryEndpointsInput setDiscoveryEndpoints(java.util.List<DiscoveryEndpoint> discoveryEndpoints) {
        this.discoveryEndpoints = discoveryEndpoints;
        return this;
    }
    public java.util.List<DiscoveryEndpoint> getDiscoveryEndpoints() {
        return this.discoveryEndpoints;
    }

}
