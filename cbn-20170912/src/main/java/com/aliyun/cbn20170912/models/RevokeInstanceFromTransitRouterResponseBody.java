// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromTransitRouterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AA4BFFD1-5090-5896-935F-4B353557F1A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeInstanceFromTransitRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromTransitRouterResponseBody self = new RevokeInstanceFromTransitRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromTransitRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
