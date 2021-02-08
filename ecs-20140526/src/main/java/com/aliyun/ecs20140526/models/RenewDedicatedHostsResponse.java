// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RenewDedicatedHostsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RenewDedicatedHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewDedicatedHostsResponse self = new RenewDedicatedHostsResponse();
        return TeaModel.build(map, self);
    }

    public RenewDedicatedHostsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
