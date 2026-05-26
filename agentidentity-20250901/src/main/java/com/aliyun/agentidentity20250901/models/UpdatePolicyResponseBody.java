// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdatePolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyResponseBody self = new UpdatePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
