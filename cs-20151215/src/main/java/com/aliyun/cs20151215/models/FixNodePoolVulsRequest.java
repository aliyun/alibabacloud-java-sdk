// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class FixNodePoolVulsRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow node restarts.</p>
     * <ul>
     * <li>true: Node restarts are allowed.</li>
     * <li>false: Node restarts are not allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("auto_restart")
    public Boolean autoRestart;

    /**
     * <p>The list of node names to fix. If this parameter is not specified, all nodes in the node pool are fixed by default.</p>
     */
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    /**
     * <p>The rolling fix policy.</p>
     */
    @NameInMap("rollout_policy")
    public FixNodePoolVulsRequestRolloutPolicy rolloutPolicy;

    /**
     * <p>The list of vulnerabilities.</p>
     */
    @NameInMap("vuls")
    public java.util.List<String> vuls;

    public static FixNodePoolVulsRequest build(java.util.Map<String, ?> map) throws Exception {
        FixNodePoolVulsRequest self = new FixNodePoolVulsRequest();
        return TeaModel.build(map, self);
    }

    public FixNodePoolVulsRequest setAutoRestart(Boolean autoRestart) {
        this.autoRestart = autoRestart;
        return this;
    }
    public Boolean getAutoRestart() {
        return this.autoRestart;
    }

    public FixNodePoolVulsRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    public FixNodePoolVulsRequest setRolloutPolicy(FixNodePoolVulsRequestRolloutPolicy rolloutPolicy) {
        this.rolloutPolicy = rolloutPolicy;
        return this;
    }
    public FixNodePoolVulsRequestRolloutPolicy getRolloutPolicy() {
        return this.rolloutPolicy;
    }

    public FixNodePoolVulsRequest setVuls(java.util.List<String> vuls) {
        this.vuls = vuls;
        return this;
    }
    public java.util.List<String> getVuls() {
        return this.vuls;
    }

    public static class FixNodePoolVulsRequestRolloutPolicy extends TeaModel {
        /**
         * <p>CVE fixes for nodes in the node pool are performed in batches. This parameter specifies the maximum number of nodes that can be fixed in parallel per batch.</p>
         * <p>Valid values: minimum value is 1 and maximum value is the total number of nodes in the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_parallelism")
        public Long maxParallelism;

        public static FixNodePoolVulsRequestRolloutPolicy build(java.util.Map<String, ?> map) throws Exception {
            FixNodePoolVulsRequestRolloutPolicy self = new FixNodePoolVulsRequestRolloutPolicy();
            return TeaModel.build(map, self);
        }

        public FixNodePoolVulsRequestRolloutPolicy setMaxParallelism(Long maxParallelism) {
            this.maxParallelism = maxParallelism;
            return this;
        }
        public Long getMaxParallelism() {
            return this.maxParallelism;
        }

    }

}
