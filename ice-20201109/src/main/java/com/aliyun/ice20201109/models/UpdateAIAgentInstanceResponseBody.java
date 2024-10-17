// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAIAgentInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7B117AF5-2A16-412C-B127-FA6175ED1AD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAIAgentInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAIAgentInstanceResponseBody self = new UpdateAIAgentInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAIAgentInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
