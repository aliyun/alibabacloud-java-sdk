// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineRelatedRouteRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DeleteRoutineRelatedRoute</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Route")
    public String route;

    @NameInMap("RouteId")
    public String routeId;

    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteRoutineRelatedRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineRelatedRouteRequest self = new DeleteRoutineRelatedRouteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineRelatedRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteRoutineRelatedRouteRequest setRoute(String route) {
        this.route = route;
        return this;
    }
    public String getRoute() {
        return this.route;
    }

    public DeleteRoutineRelatedRouteRequest setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

    public DeleteRoutineRelatedRouteRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
