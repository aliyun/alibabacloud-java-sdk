// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignIpv6AddressesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    public String networkInterfaceId;

    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    public static AssignIpv6AddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignIpv6AddressesRequest self = new AssignIpv6AddressesRequest();
        return TeaModel.build(map, self);
    }

}
