// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CleanUserPermissionsShrinkRequest extends TeaModel {
    /**
     * <p>The cluster IDs.</p>
     * <ul>
     * <li>If cluster IDs are specified, only the kubeconfig files of the specified clusters and the relevant RBAC permissions are deleted and revoked.</li>
     * </ul>
     */
    @NameInMap("ClusterIds")
    public String clusterIdsShrink;

    /**
     * <p>Specifies whether to forcefully delete the specified kubeconfig files. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): checks the cluster access records within the previous seven days before deleting the kubeconfig files. The kubeconfig files are not deleted if cluster access records are found or fail to be retrieved.</li>
     * <li><strong>true</strong>: forcefully deletes the kubeconfig files without checking cluster access records.</li>
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
