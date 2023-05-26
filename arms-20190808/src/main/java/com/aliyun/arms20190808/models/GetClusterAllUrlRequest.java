// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetClusterAllUrlRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID. Default value: cn-hangzhou.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetClusterAllUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterAllUrlRequest self = new GetClusterAllUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterAllUrlRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetClusterAllUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
