// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDetailRequest extends TeaModel {
    // The natural language of the request and response. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The ID of the local VPC.
    @NameInMap("LocalVpcId")
    public String localVpcId;

    // The ID of the peer VPC.
    @NameInMap("PeerVpcId")
    public String peerVpcId;

    // The instance ID of the VPC firewall.
    // 
    // >  You can call the [DescribeVpcFirewallList](~~342932~~) operation to query the instance IDs of VPC firewalls.
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static DescribeVpcFirewallDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDetailRequest self = new DescribeVpcFirewallDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallDetailRequest setLocalVpcId(String localVpcId) {
        this.localVpcId = localVpcId;
        return this;
    }
    public String getLocalVpcId() {
        return this.localVpcId;
    }

    public DescribeVpcFirewallDetailRequest setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }
    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    public DescribeVpcFirewallDetailRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
