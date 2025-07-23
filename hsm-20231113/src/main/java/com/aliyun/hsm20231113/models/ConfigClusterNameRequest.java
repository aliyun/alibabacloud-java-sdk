// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigClusterNameRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-BqxX63Bsgfaisdf****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster_on****</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    public static ConfigClusterNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigClusterNameRequest self = new ConfigClusterNameRequest();
        return TeaModel.build(map, self);
    }

    public ConfigClusterNameRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ConfigClusterNameRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

}
