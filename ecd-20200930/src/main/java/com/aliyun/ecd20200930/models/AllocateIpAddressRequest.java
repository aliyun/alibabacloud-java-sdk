// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AllocateIpAddressRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AllocateIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateIpAddressRequest self = new AllocateIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocateIpAddressRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public AllocateIpAddressRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public AllocateIpAddressRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AllocateIpAddressRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public AllocateIpAddressRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public AllocateIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
