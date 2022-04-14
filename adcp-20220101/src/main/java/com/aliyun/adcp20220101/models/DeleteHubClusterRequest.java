// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeleteHubClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Force")
    public Boolean force;

    public static DeleteHubClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHubClusterRequest self = new DeleteHubClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHubClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteHubClusterRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
