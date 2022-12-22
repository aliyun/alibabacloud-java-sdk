// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallListRequest extends TeaModel {
    // The sub type of connection. Valid values:
    // 
    // - **vpc2vpc**: High-speed channel.
    // - **vppeer**: Peer connection.
    @NameInMap("ConnectSubType")
    public String connectSubType;

    // The number of the page to return.
    // 
    // Pages start from page **1**. Default value: **1**.
    @NameInMap("CurrentPage")
    public String currentPage;

    // The status of the VPC firewall. Valid values:
    // 
    // *   **opened**: The VPC firewall is enabled.
    // *   **closed**: The VPC firewall is disabled.
    // *   **notconfigured**: The VPC firewall is not configured.
    // *   **configured**: The VPC firewall is configured.
    // 
    // >  If you do not specify this parameter, VPC firewalls in all states are queried.
    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    // The natural language of the request and response. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The UID of the member that is managed by your Alibaba Cloud account.
    @NameInMap("MemberUid")
    public String memberUid;

    // The number of entries to return on each page.
    // 
    // Default value: **10**.**** Maximum value: **50**.
    @NameInMap("PageSize")
    public String pageSize;

    // The cloud account UID of the peer VPC.
    @NameInMap("PeerUid")
    public String peerUid;

    // The region ID of the VPC.
    // 
    // >  For more information about regions in which Cloud Firewall is supported, see [Supported regions](~~195657~~).
    @NameInMap("RegionNo")
    public String regionNo;

    // The instance ID of the VPC firewall.
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    // The instance name of the VPC firewall.
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    // The ID of the VPC.
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
