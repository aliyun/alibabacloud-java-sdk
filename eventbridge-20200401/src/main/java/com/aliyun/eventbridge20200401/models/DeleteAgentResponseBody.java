// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteAgentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AgentNotFound</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Agent with name \&quot;xxx\&quot; not found for account 1186xxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B896B484-F16D-59DE-9E23-DD0E5C361108</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentResponseBody self = new DeleteAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
