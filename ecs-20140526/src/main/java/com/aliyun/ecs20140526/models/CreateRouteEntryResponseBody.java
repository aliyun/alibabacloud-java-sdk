// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateRouteEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteEntryResponseBody self = new CreateRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
