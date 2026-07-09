// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateAgentSpaceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AA689779-61AB-5077-BD91-9F7EA1205D68</p>
     */
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
