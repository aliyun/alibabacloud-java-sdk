// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateRouteEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteEntryResponse self = new CreateRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouteEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
