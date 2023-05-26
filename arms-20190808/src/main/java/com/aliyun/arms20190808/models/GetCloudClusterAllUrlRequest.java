// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetCloudClusterAllUrlRequest extends TeaModel {
    /**
     * <p>The ID of the CloudMonitor instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetCloudClusterAllUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudClusterAllUrlRequest self = new GetCloudClusterAllUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudClusterAllUrlRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetCloudClusterAllUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
