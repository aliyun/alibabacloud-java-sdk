// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteRouteEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteEntryResponse self = new DeleteRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouteEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
