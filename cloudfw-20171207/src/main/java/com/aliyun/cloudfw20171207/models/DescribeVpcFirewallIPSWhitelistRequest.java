// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallIPSWhitelistRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("MemberUid")
    public Long memberUid;

    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static DescribeVpcFirewallIPSWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallIPSWhitelistRequest self = new DescribeVpcFirewallIPSWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallIPSWhitelistRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallIPSWhitelistRequest setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public DescribeVpcFirewallIPSWhitelistRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
