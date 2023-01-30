// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class FixNodePoolVulsRequest extends TeaModel {
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    @NameInMap("rollout_policy")
    public FixNodePoolVulsRequestRolloutPolicy rolloutPolicy;

    @NameInMap("vuls")
    public java.util.List<String> vuls;

    public static FixNodePoolVulsRequest build(java.util.Map<String, ?> map) throws Exception {
        FixNodePoolVulsRequest self = new FixNodePoolVulsRequest();
        return TeaModel.build(map, self);
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
