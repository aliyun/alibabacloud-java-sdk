// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateAgentSpaceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AA689779-61AB-5077-BD91-9F7EA1205D68</p>
     */
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
