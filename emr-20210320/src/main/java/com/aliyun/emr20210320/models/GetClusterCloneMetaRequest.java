// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetClusterCloneMetaRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>地域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetClusterCloneMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterCloneMetaRequest self = new GetClusterCloneMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterCloneMetaRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetClusterCloneMetaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
