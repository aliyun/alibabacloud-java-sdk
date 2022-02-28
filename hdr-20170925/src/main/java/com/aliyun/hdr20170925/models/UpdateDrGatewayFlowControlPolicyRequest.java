// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateDrGatewayFlowControlPolicyRequest extends TeaModel {
    @NameInMap("FlowControlPolicy")
    public String flowControlPolicy;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static UpdateDrGatewayFlowControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDrGatewayFlowControlPolicyRequest self = new UpdateDrGatewayFlowControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDrGatewayFlowControlPolicyRequest setFlowControlPolicy(String flowControlPolicy) {
        this.flowControlPolicy = flowControlPolicy;
        return this;
    }
    public String getFlowControlPolicy() {
        return this.flowControlPolicy;
    }

    public UpdateDrGatewayFlowControlPolicyRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public UpdateDrGatewayFlowControlPolicyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
