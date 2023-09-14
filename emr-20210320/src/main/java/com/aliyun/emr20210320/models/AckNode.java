// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class AckNode extends TeaModel {
    /**
     * <p>节点ID。</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>ACK节点选择器。</p>
     */
    @NameInMap("NodeSelector")
    public AckNodeSelector nodeSelector;

    public static AckNode build(java.util.Map<String, ?> map) throws Exception {
        AckNode self = new AckNode();
        return TeaModel.build(map, self);
    }

    public AckNode setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public AckNode setNodeSelector(AckNodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }
    public AckNodeSelector getNodeSelector() {
        return this.nodeSelector;
    }

}
