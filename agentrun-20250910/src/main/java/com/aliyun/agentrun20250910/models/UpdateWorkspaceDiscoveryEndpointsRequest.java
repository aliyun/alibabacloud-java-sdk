// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceDiscoveryEndpointsRequest extends TeaModel {
    @NameInMap("body")
    public UpdateDiscoveryEndpointsInput body;

    public static UpdateWorkspaceDiscoveryEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceDiscoveryEndpointsRequest self = new UpdateWorkspaceDiscoveryEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceDiscoveryEndpointsRequest setBody(UpdateDiscoveryEndpointsInput body) {
        this.body = body;
        return this;
    }
    public UpdateDiscoveryEndpointsInput getBody() {
        return this.body;
    }

}
