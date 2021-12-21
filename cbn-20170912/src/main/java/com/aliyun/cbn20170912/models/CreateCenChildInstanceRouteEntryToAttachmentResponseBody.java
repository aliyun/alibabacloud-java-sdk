// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenChildInstanceRouteEntryToAttachmentResponseBody extends TeaModel {
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
