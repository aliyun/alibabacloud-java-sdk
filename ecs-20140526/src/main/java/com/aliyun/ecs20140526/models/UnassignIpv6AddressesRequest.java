// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnassignIpv6AddressesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    public String networkInterfaceId;

    @NameInMap("Ipv6Address")
    @Validation(required = true)
    public java.util.List<String> ipv6Address;

    public static UnassignIpv6AddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassignIpv6AddressesRequest self = new UnassignIpv6AddressesRequest();
        return TeaModel.build(map, self);
    }

    public UnassignIpv6AddressesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnassignIpv6AddressesRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public UnassignIpv6AddressesRequest setIpv6Address(java.util.List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public java.util.List<String> getIpv6Address() {
        return this.ipv6Address;
    }

}
