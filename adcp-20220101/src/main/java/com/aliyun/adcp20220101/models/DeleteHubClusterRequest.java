// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeleteHubClusterRequest extends TeaModel {
    // The ID of the master instance.
    @NameInMap("ClusterId")
    public String clusterId;

    // Specifies whether to forcefully delete the master instance. Valid values: - true: forcefully delete the master instance. - false: does not forcefully delete the master instance. Default value: false.
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
