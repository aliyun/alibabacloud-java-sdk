// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CheckGatewayConnectivityRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CheckGatewayConnectivityRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckGatewayConnectivityRequest self = new CheckGatewayConnectivityRequest();
        return TeaModel.build(map, self);
    }

    public CheckGatewayConnectivityRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CheckGatewayConnectivityRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
