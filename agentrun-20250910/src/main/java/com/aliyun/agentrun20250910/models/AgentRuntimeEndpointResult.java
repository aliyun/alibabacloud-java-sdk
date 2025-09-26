// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AgentRuntimeEndpointResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>智能体运行时端点的详细信息</p>
     */
    @NameInMap("data")
    public AgentRuntimeEndpoint data;

    /**
     * <p>唯一的请求标识符，用于问题追踪</p>
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
