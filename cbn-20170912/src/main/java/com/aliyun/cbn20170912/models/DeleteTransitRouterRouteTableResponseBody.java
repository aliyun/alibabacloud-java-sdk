// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterRouteTableResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EAB2F133-8556-4D7C-9E91-7EE4FE9CC7D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransitRouterRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterRouteTableResponseBody self = new DeleteTransitRouterRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
