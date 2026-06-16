// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateFlowEndpointRequest extends TeaModel {
    /**
     * <p>Update Flow Endpoint Input Parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateFlowEndpointInput body;

    public static UpdateFlowEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowEndpointRequest self = new UpdateFlowEndpointRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowEndpointRequest setBody(UpdateFlowEndpointInput body) {
        this.body = body;
        return this;
    }
    public UpdateFlowEndpointInput getBody() {
        return this.body;
    }

}
