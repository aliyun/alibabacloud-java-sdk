// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenRouteMapResponseBody extends TeaModel {
    @NameInMap("RouteMapId")
    public String routeMapId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCenRouteMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCenRouteMapResponseBody self = new CreateCenRouteMapResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCenRouteMapResponseBody setRouteMapId(String routeMapId) {
        this.routeMapId = routeMapId;
        return this;
    }
    public String getRouteMapId() {
        return this.routeMapId;
    }

    public CreateCenRouteMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
