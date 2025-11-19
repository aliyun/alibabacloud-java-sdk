// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteSandboxResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Sandbox data;

    /**
     * <p>唯一的请求标识符，用于问题追踪</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteSandboxResult build(java.util.Map<String, ?> map) throws Exception {
        DeleteSandboxResult self = new DeleteSandboxResult();
        return TeaModel.build(map, self);
    }

    public DeleteSandboxResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSandboxResult setData(Sandbox data) {
        this.data = data;
        return this;
    }
    public Sandbox getData() {
        return this.data;
    }

    public DeleteSandboxResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
