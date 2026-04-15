// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateFlowEndpointRequest extends TeaModel {
    /**
     * <p>创建工作流端点所需的完整配置信息</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateFlowEndpointInput body;

    public static CreateFlowEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowEndpointRequest self = new CreateFlowEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowEndpointRequest setBody(CreateFlowEndpointInput body) {
        this.body = body;
        return this;
    }
    public CreateFlowEndpointInput getBody() {
        return this.body;
    }

}
