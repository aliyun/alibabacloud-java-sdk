// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallAclEngineModeRequest extends TeaModel {
    /**
     * <p>The UID of the Cloud Firewall member account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>Specifies whether to enable strict mode.</p>
     * <ul>
     * <li><p>1: strict mode</p>
     * </li>
     * <li><p>0: loose mode</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StrictMode")
    public String strictMode;

    /**
     * <p>The instance ID of the VPC border firewall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-m5e7dbc4y****</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static ModifyVpcFirewallAclEngineModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallAclEngineModeRequest self = new ModifyVpcFirewallAclEngineModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallAclEngineModeRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public ModifyVpcFirewallAclEngineModeRequest setStrictMode(String strictMode) {
        this.strictMode = strictMode;
        return this;
    }
    public String getStrictMode() {
        return this.strictMode;
    }

    public ModifyVpcFirewallAclEngineModeRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
