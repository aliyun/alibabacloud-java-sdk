// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendAIAgentTextResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DB488837-3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendAIAgentTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendAIAgentTextResponseBody self = new SendAIAgentTextResponseBody();
        return TeaModel.build(map, self);
    }

    public SendAIAgentTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
