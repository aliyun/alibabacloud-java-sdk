// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DecreaseNodesRequest extends TeaModel {
    /**
     * <p>The cooldown time between batches.</p>
     */
    @NameInMap("BatchInterval")
    public Integer batchInterval;

    /**
     * <p>The number of nodes to concurrently take offline in a single batch.</p>
     */
    @NameInMap("BatchSize")
    public Integer batchSize;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of nodes to remove. The value must be less than the number of active nodes in the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DecreaseNodeCount")
    public Integer decreaseNodeCount;

    /**
     * <p>The node group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-869471354ecd****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>An array of node IDs. The array can contain from 1 to 500 elements.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-bp1cudc25w2bfwl5****&quot;]</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DecreaseNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DecreaseNodesRequest self = new DecreaseNodesRequest();
        return TeaModel.build(map, self);
    }

    public DecreaseNodesRequest setBatchInterval(Integer batchInterval) {
        this.batchInterval = batchInterval;
        return this;
    }
    public Integer getBatchInterval() {
        return this.batchInterval;
    }

    public DecreaseNodesRequest setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    public Integer getBatchSize() {
        return this.batchSize;
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
