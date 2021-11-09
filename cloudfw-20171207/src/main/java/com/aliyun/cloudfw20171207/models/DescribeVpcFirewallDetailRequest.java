// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDetailRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("LocalVpcId")
    public String localVpcId;

    @NameInMap("PeerVpcId")
    public String peerVpcId;

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
