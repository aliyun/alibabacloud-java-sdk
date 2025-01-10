// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetNodeInfoForPodRequest extends TeaModel {
    /**
     * <p>The ID of the node for this operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>node-be70****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetNodeInfoForPodRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeInfoForPodRequest self = new GetNodeInfoForPodRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeInfoForPodRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetNodeInfoForPodRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
