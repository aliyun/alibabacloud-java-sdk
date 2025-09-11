// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class RotateClusterManagedCertRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-hfau****gkaud</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static RotateClusterManagedCertRequest build(java.util.Map<String, ?> map) throws Exception {
        RotateClusterManagedCertRequest self = new RotateClusterManagedCertRequest();
        return TeaModel.build(map, self);
    }

    public RotateClusterManagedCertRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
