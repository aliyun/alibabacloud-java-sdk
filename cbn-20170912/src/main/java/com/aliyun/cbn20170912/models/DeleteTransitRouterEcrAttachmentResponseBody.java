// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterEcrAttachmentResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7DDDC17-FA06-4AC2-8F35-59D2470FCFC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransitRouterEcrAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterEcrAttachmentResponseBody self = new DeleteTransitRouterEcrAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterEcrAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
