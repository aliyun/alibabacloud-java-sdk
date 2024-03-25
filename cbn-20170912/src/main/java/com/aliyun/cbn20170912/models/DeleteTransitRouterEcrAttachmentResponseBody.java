// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterEcrAttachmentResponseBody extends TeaModel {
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
