// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteNatFirewallControlPolicyRequest extends TeaModel {
    @NameInMap("AclUuid")
    public String aclUuid;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    public static DeleteNatFirewallControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatFirewallControlPolicyRequest self = new DeleteNatFirewallControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNatFirewallControlPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public DeleteNatFirewallControlPolicyRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DeleteNatFirewallControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteNatFirewallControlPolicyRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

}
