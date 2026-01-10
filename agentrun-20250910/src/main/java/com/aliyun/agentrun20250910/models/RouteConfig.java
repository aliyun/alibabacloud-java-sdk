// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RouteConfig extends TeaModel {
    /**
     * <p>路由表：自定义域名访问时的 PATH 到 Function 的映射列表。</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("routes")
    public java.util.List<PathConfig> routes;

    public static RouteConfig build(java.util.Map<String, ?> map) throws Exception {
        RouteConfig self = new RouteConfig();
        return TeaModel.build(map, self);
    }

    public RouteConfig setRoutes(java.util.List<PathConfig> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<PathConfig> getRoutes() {
        return this.routes;
    }

}
