// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenChildInstanceRouteEntryToAttachmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCenChildInstanceRouteEntryToAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenChildInstanceRouteEntryToAttachmentResponseBody self = new DeleteCenChildInstanceRouteEntryToAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
