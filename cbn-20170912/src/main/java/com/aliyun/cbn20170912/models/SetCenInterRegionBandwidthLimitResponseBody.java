// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class SetCenInterRegionBandwidthLimitResponseBody extends TeaModel {
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
