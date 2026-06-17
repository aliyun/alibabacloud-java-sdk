// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteNatFirewallControlPolicyBatchRequest extends TeaModel {
    /**
     * <p>A list of access control list (ACL) UUIDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclUuidList")
    public java.util.List<String> aclUuidList;

    /**
     * <p>The traffic direction for the access control policy. Valid value:</p>
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
     * <p>The language of the request and response. Valid values:</p>
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
     * <p>ngw-uf6j0426ap74vd6vrb676</p>
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
