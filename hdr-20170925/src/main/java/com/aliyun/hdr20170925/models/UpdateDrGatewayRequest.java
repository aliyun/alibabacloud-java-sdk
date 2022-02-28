// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateDrGatewayRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Password")
    public String password;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static UpdateDrGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDrGatewayRequest self = new UpdateDrGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDrGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public UpdateDrGatewayRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateDrGatewayRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
