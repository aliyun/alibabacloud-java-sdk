// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ChangeNodeTypesRequest extends TeaModel {
    /**
     * <p>A list of node IDs. You can specify a maximum of 10 nodes in a single request.</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <p>The node specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-enhanced</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    public static ChangeNodeTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeNodeTypesRequest self = new ChangeNodeTypesRequest();
        return TeaModel.build(map, self);
    }

    public ChangeNodeTypesRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public ChangeNodeTypesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

}
