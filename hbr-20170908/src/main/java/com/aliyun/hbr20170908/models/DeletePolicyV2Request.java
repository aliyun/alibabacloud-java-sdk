// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeletePolicyV2Request extends TeaModel {
    /**
     * <p>The ID of the backup policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static DeletePolicyV2Request build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyV2Request self = new DeletePolicyV2Request();
        return TeaModel.build(map, self);
    }

    public DeletePolicyV2Request setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
