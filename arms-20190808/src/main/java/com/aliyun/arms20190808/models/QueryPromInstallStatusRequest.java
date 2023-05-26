// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryPromInstallStatusRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static QueryPromInstallStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPromInstallStatusRequest self = new QueryPromInstallStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryPromInstallStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryPromInstallStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
