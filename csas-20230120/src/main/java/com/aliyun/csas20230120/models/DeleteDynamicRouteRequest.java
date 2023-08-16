// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteDynamicRouteRequest extends TeaModel {
    @NameInMap("DynamicRouteId")
    public String dynamicRouteId;

    public static DeleteDynamicRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDynamicRouteRequest self = new DeleteDynamicRouteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDynamicRouteRequest setDynamicRouteId(String dynamicRouteId) {
        this.dynamicRouteId = dynamicRouteId;
        return this;
    }
    public String getDynamicRouteId() {
        return this.dynamicRouteId;
    }

}
