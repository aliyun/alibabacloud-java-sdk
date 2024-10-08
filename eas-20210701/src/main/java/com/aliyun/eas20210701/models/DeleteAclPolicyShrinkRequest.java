// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteAclPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The whitelisted IP CIDR blocks in the VPC that can access the private gateway.</p>
     */
    @NameInMap("AclPolicyList")
    public String aclPolicyListShrink;

    /**
     * <p>The ID of the virtual private cloud (VPC). For more information about how to obtain the VPC ID, see DescribeVpcs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf66uio7md****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DeleteAclPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclPolicyShrinkRequest self = new DeleteAclPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAclPolicyShrinkRequest setAclPolicyListShrink(String aclPolicyListShrink) {
        this.aclPolicyListShrink = aclPolicyListShrink;
        return this;
    }
    public String getAclPolicyListShrink() {
        return this.aclPolicyListShrink;
    }

    public DeleteAclPolicyShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
