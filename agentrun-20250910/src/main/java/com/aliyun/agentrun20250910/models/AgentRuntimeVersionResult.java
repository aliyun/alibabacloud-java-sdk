// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AgentRuntimeVersionResult extends TeaModel {
    /**
     * <p>SUCCESS indicates success. In case of failure, the corresponding error type is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Detailed information about the agent runtime version</p>
     */
    @NameInMap("data")
    public AgentRuntimeVersion data;

    /**
     * <p>A unique request identifier used for troubleshooting</p>
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
