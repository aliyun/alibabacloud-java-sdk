// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetNatGatewayStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inst-1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetNatGatewayStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNatGatewayStatusRequest self = new GetNatGatewayStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetNatGatewayStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
