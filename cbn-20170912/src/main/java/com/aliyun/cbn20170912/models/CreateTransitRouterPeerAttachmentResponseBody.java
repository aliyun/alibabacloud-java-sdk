// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPeerAttachmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    public static CreateTransitRouterPeerAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterPeerAttachmentResponseBody self = new CreateTransitRouterPeerAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterPeerAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransitRouterPeerAttachmentResponseBody setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

}
