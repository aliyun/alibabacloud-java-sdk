// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CleanClusterUserPermissionsRequest extends TeaModel {
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

    public static CleanClusterUserPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CleanClusterUserPermissionsRequest self = new CleanClusterUserPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public CleanClusterUserPermissionsRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
