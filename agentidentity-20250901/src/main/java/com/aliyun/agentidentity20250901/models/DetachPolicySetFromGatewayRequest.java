// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DetachPolicySetFromGatewayRequest extends TeaModel {
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
     * <li>AIGateway: Alibaba Cloud AI Gateway.</li>
     * <li>AgentRunMCP: AgentRun MCP tool.</li>
     * </ul>
     * <p>Default value: AIGateway.</p>
     * 
     * <strong>example:</strong>
     * <p>AIGateway</p>
     */
    @NameInMap("GatewayType")
    public String gatewayType;

    /**
     * <p>The name of the policy set. The name must be unique within the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>default-policy-set</p>
     */
    @NameInMap("PolicySetName")
    public String policySetName;

    public static DetachPolicySetFromGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicySetFromGatewayRequest self = new DetachPolicySetFromGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DetachPolicySetFromGatewayRequest setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
        return this;
    }
    public String getGatewayArn() {
        return this.gatewayArn;
    }

    public DetachPolicySetFromGatewayRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public DetachPolicySetFromGatewayRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

}
