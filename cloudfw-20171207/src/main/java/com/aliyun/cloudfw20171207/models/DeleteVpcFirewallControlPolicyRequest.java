// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallControlPolicyRequest extends TeaModel {
    // The ID of the access control policy. 
    // 
    // To delete an access control policy, you must provide the ID of the policy. You can call the **DescribeVpcFirewallControlPolicy** operation to query the ID.
    @NameInMap("AclUuid")
    public String aclUuid;

    // The natural language of the request and response. Valid values: 
    // 
    // - **zh**: Chinese
    // - **en**: English
    @NameInMap("Lang")
    public String lang;

    // The ID of the group to which the access control policy belongs. You can call the **DescribeVpcFirewallAclGroupList** operation to query the ID.  
    // 
    // Valid values:
    // 
    // - If the VPC firewall is used to protect a CEN instance, the value of this parameter is the ID of the CEN instance.  
    // 
    // Example: cen-ervw0g12b5jbw****
    // - If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the ID of the VPC firewall.  
    // 
    // Example: vfw-a42bbb7b887148c9****
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static DeleteVpcFirewallControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcFirewallControlPolicyRequest self = new DeleteVpcFirewallControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpcFirewallControlPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public DeleteVpcFirewallControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteVpcFirewallControlPolicyRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
