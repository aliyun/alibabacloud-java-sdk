// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the route.</p>
     */
    @NameInMap("RouteEntryId")
    public String routeEntryId;

    public static CreateEnsRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsRouteEntryResponseBody self = new CreateEnsRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnsRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEnsRouteEntryResponseBody setRouteEntryId(String routeEntryId) {
        this.routeEntryId = routeEntryId;
        return this;
    }
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

}
