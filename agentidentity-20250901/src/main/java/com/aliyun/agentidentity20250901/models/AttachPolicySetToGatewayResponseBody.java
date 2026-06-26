// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class AttachPolicySetToGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachPolicySetToGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicySetToGatewayResponseBody self = new AttachPolicySetToGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachPolicySetToGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
