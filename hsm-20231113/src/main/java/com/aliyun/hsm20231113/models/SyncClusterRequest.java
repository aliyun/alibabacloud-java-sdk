// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class SyncClusterRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-BqxX63Bsgytet****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static SyncClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncClusterRequest self = new SyncClusterRequest();
        return TeaModel.build(map, self);
    }

    public SyncClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
