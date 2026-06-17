// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyNatFirewallControlPolicyPositionRequest extends TeaModel {
    /**
     * <p>The unique ID of the access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>66461eea-e659-4225-84c9-*****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The traffic direction of the access control policy.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li><strong>out</strong>: outbound traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the NAT Gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-xxxxxx</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The new priority for the IPv4 access control policy of the NAT firewall.
     * Priorities are represented by numbers. A smaller number indicates a higher priority. The value 1 indicates the highest priority.</p>
     * <blockquote>
     * <p>The new priority must be within the range of existing priorities for IPv4 policies of the NAT firewall. Otherwise, the call fails.</p>
     * </blockquote>
     * <p>Before calling this operation, call the DescribeNatFirewallPolicyPriorUsed operation to query the priority range of existing IPv4 policies for the specified traffic direction of the NAT firewall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
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

    public ModifyNatFirewallControlPolicyPositionRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
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
