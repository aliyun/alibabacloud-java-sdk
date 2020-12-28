// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetHybridClusterConfigRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

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
