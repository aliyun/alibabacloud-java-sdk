// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RoutePrivateZoneInCenToVpcResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C0245BEF-52AC-44A8-A776-EF96FD26A5CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RoutePrivateZoneInCenToVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RoutePrivateZoneInCenToVpcResponseBody self = new RoutePrivateZoneInCenToVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public RoutePrivateZoneInCenToVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
