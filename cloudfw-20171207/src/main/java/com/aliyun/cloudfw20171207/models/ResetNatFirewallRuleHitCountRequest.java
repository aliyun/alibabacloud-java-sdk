// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ResetNatFirewallRuleHitCountRequest extends TeaModel {
    /**
     * <p>The unique ID of the access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3de3aed5-6de7-4ecd-9106-cfe994b9c49f</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

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
     * 
     * <strong>example:</strong>
     * <p>ngw-zm0h3c1exm5bifuorg8c5</p>
     */
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
