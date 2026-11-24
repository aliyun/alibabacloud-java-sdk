// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateAutoscalingConfigRequest extends TeaModel {
    /**
     * <p>The delay for triggering scale-in. This is the time interval between detecting a scale-in requirement (reaching the scale-in threshold) and actually executing the scale-in operation (reducing the number of pods). Valid values: 1 to 60. Unit: minutes. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("cool_down_duration")
    public String coolDownDuration;

    /**
     * <p>Specifies whether cluster-autoscaler evicts DaemonSet pods on nodes during scale-in. Valid values:</p>
     * <ul>
     * <li>true: The pods are evicted.</li>
     * <li>false: The pods are not evicted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("daemonset_eviction_for_nodes")
    public Boolean daemonsetEvictionForNodes;

    /**
     * <p>The node pool scale-out order policy. Valid values:</p>
     * <ul>
     * <li>least-waste: the default policy. If multiple node pools can be scaled out, the system selects the node pool that wastes the least resources.</li>
     * <li>random: the random policy. If multiple node pools can be scaled out, the system randomly selects a node pool.</li>
     * <li>priority: the priority policy. If multiple node pools can be scaled out, the system selects the node pool with the highest priority based on the custom scaling group order. The node pool priority is defined by the priorities parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>least-waste</p>
     */
    @NameInMap("expander")
    public String expander;

    /**
     * <p>The GPU scale-in threshold, which is the ratio of requested resources to total resources on a node. A GPU node can be scaled in only when this ratio is lower than the configured threshold, meaning that the CPU, memory, and GPU utilization of the node are all lower than the GPU scale-in threshold. Valid values: 0.1 to 1. Default value: 0.3, which indicates 30%.</p>
     * 
     * <strong>example:</strong>
     * <p>0.3</p>
     */
    @NameInMap("gpu_utilization_threshold")
    public String gpuUtilizationThreshold;

    /**
     * <p>The timeout period for cluster-autoscaler to wait for pod termination during node draining in a scale-in scenario. Unit: seconds. Default value: 14400.</p>
     * 
     * <strong>example:</strong>
     * <p>14400</p>
     */
    @NameInMap("max_graceful_termination_sec")
    public Integer maxGracefulTerminationSec;

    /**
     * <p>The minimum number of pods allowed in each ReplicaSet before a node is scaled in. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("min_replica_count")
    public Integer minReplicaCount;

    /**
     * <p>The auto scaling priority configuration. After you create a node pool with auto scaling enabled, you can choose whether to configure the priority policy and priority configuration by referring to <a href="https://help.aliyun.com/document_detail/119099.html">Enable auto scaling for nodes</a>. This allows you to configure priorities for the scaling groups of specified auto scaling node pools. Valid values: 1 to 100. The value must be a positive integer. A larger value indicates a higher priority.</p>
     */
    @NameInMap("priorities")
    public java.util.Map<String, java.util.List<String>> priorities;

    /**
     * <p>Specifies whether to delete the corresponding Kubernetes node objects after nodes are successfully scaled in fast mode. For more information about fast mode, see <a href="https://help.aliyun.com/document_detail/119099.html">Scaling modes</a>. Default value: false. Valid values:</p>
     * <ul>
     * <li>true: Kubernetes node objects are also deleted after nodes are stopped in fast mode. Do not set this parameter to true because it may cause data inconsistency of Kubernetes objects.</li>
     * <li>false: Kubernetes node objects are retained after nodes are stopped in fast mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("recycle_node_deletion_enabled")
    public Boolean recycleNodeDeletionEnabled;

    /**
     * <p>Specifies whether to allow node scale-in. Valid values:</p>
     * <ul>
     * <li>true: Scale-in is allowed.</li>
     * <li>false: Scale-in is prohibited.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("scale_down_enabled")
    public Boolean scaleDownEnabled;

    /**
     * <p>Specifies whether cluster-autoscaler performs scale-out when the number of ready nodes in the cluster is 0. Default value: true. Valid values:</p>
     * <ul>
     * <li>true: Scale-out is performed.</li>
     * <li>false: Scale-out is not performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("scale_up_from_zero")
    public Boolean scaleUpFromZero;

    /**
     * <p>The auto scaling component type. For clusters of version 1.24 and later, the default value is goatscaler. For clusters of earlier versions, the default value is cluster-autoscaler. Valid values:</p>
     * <ul>
     * <li>goatscaler: instant elasticity.</li>
     * <li>cluster-autoscaler: auto scaling.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>goatscaler</p>
     */
    @NameInMap("scaler_type")
    public String scalerType;

    /**
     * <p>The auto scaling sensitivity, which is used to adjust the interval at which the system evaluates scaling. Valid values: 15, 30, 60, 120, 180, and 300. Unit: seconds. Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("scan_interval")
    public String scanInterval;

    /**
     * <p>Specifies whether cluster-autoscaler scales in nodes that contain pods with local storage, such as EmptyDir or HostPath. Valid values:</p>
     * <ul>
     * <li>true: The nodes are not scaled in.</li>
     * <li>false: The nodes are scaled in.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("skip_nodes_with_local_storage")
    public Boolean skipNodesWithLocalStorage;

    /**
     * <p>Specifies whether cluster-autoscaler scales in nodes that run pods in the kube-system namespace. This feature does not take effect for DaemonSet pods and mirror pods. Valid values:</p>
     * <ul>
     * <li>true: The nodes are not scaled in.</li>
     * <li>false: The nodes are scaled in.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("skip_nodes_with_system_pods")
    public Boolean skipNodesWithSystemPods;

    /**
     * <p>The cool-down period. This is the time interval during which the auto scaling component does not perform scale-in after the most recent scale-out is completed. Scaled-out nodes can be evaluated for scale-in only after the cool-down period ends. Valid values: 1 to 60. Unit: minutes. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("unneeded_duration")
    public String unneededDuration;

    /**
     * <p>The scale-in threshold, which is the ratio of requested resources to total resources on a node. A node can be scaled in only when this ratio is lower than the configured threshold, meaning that the utilization of both CPU and memory resources on the node is lower than the scale-in threshold. Valid values: 0.1 to 1. Default value: 0.5, which indicates 50%.</p>
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
