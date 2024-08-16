// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterVpcAttachmentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C087A369-82B9-43EF-91F4-4B63A9C6E6B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the VPC connection.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-ia340z7xis7t5s****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    public static CreateTransitRouterVpcAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterVpcAttachmentResponseBody self = new CreateTransitRouterVpcAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterVpcAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransitRouterVpcAttachmentResponseBody setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

}
