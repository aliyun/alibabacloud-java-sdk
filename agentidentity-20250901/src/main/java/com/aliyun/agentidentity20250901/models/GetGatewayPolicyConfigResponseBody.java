// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetGatewayPolicyConfigResponseBody extends TeaModel {
    /**
     * <p>The gateway policy configuration.</p>
     */
    @NameInMap("GatewayPolicyConfig")
    public GetGatewayPolicyConfigResponseBodyGatewayPolicyConfig gatewayPolicyConfig;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetGatewayPolicyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayPolicyConfigResponseBody self = new GetGatewayPolicyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayPolicyConfigResponseBody setGatewayPolicyConfig(GetGatewayPolicyConfigResponseBodyGatewayPolicyConfig gatewayPolicyConfig) {
        this.gatewayPolicyConfig = gatewayPolicyConfig;
        return this;
    }
    public GetGatewayPolicyConfigResponseBodyGatewayPolicyConfig getGatewayPolicyConfig() {
        return this.gatewayPolicyConfig;
    }

    public GetGatewayPolicyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGatewayPolicyConfigResponseBodyGatewayPolicyConfig extends TeaModel {
        /**
         * <p>The policy enforcement mode. Valid values:</p>
         * <ul>
         * <li>ENFORCE: Blocks non-compliant requests and allows compliant requests.</li>
         * <li>LOG_ONLY: Records non-compliant requests without blocking them.</li>
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

        public static GetGatewayPolicyConfigResponseBodyGatewayPolicyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayPolicyConfigResponseBodyGatewayPolicyConfig self = new GetGatewayPolicyConfigResponseBodyGatewayPolicyConfig();
            return TeaModel.build(map, self);
        }

        public GetGatewayPolicyConfigResponseBodyGatewayPolicyConfig setEnforcementMode(String enforcementMode) {
            this.enforcementMode = enforcementMode;
            return this;
        }
        public String getEnforcementMode() {
            return this.enforcementMode;
        }

        public GetGatewayPolicyConfigResponseBodyGatewayPolicyConfig setPolicySetArn(String policySetArn) {
            this.policySetArn = policySetArn;
            return this;
        }
        public String getPolicySetArn() {
            return this.policySetArn;
        }

    }

}
