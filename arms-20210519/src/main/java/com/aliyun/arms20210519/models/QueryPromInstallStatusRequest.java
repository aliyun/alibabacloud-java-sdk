// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class QueryPromInstallStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    public static QueryPromInstallStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPromInstallStatusRequest self = new QueryPromInstallStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryPromInstallStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryPromInstallStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
