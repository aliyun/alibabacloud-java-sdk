// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class QueueTemplate extends TeaModel {
    @NameInMap("AllocationStrategy")
    public String allocationStrategy;

    @NameInMap("ComputeNodes")
    public java.util.List<NodeTemplate> computeNodes;

    @NameInMap("EnableScaleIn")
    public Boolean enableScaleIn;

    @NameInMap("EnableScaleOut")
    public Boolean enableScaleOut;

    @NameInMap("HostnamePrefix")
    public String hostnamePrefix;

    @NameInMap("HostnameSuffix")
    public String hostnameSuffix;

    @NameInMap("InitialCount")
    public Integer initialCount;

    @NameInMap("InterConnect")
    public String interConnect;

    @NameInMap("KeepAliveNodes")
    public java.util.List<String> keepAliveNodes;

    @NameInMap("MaxCount")
    public Integer maxCount;

    @NameInMap("MaxCountPerCycle")
    public Long maxCountPerCycle;

    @NameInMap("MinCount")
    public Integer minCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RamRole")
    public String ramRole;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    public static QueueTemplate build(java.util.Map<String, ?> map) throws Exception {
        QueueTemplate self = new QueueTemplate();
        return TeaModel.build(map, self);
    }

    public QueueTemplate setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }
    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    public QueueTemplate setComputeNodes(java.util.List<NodeTemplate> computeNodes) {
        this.computeNodes = computeNodes;
        return this;
    }
    public java.util.List<NodeTemplate> getComputeNodes() {
        return this.computeNodes;
    }

    public QueueTemplate setEnableScaleIn(Boolean enableScaleIn) {
        this.enableScaleIn = enableScaleIn;
        return this;
    }
    public Boolean getEnableScaleIn() {
        return this.enableScaleIn;
    }

    public QueueTemplate setEnableScaleOut(Boolean enableScaleOut) {
        this.enableScaleOut = enableScaleOut;
        return this;
    }
    public Boolean getEnableScaleOut() {
        return this.enableScaleOut;
    }

    public QueueTemplate setHostnamePrefix(String hostnamePrefix) {
        this.hostnamePrefix = hostnamePrefix;
        return this;
    }
    public String getHostnamePrefix() {
        return this.hostnamePrefix;
    }

    public QueueTemplate setHostnameSuffix(String hostnameSuffix) {
        this.hostnameSuffix = hostnameSuffix;
        return this;
    }
    public String getHostnameSuffix() {
        return this.hostnameSuffix;
    }

    public QueueTemplate setInitialCount(Integer initialCount) {
        this.initialCount = initialCount;
        return this;
    }
    public Integer getInitialCount() {
        return this.initialCount;
    }

    public QueueTemplate setInterConnect(String interConnect) {
        this.interConnect = interConnect;
        return this;
    }
    public String getInterConnect() {
        return this.interConnect;
    }

    public QueueTemplate setKeepAliveNodes(java.util.List<String> keepAliveNodes) {
        this.keepAliveNodes = keepAliveNodes;
        return this;
    }
    public java.util.List<String> getKeepAliveNodes() {
        return this.keepAliveNodes;
    }

    public QueueTemplate setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }
    public Integer getMaxCount() {
        return this.maxCount;
    }

    public QueueTemplate setMaxCountPerCycle(Long maxCountPerCycle) {
        this.maxCountPerCycle = maxCountPerCycle;
        return this;
    }
    public Long getMaxCountPerCycle() {
        return this.maxCountPerCycle;
    }

    public QueueTemplate setMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }
    public Integer getMinCount() {
        return this.minCount;
    }

    public QueueTemplate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueueTemplate setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public QueueTemplate setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

}
