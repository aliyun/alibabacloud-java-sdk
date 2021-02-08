// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignIpv6AddressesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AssignIpv6AddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignIpv6AddressesResponse self = new AssignIpv6AddressesResponse();
        return TeaModel.build(map, self);
    }

    public AssignIpv6AddressesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
