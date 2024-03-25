// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterEcrAttachmentAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTransitRouterEcrAttachmentAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterEcrAttachmentAttributeResponseBody self = new UpdateTransitRouterEcrAttachmentAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterEcrAttachmentAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
