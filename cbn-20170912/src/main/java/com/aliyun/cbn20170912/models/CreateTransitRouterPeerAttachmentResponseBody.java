// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPeerAttachmentResponseBody extends TeaModel {
    /**
     * <p>The ID of the region where the peer transit router is deployed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether to check the request but not perform the operation. The system checks the permissions and the status of the specified instances. Valid values:</p>
     * <br>
     * <p>*   **false** (default): checks the request. If the request passes the check, the inter-region connection is created.</p>
     * <p>*   **true**: checks the request but does not perform the operation. The inter-region connection is not created after the request passes the check. If you use this value, the system checks the required parameters and the request syntax. If the request fails to pass the precheck, an error message is returned. If the request passes the check, the system returns the ID of the request.</p>
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
