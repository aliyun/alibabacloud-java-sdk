// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessTagsForDynamicRouteRequest extends TeaModel {
    /**
     * <p>A collection of dynamic route IDs. You can enter a maximum of 100 dynamic route IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DynamicRouteIds")
    public java.util.List<String> dynamicRouteIds;

    public static ListPrivateAccessTagsForDynamicRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessTagsForDynamicRouteRequest self = new ListPrivateAccessTagsForDynamicRouteRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessTagsForDynamicRouteRequest setDynamicRouteIds(java.util.List<String> dynamicRouteIds) {
        this.dynamicRouteIds = dynamicRouteIds;
        return this;
    }
    public java.util.List<String> getDynamicRouteIds() {
        return this.dynamicRouteIds;
    }

}
