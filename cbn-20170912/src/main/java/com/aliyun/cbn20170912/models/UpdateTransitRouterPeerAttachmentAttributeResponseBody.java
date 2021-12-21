// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterPeerAttachmentAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTransitRouterPeerAttachmentAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterPeerAttachmentAttributeResponseBody self = new UpdateTransitRouterPeerAttachmentAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterPeerAttachmentAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
