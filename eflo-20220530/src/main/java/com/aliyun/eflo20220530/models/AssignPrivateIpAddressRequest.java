// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressRequest extends TeaModel {
    @NameInMap("AssignMac")
    public Boolean assignMac;

    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SkipConfig")
    public Boolean skipConfig;

    @NameInMap("SubnetId")
    public String subnetId;

    public static AssignPrivateIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignPrivateIpAddressRequest self = new AssignPrivateIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public AssignPrivateIpAddressRequest setAssignMac(Boolean assignMac) {
        this.assignMac = assignMac;
        return this;
    }
    public Boolean getAssignMac() {
        return this.assignMac;
    }

    public AssignPrivateIpAddressRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public AssignPrivateIpAddressRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public AssignPrivateIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssignPrivateIpAddressRequest setSkipConfig(Boolean skipConfig) {
        this.skipConfig = skipConfig;
        return this;
    }
    public Boolean getSkipConfig() {
        return this.skipConfig;
    }

    public AssignPrivateIpAddressRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

}
