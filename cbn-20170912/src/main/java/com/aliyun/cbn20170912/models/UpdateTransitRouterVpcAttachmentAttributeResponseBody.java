// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVpcAttachmentAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTransitRouterVpcAttachmentAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterVpcAttachmentAttributeResponseBody self = new UpdateTransitRouterVpcAttachmentAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterVpcAttachmentAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
