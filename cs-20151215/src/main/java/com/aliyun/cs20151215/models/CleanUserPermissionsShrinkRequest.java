// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CleanUserPermissionsShrinkRequest extends TeaModel {
    @NameInMap("ClusterIds")
    public String clusterIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    public static CleanUserPermissionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CleanUserPermissionsShrinkRequest self = new CleanUserPermissionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CleanUserPermissionsShrinkRequest setClusterIdsShrink(String clusterIdsShrink) {
        this.clusterIdsShrink = clusterIdsShrink;
        return this;
    }
    public String getClusterIdsShrink() {
        return this.clusterIdsShrink;
    }

    public CleanUserPermissionsShrinkRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
