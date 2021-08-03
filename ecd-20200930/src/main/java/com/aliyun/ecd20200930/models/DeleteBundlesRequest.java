// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteBundlesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("BundleId")
    public java.util.List<String> bundleId;

    public static DeleteBundlesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBundlesRequest self = new DeleteBundlesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBundlesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteBundlesRequest setBundleId(java.util.List<String> bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public java.util.List<String> getBundleId() {
        return this.bundleId;
    }

}
