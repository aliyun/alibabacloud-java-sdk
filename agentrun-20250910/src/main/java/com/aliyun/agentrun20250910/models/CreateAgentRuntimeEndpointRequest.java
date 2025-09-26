// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateAgentRuntimeEndpointRequest extends TeaModel {
    /**
     * <p>包含要创建的智能体运行时端点配置信息的请求体</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateAgentRuntimeEndpointInput body;

    public static CreateAgentRuntimeEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRuntimeEndpointRequest self = new CreateAgentRuntimeEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentRuntimeEndpointRequest setBody(CreateAgentRuntimeEndpointInput body) {
        this.body = body;
        return this;
    }
    public CreateAgentRuntimeEndpointInput getBody() {
        return this.body;
    }

}
