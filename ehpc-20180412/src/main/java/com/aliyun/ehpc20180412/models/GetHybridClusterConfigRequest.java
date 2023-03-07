// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetHybridClusterConfigRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the on-premises compute node. You can call this operation to query the configurations of the on-premises compute node.</p>
     * <br>
     * <p>By default, the operation queries the configurations of a cluster.</p>
     */
    @NameInMap("Node")
    public String node;

    public static GetHybridClusterConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHybridClusterConfigRequest self = new GetHybridClusterConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetHybridClusterConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetHybridClusterConfigRequest setNode(String node) {
        this.node = node;
        return this;
    }
    public String getNode() {
        return this.node;
    }

}
