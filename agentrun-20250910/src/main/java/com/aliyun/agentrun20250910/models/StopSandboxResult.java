// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class StopSandboxResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Sandbox data;

    @NameInMap("requestId")
    public String requestId;

    public static StopSandboxResult build(java.util.Map<String, ?> map) throws Exception {
        StopSandboxResult self = new StopSandboxResult();
        return TeaModel.build(map, self);
    }

    public StopSandboxResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopSandboxResult setData(Sandbox data) {
        this.data = data;
        return this;
    }
    public Sandbox getData() {
        return this.data;
    }

    public StopSandboxResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
