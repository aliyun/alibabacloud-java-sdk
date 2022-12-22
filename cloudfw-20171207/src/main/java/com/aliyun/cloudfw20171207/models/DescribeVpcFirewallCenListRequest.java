// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallCenListRequest extends TeaModel {
    // The ID of the CEN instance.
    @NameInMap("CenId")
    public String cenId;

    // The number of the page to return.
    // 
    // Pages start from page 1. Default value: 1.
    @NameInMap("CurrentPage")
    public String currentPage;

    // The status of the VPC firewall. Valid values:
    // 
    // *   **opened**: The VPC firewall is enabled.
    // *   **closed**: The VPC firewall is disabled.
    // *   **notconfigured**: The VPC firewall is not created.
    // *   **configured**: The VPC firewall is created but is not enabled.
    // 
    // >  If you do not specify this parameter, VPC firewalls in all states are queried.
    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    // The language of the content within the response. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The UID of the member that is manged by your Alibaba Cloud account. The member is also an Alibaba Cloud account.
    @NameInMap("MemberUid")
    public String memberUid;

    // The ID of the network instance.
    @NameInMap("NetworkInstanceId")
    public String networkInstanceId;

    @NameInMap("OwnerId")
    public String ownerId;

    // The number of entries to return on each page.
    // 
    // Default value: 10. Maximum value: 50.
    @NameInMap("PageSize")
    public String pageSize;

    // The region ID of the VPC.
    // 
    // >  For more information about the regions, see [Supported regions](~~195657~~).
    @NameInMap("RegionNo")
    public String regionNo;

    // The routing mode of the VPC firewall. Valid values:
    // 
    // *   **auto**: automatic mode
    // *   **manual**: manual mode
    // 
    // >  If you do not specify this parameter, VPC firewalls in all routing modes are queried.
    @NameInMap("RouteMode")
    public String routeMode;

    // The type of the transit router. Valid values:
    // 
    // *   **Basic**: Basic Edition transit router
    // *   **Enterprise**: Enterprise Edition transit router
    @NameInMap("TransitRouterType")
    public String transitRouterType;

    // The instance ID of the VPC firewall.
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    // The instance name of the VPC firewall.
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    public static DescribeVpcFirewallCenListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallCenListRequest self = new DescribeVpcFirewallCenListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallCenListRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeVpcFirewallCenListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVpcFirewallCenListRequest setFirewallSwitchStatus(String firewallSwitchStatus) {
        this.firewallSwitchStatus = firewallSwitchStatus;
        return this;
    }
    public String getFirewallSwitchStatus() {
        return this.firewallSwitchStatus;
    }

    public DescribeVpcFirewallCenListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallCenListRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeVpcFirewallCenListRequest setNetworkInstanceId(String networkInstanceId) {
        this.networkInstanceId = networkInstanceId;
        return this;
    }
    public String getNetworkInstanceId() {
        return this.networkInstanceId;
    }

    public DescribeVpcFirewallCenListRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeVpcFirewallCenListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcFirewallCenListRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeVpcFirewallCenListRequest setRouteMode(String routeMode) {
        this.routeMode = routeMode;
        return this;
    }
    public String getRouteMode() {
        return this.routeMode;
    }

    public DescribeVpcFirewallCenListRequest setTransitRouterType(String transitRouterType) {
        this.transitRouterType = transitRouterType;
        return this;
    }
    public String getTransitRouterType() {
        return this.transitRouterType;
    }

    public DescribeVpcFirewallCenListRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public DescribeVpcFirewallCenListRequest setVpcFirewallName(String vpcFirewallName) {
        this.vpcFirewallName = vpcFirewallName;
        return this;
    }
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

}
