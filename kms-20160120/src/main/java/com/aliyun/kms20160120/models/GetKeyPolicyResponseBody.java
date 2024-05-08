// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKeyPolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    public String policy;

    @NameInMap("RequestId")
    public String requestId;

    public static GetKeyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKeyPolicyResponseBody self = new GetKeyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKeyPolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GetKeyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
