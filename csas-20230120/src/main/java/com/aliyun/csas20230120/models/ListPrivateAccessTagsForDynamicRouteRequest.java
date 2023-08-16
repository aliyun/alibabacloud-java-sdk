// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessTagsForDynamicRouteRequest extends TeaModel {
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
