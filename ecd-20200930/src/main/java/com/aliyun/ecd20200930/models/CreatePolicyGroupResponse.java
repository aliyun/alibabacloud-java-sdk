// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreatePolicyGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PolicyGroupId")
    @Validation(required = true)
    public String policyGroupId;

    public static CreatePolicyGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyGroupResponse self = new CreatePolicyGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolicyGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePolicyGroupResponse setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

}
