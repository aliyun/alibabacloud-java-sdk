// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyClusterConnectionStringResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>370D09FD-442A-5225-AAD3-7362CAE39177</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterConnectionStringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterConnectionStringResponseBody self = new ModifyClusterConnectionStringResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterConnectionStringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
