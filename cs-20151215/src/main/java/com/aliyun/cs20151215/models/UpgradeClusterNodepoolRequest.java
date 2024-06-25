// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterNodepoolRequest extends TeaModel {
    /**
     * <p>The ID of the OS image that is used by the nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_2_1903_x64_20G_alibase_20200529.vhd</p>
     */
    @NameInMap("image_id")
    public String imageId;

    /**
     * <p>The Kubernetes version that is used by the nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>1.22.15-aliyun.1</p>
     */
    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    @NameInMap("node_names")
    public java.util.List<String> nodeNames;

    @NameInMap("rolling_policy")
    public UpgradeClusterNodepoolRequestRollingPolicy rollingPolicy;

    /**
     * <p>The runtime type. Valid values: containerd and docker.</p>
     * 
     * <strong>example:</strong>
     * <p>containerd</p>
     */
    @NameInMap("runtime_type")
    public String runtimeType;

    /**
     * <p>The version of the container runtime that is used by the nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>1.5.10</p>
     */
    @NameInMap("runtime_version")
    public String runtimeVersion;

    @NameInMap("use_replace")
    public Boolean useReplace;

    public static UpgradeClusterNodepoolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterNodepoolRequest self = new UpgradeClusterNodepoolRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterNodepoolRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpgradeClusterNodepoolRequest setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public UpgradeClusterNodepoolRequest setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public UpgradeClusterNodepoolRequest setRollingPolicy(UpgradeClusterNodepoolRequestRollingPolicy rollingPolicy) {
        this.rollingPolicy = rollingPolicy;
        return this;
    }
    public UpgradeClusterNodepoolRequestRollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    public UpgradeClusterNodepoolRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

    public UpgradeClusterNodepoolRequest setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }
    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    public UpgradeClusterNodepoolRequest setUseReplace(Boolean useReplace) {
        this.useReplace = useReplace;
        return this;
    }
    public Boolean getUseReplace() {
        return this.useReplace;
    }

    public static class UpgradeClusterNodepoolRequestRollingPolicy extends TeaModel {
        @NameInMap("batch_interval")
        public Integer batchInterval;

        @NameInMap("max_parallelism")
        public Integer maxParallelism;

        @NameInMap("pause_policy")
        public String pausePolicy;

        public static UpgradeClusterNodepoolRequestRollingPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpgradeClusterNodepoolRequestRollingPolicy self = new UpgradeClusterNodepoolRequestRollingPolicy();
            return TeaModel.build(map, self);
        }

        public UpgradeClusterNodepoolRequestRollingPolicy setBatchInterval(Integer batchInterval) {
            this.batchInterval = batchInterval;
            return this;
        }
        public Integer getBatchInterval() {
            return this.batchInterval;
        }

        public UpgradeClusterNodepoolRequestRollingPolicy setMaxParallelism(Integer maxParallelism) {
            this.maxParallelism = maxParallelism;
            return this;
        }
        public Integer getMaxParallelism() {
            return this.maxParallelism;
        }

        public UpgradeClusterNodepoolRequestRollingPolicy setPausePolicy(String pausePolicy) {
            this.pausePolicy = pausePolicy;
            return this;
        }
        public String getPausePolicy() {
            return this.pausePolicy;
        }

    }

}
