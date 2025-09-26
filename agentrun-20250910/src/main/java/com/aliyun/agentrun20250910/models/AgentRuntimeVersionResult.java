// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AgentRuntimeVersionResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>智能体运行时版本的详细信息</p>
     */
    @NameInMap("data")
    public AgentRuntimeVersion data;

    /**
     * <p>唯一的请求标识符，用于问题追踪</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AgentRuntimeVersionResult build(java.util.Map<String, ?> map) throws Exception {
        AgentRuntimeVersionResult self = new AgentRuntimeVersionResult();
        return TeaModel.build(map, self);
    }

    public AgentRuntimeVersionResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AgentRuntimeVersionResult setData(AgentRuntimeVersion data) {
        this.data = data;
        return this;
    }
    public AgentRuntimeVersion getData() {
        return this.data;
    }

    public AgentRuntimeVersionResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
