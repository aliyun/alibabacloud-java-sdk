// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnassignIpv6AddressesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnassignIpv6AddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassignIpv6AddressesResponse self = new UnassignIpv6AddressesResponse();
        return TeaModel.build(map, self);
    }

}
