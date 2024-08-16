// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterRouteTableResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9D6D5548-F271-41C4-AA9F-A62F5599085B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTransitRouterRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterRouteTableResponseBody self = new UpdateTransitRouterRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
