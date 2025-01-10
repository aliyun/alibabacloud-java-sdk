// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UnAssignPrivateIpAddressRequest extends TeaModel {
    /**
     * <p>By default, popApi is not ignored and idempotent</p>
     * 
     * <strong>example:</strong>
     * <p>141cccd6-dfbd-11ec-b8e8-0242ac110003</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>IP unique identifier</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sip-xxxx</p>
     */
    @NameInMap("IpName")
    public String ipName;

    /**
     * <p>Lingjun network interface controller ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lni-bp18exxqa2rvfn45e5pz</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The private IP address of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10.209.75.242</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>Region</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Subnet</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>subnet-f3zfzmnc</p>
     */
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
