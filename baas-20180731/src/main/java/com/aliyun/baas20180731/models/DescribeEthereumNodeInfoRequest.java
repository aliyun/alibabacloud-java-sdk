// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumNodeInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static DescribeEthereumNodeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumNodeInfoRequest self = new DescribeEthereumNodeInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumNodeInfoRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
