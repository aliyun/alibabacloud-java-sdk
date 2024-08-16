// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2D69CCEA-42D0-48B2-8C9A-9BB207F76D6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTransitRouterRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterRouteEntryResponseBody self = new UpdateTransitRouterRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
