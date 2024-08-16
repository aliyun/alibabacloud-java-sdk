// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterPeerAttachmentResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A01FEDD7-7D69-4EB3-996D-CF79F6F885CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransitRouterPeerAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterPeerAttachmentResponseBody self = new DeleteTransitRouterPeerAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterPeerAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
