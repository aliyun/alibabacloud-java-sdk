// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class FixNodePoolVulsRequest extends TeaModel {
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    @NameInMap("rollout_policy")
    public FixNodePoolVulsRequestRolloutPolicy rolloutPolicy;

    @NameInMap("vul_list")
    public java.util.List<String> vulList;

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

    public FixNodePoolVulsRequest setVulList(java.util.List<String> vulList) {
        this.vulList = vulList;
        return this;
    }
    public java.util.List<String> getVulList() {
        return this.vulList;
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
