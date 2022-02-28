// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDrGatewayStatisticsRequest extends TeaModel {
    @NameInMap("DownstreamTraffic")
    public Long downstreamTraffic;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UpstreamTraffic")
    public Long upstreamTraffic;

    @NameInMap("UserUid")
    public Long userUid;

    public static ReportDrGatewayStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportDrGatewayStatisticsRequest self = new ReportDrGatewayStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ReportDrGatewayStatisticsRequest setDownstreamTraffic(Long downstreamTraffic) {
        this.downstreamTraffic = downstreamTraffic;
        return this;
    }
    public Long getDownstreamTraffic() {
        return this.downstreamTraffic;
    }

    public ReportDrGatewayStatisticsRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ReportDrGatewayStatisticsRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ReportDrGatewayStatisticsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ReportDrGatewayStatisticsRequest setUpstreamTraffic(Long upstreamTraffic) {
        this.upstreamTraffic = upstreamTraffic;
        return this;
    }
    public Long getUpstreamTraffic() {
        return this.upstreamTraffic;
    }

    public ReportDrGatewayStatisticsRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
