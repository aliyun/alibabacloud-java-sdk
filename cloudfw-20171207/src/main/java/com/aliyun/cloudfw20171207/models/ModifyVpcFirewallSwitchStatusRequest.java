// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallSwitchStatusRequest extends TeaModel {
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MemberUid")
    public String memberUid;

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
