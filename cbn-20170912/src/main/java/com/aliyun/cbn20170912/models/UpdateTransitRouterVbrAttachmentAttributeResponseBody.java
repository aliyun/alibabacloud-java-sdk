// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVbrAttachmentAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTransitRouterVbrAttachmentAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterVbrAttachmentAttributeResponseBody self = new UpdateTransitRouterVbrAttachmentAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterVbrAttachmentAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
