// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class BatchDeletePrivateAccessPolicyRequest extends TeaModel {
    /**
     * <p>The IDs of internal network access policies. You can specify up to 100 internal network access policy IDs.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    public static BatchDeletePrivateAccessPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeletePrivateAccessPolicyRequest self = new BatchDeletePrivateAccessPolicyRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeletePrivateAccessPolicyRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

}
