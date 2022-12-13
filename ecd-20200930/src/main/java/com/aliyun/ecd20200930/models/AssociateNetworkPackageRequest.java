// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AssociateNetworkPackageRequest extends TeaModel {
    // The ID of the Internet access package. You can call the [DescribeNetworkPackages](~~216079~~) operation to query the ID of the Internet access package.
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    // The ID of the workspace. You can call the [DescribeOfficeSites](~~216071~~) operation to query the ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    public static AssociateNetworkPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateNetworkPackageRequest self = new AssociateNetworkPackageRequest();
        return TeaModel.build(map, self);
    }

    public AssociateNetworkPackageRequest setNetworkPackageId(String networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    public AssociateNetworkPackageRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public AssociateNetworkPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
