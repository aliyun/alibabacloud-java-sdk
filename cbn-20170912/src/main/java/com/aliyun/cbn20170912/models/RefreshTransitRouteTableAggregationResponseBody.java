// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RefreshTransitRouteTableAggregationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshTransitRouteTableAggregationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshTransitRouteTableAggregationResponseBody self = new RefreshTransitRouteTableAggregationResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshTransitRouteTableAggregationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
