// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateDynamicRouteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dr-ca9fddfac7c6****</p>
     */
    @NameInMap("DynamicRouteId")
    public String dynamicRouteId;

    /**
     * <strong>example:</strong>
     * <p>102350E7-1A20-58F5-9D63-ABEA820AE6E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDynamicRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDynamicRouteResponseBody self = new CreateDynamicRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDynamicRouteResponseBody setDynamicRouteId(String dynamicRouteId) {
        this.dynamicRouteId = dynamicRouteId;
        return this;
    }
    public String getDynamicRouteId() {
        return this.dynamicRouteId;
    }

    public CreateDynamicRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
