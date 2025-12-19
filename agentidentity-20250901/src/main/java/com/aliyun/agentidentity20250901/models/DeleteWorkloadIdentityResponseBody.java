// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteWorkloadIdentityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0946BB5C-15AA-53E6-A2A6-ED87119A640C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWorkloadIdentityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkloadIdentityResponseBody self = new DeleteWorkloadIdentityResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkloadIdentityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
