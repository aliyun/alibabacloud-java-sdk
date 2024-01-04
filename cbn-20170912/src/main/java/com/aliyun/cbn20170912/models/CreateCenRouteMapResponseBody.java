// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenRouteMapResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the routing policy.</p>
     */
    @NameInMap("RouteMapId")
    public String routeMapId;

    public static CreateCenRouteMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCenRouteMapResponseBody self = new CreateCenRouteMapResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCenRouteMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCenRouteMapResponseBody setRouteMapId(String routeMapId) {
        this.routeMapId = routeMapId;
        return this;
    }
    public String getRouteMapId() {
        return this.routeMapId;
    }

}
