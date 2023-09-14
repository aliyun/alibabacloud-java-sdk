// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DecreaseNodesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of nodes to scale in. The number of nodes to be scaled in. The value should be less than the number of surviving nodes in the current node group.</p>
     */
    @NameInMap("DecreaseNodeCount")
    public Integer decreaseNodeCount;

    /**
     * <p>The ID of the node group.</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The array of node IDs. Valid values of array element N: 1 to 500.</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <p>The ID of the region in which you want to create the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DecreaseNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DecreaseNodesRequest self = new DecreaseNodesRequest();
        return TeaModel.build(map, self);
    }

    public DecreaseNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DecreaseNodesRequest setDecreaseNodeCount(Integer decreaseNodeCount) {
        this.decreaseNodeCount = decreaseNodeCount;
        return this;
    }
    public Integer getDecreaseNodeCount() {
        return this.decreaseNodeCount;
    }

    public DecreaseNodesRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public DecreaseNodesRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public DecreaseNodesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
