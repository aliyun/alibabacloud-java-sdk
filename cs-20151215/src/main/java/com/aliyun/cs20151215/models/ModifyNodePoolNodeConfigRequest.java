// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyNodePoolNodeConfigRequest extends TeaModel {
    /**
     * <p>The parameter settings of the kubelet.</p>
     */
    @NameInMap("kubelet_config")
    public KubeletConfig kubeletConfig;

    @NameInMap("os_config")
    public ModifyNodePoolNodeConfigRequestOsConfig osConfig;

    /**
     * <p>The rotation configurations.</p>
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

    public ModifyNodePoolNodeConfigRequest setOsConfig(ModifyNodePoolNodeConfigRequestOsConfig osConfig) {
        this.osConfig = osConfig;
        return this;
    }
    public ModifyNodePoolNodeConfigRequestOsConfig getOsConfig() {
        return this.osConfig;
    }

    public ModifyNodePoolNodeConfigRequest setRollingPolicy(ModifyNodePoolNodeConfigRequestRollingPolicy rollingPolicy) {
        this.rollingPolicy = rollingPolicy;
        return this;
    }
    public ModifyNodePoolNodeConfigRequestRollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    public static class ModifyNodePoolNodeConfigRequestOsConfig extends TeaModel {
        @NameInMap("sysctl")
        public java.util.Map<String, ?> sysctl;

        public static ModifyNodePoolNodeConfigRequestOsConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyNodePoolNodeConfigRequestOsConfig self = new ModifyNodePoolNodeConfigRequestOsConfig();
            return TeaModel.build(map, self);
        }

        public ModifyNodePoolNodeConfigRequestOsConfig setSysctl(java.util.Map<String, ?> sysctl) {
            this.sysctl = sysctl;
            return this;
        }
        public java.util.Map<String, ?> getSysctl() {
            return this.sysctl;
        }

    }

    public static class ModifyNodePoolNodeConfigRequestRollingPolicy extends TeaModel {
        /**
         * <p>The maximum number of unavailable nodes.</p>
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
