// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateAgentSpaceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static UpdateAgentSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentSpaceResponseBody self = new UpdateAgentSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAgentSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
