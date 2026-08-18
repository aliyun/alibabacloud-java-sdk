// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteNodePoolComponentInstanceShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("batch_interval")
    public Long batchInterval;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("max_failed_nodes")
    public Long maxFailedNodes;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("max_parallelism")
    public Long maxParallelism;

    /**
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou.10.91.xx.xx&quot;]</p>
     */
    @NameInMap("node_names")
    public String nodeNamesShrink;

    /**
     * <strong>example:</strong>
     * <p>NotPause</p>
     */
    @NameInMap("pause_policy")
    public String pausePolicy;

    public static DeleteNodePoolComponentInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodePoolComponentInstanceShrinkRequest self = new DeleteNodePoolComponentInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNodePoolComponentInstanceShrinkRequest setBatchInterval(Long batchInterval) {
        this.batchInterval = batchInterval;
        return this;
    }
    public Long getBatchInterval() {
        return this.batchInterval;
    }

    public DeleteNodePoolComponentInstanceShrinkRequest setMaxFailedNodes(Long maxFailedNodes) {
        this.maxFailedNodes = maxFailedNodes;
        return this;
    }
    public Long getMaxFailedNodes() {
        return this.maxFailedNodes;
    }

    public DeleteNodePoolComponentInstanceShrinkRequest setMaxParallelism(Long maxParallelism) {
        this.maxParallelism = maxParallelism;
        return this;
    }
    public Long getMaxParallelism() {
        return this.maxParallelism;
    }

    public DeleteNodePoolComponentInstanceShrinkRequest setNodeNamesShrink(String nodeNamesShrink) {
        this.nodeNamesShrink = nodeNamesShrink;
        return this;
    }
    public String getNodeNamesShrink() {
        return this.nodeNamesShrink;
    }

    public DeleteNodePoolComponentInstanceShrinkRequest setPausePolicy(String pausePolicy) {
        this.pausePolicy = pausePolicy;
        return this;
    }
    public String getPausePolicy() {
        return this.pausePolicy;
    }

}
