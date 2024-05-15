// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallPolicyPriorUsedRequest extends TeaModel {
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
     * <p>The ID of the policy group to which the access control policy belongs. You can call the DescribeVpcFirewallAclGroupList operation to query the ID.  </p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>- If the VPC firewall is used to protect a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance.  </p>
     * <br>
     * <p>Example: cen-ervw0g12b5jbw****</p>
     * <p>- If the VPC firewall is used to protect an Express Connect circuit, the value of this parameter is the ID of the VPC firewall instance.  </p>
     * <br>
     * <p>Example: vfw-a42bbb7b887148c9****</p>
     * <br>
     * <p>This parameter is required.</p>
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
