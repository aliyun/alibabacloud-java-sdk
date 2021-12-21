// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterVpcAttachmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransitRouterVpcAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterVpcAttachmentResponseBody self = new DeleteTransitRouterVpcAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterVpcAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
