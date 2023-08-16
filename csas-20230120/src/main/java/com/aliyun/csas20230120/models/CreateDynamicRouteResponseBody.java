// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateDynamicRouteResponseBody extends TeaModel {
    @NameInMap("DynamicRouteId")
    public String dynamicRouteId;

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
