// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterVpnAttachmentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8B5DD40A-3A29-5AC0-B8DA-05FD10D5C893</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the VPN attachment.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-y5dup2qwfyh9lu****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    public static CreateTransitRouterVpnAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterVpnAttachmentResponseBody self = new CreateTransitRouterVpnAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterVpnAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransitRouterVpnAttachmentResponseBody setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

}
