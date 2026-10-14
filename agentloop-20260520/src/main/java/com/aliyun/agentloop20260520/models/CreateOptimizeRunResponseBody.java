// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateOptimizeRunResponseBody extends TeaModel {
    /**
     * <p>The details of the created run. You can call the GetOptimizeRun operation to query the subsequent status.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;optimizeRunId&quot;:&quot;opr-20261014&quot;,&quot;status&quot;:&quot;Pending&quot;}</p>
     */
    @NameInMap("optimizeRun")
    public java.util.Map<String, ?> optimizeRun;

    /**
     * <p>The run ID.</p>
     * 
     * <strong>example:</strong>
     * <p>opr-20261014</p>
     */
    @NameInMap("optimizeRunId")
    public String optimizeRunId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateOptimizeRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOptimizeRunResponseBody self = new CreateOptimizeRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOptimizeRunResponseBody setOptimizeRun(java.util.Map<String, ?> optimizeRun) {
        this.optimizeRun = optimizeRun;
        return this;
    }
    public java.util.Map<String, ?> getOptimizeRun() {
        return this.optimizeRun;
    }

    public CreateOptimizeRunResponseBody setOptimizeRunId(String optimizeRunId) {
        this.optimizeRunId = optimizeRunId;
        return this;
    }
    public String getOptimizeRunId() {
        return this.optimizeRunId;
    }

    public CreateOptimizeRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
