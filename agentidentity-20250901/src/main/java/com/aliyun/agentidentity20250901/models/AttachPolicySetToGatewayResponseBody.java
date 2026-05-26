// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class AttachPolicySetToGatewayResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
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
