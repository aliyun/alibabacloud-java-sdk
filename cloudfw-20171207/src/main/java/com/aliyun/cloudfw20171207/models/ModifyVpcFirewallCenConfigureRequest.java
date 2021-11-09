// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallCenConfigureRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("MemberUid")
    public String memberUid;

    @NameInMap("VpcCidrTableList")
    public String vpcCidrTableList;

    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    public static ModifyVpcFirewallCenConfigureRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallCenConfigureRequest self = new ModifyVpcFirewallCenConfigureRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallCenConfigureRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyVpcFirewallCenConfigureRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public ModifyVpcFirewallCenConfigureRequest setVpcCidrTableList(String vpcCidrTableList) {
        this.vpcCidrTableList = vpcCidrTableList;
        return this;
    }
    public String getVpcCidrTableList() {
        return this.vpcCidrTableList;
    }

    public ModifyVpcFirewallCenConfigureRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public ModifyVpcFirewallCenConfigureRequest setVpcFirewallName(String vpcFirewallName) {
        this.vpcFirewallName = vpcFirewallName;
        return this;
    }
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

}
