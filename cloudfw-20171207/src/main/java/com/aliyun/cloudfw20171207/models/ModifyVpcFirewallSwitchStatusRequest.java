// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallSwitchStatusRequest extends TeaModel {
    // Specifies whether to enable the VPC firewall. Valid values:
    // 
    // *   **open**: enables the VPC firewall.
    // *   **close**: disables the VPC firewall.
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    // The natural language of the request and response. Valid values:
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
    // >  You can call the [DescribeVpcFirewallList](~~342932~~) operation to query the instance IDs of VPC firewalls.
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static ModifyVpcFirewallSwitchStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallSwitchStatusRequest self = new ModifyVpcFirewallSwitchStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallSwitchStatusRequest setFirewallSwitch(String firewallSwitch) {
        this.firewallSwitch = firewallSwitch;
        return this;
    }
    public String getFirewallSwitch() {
        return this.firewallSwitch;
    }

    public ModifyVpcFirewallSwitchStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyVpcFirewallSwitchStatusRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public ModifyVpcFirewallSwitchStatusRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
