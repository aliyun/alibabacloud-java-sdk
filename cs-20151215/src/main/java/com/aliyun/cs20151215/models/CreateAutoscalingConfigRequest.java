// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateAutoscalingConfigRequest extends TeaModel {
    /**
     * <p>The scale-down trigger delay. The time interval between detecting a scale-down need (reaching the scale-down threshold) and actually performing the scale-down operation (reducing the number of Pods).</p>
     * <p>Valid values: [1,60]. Unit: minutes.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("cool_down_duration")
    public String coolDownDuration;

    /**
     * <p>Specifies whether cluster-autoscaler evicts DaemonSet Pods on nodes during scale-down. Valid values:</p>
     * <ul>
     * <li><code>true</code>: DaemonSet Pods are evicted.</li>
     * <li><code>false</code>: DaemonSet Pods are not evicted.</li>
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
     * <li><code>least-waste</code>: The default policy. If multiple node pools are available for scale-out, the node pool with the least resource waste is selected.</li>
     * <li><code>random</code>: The random policy. If multiple node pools are available for scale-out, a random node pool is selected.</li>
     * <li><code>priority</code>: The priority policy. If multiple node pools are available for scale-out, the node pool with the highest priority is selected based on the custom scaling group order you defined. Node pool priorities are defined by the <code>priorities</code> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>least-waste</p>
     */
    @NameInMap("expander")
    public String expander;

    /**
     * <p>The GPU scale-down threshold. The ratio of requested resources to total resources on a node.</p>
     * <p>A GPU node can be scaled down only when this ratio falls below the configured threshold, meaning the CPU, memory, and GPU utilization of the node are all below the GPU scale-down threshold.</p>
     * <p>Valid values: [0.1~1].</p>
     * <p>Default value: 0.3, which indicates 30%.</p>
     * 
     * <strong>example:</strong>
     * <p>0.3</p>
     */
    @NameInMap("gpu_utilization_threshold")
    public String gpuUtilizationThreshold;

    /**
     * <p>The timeout period that cluster-autoscaler waits for Pod termination during node draining in scale-down scenarios.</p>
     * <p>Unit: seconds.</p>
     * <p>Default value: 14400.</p>
     * 
     * <strong>example:</strong>
     * <p>14400</p>
     */
    @NameInMap("max_graceful_termination_sec")
    public Integer maxGracefulTerminationSec;

    /**
     * <p>The minimum number of Pods allowed in each ReplicaSet before a node can be scaled down.</p>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("min_replica_count")
    public Integer minReplicaCount;

    /**
     * <p>The priority configuration for automatic scaling. After you create a node pool with auto scaling enabled, you can choose whether to configure a priority policy and priority settings by using <a href="https://help.aliyun.com/document_detail/119099.html">Enable node auto scaling</a> to assign priorities to the scaling groups of specified auto scaling node pools.</p>
     * <p>Valid values: [1, 100]. The value must be a positive integer. A larger value indicates a higher priority.</p>
     */
    @NameInMap("priorities")
    public java.util.Map<String, java.util.List<String>> priorities;

    /**
     * <p>Specifies whether to delete the corresponding Kubernetes Node object after a node is successfully scaled down in swift mode. For more information about swift mode, see <a href="https://help.aliyun.com/document_detail/119099.html">Scaling modes</a>. Default value: false. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The Kubernetes Node object is deleted after the node is stopped in swift mode. Setting this parameter to true is not recommended because it may cause Kubernetes object data inconsistency.</li>
     * <li><code>false</code>: The Kubernetes Node object is retained after the node is stopped in swift mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("recycle_node_deletion_enabled")
    public Boolean recycleNodeDeletionEnabled;

    /**
     * <p>Specifies whether to allow node scale-down. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Scale-down is allowed.</li>
     * <li><code>false</code>: Scale-down is not allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("scale_down_enabled")
    public Boolean scaleDownEnabled;

    /**
     * <p>Specifies whether cluster-autoscaler performs scale-out when the number of Ready nodes in the cluster is 0. Default value: true. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Scale-out is performed.</li>
     * <li><code>false</code>: Scale-out is not performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("scale_up_from_zero")
    public Boolean scaleUpFromZero;

    /**
     * <p>The type of the auto scaling component. For clusters of version 1.24 and later, the default value is goatscaler. For earlier versions, the default value is cluster-autoscaler. Valid values:</p>
     * <ul>
     * <li><p><code>goatscaler</code>: instant scaling.</p>
     * </li>
     * <li><p><code>cluster-autoscaler</code>: automatic scaling.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>goatscaler</p>
     */
    @NameInMap("scaler_type")
    public String scalerType;

    /**
     * <p>The scaling sensitivity, which adjusts the interval at which the system evaluates scaling decisions.</p>
     * <p>Valid values: 15, 30, 60, 120, 180, and 300. Unit: seconds.</p>
     * <p>Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("scan_interval")
    public String scanInterval;

    /**
     * <p>Specifies whether cluster-autoscaler skips scaling down nodes that run Pods with local storage (such as EmptyDir or HostPath). Valid values:</p>
     * <ul>
     * <li><code>true</code>: Nodes are not scaled down.</li>
     * <li><code>false</code>: Nodes are scaled down.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("skip_nodes_with_local_storage")
    public Boolean skipNodesWithLocalStorage;

    /**
     * <p>Specifies whether cluster-autoscaler skips scaling down nodes that run Pods in the kube-system namespace. This feature does not apply to DaemonSet Pods or Mirror Pods. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Nodes are not scaled down.</li>
     * <li><code>false</code>: Nodes are scaled down.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("skip_nodes_with_system_pods")
    public Boolean skipNodesWithSystemPods;

    /**
     * <p>The cool-down period. The time interval after the most recent scale-out during which the auto scaling component does not perform scale-down operations. Nodes added during scale-out can only be evaluated for scale-down after the cool-down period expires.</p>
     * <p>Valid values: [1,60]. Unit: minutes.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("unneeded_duration")
    public String unneededDuration;

    /**
     * <p>The scale-down threshold. The ratio of requested resources to total resources on a node.</p>
     * <p>A node can be scaled down only when this ratio falls below the configured threshold, meaning both the CPU and memory resources utilization of the node are below the scale-down threshold.</p>
     * <p>Valid values: [0.1~1].</p>
     * <p>Default value: 0.5, which indicates 50%.</p>
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
