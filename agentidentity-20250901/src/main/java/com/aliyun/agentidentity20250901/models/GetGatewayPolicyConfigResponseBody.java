// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetGatewayPolicyConfigResponseBody extends TeaModel {
    @NameInMap("GatewayPolicyConfig")
    public GetGatewayPolicyConfigResponseBodyGatewayPolicyConfig gatewayPolicyConfig;

    /**
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
         * <strong>example:</strong>
         * <p>ENFORCE</p>
         */
        @NameInMap("EnforcementMode")
        public String enforcementMode;

        /**
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
