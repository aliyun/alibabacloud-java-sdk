// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class RemoveAuthPolicyRequest extends TeaModel {
    @NameInMap("PolicyId")
    @Validation(required = true)
    public String policyId;

    public static RemoveAuthPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAuthPolicyRequest self = new RemoveAuthPolicyRequest();
        return TeaModel.build(map, self);
    }

}
