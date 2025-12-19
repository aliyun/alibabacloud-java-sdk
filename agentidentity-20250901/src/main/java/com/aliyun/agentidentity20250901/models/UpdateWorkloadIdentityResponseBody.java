// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateWorkloadIdentityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>69469F02-DFA8-5733-960F-AEE7CBC7C436</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWorkloadIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkloadIdentityResponseBody self = new UpdateWorkloadIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkloadIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
