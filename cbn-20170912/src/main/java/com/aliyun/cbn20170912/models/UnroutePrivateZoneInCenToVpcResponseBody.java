// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UnroutePrivateZoneInCenToVpcResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnroutePrivateZoneInCenToVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnroutePrivateZoneInCenToVpcResponseBody self = new UnroutePrivateZoneInCenToVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public UnroutePrivateZoneInCenToVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
