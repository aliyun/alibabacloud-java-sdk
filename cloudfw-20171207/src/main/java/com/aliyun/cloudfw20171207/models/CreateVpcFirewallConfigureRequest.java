// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallConfigureRequest extends TeaModel {
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("LocalVpcCidrTableList")
    public String localVpcCidrTableList;

    @NameInMap("LocalVpcId")
    public String localVpcId;

    @NameInMap("LocalVpcRegion")
    public String localVpcRegion;

    @NameInMap("MemberUid")
    public String memberUid;

    @NameInMap("PeerVpcCidrTableList")
    public String peerVpcCidrTableList;

    @NameInMap("PeerVpcId")
    public String peerVpcId;

    @NameInMap("PeerVpcRegion")
    public String peerVpcRegion;

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
