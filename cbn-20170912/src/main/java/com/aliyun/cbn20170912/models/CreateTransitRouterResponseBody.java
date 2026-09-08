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
     * <p>The Enterprise Edition transit router instance ID. After creation, the instance is in the Creating state. Wait until the instance status changes to Active before performing subsequent operations. You can call the <a href="https://help.aliyun.com/document_detail/261219.html">ListTransitRouters</a> operation to query the Enterprise Edition transit router instance status.</p>
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
