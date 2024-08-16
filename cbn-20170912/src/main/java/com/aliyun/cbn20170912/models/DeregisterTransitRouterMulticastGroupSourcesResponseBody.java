// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeregisterTransitRouterMulticastGroupSourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>53E7E8BE-7F4E-5458-ACCA-9B5C1D6A642D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeregisterTransitRouterMulticastGroupSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeregisterTransitRouterMulticastGroupSourcesResponseBody self = new DeregisterTransitRouterMulticastGroupSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeregisterTransitRouterMulticastGroupSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
