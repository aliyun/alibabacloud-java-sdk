// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallConfigureRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The CIDR blocks of the local VPC. The value is a JSON string that contains the following parameters:</p>
     * <br>
     * <p>*   **RouteTableId**: the ID of the route table for the local VPC.</p>
     * <p>*   **RouteEntryList**: The value is a JSON string that contains the DestinationCidr and NextHopInstanceId parameters. The DestinationCidr parameter indicates the destination CIDR block of the local VPC. The NextHopInstanceId parameter indicates the instance ID of the next hop for the local VPC.</p>
     * <br>
     * <p>> You can call the [DescribeVpcFirewallDetail](https://help.aliyun.com/document_detail/342892.html) operation to query the CIDR blocks of local VPCs for VPC firewalls.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LocalVpcCidrTableList")
    public String localVpcCidrTableList;

    /**
     * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The CIDR blocks of the peer VPC. The value is a JSON string that contains the following parameters:</p>
     * <br>
     * <p>*   **RouteTableId**: the ID of the route table for the peer VPC.</p>
     * <p>*   **RouteEntryList**: The value is a JSON string that contains the DestinationCidr and NextHopInstanceId parameters. The DestinationCidr parameter indicates the destination CIDR block of the peer VPC. The NextHopInstanceId parameter indicates the instance ID of the next hop for the peer VPC.</p>
     * <br>
     * <p>> You can call the [DescribeVpcFirewallDetail](https://help.aliyun.com/document_detail/342892.html) operation to query the CIDR blocks of peer VPCs for VPC firewalls.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PeerVpcCidrTableList")
    public String peerVpcCidrTableList;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     * <br>
     * <p>> You can call the [DescribeVpcFirewallList](https://help.aliyun.com/document_detail/342932.html) operation to query the instance IDs of VPC firewalls.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    /**
     * <p>The instance name of the VPC firewall.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    public static ModifyVpcFirewallConfigureRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallConfigureRequest self = new ModifyVpcFirewallConfigureRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallConfigureRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyVpcFirewallConfigureRequest setLocalVpcCidrTableList(String localVpcCidrTableList) {
        this.localVpcCidrTableList = localVpcCidrTableList;
        return this;
    }
    public String getLocalVpcCidrTableList() {
        return this.localVpcCidrTableList;
    }

    public ModifyVpcFirewallConfigureRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public ModifyVpcFirewallConfigureRequest setPeerVpcCidrTableList(String peerVpcCidrTableList) {
        this.peerVpcCidrTableList = peerVpcCidrTableList;
        return this;
    }
    public String getPeerVpcCidrTableList() {
        return this.peerVpcCidrTableList;
    }

    public ModifyVpcFirewallConfigureRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public ModifyVpcFirewallConfigureRequest setVpcFirewallName(String vpcFirewallName) {
        this.vpcFirewallName = vpcFirewallName;
        return this;
    }
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

}
