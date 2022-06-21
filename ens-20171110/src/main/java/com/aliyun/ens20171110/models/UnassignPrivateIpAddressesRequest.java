// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnassignPrivateIpAddressesRequest extends TeaModel {
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("PrivateIpAddress")
    public java.util.List<String> privateIpAddress;

    public static UnassignPrivateIpAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnassignPrivateIpAddressesRequest self = new UnassignPrivateIpAddressesRequest();
        return TeaModel.build(map, self);
    }

    public UnassignPrivateIpAddressesRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public UnassignPrivateIpAddressesRequest setPrivateIpAddress(java.util.List<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public java.util.List<String> getPrivateIpAddress() {
        return this.privateIpAddress;
    }

}
