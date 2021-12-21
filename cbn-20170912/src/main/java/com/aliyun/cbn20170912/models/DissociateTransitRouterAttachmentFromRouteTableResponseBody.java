// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DissociateTransitRouterAttachmentFromRouteTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateTransitRouterAttachmentFromRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateTransitRouterAttachmentFromRouteTableResponseBody self = new DissociateTransitRouterAttachmentFromRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateTransitRouterAttachmentFromRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
