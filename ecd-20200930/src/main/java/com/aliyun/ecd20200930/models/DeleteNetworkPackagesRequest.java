// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteNetworkPackagesRequest extends TeaModel {
    /**
     * <p>The IDs of premium bandwidth plans. You can specify one or more IDs.</p>
     */
    @NameInMap("NetworkPackageId")
    public java.util.List<String> networkPackageId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteNetworkPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkPackagesRequest self = new DeleteNetworkPackagesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkPackagesRequest setNetworkPackageId(java.util.List<String> networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public java.util.List<String> getNetworkPackageId() {
        return this.networkPackageId;
    }

    public DeleteNetworkPackagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
