// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeletePolicySetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePolicySetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicySetResponseBody self = new DeletePolicySetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePolicySetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
