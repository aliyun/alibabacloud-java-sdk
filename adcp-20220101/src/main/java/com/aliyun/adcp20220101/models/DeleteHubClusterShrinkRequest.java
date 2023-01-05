// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeleteHubClusterShrinkRequest extends TeaModel {
    // The ID of the master instance.
    @NameInMap("ClusterId")
    public String clusterId;

    // Specifies whether to forcefully delete the master instance. Valid values: - true: forcefully delete the master instance. - false: does not forcefully delete the master instance. Default value: false.
    @NameInMap("Force")
    public Boolean force;

    @NameInMap("RetainResources")
    public String retainResourcesShrink;

    public static DeleteHubClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHubClusterShrinkRequest self = new DeleteHubClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHubClusterShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteHubClusterShrinkRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteHubClusterShrinkRequest setRetainResourcesShrink(String retainResourcesShrink) {
        this.retainResourcesShrink = retainResourcesShrink;
        return this;
    }
    public String getRetainResourcesShrink() {
        return this.retainResourcesShrink;
    }

}
