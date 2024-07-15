// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CleanClusterUserPermissionsRequest extends TeaModel {
    /**
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
