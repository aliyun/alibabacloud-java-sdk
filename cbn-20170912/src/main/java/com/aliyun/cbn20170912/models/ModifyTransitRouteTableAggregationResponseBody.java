// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouteTableAggregationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C2EE7A8-74D4-4081-8236-CEBDE3BBCF50</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTransitRouteTableAggregationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouteTableAggregationResponseBody self = new ModifyTransitRouteTableAggregationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouteTableAggregationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
