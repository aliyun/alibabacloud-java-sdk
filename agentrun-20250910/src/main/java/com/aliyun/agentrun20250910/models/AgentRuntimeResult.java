// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AgentRuntimeResult extends TeaModel {
    /**
     * <p>Returns <code>SUCCESS</code> if the operation is successful; otherwise, returns an error code such as <code>ERR_BAD_REQUEST</code>, <code>ERR_VALIDATION_FAILED</code>, or <code>ERR_INTERNAL_SERVER_ERROR</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Detailed information about the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public AgentRuntime data;

    /**
     * <p>A unique request ID for issue tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AgentRuntimeResult build(java.util.Map<String, ?> map) throws Exception {
        AgentRuntimeResult self = new AgentRuntimeResult();
        return TeaModel.build(map, self);
    }

    public AgentRuntimeResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AgentRuntimeResult setData(AgentRuntime data) {
        this.data = data;
        return this;
    }
    public AgentRuntime getData() {
        return this.data;
    }

    public AgentRuntimeResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
