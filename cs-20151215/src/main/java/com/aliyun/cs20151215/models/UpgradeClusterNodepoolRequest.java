// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterNodepoolRequest extends TeaModel {
    /**
     * <p>The ID of the OS image used by the nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_2_1903_x64_20G_alibase_20200529.vhd</p>
     */
    @NameInMap("image_id")
    public String imageId;

    /**
     * <p>The Kubernetes version used by the nodes. You can call the <a href="https://help.aliyun.com/document_detail/2667899.html">DescribeKubernetesVersionMetadata</a> operation and get the Kubernetes version of the current cluster in the current_version field.</p>
     * 
     * <strong>example:</strong>
     * <p>1.22.15-aliyun.1</p>
     */
    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    /**
     * <p>The nodes you want to update. If you do not specify this parameter, all nodes in the node pool are updated by default.</p>
     */
    @NameInMap("node_names")
    public java.util.List<String> nodeNames;

    /**
     * <p>The rolling update configuration.</p>
     */
    @NameInMap("rolling_policy")
    public UpgradeClusterNodepoolRequestRollingPolicy rollingPolicy;

    /**
     * <p>The runtime type. You can call the <a href="https://help.aliyun.com/document_detail/2667899.html">DescribeKubernetesVersionMetadata</a> operation and get the runtime information in the runtime field.</p>
     * 
     * <strong>example:</strong>
     * <p>containerd</p>
     */
    @NameInMap("runtime_type")
    public String runtimeType;

    /**
     * <p>The version of the container runtime used by the nodes. You can call the <a href="https://help.aliyun.com/document_detail/2667899.html">DescribeKubernetesVersionMetadata</a> operation and get the runtime version in the runtime field.</p>
     * 
     * <strong>example:</strong>
     * <p>1.5.10</p>
     */
    @NameInMap("runtime_version")
    public String runtimeVersion;

    /**
     * <p>Specifies whether to perform the update by replacing the system disk. Valid values:</p>
     * <ul>
     * <li>true: replaces the system disk.</li>
     * <li>false: does not replace the system disk.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
        /**
         * <p>The update interval between batches takes effect only when the pause policy is set to NotPause. Unit: minutes. Valid values: 5 to 120.</p>
         * 
         * <strong>example:</strong>
         * <p>5 minutes</p>
         */
        @NameInMap("batch_interval")
        public Integer batchInterval;

        /**
         * <p>The maximum number of nodes per batch.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("max_parallelism")
        public Integer maxParallelism;

        /**
         * <p>The policy used to pause the update. Valid values:</p>
         * <ul>
         * <li>FirstBatch: pauses after the first batch is updated.</li>
         * <li>EveryBatch: pauses after each batch is updated.</li>
         * <li>NotPause: does not pause.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotPause</p>
         */
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
