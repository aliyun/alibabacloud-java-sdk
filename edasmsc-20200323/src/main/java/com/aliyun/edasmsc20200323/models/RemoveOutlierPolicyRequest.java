// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class RemoveOutlierPolicyRequest extends TeaModel {
    @NameInMap("PolicyId")
    @Validation(required = true)
    public String policyId;

    public static RemoveOutlierPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveOutlierPolicyRequest self = new RemoveOutlierPolicyRequest();
        return TeaModel.build(map, self);
    }

}
