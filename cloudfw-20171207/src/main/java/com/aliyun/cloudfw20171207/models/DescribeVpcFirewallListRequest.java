// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallListRequest extends TeaModel {
    /**
     * <p>The sub-type of the connection. Valid values:</p>
     * <br>
     * <p>*   **vpc2vpc**: Express Connect connection</p>
     * <p>*   **vpcpeer**: peer connection</p>
     */
    @NameInMap("ConnectSubType")
    public String connectSubType;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The status of the VPC firewall. Valid values:</p>
     * <br>
     * <p>*   **opened**: The VPC firewall is enabled.</p>
     * <p>*   **closed**: The VPC firewall is disabled.</p>
     * <p>*   **notconfigured**: The VPC firewall is not configured.</p>
     * <p>*   **configured**: The VPC firewall is configured.</p>
     * <br>
     * <p>> If you do not specify this parameter, VPC firewalls in all states are queried.</p>
     */
    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Default value: **10**. Maximum value: **50**.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The UID of the Alibaba Cloud account to which the peer VPC belongs.</p>
     */
    @NameInMap("PeerUid")
    public String peerUid;

    /**
     * <p>The region ID of the VPC.</p>
     * <br>
     * <p>> For more information about the regions, see [Supported regions](https://help.aliyun.com/document_detail/195657.html).</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    /**
     * <p>The instance name of the VPC firewall.</p>
     */
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    /**
     * <p>The ID of the VPC.</p>
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
