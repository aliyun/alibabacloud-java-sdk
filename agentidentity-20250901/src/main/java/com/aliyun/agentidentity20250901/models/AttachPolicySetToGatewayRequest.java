// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class AttachPolicySetToGatewayRequest extends TeaModel {
    @NameInMap("EnforcementMode")
    public String enforcementMode;

    @NameInMap("GatewayArn")
    public String gatewayArn;

    @NameInMap("GatewayType")
    public String gatewayType;

    @NameInMap("PolicySetName")
    public String policySetName;

    public static AttachPolicySetToGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicySetToGatewayRequest self = new AttachPolicySetToGatewayRequest();
        return TeaModel.build(map, self);
    }

    public AttachPolicySetToGatewayRequest setEnforcementMode(String enforcementMode) {
        this.enforcementMode = enforcementMode;
        return this;
    }
    public String getEnforcementMode() {
        return this.enforcementMode;
    }

    public AttachPolicySetToGatewayRequest setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
        return this;
    }
    public String getGatewayArn() {
        return this.gatewayArn;
    }

    public AttachPolicySetToGatewayRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public AttachPolicySetToGatewayRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

}
