// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class InitializeClusterRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-p94y1dud9****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static InitializeClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeClusterRequest self = new InitializeClusterRequest();
        return TeaModel.build(map, self);
    }

    public InitializeClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
