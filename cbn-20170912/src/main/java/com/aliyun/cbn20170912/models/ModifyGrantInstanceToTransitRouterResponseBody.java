// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyGrantInstanceToTransitRouterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F7DDDC17-FA06-4AC2-8F35-59D2470FCFC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGrantInstanceToTransitRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGrantInstanceToTransitRouterResponseBody self = new ModifyGrantInstanceToTransitRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGrantInstanceToTransitRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
