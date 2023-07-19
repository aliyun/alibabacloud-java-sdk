// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallControlPolicyPositionRequest extends TeaModel {
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The natural language of the request and response. </p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>- **zh**: Chinese (default)</p>
     * <p>- **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The new priority of the access control policy.</p>
     */
    @NameInMap("NewOrder")
    public String newOrder;

    /**
     * <p>The original priority of the access control policy.</p>
     */
    @NameInMap("OldOrder")
    public String oldOrder;

    /**
     * <p>The ID of the policy group to which the access control policy belongs. You can call the DescribeVpcFirewallAclGroupList operation to query the ID.  </p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>- If the VPC firewall is used to protect a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance.  </p>
     * <br>
     * <p>Example: cen-ervw0g12b5jbw****</p>
     * <p>- If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall.  </p>
     * <br>
     * <p>Example: vfw-a42bbb7b887148c9****</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static ModifyVpcFirewallControlPolicyPositionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallControlPolicyPositionRequest self = new ModifyVpcFirewallControlPolicyPositionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallControlPolicyPositionRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
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
