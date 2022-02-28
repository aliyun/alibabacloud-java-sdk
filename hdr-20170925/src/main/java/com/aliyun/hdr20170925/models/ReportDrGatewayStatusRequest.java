// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDrGatewayStatusRequest extends TeaModel {
    @NameInMap("DownstreamSpeed")
    public Long downstreamSpeed;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UpstreamSpeed")
    public Long upstreamSpeed;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportDrGatewayStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportDrGatewayStatusRequest self = new ReportDrGatewayStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportDrGatewayStatusRequest setDownstreamSpeed(Long downstreamSpeed) {
        this.downstreamSpeed = downstreamSpeed;
        return this;
    }
    public Long getDownstreamSpeed() {
        return this.downstreamSpeed;
    }

    public ReportDrGatewayStatusRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportDrGatewayStatusRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportDrGatewayStatusRequest setUpstreamSpeed(Long upstreamSpeed) {
        this.upstreamSpeed = upstreamSpeed;
        return this;
    }
    public Long getUpstreamSpeed() {
        return this.upstreamSpeed;
    }

    public ReportDrGatewayStatusRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
