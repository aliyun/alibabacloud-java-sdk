// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnassignPrivateIpAddressesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnassignPrivateIpAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassignPrivateIpAddressesResponse self = new UnassignPrivateIpAddressesResponse();
        return TeaModel.build(map, self);
    }

    public UnassignPrivateIpAddressesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
