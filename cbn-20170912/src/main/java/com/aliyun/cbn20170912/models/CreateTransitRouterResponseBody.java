// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>404DA7EC-F495-44B5-B543-6EDCDF90F3D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Enterprise Edition transit router instance ID, which is used to forward traffic and perform routing. After the instance is created, it is in the Creating state. You must wait until the instance enters the Active state before you can proceed to What to do next. You can invoke the ListTransitRouters operation to query the instance status.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-uf6llz2286805i44g****</p>
     */
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
