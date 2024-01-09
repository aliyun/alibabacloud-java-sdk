// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateAutoscalingConfigRequest extends TeaModel {
    /**
     * <p>The waiting time before the auto scaling feature performs a scale-in activity. Only if the resource usage on a node remains below the scale-in threshold within the waiting time, the node is removed after the waiting time ends. Unit: minutes.</p>
     */
    @NameInMap("cool_down_duration")
    public String coolDownDuration;

    /**
     * <p>Specifies whether to evict DaemonSet pods during scale-in activities. Valid values:</p>
     * <br>
     * <p>*   `true`: evicts DaemonSet pods.</p>
     * <p>*   `false`: does not evict DaemonSet pods.</p>
     */
    @NameInMap("daemonset_eviction_for_nodes")
    public Boolean daemonsetEvictionForNodes;

    /**
     * <p>The node pool scale-out policy. Valid values:</p>
     * <br>
     * <p>*   `least-waste`: the default policy. If multiple node pools meet the requirement, this policy selects the node pool that will have the least idle resources after the scale-out activity is completed.</p>
     * <p>*   `random`: the random policy. If multiple node pools meet the requirement, this policy selects a random node pool for the scale-out activity.</p>
     * <p>*   `priority`: the priority-based policy If multiple node pools meet the requirement, this policy selects the node pool with the highest priority for the scale-out activity. The priority setting is stored in the ConfigMap named `cluster-autoscaler-priority-expander` in the kube-system namespace. When a scale-out activity is triggered, the policy obtains the node pool priorities from the ConfigMap based on the node pool IDs and then selects the node pool with the highest priority for the scale-out activity.</p>
     */
    @NameInMap("expander")
    public String expander;

    /**
     * <p>The scale-in threshold of GPU utilization. This threshold specifies the ratio of the GPU resources that are requested by pods to the total GPU resources on the node.</p>
     */
    @NameInMap("gpu_utilization_threshold")
    public String gpuUtilizationThreshold;

    /**
     * <p>The maximum amount of time that the cluster autoscaler waits for pods on the nodes to terminate during scale-in activities. Unit: seconds.</p>
     */
    @NameInMap("max_graceful_termination_sec")
    public Integer maxGracefulTerminationSec;

    /**
     * <p>The minimum number of pods that must be guaranteed during scale-in activities.</p>
     */
    @NameInMap("min_replica_count")
    public Integer minReplicaCount;

    /**
     * <p>Specifies whether to delete the corresponding Kubernetes node objects after nodes are removed in swift mode.</p>
     */
    @NameInMap("recycle_node_deletion_enabled")
    public Boolean recycleNodeDeletionEnabled;

    /**
     * <p>Specifies whether to allow node scale-in activities. Valid values:</p>
     * <br>
     * <p>*   `true`: allows node scale-in activities.</p>
     * <p>*   `false`: does not allow node scale-in activities.</p>
     */
    @NameInMap("scale_down_enabled")
    public Boolean scaleDownEnabled;

    /**
     * <p>Specifies whether the cluster autoscaler performs scale-out activities when the number of ready nodes in the cluster is zero.</p>
     */
    @NameInMap("scale_up_from_zero")
    public Boolean scaleUpFromZero;

    /**
     * <p>The interval at which the cluster is scanned and evaluated for scaling. Unit: seconds.</p>
     */
    @NameInMap("scan_interval")
    public String scanInterval;

    /**
     * <p>Specifies whether to allow the cluster autoscaler to scale in nodes that host pods mounted with local storage, such as EmptyDir volumes or HostPath volumes. Valid values:</p>
     * <br>
     * <p>*   `true`: does not allow the cluster autoscaler to scale in these nodes.</p>
     * <p>*   `false`: allows the cluster autoscaler to scale in these nodes.</p>
     */
    @NameInMap("skip_nodes_with_local_storage")
    public Boolean skipNodesWithLocalStorage;

    /**
     * <p>Specifies whether to allow the cluster autoscaler to scale in nodes that host pods in the kube-system namespace, excluding DaemonSet pods and mirror pods. Valid values:</p>
     * <br>
     * <p>*   `true`: does not allow the cluster autoscaler to scale in these nodes.</p>
     * <p>*   `false`: allows the cluster autoscaler to scale in these nodes.</p>
     */
    @NameInMap("skip_nodes_with_system_pods")
    public Boolean skipNodesWithSystemPods;

    /**
     * <p>The cooldown period. Newly added nodes can be removed in scale-in activities only after the cooldown period ends. Unit: minutes.</p>
     */
    @NameInMap("unneeded_duration")
    public String unneededDuration;

    /**
     * <p>The scale-in threshold. This threshold specifies the ratio of the resources that are requested by pods to the total resources on the node.</p>
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
