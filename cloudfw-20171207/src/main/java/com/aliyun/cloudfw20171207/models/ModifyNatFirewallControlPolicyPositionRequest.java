// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyNatFirewallControlPolicyPositionRequest extends TeaModel {
    @NameInMap("AclUuid")
    public String aclUuid;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("NewOrder")
    public Integer newOrder;

    public static ModifyNatFirewallControlPolicyPositionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatFirewallControlPolicyPositionRequest self = new ModifyNatFirewallControlPolicyPositionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNatFirewallControlPolicyPositionRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public ModifyNatFirewallControlPolicyPositionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyNatFirewallControlPolicyPositionRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ModifyNatFirewallControlPolicyPositionRequest setNewOrder(Integer newOrder) {
        this.newOrder = newOrder;
        return this;
    }
    public Integer getNewOrder() {
        return this.newOrder;
    }

}
