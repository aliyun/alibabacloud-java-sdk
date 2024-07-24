// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CleanClusterUserPermissionsRequest extends TeaModel {
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
