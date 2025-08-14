// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ForwardAIAgentCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>550e8400********55440000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ForwardAIAgentCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ForwardAIAgentCallResponseBody self = new ForwardAIAgentCallResponseBody();
        return TeaModel.build(map, self);
    }

    public ForwardAIAgentCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
