// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DissociateNetworkPackageRequest extends TeaModel {
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    @NameInMap("RegionId")
    public String regionId;

    public static DissociateNetworkPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateNetworkPackageRequest self = new DissociateNetworkPackageRequest();
        return TeaModel.build(map, self);
    }

    public DissociateNetworkPackageRequest setNetworkPackageId(String networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    public DissociateNetworkPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
