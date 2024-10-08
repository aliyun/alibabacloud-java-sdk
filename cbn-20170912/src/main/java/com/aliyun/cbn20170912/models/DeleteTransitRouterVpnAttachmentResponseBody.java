// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterVpnAttachmentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FA43C571-E88B-56C0-8FF8-5646D9B96297</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransitRouterVpnAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterVpnAttachmentResponseBody self = new DeleteTransitRouterVpnAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterVpnAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
