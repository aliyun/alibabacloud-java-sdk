// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateFlowEndpointRequest extends TeaModel {
    /**
     * <p>Request parameters for creating a flow endpoint</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateFlowEndpointInput body;

    public static CreateFlowEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowEndpointRequest self = new CreateFlowEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowEndpointRequest setBody(CreateFlowEndpointInput body) {
        this.body = body;
        return this;
    }
    public CreateFlowEndpointInput getBody() {
        return this.body;
    }

}
