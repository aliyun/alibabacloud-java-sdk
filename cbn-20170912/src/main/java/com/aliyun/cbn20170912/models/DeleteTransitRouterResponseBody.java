// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6DE3EE92-39C8-4BBD-A3AD-F568D74741BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransitRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterResponseBody self = new DeleteTransitRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
