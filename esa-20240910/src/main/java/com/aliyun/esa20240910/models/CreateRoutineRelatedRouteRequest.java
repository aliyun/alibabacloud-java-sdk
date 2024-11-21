// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineRelatedRouteRequest extends TeaModel {
    /**
     * <p>The routine name.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateRoutineRelatedRoute</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The route.</p>
     * 
     * <strong>example:</strong>
     * <p><em>.example.com/path1</em></p>
     */
    @NameInMap("Route")
    public String route;

    /**
     * <p>The website ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54362329990032</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static CreateRoutineRelatedRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineRelatedRouteRequest self = new CreateRoutineRelatedRouteRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoutineRelatedRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRoutineRelatedRouteRequest setRoute(String route) {
        this.route = route;
        return this;
    }
    public String getRoute() {
        return this.route;
    }

    public CreateRoutineRelatedRouteRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
