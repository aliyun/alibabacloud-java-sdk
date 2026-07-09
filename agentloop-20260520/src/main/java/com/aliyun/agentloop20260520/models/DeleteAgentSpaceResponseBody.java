// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteAgentSpaceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0173835-9E0F-508F-8BFA-9F556E59C302</p>
     */
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
