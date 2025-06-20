// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeRequest extends TeaModel {
    /**
     * <p>The node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mock-sn-2060</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static DescribeNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeRequest self = new DescribeNodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
