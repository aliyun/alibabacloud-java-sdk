// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DetachPolicySetFromGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachPolicySetFromGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicySetFromGatewayResponseBody self = new DetachPolicySetFromGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachPolicySetFromGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
