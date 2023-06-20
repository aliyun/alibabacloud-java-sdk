// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateAutoscalingConfigRequest extends TeaModel {
    @NameInMap("cool_down_duration")
    public String coolDownDuration;

    @NameInMap("daemonset_eviction_for_nodes")
    public Boolean daemonsetEvictionForNodes;

    @NameInMap("expander")
    public String expander;

    @NameInMap("gpu_utilization_threshold")
    public String gpuUtilizationThreshold;

    @NameInMap("max_graceful_termination_sec")
    public Integer maxGracefulTerminationSec;

    @NameInMap("min_replica_count")
    public Integer minReplicaCount;

    @NameInMap("recycle_node_deletion_enabled")
    public Boolean recycleNodeDeletionEnabled;

    @NameInMap("scale_down_enabled")
    public Boolean scaleDownEnabled;

    @NameInMap("scale_up_from_zero")
    public Boolean scaleUpFromZero;

    @NameInMap("scan_interval")
    public String scanInterval;

    @NameInMap("skip_nodes_with_local_storage")
    public Boolean skipNodesWithLocalStorage;

    @NameInMap("skip_nodes_with_system_pods")
    public Boolean skipNodesWithSystemPods;

    @NameInMap("unneeded_duration")
    public String unneededDuration;

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
