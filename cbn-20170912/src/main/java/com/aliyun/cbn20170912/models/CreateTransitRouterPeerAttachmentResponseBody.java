// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPeerAttachmentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>59422BF5-BAAD-4CFD-9019-9557BD3ACFA3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the inter-region connection.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-nwkiqfvw22qesz****</p>
     */
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
