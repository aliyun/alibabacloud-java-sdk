// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetGatewayPolicyConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acs:agentidentity:cn-beijing:123456:gateway/my-gateway</p>
     */
    @NameInMap("GatewayArn")
    public String gatewayArn;

    @NameInMap("GatewayType")
    public String gatewayType;

    public static GetGatewayPolicyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayPolicyConfigRequest self = new GetGatewayPolicyConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetGatewayPolicyConfigRequest setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
        return this;
    }
    public String getGatewayArn() {
        return this.gatewayArn;
    }

    public GetGatewayPolicyConfigRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

}
