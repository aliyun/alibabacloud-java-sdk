// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteNatFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The unique ID of the access control policy.</p>
     * <p>To delete a security access control policy, you must provide the unique ID of the policy. You can call the DescribeNatFirewallControlPolicy operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b6c8f905-2eb6-442a-ba35-9416e9dbb2c5</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The direction of traffic that the access control policy controls.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>out</strong>: outbound traffic.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The language type of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the NAT gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-xxxxxx</p>
     */
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
