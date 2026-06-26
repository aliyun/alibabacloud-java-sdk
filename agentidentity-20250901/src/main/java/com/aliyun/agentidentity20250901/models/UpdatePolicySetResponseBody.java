// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdatePolicySetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePolicySetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicySetResponseBody self = new UpdatePolicySetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePolicySetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
