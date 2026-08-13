// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallConfigureRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
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
     * <p>The CIDR block information of the local VPC, in JSON format. The following parameters are included:</p>
     * <ul>
     * <li><p><strong>RouteTableId</strong>: the routing table ID of the local VPC.</p>
     * </li>
     * <li><p><strong>RouteEntryList</strong>: specified in JSON format and contains DestinationCidr (the destination CIDR block of the local VPC) and NextHopInstanceId (the next hop instance ID of the local VPC).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/342892.html">DescribeVpcFirewallDetail</a> operation to query the CIDR block information of the local VPC for the virtual private cloud (VPC) firewall.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;RouteTableId&quot;:&quot;vtb-1234&quot;,&quot;RouteEntryList&quot;:[{&quot;DestinationCidr&quot;:&quot;192.168.XX.XX/24&quot;,&quot;NextHopInstanceId&quot;:&quot;vrt-m5eb5me6c3l5sezae****&quot;}]},{&quot;RouteTableId&quot;:&quot;vtb-1235&quot;,&quot;RouteEntryList&quot;:[{&quot;DestinationCidr&quot;:&quot;192.168.XX.XX/24&quot;,&quot;NextHopInstanceId&quot;:&quot;vrt-m5eb5me6c3l5sezae****&quot;}]}]</p>
     */
    @NameInMap("LocalVpcCidrTableList")
    public String localVpcCidrTableList;

    /**
     * <p>The UID of the member accounts of the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The CIDR block information of the peer VPC, in JSON format. The following parameters are included:</p>
     * <ul>
     * <li><p><strong>RouteTableId</strong>: the routing table ID of the peer VPC.</p>
     * </li>
     * <li><p><strong>RouteEntryList</strong>: specified in JSON format and contains DestinationCidr (the destination CIDR block of the peer VPC) and NextHopInstanceId (the next hop instance ID of the peer VPC).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/342892.html">DescribeVpcFirewallDetail</a> operation to query the CIDR block information of the peer VPC for the virtual private cloud (VPC) firewall.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;RouteTableId&quot;:&quot;vtb-1234&quot;,&quot;RouteEntryList&quot;:[{&quot;DestinationCidr&quot;:&quot;192.168.XX.XX/24&quot;,&quot;NextHopInstanceId&quot;:&quot;vrt-m5eb5me6c3l5sezae****&quot;}]},{&quot;RouteTableId&quot;:&quot;vtb-1235&quot;,&quot;RouteEntryList&quot;:[{&quot;DestinationCidr&quot;:&quot;192.168.XX.XX/24&quot;,&quot;NextHopInstanceId&quot;:&quot;vrt-m5eb5me6c3l5sezae****&quot;}]}]</p>
     */
    @NameInMap("PeerVpcCidrTableList")
    public String peerVpcCidrTableList;

    /**
     * <p>The instance ID of the virtual private cloud (VPC) firewall.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/342932.html">DescribeVpcFirewallList</a> operation to query the instance ID of the virtual private cloud (VPC) firewall.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-m5e7dbc4y****</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    /**
     * <p>The instance name of the virtual private cloud (VPC) firewall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-vpc-firewall</p>
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
