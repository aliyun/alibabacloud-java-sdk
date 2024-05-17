// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessApplicationsForDynamicRouteRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DynamicRouteIds")
    public java.util.List<String> dynamicRouteIds;

    public static ListPrivateAccessApplicationsForDynamicRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessApplicationsForDynamicRouteRequest self = new ListPrivateAccessApplicationsForDynamicRouteRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessApplicationsForDynamicRouteRequest setDynamicRouteIds(java.util.List<String> dynamicRouteIds) {
        this.dynamicRouteIds = dynamicRouteIds;
        return this;
    }
    public java.util.List<String> getDynamicRouteIds() {
        return this.dynamicRouteIds;
    }

}
