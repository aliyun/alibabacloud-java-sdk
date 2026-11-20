// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteAclPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The whitelist of IP address ranges that are allowed to access the VPC. This parameter is required. If this parameter is not specified, an InvalidParameter error is returned, indicating that AclPolicyList must be set.</p>
     */
    @NameInMap("AclPolicyList")
    public String aclPolicyListShrink;

    /**
     * <p>The ID of the VPC. For information about how to obtain the VPC ID, see DescribeVpcs.</p>
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
