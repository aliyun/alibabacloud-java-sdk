// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnWafPolicyRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PolicyId")
    public Long policyId;

    public static DeleteDcdnWafPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnWafPolicyRequest self = new DeleteDcdnWafPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnWafPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteDcdnWafPolicyRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

}
