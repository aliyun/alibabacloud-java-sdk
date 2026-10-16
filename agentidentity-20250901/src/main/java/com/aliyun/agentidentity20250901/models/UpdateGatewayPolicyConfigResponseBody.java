// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateGatewayPolicyConfigResponseBody extends TeaModel {
    /**
     * <p>The gateway policy configuration.</p>
     */
    @NameInMap("GatewayPolicyConfig")
    public UpdateGatewayPolicyConfigResponseBodyGatewayPolicyConfig gatewayPolicyConfig;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGatewayPolicyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayPolicyConfigResponseBody self = new UpdateGatewayPolicyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayPolicyConfigResponseBody setGatewayPolicyConfig(UpdateGatewayPolicyConfigResponseBodyGatewayPolicyConfig gatewayPolicyConfig) {
        this.gatewayPolicyConfig = gatewayPolicyConfig;
        return this;
    }
    public UpdateGatewayPolicyConfigResponseBodyGatewayPolicyConfig getGatewayPolicyConfig() {
        return this.gatewayPolicyConfig;
    }

    public UpdateGatewayPolicyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateGatewayPolicyConfigResponseBodyGatewayPolicyConfig extends TeaModel {
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
         * <p>The ARN of the policy set.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:policyset/default-policy-set</p>
         */
        @NameInMap("PolicySetArn")
        public String policySetArn;

        public static UpdateGatewayPolicyConfigResponseBodyGatewayPolicyConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayPolicyConfigResponseBodyGatewayPolicyConfig self = new UpdateGatewayPolicyConfigResponseBodyGatewayPolicyConfig();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayPolicyConfigResponseBodyGatewayPolicyConfig setEnforcementMode(String enforcementMode) {
            this.enforcementMode = enforcementMode;
            return this;
        }
        public String getEnforcementMode() {
            return this.enforcementMode;
        }

        public UpdateGatewayPolicyConfigResponseBodyGatewayPolicyConfig setPolicySetArn(String policySetArn) {
            this.policySetArn = policySetArn;
            return this;
        }
        public String getPolicySetArn() {
            return this.policySetArn;
        }

    }

}
