// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CleanUserPermissionsRequest extends TeaModel {
    @NameInMap("ClusterIds")
    public java.util.List<String> clusterIds;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    public static CleanUserPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CleanUserPermissionsRequest self = new CleanUserPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public CleanUserPermissionsRequest setClusterIds(java.util.List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    public CleanUserPermissionsRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
