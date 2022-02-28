// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportShadowConsistenceRequest extends TeaModel {
    @NameInMap("Consistent")
    public Boolean consistent;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportShadowConsistenceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportShadowConsistenceRequest self = new ReportShadowConsistenceRequest();
        return TeaModel.build(map, self);
    }

    public ReportShadowConsistenceRequest setConsistent(Boolean consistent) {
        this.consistent = consistent;
        return this;
    }
    public Boolean getConsistent() {
        return this.consistent;
    }

    public ReportShadowConsistenceRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportShadowConsistenceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportShadowConsistenceRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public ReportShadowConsistenceRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
