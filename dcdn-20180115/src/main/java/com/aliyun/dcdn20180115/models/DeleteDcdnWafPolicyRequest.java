// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnWafPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the protection policy that you want to delete. You can specify only one ID in each request.</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    public static DeleteDcdnWafPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnWafPolicyRequest self = new DeleteDcdnWafPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnWafPolicyRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

}
