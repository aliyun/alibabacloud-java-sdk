// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallCenSwitchStatusRequest extends TeaModel {
    // Specifies whether to enable the VPC firewall. Valid values:
    // 
    // *   **open**: yes
    // *   **close**: no
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    // The language of the content within the request and response. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The UID of the member that is managed by your Alibaba Cloud account.
    @NameInMap("MemberUid")
    public String memberUid;

    // The instance ID of the VPC firewall.
    // 
    // >  You can call the [DescribeVpcFirewallCenList](~~345777~~) operation to query the instance IDs of VPC firewalls.
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static ModifyVpcFirewallCenSwitchStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallCenSwitchStatusRequest self = new ModifyVpcFirewallCenSwitchStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallCenSwitchStatusRequest setFirewallSwitch(String firewallSwitch) {
        this.firewallSwitch = firewallSwitch;
        return this;
    }
    public String getFirewallSwitch() {
        return this.firewallSwitch;
    }

    public ModifyVpcFirewallCenSwitchStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyVpcFirewallCenSwitchStatusRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public ModifyVpcFirewallCenSwitchStatusRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
