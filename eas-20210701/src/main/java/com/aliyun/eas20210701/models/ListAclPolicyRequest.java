// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListAclPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>vpc-uf66uio7md****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ListAclPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAclPolicyRequest self = new ListAclPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListAclPolicyRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
