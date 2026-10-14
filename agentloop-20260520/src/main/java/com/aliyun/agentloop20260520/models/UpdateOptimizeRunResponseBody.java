// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateOptimizeRunResponseBody extends TeaModel {
    /**
     * <p>The ID of the execution instance.</p>
     * 
     * <strong>example:</strong>
     * <p>or-20260812-0001</p>
     */
    @NameInMap("optimizeRunId")
    public String optimizeRunId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateOptimizeRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOptimizeRunResponseBody self = new UpdateOptimizeRunResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOptimizeRunResponseBody setOptimizeRunId(String optimizeRunId) {
        this.optimizeRunId = optimizeRunId;
        return this;
    }
    public String getOptimizeRunId() {
        return this.optimizeRunId;
    }

    public UpdateOptimizeRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
