// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallConfigureRequest extends TeaModel {
    /**
     * <p>Settings for the enabling status of the virtual private cloud (VPC) firewall after it is created. Valid values:</p>
     * <ul>
     * <li><p><strong>open</strong> (default): Protection is automatically enabled after the VPC firewall is created.</p>
     * </li>
     * <li><p><strong>close</strong>: Protection is not automatically enabled after the VPC firewall is created. You can invoke the <a href="https://help.aliyun.com/document_detail/342935.html">ModifyVpcFirewallSwitchStatus</a> operation to enable protection.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

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
     * <p>The CIDR block list of the local VPC, in JSON format. This parameter contains the following fields:</p>
     * <ul>
     * <li><strong>RouteTableId</strong>: the route table ID of the local VPC.</li>
     * <li><strong>RouteEntryList</strong>: specified in JSON format. This field contains DestinationCidr (the destination CIDR block of the local VPC) and NextHopInstanceId (the next hop instance ID of the local VPC).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;RouteTableId&quot;:&quot;vtb-1234&quot;,&quot;RouteEntryList&quot;:[{&quot;DestinationCidr&quot;:&quot;192.168.XX.XX/24&quot;,&quot;NextHopInstanceId&quot;:&quot;vrt-m5eb5me6c3l5sezae****&quot;}]},{&quot;RouteTableId&quot;:&quot;vtb-1235&quot;,&quot;RouteEntryList&quot;:[{&quot;DestinationCidr&quot;:&quot;192.168.XX.XX/24&quot;,&quot;NextHopInstanceId&quot;:&quot;vrt-m5eb5me6c3l5sezae****&quot;}]}]</p>
     */
    @NameInMap("LocalVpcCidrTableList")
    public String localVpcCidrTableList;

    /**
     * <p>The instance ID of the local VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-8vbwbo90rq0anm6t****</p>
     */
    @NameInMap("LocalVpcId")
    public String localVpcId;

    /**
     * <p>The region ID of the local VPC.</p>
     * <blockquote>
     * <p>For more information about the regions supported by Cloud Firewall, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LocalVpcRegion")
    public String localVpcRegion;

    /**
     * <p>The UID of the Alibaba Cloud member account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The CIDR block list of the peer VPC, in JSON format. This parameter contains the following fields:</p>
     * <ul>
     * <li><strong>RouteTableId</strong>: the route table ID of the peer VPC.</li>
     * <li><strong>RouteEntryList</strong>: specified in JSON format. This field contains DestinationCidr (the destination CIDR block of the peer VPC) and NextHopInstanceId (the next hop instance ID of the peer VPC).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;RouteTableId&quot;:&quot;vtb-1234&quot;,&quot;RouteEntryList&quot;:[{&quot;DestinationCidr&quot;:&quot;192.168.XX.XX/24&quot;,&quot;NextHopInstanceId&quot;:&quot;vrt-m5eb5me6c3l5sezae****&quot;}]},{&quot;RouteTableId&quot;:&quot;vtb-1235&quot;,&quot;RouteEntryList&quot;:[{&quot;DestinationCidr&quot;:&quot;192.168.XX.XX/24&quot;,&quot;NextHopInstanceId&quot;:&quot;vrt-m5eb5me6c3l5sezae****&quot;}]}]</p>
     */
    @NameInMap("PeerVpcCidrTableList")
    public String peerVpcCidrTableList;

    /**
     * <p>The instance ID of the peer VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-wb8vbo90rq0anm6t****</p>
     */
    @NameInMap("PeerVpcId")
    public String peerVpcId;

    /**
     * <p>The region ID of the peer VPC.</p>
     * <blockquote>
     * <p>For more information about the regions supported by Cloud Firewall, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("PeerVpcRegion")
    public String peerVpcRegion;

    /**
     * <p>The instance name of the virtual private cloud (VPC) firewall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-vpc-firewall</p>
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
