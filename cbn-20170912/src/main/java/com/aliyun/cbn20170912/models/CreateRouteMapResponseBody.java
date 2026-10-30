// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateRouteMapResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0C2EE7A8-74D4-4081-8236-CEBDE3BBCF50</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the route map.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-abcdedfghij****</p>
     */
    @NameInMap("RouteMapId")
    public String routeMapId;

    public static CreateRouteMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteMapResponseBody self = new CreateRouteMapResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRouteMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRouteMapResponseBody setRouteMapId(String routeMapId) {
        this.routeMapId = routeMapId;
        return this;
    }
    public String getRouteMapId() {
        return this.routeMapId;
    }

}
