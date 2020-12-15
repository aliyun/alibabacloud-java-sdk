// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListMapRouteDetailsShrinkRequest extends TeaModel {
    @NameInMap("RouteList")
    public String routeListShrink;

    public static ListMapRouteDetailsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMapRouteDetailsShrinkRequest self = new ListMapRouteDetailsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMapRouteDetailsShrinkRequest setRouteListShrink(String routeListShrink) {
        this.routeListShrink = routeListShrink;
        return this;
    }
    public String getRouteListShrink() {
        return this.routeListShrink;
    }

}
