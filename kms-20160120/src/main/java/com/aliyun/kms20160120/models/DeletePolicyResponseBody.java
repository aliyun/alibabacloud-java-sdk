// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeletePolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00a26a33-d992-42f3-9012-5fd12764430f</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyResponseBody self = new DeletePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
