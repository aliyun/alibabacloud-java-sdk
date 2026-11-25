// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The unique identity ID of the access control policy for virtual private cloud (VPC) firewalls at the border.</p>
     * <p>When you delete an access control policy, you must provide the unique identity ID of the policy. You can invoke the <a href="https://help.aliyun.com/document_detail/159758.html">DescribeVpcFirewallControlPolicy</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00281255-d220-4db1-8f4f-c4df2214****</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The language of the request and response.</p>
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
     * <p>The ID of the access control policy group for virtual private cloud (VPC) firewalls at the border. You can invoke the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to query the ID.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>If the virtual private cloud (VPC) firewalls at the border protect a CEN instance, the policy group ID is the instance ID of the CEN instance.</p>
     * <p> Example: cen-ervw0g12b5jbw****</p>
     * </li>
     * <li><p>If the virtual private cloud (VPC) firewalls at the border protect an Express Connect circuit, the policy group ID is the instance ID of the virtual private cloud (VPC) firewalls at the border.</p>
     * <p>Example: vfw-a42bbb7b887148c9****</p>
     * </li>
     * </ul>
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
