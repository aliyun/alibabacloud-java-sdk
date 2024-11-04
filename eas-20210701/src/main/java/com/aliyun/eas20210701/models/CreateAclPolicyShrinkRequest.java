// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateAclPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The whitelisted IP CIDR blocks in the VPC that can access the private gateway.</p>
     * <p>This parameter is required.</p>
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

    public static CreateAclPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAclPolicyShrinkRequest self = new CreateAclPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAclPolicyShrinkRequest setAclPolicyListShrink(String aclPolicyListShrink) {
        this.aclPolicyListShrink = aclPolicyListShrink;
        return this;
    }
    public String getAclPolicyListShrink() {
        return this.aclPolicyListShrink;
    }

    public CreateAclPolicyShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
