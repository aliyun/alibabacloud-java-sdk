// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyNodePoolNodeConfigRequest extends TeaModel {
    @NameInMap("kubelet_config")
    public ModifyNodePoolNodeConfigRequestKubeletConfig kubeletConfig;

    @NameInMap("rolling_policy")
    public ModifyNodePoolNodeConfigRequestRollingPolicy rollingPolicy;

    public static ModifyNodePoolNodeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodePoolNodeConfigRequest self = new ModifyNodePoolNodeConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNodePoolNodeConfigRequest setKubeletConfig(ModifyNodePoolNodeConfigRequestKubeletConfig kubeletConfig) {
        this.kubeletConfig = kubeletConfig;
        return this;
    }
    public ModifyNodePoolNodeConfigRequestKubeletConfig getKubeletConfig() {
        return this.kubeletConfig;
    }

    public ModifyNodePoolNodeConfigRequest setRollingPolicy(ModifyNodePoolNodeConfigRequestRollingPolicy rollingPolicy) {
        this.rollingPolicy = rollingPolicy;
        return this;
    }
    public ModifyNodePoolNodeConfigRequestRollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    public static class ModifyNodePoolNodeConfigRequestKubeletConfig extends TeaModel {
        @NameInMap("cpuManagerPolicy")
        public String cpuManagerPolicy;

        @NameInMap("eventBurst")
        public Long eventBurst;

        @NameInMap("eventRecordQPS")
        public Long eventRecordQPS;

        @NameInMap("evictionHard")
        public java.util.Map<String, ?> evictionHard;

        @NameInMap("evictionSoft")
        public java.util.Map<String, ?> evictionSoft;

        @NameInMap("evictionSoftGracePeriod")
        public java.util.Map<String, ?> evictionSoftGracePeriod;

        @NameInMap("kubeAPIBurst")
        public Long kubeAPIBurst;

        @NameInMap("kubeAPIQPS")
        public Long kubeAPIQPS;

        @NameInMap("kubeReserved")
        public java.util.Map<String, ?> kubeReserved;

        @NameInMap("registryBurst")
        public Long registryBurst;

        @NameInMap("registryPullQPS")
        public Long registryPullQPS;

        @NameInMap("serializeImagePulls")
        public Boolean serializeImagePulls;

        @NameInMap("systemReserved")
        public java.util.Map<String, ?> systemReserved;

        public static ModifyNodePoolNodeConfigRequestKubeletConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyNodePoolNodeConfigRequestKubeletConfig self = new ModifyNodePoolNodeConfigRequestKubeletConfig();
            return TeaModel.build(map, self);
        }

        public ModifyNodePoolNodeConfigRequestKubeletConfig setCpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = cpuManagerPolicy;
            return this;
        }
        public String getCpuManagerPolicy() {
            return this.cpuManagerPolicy;
        }

        public ModifyNodePoolNodeConfigRequestKubeletConfig setEventBurst(Long eventBurst) {
            this.eventBurst = eventBurst;
            return this;
        }
        public Long getEventBurst() {
            return this.eventBurst;
        }

        public ModifyNodePoolNodeConfigRequestKubeletConfig setEventRecordQPS(Long eventRecordQPS) {
            this.eventRecordQPS = eventRecordQPS;
            return this;
        }
        public Long getEventRecordQPS() {
            return this.eventRecordQPS;
        }

        public ModifyNodePoolNodeConfigRequestKubeletConfig setEvictionHard(java.util.Map<String, ?> evictionHard) {
            this.evictionHard = evictionHard;
            return this;
        }
        public java.util.Map<String, ?> getEvictionHard() {
            return this.evictionHard;
        }

        public ModifyNodePoolNodeConfigRequestKubeletConfig setEvictionSoft(java.util.Map<String, ?> evictionSoft) {
            this.evictionSoft = evictionSoft;
            return this;
        }
        public java.util.Map<String, ?> getEvictionSoft() {
            return this.evictionSoft;
        }

        public ModifyNodePoolNodeConfigRequestKubeletConfig setEvictionSoftGracePeriod(java.util.Map<String, ?> evictionSoftGracePeriod) {
            this.evictionSoftGracePeriod = evictionSoftGracePeriod;
            return this;
        }
        public java.util.Map<String, ?> getEvictionSoftGracePeriod() {
            return this.evictionSoftGracePeriod;
        }

        public ModifyNodePoolNodeConfigRequestKubeletConfig setKubeAPIBurst(Long kubeAPIBurst) {
            this.kubeAPIBurst = kubeAPIBurst;
            return this;
        }
        public Long getKubeAPIBurst() {
            return this.kubeAPIBurst;
        }

        public ModifyNodePoolNodeConfigRequestKubeletConfig setKubeAPIQPS(Long kubeAPIQPS) {
            this.kubeAPIQPS = kubeAPIQPS;
            return this;
        }
        public Long getKubeAPIQPS() {
            return this.kubeAPIQPS;
        }

        public ModifyNodePoolNodeConfigRequestKubeletConfig setKubeReserved(java.util.Map<String, ?> kubeReserved) {
            this.kubeReserved = kubeReserved;
            return this;
        }
        public java.util.Map<String, ?> getKubeReserved() {
            return this.kubeReserved;
        }

        public ModifyNodePoolNodeConfigRequestKubeletConfig setRegistryBurst(Long registryBurst) {
            this.registryBurst = registryBurst;
            return this;
        }
        public Long getRegistryBurst() {
            return this.registryBurst;
        }

        public ModifyNodePoolNodeConfigRequestKubeletConfig setRegistryPullQPS(Long registryPullQPS) {
            this.registryPullQPS = registryPullQPS;
            return this;
        }
        public Long getRegistryPullQPS() {
            return this.registryPullQPS;
        }

        public ModifyNodePoolNodeConfigRequestKubeletConfig setSerializeImagePulls(Boolean serializeImagePulls) {
            this.serializeImagePulls = serializeImagePulls;
            return this;
        }
        public Boolean getSerializeImagePulls() {
            return this.serializeImagePulls;
        }

        public ModifyNodePoolNodeConfigRequestKubeletConfig setSystemReserved(java.util.Map<String, ?> systemReserved) {
            this.systemReserved = systemReserved;
            return this;
        }
        public java.util.Map<String, ?> getSystemReserved() {
            return this.systemReserved;
        }

    }

    public static class ModifyNodePoolNodeConfigRequestRollingPolicy extends TeaModel {
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
