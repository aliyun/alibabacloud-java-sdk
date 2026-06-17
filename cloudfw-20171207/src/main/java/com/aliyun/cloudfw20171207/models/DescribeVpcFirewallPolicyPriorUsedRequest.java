// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallPolicyPriorUsedRequest extends TeaModel {
    /**
     * <p>The language of the request and response.</p>
     * <p>Valid values:</p>
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
     * <p>The ID of the policy group for the VPC firewall. Call the <a href="https://help.aliyun.com/document_detail/159760.html">DescribeVpcFirewallAclGroupList</a> operation to query the ID.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>If the VPC firewall protects a Cloud Enterprise Network (CEN) instance, set this parameter to the ID of the CEN instance.</p>
     * <p>Example: cen-ervw0g12b5jbw\<em>\</em>\<em>\</em></p>
     * </li>
     * <li><p>If the VPC firewall protects an Express Connect circuit, set this parameter to the ID of the VPC firewall instance.</p>
     * <p>Example: vfw-a42bbb7b887148c9\<em>\</em>\<em>\</em></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-a42bbb7b887148c9****</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static DescribeVpcFirewallPolicyPriorUsedRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallPolicyPriorUsedRequest self = new DescribeVpcFirewallPolicyPriorUsedRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallPolicyPriorUsedRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallPolicyPriorUsedRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
