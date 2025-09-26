// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateAgentRuntimeRequest extends TeaModel {
    /**
     * <p>创建智能体运行时所需的完整配置信息，包括运行时名称、资源规格、网络配置、协议配置等</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateAgentRuntimeInput body;

    public static CreateAgentRuntimeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRuntimeRequest self = new CreateAgentRuntimeRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentRuntimeRequest setBody(CreateAgentRuntimeInput body) {
        this.body = body;
        return this;
    }
    public CreateAgentRuntimeInput getBody() {
        return this.body;
    }

}
