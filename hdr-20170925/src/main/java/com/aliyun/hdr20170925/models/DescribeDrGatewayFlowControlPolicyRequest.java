// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDrGatewayFlowControlPolicyRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDrGatewayFlowControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrGatewayFlowControlPolicyRequest self = new DescribeDrGatewayFlowControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrGatewayFlowControlPolicyRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeDrGatewayFlowControlPolicyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
