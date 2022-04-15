// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeregisterTransitRouterMulticastGroupSourcesResponseBody extends TeaModel {
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
