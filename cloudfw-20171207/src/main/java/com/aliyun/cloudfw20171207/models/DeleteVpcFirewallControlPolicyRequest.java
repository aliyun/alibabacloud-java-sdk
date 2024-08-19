// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the access control policy. </p>
     * <p>To delete an access control policy, you must provide the ID of the policy. You can call the <strong>DescribeVpcFirewallControlPolicy</strong> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00281255-d220-4db1-8f4f-c4df2214****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The natural language of the request and response. Valid values: </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the group to which the access control policy belongs. You can call the <strong>DescribeVpcFirewallAclGroupList</strong> operation to query the ID.  </p>
     * <p>Valid values:</p>
     * <ul>
     * <li>If the VPC firewall is used to protect a CEN instance, the value of this parameter is the ID of the CEN instance.</li>
     * </ul>
     * <p>Example: cen-ervw0g12b5jbw****</p>
     * <ul>
     * <li>If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the ID of the VPC firewall.</li>
     * </ul>
     * <p>Example: vfw-a42bbb7b887148c9****</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-a42bbb7b887148c91****</p>
     */
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
