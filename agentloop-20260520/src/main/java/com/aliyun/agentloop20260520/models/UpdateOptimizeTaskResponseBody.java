// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateOptimizeTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateOptimizeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOptimizeTaskResponseBody self = new UpdateOptimizeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOptimizeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
