// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CleanUserPermissionsRequest extends TeaModel {
    /**
     * <p>The list of cluster IDs. If you specify this list, only the KubeConfig credentials and RBAC permissions of the specified user in the listed clusters are cleared.</p>
     */
    @NameInMap("ClusterIds")
    public java.util.List<String> clusterIds;

    /**
     * <p>Specifies whether to force delete the specified KubeConfig. Valid values:</p>
     * <ul>
     * <li>false (default): Checks whether there are cluster access records within the last seven days before deleting the KubeConfig. If such records exist or cannot be found, the deletion is not allowed.</li>
     * <li>true: Force deletes the KubeConfig without checking cluster access records.</li>
     * </ul>
     * 
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
