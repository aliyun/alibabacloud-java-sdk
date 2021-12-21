// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterRouteTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransitRouterRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterRouteTableResponseBody self = new DeleteTransitRouterRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
