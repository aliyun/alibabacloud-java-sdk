// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class SandboxHealthCheckResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public SandboxHealthCheckOut data;

    /**
     * <p>唯一的请求标识符，用于问题追踪</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SandboxHealthCheckResult build(java.util.Map<String, ?> map) throws Exception {
        SandboxHealthCheckResult self = new SandboxHealthCheckResult();
        return TeaModel.build(map, self);
    }

    public SandboxHealthCheckResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SandboxHealthCheckResult setData(SandboxHealthCheckOut data) {
        this.data = data;
        return this;
    }
    public SandboxHealthCheckOut getData() {
        return this.data;
    }

    public SandboxHealthCheckResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
