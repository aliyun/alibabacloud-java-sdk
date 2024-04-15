// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteBundlesRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud computer templates. You can specify 1 to 100 IDs.</p>
     */
    @NameInMap("BundleId")
    public java.util.List<String> bundleId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteBundlesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBundlesRequest self = new DeleteBundlesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBundlesRequest setBundleId(java.util.List<String> bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public java.util.List<String> getBundleId() {
        return this.bundleId;
    }

    public DeleteBundlesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
