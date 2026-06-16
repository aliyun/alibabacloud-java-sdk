// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateAgentRuntimeEndpointRequest extends TeaModel {
    /**
     * <p>Update Agent Runtime Endpoint Input</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateAgentRuntimeEndpointInput body;

    public static UpdateAgentRuntimeEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentRuntimeEndpointRequest self = new UpdateAgentRuntimeEndpointRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentRuntimeEndpointRequest setBody(UpdateAgentRuntimeEndpointInput body) {
        this.body = body;
        return this;
    }
    public UpdateAgentRuntimeEndpointInput getBody() {
        return this.body;
    }

}
