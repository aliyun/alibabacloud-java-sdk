// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallControlPolicyPositionRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("NewOrder")
    public String newOrder;

    @NameInMap("OldOrder")
    public String oldOrder;

    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static ModifyVpcFirewallControlPolicyPositionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallControlPolicyPositionRequest self = new ModifyVpcFirewallControlPolicyPositionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallControlPolicyPositionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyVpcFirewallControlPolicyPositionRequest setNewOrder(String newOrder) {
        this.newOrder = newOrder;
        return this;
    }
    public String getNewOrder() {
        return this.newOrder;
    }

    public ModifyVpcFirewallControlPolicyPositionRequest setOldOrder(String oldOrder) {
        this.oldOrder = oldOrder;
        return this;
    }
    public String getOldOrder() {
        return this.oldOrder;
    }

    public ModifyVpcFirewallControlPolicyPositionRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
