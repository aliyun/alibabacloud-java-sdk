// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9963DD7-998B-4F92-892D-8293CB49EE81</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTransitRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterResponseBody self = new UpdateTransitRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
