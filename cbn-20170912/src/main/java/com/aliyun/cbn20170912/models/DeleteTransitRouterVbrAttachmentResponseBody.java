// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterVbrAttachmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransitRouterVbrAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterVbrAttachmentResponseBody self = new DeleteTransitRouterVbrAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterVbrAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
