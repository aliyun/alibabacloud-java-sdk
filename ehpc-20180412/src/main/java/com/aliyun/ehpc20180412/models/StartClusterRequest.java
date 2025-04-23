// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartClusterRequest extends TeaModel {
    /**
     * <p>The ID of the cluster that you want to start.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static StartClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        StartClusterRequest self = new StartClusterRequest();
        return TeaModel.build(map, self);
    }

    public StartClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
