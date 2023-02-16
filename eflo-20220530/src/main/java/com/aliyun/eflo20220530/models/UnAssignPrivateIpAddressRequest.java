// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UnAssignPrivateIpAddressRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("IpName")
    public String ipName;

    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubnetId")
    public String subnetId;

    public static UnAssignPrivateIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        UnAssignPrivateIpAddressRequest self = new UnAssignPrivateIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public UnAssignPrivateIpAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UnAssignPrivateIpAddressRequest setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public UnAssignPrivateIpAddressRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public UnAssignPrivateIpAddressRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public UnAssignPrivateIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnAssignPrivateIpAddressRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

}
