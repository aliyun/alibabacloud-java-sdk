// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallCenListRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-x5jayxou71ad73****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The page number to return.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The status of the VPC firewall. Valid values:</p>
     * <ul>
     * <li><p><strong>opened</strong>: The firewall is enabled.</p>
     * </li>
     * <li><p><strong>closed</strong>: The firewall is disabled.</p>
     * </li>
     * <li><p><strong>notconfigured</strong>: The firewall is not configured.</p>
     * </li>
     * <li><p><strong>configured</strong>: The firewall is configured but is disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you leave this parameter empty, VPC firewalls in all states are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>opened</p>
     */
    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of a member account that is managed by your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The ID of the network instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-8vbwbo90rq0anm6t****</p>
     */
    @NameInMap("NetworkInstanceId")
    public String networkInstanceId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the VPC.</p>
     * <blockquote>
     * <p>For more information about the regions that Cloud Firewall supports, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The routing mode. Valid values:</p>
     * <ul>
     * <li><p><strong>auto</strong>: automatic mode.</p>
     * </li>
     * <li><p><strong>manual</strong>: manual mode.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you leave this parameter empty, VPC firewalls that use all routing modes are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("RouteMode")
    public String routeMode;

    /**
     * <p>The type of the transit router. Valid values:</p>
     * <ul>
     * <li><p><strong>Basic</strong>: Basic Edition transit router.</p>
     * </li>
     * <li><p><strong>Enterprise</strong>: Enterprise Edition transit router.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("TransitRouterType")
    public String transitRouterType;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-m5e7dbc4y****</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    /**
     * <p>The instance name of the VPC firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-firewall-test</p>
     */
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
