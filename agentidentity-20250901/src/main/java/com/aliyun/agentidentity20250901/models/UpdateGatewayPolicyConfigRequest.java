// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateGatewayPolicyConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ENFORCE</p>
     */
    @NameInMap("EnforcementMode")
    public String enforcementMode;

    /**
     * <strong>example:</strong>
     * <p>acs:agentidentity:cn-beijing:123456:gateway/my-gateway</p>
     */
    @NameInMap("GatewayArn")
    public String gatewayArn;

    @NameInMap("GatewayType")
    public String gatewayType;

    public static UpdateGatewayPolicyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayPolicyConfigRequest self = new UpdateGatewayPolicyConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayPolicyConfigRequest setEnforcementMode(String enforcementMode) {
        this.enforcementMode = enforcementMode;
        return this;
    }
    public String getEnforcementMode() {
        return this.enforcementMode;
    }

    public UpdateGatewayPolicyConfigRequest setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
        return this;
    }
    public String getGatewayArn() {
        return this.gatewayArn;
    }

    public UpdateGatewayPolicyConfigRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

}
