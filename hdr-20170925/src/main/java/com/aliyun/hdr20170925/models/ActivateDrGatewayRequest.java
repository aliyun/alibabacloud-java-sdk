// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ActivateDrGatewayRequest extends TeaModel {
    @NameInMap("ActivationCode")
    public Long activationCode;

    @NameInMap("GatewayVersion")
    public String gatewayVersion;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ActivateDrGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateDrGatewayRequest self = new ActivateDrGatewayRequest();
        return TeaModel.build(map, self);
    }

    public ActivateDrGatewayRequest setActivationCode(Long activationCode) {
        this.activationCode = activationCode;
        return this;
    }
    public Long getActivationCode() {
        return this.activationCode;
    }

    public ActivateDrGatewayRequest setGatewayVersion(String gatewayVersion) {
        this.gatewayVersion = gatewayVersion;
        return this;
    }
    public String getGatewayVersion() {
        return this.gatewayVersion;
    }

    public ActivateDrGatewayRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public ActivateDrGatewayRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
