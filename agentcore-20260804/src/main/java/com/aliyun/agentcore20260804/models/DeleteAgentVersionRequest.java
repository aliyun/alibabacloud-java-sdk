// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteAgentVersionRequest extends TeaModel {
    /**
     * <p>The client-generated idempotency token. This is a reserved parameter, and the backend does not currently provide persistent idempotency guarantees.</p>
     * 
     * <strong>example:</strong>
     * <p>c2d8a6f0-3b1e-4a7d-9f25-6e4b0c1a8d37</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static DeleteAgentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentVersionRequest self = new DeleteAgentVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentVersionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
