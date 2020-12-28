// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddLocalNodesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Nodes")
    public String nodes;

    public static AddLocalNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLocalNodesRequest self = new AddLocalNodesRequest();
        return TeaModel.build(map, self);
    }

    public AddLocalNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddLocalNodesRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

}
