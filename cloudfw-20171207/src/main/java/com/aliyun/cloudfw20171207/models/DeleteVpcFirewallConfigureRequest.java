// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallConfigureRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("MemberUid")
    public String memberUid;

    @NameInMap("VpcFirewallIdList")
    public java.util.List<String> vpcFirewallIdList;

    public static DeleteVpcFirewallConfigureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcFirewallConfigureRequest self = new DeleteVpcFirewallConfigureRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpcFirewallConfigureRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteVpcFirewallConfigureRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DeleteVpcFirewallConfigureRequest setVpcFirewallIdList(java.util.List<String> vpcFirewallIdList) {
        this.vpcFirewallIdList = vpcFirewallIdList;
        return this;
    }
    public java.util.List<String> getVpcFirewallIdList() {
        return this.vpcFirewallIdList;
    }

}
