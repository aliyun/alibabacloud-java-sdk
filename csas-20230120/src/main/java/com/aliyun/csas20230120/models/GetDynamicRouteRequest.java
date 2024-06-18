// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetDynamicRouteRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dr-16ff07c8207d****</p>
     */
    @NameInMap("DynamicRouteId")
    public String dynamicRouteId;

    public static GetDynamicRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDynamicRouteRequest self = new GetDynamicRouteRequest();
        return TeaModel.build(map, self);
    }

    public GetDynamicRouteRequest setDynamicRouteId(String dynamicRouteId) {
        this.dynamicRouteId = dynamicRouteId;
        return this;
    }
    public String getDynamicRouteId() {
        return this.dynamicRouteId;
    }

}
