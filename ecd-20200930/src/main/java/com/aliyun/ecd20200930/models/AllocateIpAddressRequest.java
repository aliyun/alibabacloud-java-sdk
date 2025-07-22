// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AllocateIpAddressRequest extends TeaModel {
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
