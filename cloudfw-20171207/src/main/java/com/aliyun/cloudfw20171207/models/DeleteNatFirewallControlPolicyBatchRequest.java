// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteNatFirewallControlPolicyBatchRequest extends TeaModel {
    /**
     * <p>The UUIDs of access control policies.</p>
     */
    @NameInMap("AclUuidList")
    public java.util.List<String> aclUuidList;

    /**
     * <p>The direction of the traffic to which the access control policy applies. Valid values:</p>
     * <br>
     * <p>*   **out**: outbound traffic</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the NAT gateway.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    public static DeleteNatFirewallControlPolicyBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatFirewallControlPolicyBatchRequest self = new DeleteNatFirewallControlPolicyBatchRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNatFirewallControlPolicyBatchRequest setAclUuidList(java.util.List<String> aclUuidList) {
        this.aclUuidList = aclUuidList;
        return this;
    }
    public java.util.List<String> getAclUuidList() {
        return this.aclUuidList;
    }

    public DeleteNatFirewallControlPolicyBatchRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DeleteNatFirewallControlPolicyBatchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteNatFirewallControlPolicyBatchRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

}
