// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AssociateTransitRouterAttachmentWithRouteTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateTransitRouterAttachmentWithRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateTransitRouterAttachmentWithRouteTableResponseBody self = new AssociateTransitRouterAttachmentWithRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateTransitRouterAttachmentWithRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
