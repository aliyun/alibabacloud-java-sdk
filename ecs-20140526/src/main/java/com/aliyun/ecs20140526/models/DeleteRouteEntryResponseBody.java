// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteRouteEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteEntryResponseBody self = new DeleteRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
