// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteAIAgentDialogueResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7B117AF5-2A1******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAIAgentDialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIAgentDialogueResponseBody self = new DeleteAIAgentDialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAIAgentDialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
