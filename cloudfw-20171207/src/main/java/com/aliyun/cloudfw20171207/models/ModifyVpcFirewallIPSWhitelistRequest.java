// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallIPSWhitelistRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ListType")
    public Long listType;

    @NameInMap("ListValue")
    public String listValue;

    @NameInMap("MemberUid")
    public Long memberUid;

    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    @NameInMap("WhiteType")
    public Long whiteType;

    public static ModifyVpcFirewallIPSWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallIPSWhitelistRequest self = new ModifyVpcFirewallIPSWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallIPSWhitelistRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyVpcFirewallIPSWhitelistRequest setListType(Long listType) {
        this.listType = listType;
        return this;
    }
    public Long getListType() {
        return this.listType;
    }

    public ModifyVpcFirewallIPSWhitelistRequest setListValue(String listValue) {
        this.listValue = listValue;
        return this;
    }
    public String getListValue() {
        return this.listValue;
    }

    public ModifyVpcFirewallIPSWhitelistRequest setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public ModifyVpcFirewallIPSWhitelistRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public ModifyVpcFirewallIPSWhitelistRequest setWhiteType(Long whiteType) {
        this.whiteType = whiteType;
        return this;
    }
    public Long getWhiteType() {
        return this.whiteType;
    }

}
