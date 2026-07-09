// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateContextStoreResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to locate the request during troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateContextStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextStoreResponseBody self = new UpdateContextStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContextStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
