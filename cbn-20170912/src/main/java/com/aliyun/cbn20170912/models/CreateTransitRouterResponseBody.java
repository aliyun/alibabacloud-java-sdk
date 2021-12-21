// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static CreateTransitRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterResponseBody self = new CreateTransitRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransitRouterResponseBody setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}
