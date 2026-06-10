// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateAutoscalingConfigRequest extends TeaModel {
    /**
     * <p>The cool-down duration for scale-in events. This is the time interval from when the system detects a node is eligible for a scale-in to when the scale-in operation is executed.</p>
     * <p>Valid values: 1 to 60. Unit: minutes.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("cool_down_duration")
    public String coolDownDuration;

    /**
     * <p>Specifies whether <code>cluster-autoscaler</code> evicts DaemonSet Pods from nodes during a scale-in event. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Perform eviction.</p>
     * </li>
     * <li><p><code>false</code>: Do not perform eviction.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("daemonset_eviction_for_nodes")
    public Boolean daemonsetEvictionForNodes;

    /**
     * <p>The strategy for selecting a node pool for a scale-out when multiple node pools are available. Valid values:</p>
     * <ul>
     * <li><p><code>least-waste</code>: The default strategy. The scaler selects the node pool that will have the least idle resources after a scale-out.</p>
     * </li>
     * <li><p><code>random</code>: The scaler selects a random node pool from the list of eligible node pools.</p>
     * </li>
     * <li><p><code>priority</code>: The scaler selects the node pool that has the highest priority. You must configure the priority of each scaling group by using the <code>priorities</code> parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>least-waste</p>
     */
    @NameInMap("expander")
    public String expander;

    /**
     * <p>The GPU utilization threshold for a scale-in on GPU nodes, which is the ratio of requested resources to total allocatable resources on a node.</p>
     * <p>A GPU node is eligible for a scale-in only if its CPU, memory, and GPU utilization all fall below this threshold.</p>
     * <p>Valid values: [0.1, 1].</p>
     * <p>Default value: 0.3 (30%).</p>
     * 
     * <strong>example:</strong>
     * <p>0.3</p>
     */
    @NameInMap("gpu_utilization_threshold")
    public String gpuUtilizationThreshold;

    /**
     * <p>The maximum duration in seconds that <code>cluster-autoscaler</code> waits for Pods to terminate during a node drain for a scale-in event.</p>
     * <p>Unit: seconds.</p>
     * <p>Default value: 14400.</p>
     * 
     * <strong>example:</strong>
     * <p>14400</p>
     */
    @NameInMap("max_graceful_termination_sec")
    public Integer maxGracefulTerminationSec;

    /**
     * <p>The minimum number of Pods that must remain for any ReplicaSet after a scale-in operation. Nodes will not be scaled-in if doing so would violate this minimum.</p>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("min_replica_count")
    public Integer minReplicaCount;

    /**
     * <p>Configures the priorities for scaling groups. This is used when the <code>expander</code> strategy is set to <code>priority</code>. After you create a node pool and enable autoscaling for it, you can configure the priority of its associated scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/119099.html">Enable node autoscaling</a>.</p>
     * <p>The priority must be a positive integer from 1 to 100. A larger value indicates a higher priority.</p>
     */
    @NameInMap("priorities")
    public java.util.Map<String, java.util.List<String>> priorities;

    /**
     * <p>Specifies whether to delete the Kubernetes Node object after a node is successfully scaled-in using fast scaling mode. For more information, see <a href="https://help.aliyun.com/document_detail/119099.html">Scaling modes</a>. Default value: false. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The Node object is deleted after the instance is stopped. We do not recommend this setting because it can cause data inconsistencies in Kubernetes.</p>
     * </li>
     * <li><p><code>false</code>: The Node object is retained after the instance is stopped.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("recycle_node_deletion_enabled")
    public Boolean recycleNodeDeletionEnabled;

    /**
     * <p>Specifies whether to allow node scale-in operations. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Allows scale-in operations.</p>
     * </li>
     * <li><p><code>false</code>: Disables scale-in operations.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("scale_down_enabled")
    public Boolean scaleDownEnabled;

    /**
     * <p>Controls whether <code>cluster-autoscaler</code> performs a scale-out operation when there are no ready nodes in the cluster. Default value: true. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: A scale-out operation is performed.</p>
     * </li>
     * <li><p><code>false</code>: No scale-out operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("scale_up_from_zero")
    public Boolean scaleUpFromZero;

    /**
     * <p>The type of scaler to use. In clusters that run Kubernetes 1.24 or later, the default is goatscaler. In clusters that run an earlier version, the default is cluster-autoscaler. Valid values:</p>
     * <ul>
     * <li><p><code>goatscaler</code>: The proprietary scaler for fast scaling.</p>
     * </li>
     * <li><p><code>cluster-autoscaler</code>: The standard Kubernetes cluster autoscaler.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>goatscaler</p>
     */
    @NameInMap("scaler_type")
    public String scalerType;

    /**
     * <p>The frequency at which the system checks for scaling conditions.</p>
     * <p>Valid values: 15, 30, 60, 120, 180, and 300. Unit: seconds.</p>
     * <p>Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("scan_interval")
    public String scanInterval;

    /**
     * <p>Controls whether <code>cluster-autoscaler</code> can scale-in nodes that run Pods using local storage (for example, with <code>emptyDir</code> or <code>hostPath</code> volumes). Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Prevents these nodes from being scaled-in.</p>
     * </li>
     * <li><p><code>false</code>: Allows these nodes to be scaled-in.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("skip_nodes_with_local_storage")
    public Boolean skipNodesWithLocalStorage;

    /**
     * <p>Controls whether <code>cluster-autoscaler</code> can scale-in nodes that run Pods from the <code>kube-system</code> namespace. This setting does not affect DaemonSet or mirror Pods. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Prevents these nodes from being scaled-in.</p>
     * </li>
     * <li><p><code>false</code>: Allows these nodes to be scaled-in.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("skip_nodes_with_system_pods")
    public Boolean skipNodesWithSystemPods;

    /**
     * <p>The stabilization window. This is the period after a scale-out event during which the scaler does not perform scale-in operations.</p>
     * <p>Valid values: 1 to 60. Unit: minutes.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("unneeded_duration")
    public String unneededDuration;

    /**
     * <p>The utilization threshold for a scale-in, which is the ratio of requested resources to the total allocatable resources on a node.</p>
     * <p>A node is eligible for a scale-in only when both its CPU and memory utilization fall below this threshold.</p>
     * <p>Valid values: [0.1, 1].</p>
     * <p>Default value: 0.5 (50%).</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("utilization_threshold")
    public String utilizationThreshold;

    public static CreateAutoscalingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoscalingConfigRequest self = new CreateAutoscalingConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoscalingConfigRequest setCoolDownDuration(String coolDownDuration) {
        this.coolDownDuration = coolDownDuration;
        return this;
    }
    public String getCoolDownDuration() {
        return this.coolDownDuration;
    }

    public CreateAutoscalingConfigRequest setDaemonsetEvictionForNodes(Boolean daemonsetEvictionForNodes) {
        this.daemonsetEvictionForNodes = daemonsetEvictionForNodes;
        return this;
    }
    public Boolean getDaemonsetEvictionForNodes() {
        return this.daemonsetEvictionForNodes;
    }

    public CreateAutoscalingConfigRequest setExpander(String expander) {
        this.expander = expander;
        return this;
    }
    public String getExpander() {
        return this.expander;
    }

    public CreateAutoscalingConfigRequest setGpuUtilizationThreshold(String gpuUtilizationThreshold) {
        this.gpuUtilizationThreshold = gpuUtilizationThreshold;
        return this;
    }
    public String getGpuUtilizationThreshold() {
        return this.gpuUtilizationThreshold;
    }

    public CreateAutoscalingConfigRequest setMaxGracefulTerminationSec(Integer maxGracefulTerminationSec) {
        this.maxGracefulTerminationSec = maxGracefulTerminationSec;
        return this;
    }
    public Integer getMaxGracefulTerminationSec() {
        return this.maxGracefulTerminationSec;
    }

    public CreateAutoscalingConfigRequest setMinReplicaCount(Integer minReplicaCount) {
        this.minReplicaCount = minReplicaCount;
        return this;
    }
    public Integer getMinReplicaCount() {
        return this.minReplicaCount;
    }

    public CreateAutoscalingConfigRequest setPriorities(java.util.Map<String, java.util.List<String>> priorities) {
        this.priorities = priorities;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getPriorities() {
        return this.priorities;
    }

    public CreateAutoscalingConfigRequest setRecycleNodeDeletionEnabled(Boolean recycleNodeDeletionEnabled) {
        this.recycleNodeDeletionEnabled = recycleNodeDeletionEnabled;
        return this;
    }
    public Boolean getRecycleNodeDeletionEnabled() {
        return this.recycleNodeDeletionEnabled;
    }

    public CreateAutoscalingConfigRequest setScaleDownEnabled(Boolean scaleDownEnabled) {
        this.scaleDownEnabled = scaleDownEnabled;
        return this;
    }
    public Boolean getScaleDownEnabled() {
        return this.scaleDownEnabled;
    }

    public CreateAutoscalingConfigRequest setScaleUpFromZero(Boolean scaleUpFromZero) {
        this.scaleUpFromZero = scaleUpFromZero;
        return this;
    }
    public Boolean getScaleUpFromZero() {
        return this.scaleUpFromZero;
    }

    public CreateAutoscalingConfigRequest setScalerType(String scalerType) {
        this.scalerType = scalerType;
        return this;
    }
    public String getScalerType() {
        return this.scalerType;
    }

    public CreateAutoscalingConfigRequest setScanInterval(String scanInterval) {
        this.scanInterval = scanInterval;
        return this;
    }
    public String getScanInterval() {
        return this.scanInterval;
    }

    public CreateAutoscalingConfigRequest setSkipNodesWithLocalStorage(Boolean skipNodesWithLocalStorage) {
        this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
        return this;
    }
    public Boolean getSkipNodesWithLocalStorage() {
        return this.skipNodesWithLocalStorage;
    }

    public CreateAutoscalingConfigRequest setSkipNodesWithSystemPods(Boolean skipNodesWithSystemPods) {
        this.skipNodesWithSystemPods = skipNodesWithSystemPods;
        return this;
    }
    public Boolean getSkipNodesWithSystemPods() {
        return this.skipNodesWithSystemPods;
    }

    public CreateAutoscalingConfigRequest setUnneededDuration(String unneededDuration) {
        this.unneededDuration = unneededDuration;
        return this;
    }
    public String getUnneededDuration() {
        return this.unneededDuration;
    }

    public CreateAutoscalingConfigRequest setUtilizationThreshold(String utilizationThreshold) {
        this.utilizationThreshold = utilizationThreshold;
        return this;
    }
    public String getUtilizationThreshold() {
        return this.utilizationThreshold;
    }

}
