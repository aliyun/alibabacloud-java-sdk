// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class SetCenInterRegionBandwidthLimitResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>530BC816-F575-412A-AAB2-435125D26328</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetCenInterRegionBandwidthLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCenInterRegionBandwidthLimitResponseBody self = new SetCenInterRegionBandwidthLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCenInterRegionBandwidthLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
