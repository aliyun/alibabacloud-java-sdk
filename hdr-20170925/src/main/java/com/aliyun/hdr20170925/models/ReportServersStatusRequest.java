// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportServersStatusRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Servers")
    public String servers;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportServersStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportServersStatusRequest self = new ReportServersStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportServersStatusRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportServersStatusRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportServersStatusRequest setServers(String servers) {
        this.servers = servers;
        return this;
    }
    public String getServers() {
        return this.servers;
    }

    public ReportServersStatusRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
