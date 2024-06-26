// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeExplorerURLRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static DescribeExplorerURLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExplorerURLRequest self = new DescribeExplorerURLRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExplorerURLRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
