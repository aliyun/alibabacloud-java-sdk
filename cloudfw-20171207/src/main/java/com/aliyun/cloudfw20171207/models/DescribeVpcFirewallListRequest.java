// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallListRequest extends TeaModel {
    /**
     * <p>The subtype of the connection. Valid values:</p>
     * <ul>
     * <li><p><strong>vpc2vpc</strong>: Express Connect.</p>
     * </li>
     * <li><p><strong>vpcpeer</strong>: peering connection.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpcpeer</p>
     */
    @NameInMap("ConnectSubType")
    public String connectSubType;

    /**
     * <p>The page number.</p>
     * <p>Default value: <strong>1</strong>.</p>
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
     * <li><p><strong>configured</strong>: The firewall is configured.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, VPC firewalls in all states are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>opened</p>
     */
    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    /**
     * <p>The language of the request and response. Valid values:</p>
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
     * <p>The UID of the member account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The number of entries per page.</p>
     * <p>Default value: <strong>10</strong>. Maximum value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The UID of the Alibaba Cloud account to which the peer VPC belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("PeerUid")
    public String peerUid;

    /**
     * <p>The region ID of the VPC.</p>
     * <blockquote>
     * <p>For more information about the regions where Cloud Firewall is supported, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

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
     * <p>test-vpc-firewall</p>
     */
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    /**
     * <p>The instance ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-8vbwbo90rq0anm6t****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeVpcFirewallListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallListRequest self = new DescribeVpcFirewallListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallListRequest setConnectSubType(String connectSubType) {
        this.connectSubType = connectSubType;
        return this;
    }
    public String getConnectSubType() {
        return this.connectSubType;
    }

    public DescribeVpcFirewallListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVpcFirewallListRequest setFirewallSwitchStatus(String firewallSwitchStatus) {
        this.firewallSwitchStatus = firewallSwitchStatus;
        return this;
    }
    public String getFirewallSwitchStatus() {
        return this.firewallSwitchStatus;
    }

    public DescribeVpcFirewallListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallListRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeVpcFirewallListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcFirewallListRequest setPeerUid(String peerUid) {
        this.peerUid = peerUid;
        return this;
    }
    public String getPeerUid() {
        return this.peerUid;
    }

    public DescribeVpcFirewallListRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeVpcFirewallListRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public DescribeVpcFirewallListRequest setVpcFirewallName(String vpcFirewallName) {
        this.vpcFirewallName = vpcFirewallName;
        return this;
    }
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

    public DescribeVpcFirewallListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
