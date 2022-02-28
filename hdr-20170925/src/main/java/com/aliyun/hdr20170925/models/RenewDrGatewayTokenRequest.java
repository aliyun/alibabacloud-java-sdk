// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RenewDrGatewayTokenRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("PubToken")
    public String pubToken;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SubToken")
    public String subToken;

    @NameInMap("UserUid")
    public Long userUid;

    public static RenewDrGatewayTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewDrGatewayTokenRequest self = new RenewDrGatewayTokenRequest();
        return TeaModel.build(map, self);
    }

    public RenewDrGatewayTokenRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public RenewDrGatewayTokenRequest setPubToken(String pubToken) {
        this.pubToken = pubToken;
        return this;
    }
    public String getPubToken() {
        return this.pubToken;
    }

    public RenewDrGatewayTokenRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RenewDrGatewayTokenRequest setSubToken(String subToken) {
        this.subToken = subToken;
        return this;
    }
    public String getSubToken() {
        return this.subToken;
    }

    public RenewDrGatewayTokenRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
