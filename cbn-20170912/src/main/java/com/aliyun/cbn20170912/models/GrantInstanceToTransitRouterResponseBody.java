// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class GrantInstanceToTransitRouterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GrantInstanceToTransitRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToTransitRouterResponseBody self = new GrantInstanceToTransitRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToTransitRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
