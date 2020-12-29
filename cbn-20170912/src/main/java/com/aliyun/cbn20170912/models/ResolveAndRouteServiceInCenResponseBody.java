// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ResolveAndRouteServiceInCenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResolveAndRouteServiceInCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResolveAndRouteServiceInCenResponseBody self = new ResolveAndRouteServiceInCenResponseBody();
        return TeaModel.build(map, self);
    }

    public ResolveAndRouteServiceInCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
