// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterVbrAttachmentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3EDA94DE-0AE5-41FC-A91E-7170E408E0FD</p>
     */
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
