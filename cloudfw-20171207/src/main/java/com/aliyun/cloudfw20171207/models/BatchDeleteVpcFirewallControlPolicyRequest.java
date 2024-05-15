// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class BatchDeleteVpcFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The UUIDs of access control policies.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclUuidList")
    public java.util.List<String> aclUuidList;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static BatchDeleteVpcFirewallControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteVpcFirewallControlPolicyRequest self = new BatchDeleteVpcFirewallControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteVpcFirewallControlPolicyRequest setAclUuidList(java.util.List<String> aclUuidList) {
        this.aclUuidList = aclUuidList;
        return this;
    }
    public java.util.List<String> getAclUuidList() {
        return this.aclUuidList;
    }

    public BatchDeleteVpcFirewallControlPolicyRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
