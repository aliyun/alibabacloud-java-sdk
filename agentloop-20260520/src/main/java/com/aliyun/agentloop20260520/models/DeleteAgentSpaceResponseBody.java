// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteAgentSpaceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DeleteAgentSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentSpaceResponseBody self = new DeleteAgentSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgentSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
