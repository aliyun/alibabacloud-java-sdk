// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CleanUserPermissionsShrinkRequest extends TeaModel {
    /**
     * <p>The list of cluster IDs. If this list is specified, only the KubeConfig credentials and RBAC permissions of the current user in the specified clusters are cleaned up.</p>
     */
    @NameInMap("ClusterIds")
    public String clusterIdsShrink;

    /**
     * <p>Specifies whether to force delete the specified KubeConfig. Valid values:</p>
     * <ul>
     * <li>false (default): Before deleting the KubeConfig, the system checks whether cluster access records exist within the last seven days. If access records exist or cannot be retrieved, the deletion is not allowed.</li>
     * <li>true: Force deletes the KubeConfig without checking cluster access records.</li>
     * </ul>
     * 
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
