// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListMapRouteDetailsRequest extends TeaModel {
    @NameInMap("RouteList")
    public java.util.Map<String, ?> routeList;

    public static ListMapRouteDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMapRouteDetailsRequest self = new ListMapRouteDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListMapRouteDetailsRequest setRouteList(java.util.Map<String, ?> routeList) {
        this.routeList = routeList;
        return this;
    }
    public java.util.Map<String, ?> getRouteList() {
        return this.routeList;
    }

}
