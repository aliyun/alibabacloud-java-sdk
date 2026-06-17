// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallConfigureRequest extends TeaModel {
    /**
     * <p>The status of the VPC firewall after it is created. Valid values:</p>
     * <ul>
     * <li><p><strong>open</strong> (default): The VPC firewall is automatically enabled after it is created.</p>
     * </li>
     * <li><p><strong>close</strong>: The VPC firewall is not automatically enabled after it is created. To enable the firewall, call the <a href="https://help.aliyun.com/document_detail/342935.html">ModifyVpcFirewallSwitchStatus</a> operation.</p>
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
     * <p>The CIDR blocks of the local VPC. The value is a JSON string that contains the following parameters:</p>
     * <ul>
     * <li><p><strong>RouteTableId</strong>: The ID of the route table for the local VPC.</p>
     * </li>
     * <li><p>RouteEntryList: The route entries. The value is a JSON string that contains DestinationCidr (the destination CIDR block of the local VPC) and <strong>NextHopInstanceId</strong> (the ID of the next hop instance of the local VPC).</p>
     * </li>
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
     * <p>For more information about the regions where Cloud Firewall is available, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LocalVpcRegion")
    public String localVpcRegion;

    /**
     * <p>The UID of the member account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The CIDR blocks of the peer VPC. The value is a JSON string that contains the following parameters:</p>
     * <ul>
     * <li><p><strong>RouteTableId</strong>: The ID of the route table for the peer VPC.</p>
     * </li>
     * <li><p>RouteEntryList: The route entries. The value is a JSON string that contains DestinationCidr (the destination CIDR block of the peer VPC) and <strong>NextHopInstanceId</strong> (the ID of the next hop instance of the peer VPC).</p>
     * </li>
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
     * <p>For more information about the regions where Cloud Firewall is available, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("PeerVpcRegion")
    public String peerVpcRegion;

    /**
     * <p>The instance name of the VPC firewall.</p>
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
