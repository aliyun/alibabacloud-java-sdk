// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterNodepoolRequest extends TeaModel {
    /**
     * <p>Specifies whether to ignore warning-level pre-checks.</p>
     */
    @NameInMap("ignore_warning_check")
    public Boolean ignoreWarningCheck;

    /**
     * <p>The node system image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_3_x64_20G_container_optimized_20241226.vhd</p>
     */
    @NameInMap("image_id")
    public String imageId;

    /**
     * <p>The node Kubernetes version. You can call the <a href="https://help.aliyun.com/document_detail/2667899.html">DescribeKubernetesVersionMetadata</a> operation to obtain the current cluster version information from the <code>KubernetesVersion</code> field.</p>
     * 
     * <strong>example:</strong>
     * <p>1.32.1-aliyun.1</p>
     */
    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    /**
     * <p>The list of specified nodes to upgrade. If not specified, all nodes in the node pool are upgraded by default.</p>
     */
    @NameInMap("node_names")
    public java.util.List<String> nodeNames;

    /**
     * <p>The rolling update configuration.</p>
     */
    @NameInMap("rolling_policy")
    public UpgradeClusterNodepoolRequestRollingPolicy rollingPolicy;

    /**
     * <p>The runtime type. You can call the <a href="https://help.aliyun.com/document_detail/2667899.html">DescribeKubernetesVersionMetadata</a> operation to obtain the runtime information from the runtime field.</p>
     * 
     * <strong>example:</strong>
     * <p>containerd</p>
     */
    @NameInMap("runtime_type")
    public String runtimeType;

    /**
     * <p>The node runtime version. You can call the <a href="https://help.aliyun.com/document_detail/2667899.html">DescribeKubernetesVersionMetadata</a> operation to obtain the runtime version information from the runtime field.</p>
     * 
     * <strong>example:</strong>
     * <p>1.6.36</p>
     */
    @NameInMap("runtime_version")
    public String runtimeVersion;

    /**
     * <p>Specifies whether to use disk replacement for the upgrade. Valid values:</p>
     * <ul>
     * <li>true: Uses disk replacement. The node pool is upgraded by replacing the system cloud disks of the nodes. ACK reinitializes the nodes based on the current configurations of the node pool, such as the node logon method, labels, taints, operating system image, and runtime version.</li>
     * <li>false: Does not use disk replacement.</li>
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

    public UpgradeClusterNodepoolRequest setIgnoreWarningCheck(Boolean ignoreWarningCheck) {
        this.ignoreWarningCheck = ignoreWarningCheck;
        return this;
    }
    public Boolean getIgnoreWarningCheck() {
        return this.ignoreWarningCheck;
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
         * <p>The upgrade interval between batches. This parameter takes effect only when the pause policy is set to <code>NotPause</code>.</p>
         * <p>Valid values: 5 to 120. Unit: minutes.</p>
         * <p>You can set this parameter to 0, which indicates that no interval is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("batch_interval")
        public Integer batchInterval;

        /**
         * <p>The maximum number of nodes allowed to fail during the rolling update. Default value: 0, which indicates that the task fails if any node fails. If the value is greater than 0, the task fails and stops when the cumulative number of failed nodes exceeds this value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("max_failed_nodes")
        public Integer maxFailedNodes;

        /**
         * <p>The node updates in the node pool are performed in batches. This parameter specifies the maximum number of nodes that can be updated in parallel in each batch.</p>
         * <p>Valid values: 1 to 10.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("max_parallelism")
        public Integer maxParallelism;

        /**
         * <p>The automatic pause policy during the node upgrade process. Valid values:</p>
         * <ul>
         * <li>FirstBatch: Pauses after the first batch is completed.</li>
         * <li>EveryBatch: Pauses after each batch is completed.</li>
         * <li>NotPause: Does not pause.</li>
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

        public UpgradeClusterNodepoolRequestRollingPolicy setMaxFailedNodes(Integer maxFailedNodes) {
            this.maxFailedNodes = maxFailedNodes;
            return this;
        }
        public Integer getMaxFailedNodes() {
            return this.maxFailedNodes;
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
