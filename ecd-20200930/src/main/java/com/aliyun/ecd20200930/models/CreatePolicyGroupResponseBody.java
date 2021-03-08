// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreatePolicyGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    public static CreatePolicyGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyGroupResponseBody self = new CreatePolicyGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolicyGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePolicyGroupResponseBody setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

}
