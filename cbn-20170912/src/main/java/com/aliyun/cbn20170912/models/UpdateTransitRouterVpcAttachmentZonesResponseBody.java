// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterVpcAttachmentZonesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>595AE52F-49FF-5788-A677-0DD1467941A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTransitRouterVpcAttachmentZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterVpcAttachmentZonesResponseBody self = new UpdateTransitRouterVpcAttachmentZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterVpcAttachmentZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
