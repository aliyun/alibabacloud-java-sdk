// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2DetailResponseBody extends TeaModel {
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("FirewallDescription")
    public String firewallDescription;

    @NameInMap("FirewallEniId")
    public String firewallEniId;

    @NameInMap("FirewallEniVpcId")
    public String firewallEniVpcId;

    @NameInMap("FirewallEniVswitchId")
    public String firewallEniVswitchId;

    @NameInMap("FirewallId")
    public String firewallId;

    @NameInMap("FirewallName")
    public String firewallName;

    @NameInMap("FirewallStatus")
    public String firewallStatus;

    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    @NameInMap("RegionNo")
    public String regionNo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouteMode")
    public String routeMode;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static DescribeTrFirewallsV2DetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallsV2DetailResponseBody self = new DescribeTrFirewallsV2DetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallsV2DetailResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallDescription(String firewallDescription) {
        this.firewallDescription = firewallDescription;
        return this;
    }
    public String getFirewallDescription() {
        return this.firewallDescription;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallEniId(String firewallEniId) {
        this.firewallEniId = firewallEniId;
        return this;
    }
    public String getFirewallEniId() {
        return this.firewallEniId;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallEniVpcId(String firewallEniVpcId) {
        this.firewallEniVpcId = firewallEniVpcId;
        return this;
    }
    public String getFirewallEniVpcId() {
        return this.firewallEniVpcId;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallEniVswitchId(String firewallEniVswitchId) {
        this.firewallEniVswitchId = firewallEniVswitchId;
        return this;
    }
    public String getFirewallEniVswitchId() {
        return this.firewallEniVswitchId;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallName(String firewallName) {
        this.firewallName = firewallName;
        return this;
    }
    public String getFirewallName() {
        return this.firewallName;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallStatus(String firewallStatus) {
        this.firewallStatus = firewallStatus;
        return this;
    }
    public String getFirewallStatus() {
        return this.firewallStatus;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallSwitchStatus(String firewallSwitchStatus) {
        this.firewallSwitchStatus = firewallSwitchStatus;
        return this;
    }
    public String getFirewallSwitchStatus() {
        return this.firewallSwitchStatus;
    }

    public DescribeTrFirewallsV2DetailResponseBody setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeTrFirewallsV2DetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTrFirewallsV2DetailResponseBody setRouteMode(String routeMode) {
        this.routeMode = routeMode;
        return this;
    }
    public String getRouteMode() {
        return this.routeMode;
    }

    public DescribeTrFirewallsV2DetailResponseBody setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}
