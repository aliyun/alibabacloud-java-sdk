// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVpnAttachmentAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTransitRouterVpnAttachmentAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterVpnAttachmentAttributeResponseBody self = new UpdateTransitRouterVpnAttachmentAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterVpnAttachmentAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
