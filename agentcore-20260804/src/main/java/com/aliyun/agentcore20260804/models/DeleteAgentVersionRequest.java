// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteAgentVersionRequest extends TeaModel {
    /**
     * <p>客户端生成的幂等令牌，当前为预留参数，后端暂不提供持久化幂等保证。</p>
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
