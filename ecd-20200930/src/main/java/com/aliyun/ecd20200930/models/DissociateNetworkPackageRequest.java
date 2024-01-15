// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DissociateNetworkPackageRequest extends TeaModel {
    /**
     * <p>The ID of the Internet access package. You can call the [DescribeNetworkPackages](~~216079~~) operation to query the ID of the Internet access package.</p>
     */
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
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
