// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallControlPolicyRequest extends TeaModel {
    /**
     * <p>The unique ID of the access control policy for the virtual private cloud (VPC) firewall.</p>
     * <p>To delete an access control policy, you must provide the unique ID of the policy. You can call the <a href="https://help.aliyun.com/document_detail/159758.html">DescribeVpcFirewallControlPolicy</a> operation to obtain the ID.</p>
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
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the access control policy group for the virtual private cloud (VPC) firewall. You can call the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to obtain the ID.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>If the VPC firewall protects a CEN instance, the value is the instance ID of the CEN instance.</p>
     * <p> Example: cen-ervw0g12b5jbw\<em>\</em>\*</p>
     * </li>
     * <li><p>If the VPC firewall protects an Express Connect circuit, the value is the instance ID of the VPC firewall.</p>
     * <p>Example: vfw-a42bbb7b887148c9\<em>\</em>\*.</p>
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
