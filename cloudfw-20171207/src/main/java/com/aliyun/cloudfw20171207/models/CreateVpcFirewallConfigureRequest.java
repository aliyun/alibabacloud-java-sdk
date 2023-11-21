// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallConfigureRequest extends TeaModel {
    /**
     * <p>The status of the VPC firewall after you create the firewall. Valid values:</p>
     * <br>
     * <p>*   **open**: After you create the VPC firewall, the VPC firewall is automatically enabled. This is the default value.</p>
     * <p>*   **close**: After you create the VPC firewall, the VPC firewall is disabled. To enable the firewall, you can call the [ModifyVpcFirewallSwitchStatus](~~342935~~) operation.</p>
     */
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The CIDR blocks of the local VPC. The value is a JSON string that contains the following parameters:</p>
     * <br>
     * <p>*   **RouteTableId**: the ID of the route table for the local VPC.</p>
     * <p>*   **RouteEntryList**: The value is a JSON string that contains the DestinationCidr and NextHopInstanceId parameters. The DestinationCidr parameter indicates the destination CIDR block of the local VPC. The NextHopInstanceId parameter indicates the instance ID of the next hop for the local VPC.</p>
     */
    @NameInMap("LocalVpcCidrTableList")
    public String localVpcCidrTableList;

    /**
     * <p>The ID of the local VPC.</p>
     */
    @NameInMap("LocalVpcId")
    public String localVpcId;

    /**
     * <p>The region ID of the local VPC.</p>
     * <br>
     * <p>>  For more information about the regions in which Cloud Firewall is available, see [Supported regions](~~195657~~).</p>
     */
    @NameInMap("LocalVpcRegion")
    public String localVpcRegion;

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
     */
    @NameInMap("PeerVpcCidrTableList")
    public String peerVpcCidrTableList;

    /**
     * <p>The ID of the peer VPC.</p>
     */
    @NameInMap("PeerVpcId")
    public String peerVpcId;

    /**
     * <p>The region ID of the peer VPC.</p>
     * <br>
     * <p>>  For more information about Cloud Firewall supported regions, see [Supported regions](~~195657~~).</p>
     */
    @NameInMap("PeerVpcRegion")
    public String peerVpcRegion;

    /**
     * <p>The instance name of the VPC firewall.</p>
     */
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    public static CreateVpcFirewallConfigureRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallConfigureRequest self = new CreateVpcFirewallConfigureRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallConfigureRequest setFirewallSwitch(String firewallSwitch) {
        this.firewallSwitch = firewallSwitch;
        return this;
    }
    public String getFirewallSwitch() {
        return this.firewallSwitch;
    }

    public CreateVpcFirewallConfigureRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateVpcFirewallConfigureRequest setLocalVpcCidrTableList(String localVpcCidrTableList) {
        this.localVpcCidrTableList = localVpcCidrTableList;
        return this;
    }
    public String getLocalVpcCidrTableList() {
        return this.localVpcCidrTableList;
    }

    public CreateVpcFirewallConfigureRequest setLocalVpcId(String localVpcId) {
        this.localVpcId = localVpcId;
        return this;
    }
    public String getLocalVpcId() {
        return this.localVpcId;
    }

    public CreateVpcFirewallConfigureRequest setLocalVpcRegion(String localVpcRegion) {
        this.localVpcRegion = localVpcRegion;
        return this;
    }
    public String getLocalVpcRegion() {
        return this.localVpcRegion;
    }

    public CreateVpcFirewallConfigureRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public CreateVpcFirewallConfigureRequest setPeerVpcCidrTableList(String peerVpcCidrTableList) {
        this.peerVpcCidrTableList = peerVpcCidrTableList;
        return this;
    }
    public String getPeerVpcCidrTableList() {
        return this.peerVpcCidrTableList;
    }

    public CreateVpcFirewallConfigureRequest setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }
    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    public CreateVpcFirewallConfigureRequest setPeerVpcRegion(String peerVpcRegion) {
        this.peerVpcRegion = peerVpcRegion;
        return this;
    }
    public String getPeerVpcRegion() {
        return this.peerVpcRegion;
    }

    public CreateVpcFirewallConfigureRequest setVpcFirewallName(String vpcFirewallName) {
        this.vpcFirewallName = vpcFirewallName;
        return this;
    }
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

}
