// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateAgentSpaceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static CreateAgentSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSpaceResponseBody self = new CreateAgentSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
