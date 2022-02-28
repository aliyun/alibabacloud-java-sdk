// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class GenerateActivateCodeRequest extends TeaModel {
    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static GenerateActivateCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateActivateCodeRequest self = new GenerateActivateCodeRequest();
        return TeaModel.build(map, self);
    }

    public GenerateActivateCodeRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public GenerateActivateCodeRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public GenerateActivateCodeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
