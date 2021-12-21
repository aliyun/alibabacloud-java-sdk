// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterVbrAttachmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    public static CreateTransitRouterVbrAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterVbrAttachmentResponseBody self = new CreateTransitRouterVbrAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterVbrAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransitRouterVbrAttachmentResponseBody setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

}
