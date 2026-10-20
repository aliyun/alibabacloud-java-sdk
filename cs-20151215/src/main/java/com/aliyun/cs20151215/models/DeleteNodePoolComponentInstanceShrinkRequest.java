// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteNodePoolComponentInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The interval between batches, in seconds. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("batch_interval")
    public Long batchInterval;

    /**
     * <p>The maximum number of nodes that can fail during the rolling process. Default value: 0. A value of 0 indicates that the task fails if any node fails. A value greater than 0 indicates that the task fails and stops if the cumulative number of failed nodes exceeds this value.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("max_failed_nodes")
    public Long maxFailedNodes;

    /**
     * <p>The maximum number of parallel operations per batch. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("max_parallelism")
    public Long maxParallelism;

    /**
     * <p>The list of nodes to rotate. Default value: all nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou.10.91.xx.xx&quot;]</p>
     */
    @NameInMap("node_names")
    public String nodeNamesShrink;

    /**
     * <p>The auto-pause policy during a node upgrade. Valid values:</p>
     * <ul>
     * <li>NotPause</li>
     * <li>FirstBatch</li>
     * <li>EveryBatch</li>
     * </ul>
     * <p>Default value: NotPause.</p>
     * 
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
