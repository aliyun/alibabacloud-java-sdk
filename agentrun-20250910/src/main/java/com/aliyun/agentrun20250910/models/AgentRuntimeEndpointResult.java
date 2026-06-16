// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AgentRuntimeEndpointResult extends TeaModel {
    /**
     * <p>SUCCESS indicates success. In case of failure, the corresponding error type is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Detailed information about the agent runtime endpoint</p>
     */
    @NameInMap("data")
    public AgentRuntimeEndpoint data;

    /**
     * <p>A unique request identifier used for troubleshooting</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AgentRuntimeEndpointResult build(java.util.Map<String, ?> map) throws Exception {
        AgentRuntimeEndpointResult self = new AgentRuntimeEndpointResult();
        return TeaModel.build(map, self);
    }

    public AgentRuntimeEndpointResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AgentRuntimeEndpointResult setData(AgentRuntimeEndpoint data) {
        this.data = data;
        return this;
    }
    public AgentRuntimeEndpoint getData() {
        return this.data;
    }

    public AgentRuntimeEndpointResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
