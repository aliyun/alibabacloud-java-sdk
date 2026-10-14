// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteOptimizeTaskRequest extends TeaModel {
    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static DeleteOptimizeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOptimizeTaskRequest self = new DeleteOptimizeTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOptimizeTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
