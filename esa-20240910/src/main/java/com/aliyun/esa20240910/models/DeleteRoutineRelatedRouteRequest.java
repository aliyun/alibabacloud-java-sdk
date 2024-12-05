// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineRelatedRouteRequest extends TeaModel {
    /**
     * <p>The routine name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DeleteRoutineRelatedRoute</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The route URL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><em>.example.com/path1</em></p>
     */
    @NameInMap("Route")
    public String route;

    /**
     * <p>The route ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0c3b82a3d1524e9f750da11d0cc0be0a</p>
     */
    @NameInMap("RouteId")
    public String routeId;

    /**
     * <p>The website ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54362329990032</p>
     */
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
