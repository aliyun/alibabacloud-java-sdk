// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ResetNatFirewallRuleHitCountRequest extends TeaModel {
    @NameInMap("AclUuid")
    public String aclUuid;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    public static ResetNatFirewallRuleHitCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetNatFirewallRuleHitCountRequest self = new ResetNatFirewallRuleHitCountRequest();
        return TeaModel.build(map, self);
    }

    public ResetNatFirewallRuleHitCountRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public ResetNatFirewallRuleHitCountRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ResetNatFirewallRuleHitCountRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

}
