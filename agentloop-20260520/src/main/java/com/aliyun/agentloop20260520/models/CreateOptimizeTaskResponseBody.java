// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateOptimizeTaskResponseBody extends TeaModel {
    /**
     * <p>The name of the optimization task.</p>
     * 
     * <strong>example:</strong>
     * <p>efficiency-analysis</p>
     */
    @NameInMap("optimizeTaskName")
    public String optimizeTaskName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateOptimizeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOptimizeTaskResponseBody self = new CreateOptimizeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOptimizeTaskResponseBody setOptimizeTaskName(String optimizeTaskName) {
        this.optimizeTaskName = optimizeTaskName;
        return this;
    }
    public String getOptimizeTaskName() {
        return this.optimizeTaskName;
    }

    public CreateOptimizeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
