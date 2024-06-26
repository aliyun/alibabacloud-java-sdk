// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEthereumNodeLogsRequest extends TeaModel {
    @NameInMap("Lines")
    public String lines;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("Target")
    public String target;

    public static DescribeEthereumNodeLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumNodeLogsRequest self = new DescribeEthereumNodeLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumNodeLogsRequest setLines(String lines) {
        this.lines = lines;
        return this;
    }
    public String getLines() {
        return this.lines;
    }

    public DescribeEthereumNodeLogsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeEthereumNodeLogsRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
