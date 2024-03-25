// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterEcrAttachmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    public static CreateTransitRouterEcrAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterEcrAttachmentResponseBody self = new CreateTransitRouterEcrAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterEcrAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransitRouterEcrAttachmentResponseBody setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

}
