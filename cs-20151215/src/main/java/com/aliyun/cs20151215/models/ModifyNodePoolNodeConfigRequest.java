// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyNodePoolNodeConfigRequest extends TeaModel {
    /**
     * <p>The kubelet configuration.</p>
     */
    @NameInMap("kubelet_config")
    public KubeletConfig kubeletConfig;

    /**
     * <p>The rotation configuration.</p>
     */
    @NameInMap("rolling_policy")
    public ModifyNodePoolNodeConfigRequestRollingPolicy rollingPolicy;

    public static ModifyNodePoolNodeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodePoolNodeConfigRequest self = new ModifyNodePoolNodeConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodePoolNodeConfigRequest setKubeletConfig(KubeletConfig kubeletConfig) {
        this.kubeletConfig = kubeletConfig;
        return this;
    }
    public KubeletConfig getKubeletConfig() {
        return this.kubeletConfig;
    }

    public ModifyNodePoolNodeConfigRequest setRollingPolicy(ModifyNodePoolNodeConfigRequestRollingPolicy rollingPolicy) {
        this.rollingPolicy = rollingPolicy;
        return this;
    }
    public ModifyNodePoolNodeConfigRequestRollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    public static class ModifyNodePoolNodeConfigRequestRollingPolicy extends TeaModel {
        /**
         * <p>The maximum number of nodes in the Unschedulable state.</p>
         */
        @NameInMap("max_parallelism")
        public Long maxParallelism;

        public static ModifyNodePoolNodeConfigRequestRollingPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyNodePoolNodeConfigRequestRollingPolicy self = new ModifyNodePoolNodeConfigRequestRollingPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyNodePoolNodeConfigRequestRollingPolicy setMaxParallelism(Long maxParallelism) {
            this.maxParallelism = maxParallelism;
            return this;
        }
        public Long getMaxParallelism() {
            return this.maxParallelism;
        }

    }

}
