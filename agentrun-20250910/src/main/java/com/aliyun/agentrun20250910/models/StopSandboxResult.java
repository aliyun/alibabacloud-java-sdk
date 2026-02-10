// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class StopSandboxResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Sandbox data;

    /**
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
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
