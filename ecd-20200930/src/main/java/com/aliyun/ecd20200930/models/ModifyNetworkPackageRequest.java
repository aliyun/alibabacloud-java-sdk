// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkPackageId")
    @Validation(required = true)
    public String networkPackageId;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    public static ModifyNetworkPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkPackageRequest self = new ModifyNetworkPackageRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNetworkPackageRequest setNetworkPackageId(String networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    public ModifyNetworkPackageRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

}
