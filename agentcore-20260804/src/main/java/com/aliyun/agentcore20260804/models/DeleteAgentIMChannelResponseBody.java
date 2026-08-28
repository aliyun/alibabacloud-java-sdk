// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteAgentIMChannelResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteAgentIMChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentIMChannelResponseBody self = new DeleteAgentIMChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgentIMChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
