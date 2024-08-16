// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenChildInstanceRouteEntryToAttachmentResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A95A100B-3F3A-56F4-A5DE-19DB7E994807</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCenChildInstanceRouteEntryToAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCenChildInstanceRouteEntryToAttachmentResponseBody self = new CreateCenChildInstanceRouteEntryToAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCenChildInstanceRouteEntryToAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
