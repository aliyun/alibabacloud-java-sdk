// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DeleteClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterRequest self = new DeleteClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
