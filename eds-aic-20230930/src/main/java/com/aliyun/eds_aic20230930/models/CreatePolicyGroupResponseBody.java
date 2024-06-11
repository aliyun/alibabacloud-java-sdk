// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreatePolicyGroupResponseBody extends TeaModel {
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreatePolicyGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyGroupResponseBody self = new CreatePolicyGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolicyGroupResponseBody setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public CreatePolicyGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
