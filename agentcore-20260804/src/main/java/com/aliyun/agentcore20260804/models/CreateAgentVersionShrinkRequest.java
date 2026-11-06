// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateAgentVersionShrinkRequest extends TeaModel {
    /**
     * <p>保存版本的请求体。</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>客户端生成的幂等令牌，当前为预留参数，后端暂不提供持久化幂等保证。</p>
     * 
     * <strong>example:</strong>
     * <p>c2d8a6f0-3b1e-4a7d-9f25-6e4b0c1a8d37</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateAgentVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentVersionShrinkRequest self = new CreateAgentVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentVersionShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public CreateAgentVersionShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
