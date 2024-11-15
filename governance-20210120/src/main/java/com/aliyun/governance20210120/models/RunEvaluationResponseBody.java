// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class RunEvaluationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D3E2A3A-F2B8-578D-9659-3195F94A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunEvaluationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunEvaluationResponseBody self = new RunEvaluationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunEvaluationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
