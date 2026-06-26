// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteWorkloadIdentityResponseBody extends TeaModel {
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
