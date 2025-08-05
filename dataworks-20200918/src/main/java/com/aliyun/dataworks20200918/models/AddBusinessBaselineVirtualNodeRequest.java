// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class AddBusinessBaselineVirtualNodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    public static AddBusinessBaselineVirtualNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBusinessBaselineVirtualNodeRequest self = new AddBusinessBaselineVirtualNodeRequest();
        return TeaModel.build(map, self);
    }

    public AddBusinessBaselineVirtualNodeRequest setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
    }

    public AddBusinessBaselineVirtualNodeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

}
