// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateGatewayPolicyConfigRequest extends TeaModel {
    /**
     * <p>The policy enforcement mode. Valid values:</p>
     * <ul>
     * <li>ENFORCE: Intercepts non-compliant requests and allows compliant requests.</li>
     * <li>LOG_ONLY: Only logs non-compliant requests without intercepting them.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENFORCE</p>
     */
    @NameInMap("EnforcementMode")
    public String enforcementMode;

    /**
     * <p>The ARN of the target gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:agentidentity:cn-beijing:123456:gateway/my-gateway</p>
     */
    @NameInMap("GatewayArn")
    public String gatewayArn;

    /**
     * <p>The gateway type. Valid values:</p>
     * <ul>
     * <li>AIGateway: Alibaba Cloud AI gateway.</li>
     * <li>AgentRunMCP: AgentRun MCP tool.
     * If you do not specify this parameter, the default value is AIGateway.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AIGateway</p>
     */
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
