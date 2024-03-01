// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyNatFirewallControlPolicyPositionRequest extends TeaModel {
    /**
     * <p>The UUID of the access control policy.</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The direction of the traffic to which the access control policy applies.</p>
     * <br>
     * <p>*   Set the value to **out**.</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the NAT gateway.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The new priority of the IPv4 access control policy. You must specify a numeric value for this parameter. The value 1 indicates the highest priority. A larger value indicates a lower priority.</p>
     * <br>
     * <p>> Make sure that the value of this parameter is within the priority range of existing IPv4 access control policies. Otherwise, an error occurs when you call this operation.</p>
     * <br>
     * <p>Before you call this operation, we recommend that you call the DescribeNatFirewallPolicyPriorUsed operation to query the priority range of the IPv4 access control policies in the specified traffic direction.</p>
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
