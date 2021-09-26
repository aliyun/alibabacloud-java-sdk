// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RunClusterServiceActionRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HostIdList")
    public String hostIdList;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceActionName")
    public String serviceActionName;

    @NameInMap("CustomCommand")
    public String customCommand;

    @NameInMap("ComponentNameList")
    public String componentNameList;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("IsRolling")
    public Boolean isRolling;

    @NameInMap("ExecuteStrategy")
    public String executeStrategy;

    @NameInMap("CustomParams")
    public String customParams;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("NodeCountPerBatch")
    public Integer nodeCountPerBatch;

    @NameInMap("TolerateFailCount")
    public Integer tolerateFailCount;

    @NameInMap("OnlyRestartStaleConfigNodes")
    public Boolean onlyRestartStaleConfigNodes;

    @NameInMap("TurnOnMaintenanceMode")
    public Boolean turnOnMaintenanceMode;

    @NameInMap("HostGroupIdList")
    public java.util.List<String> hostGroupIdList;

    public static RunClusterServiceActionRequest build(java.util.Map<String, ?> map) throws Exception {
        RunClusterServiceActionRequest self = new RunClusterServiceActionRequest();
        return TeaModel.build(map, self);
    }

    public RunClusterServiceActionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RunClusterServiceActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunClusterServiceActionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RunClusterServiceActionRequest setHostIdList(String hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }
    public String getHostIdList() {
        return this.hostIdList;
    }

    public RunClusterServiceActionRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public RunClusterServiceActionRequest setServiceActionName(String serviceActionName) {
        this.serviceActionName = serviceActionName;
        return this;
    }
    public String getServiceActionName() {
        return this.serviceActionName;
    }

    public RunClusterServiceActionRequest setCustomCommand(String customCommand) {
        this.customCommand = customCommand;
        return this;
    }
    public String getCustomCommand() {
        return this.customCommand;
    }

    public RunClusterServiceActionRequest setComponentNameList(String componentNameList) {
        this.componentNameList = componentNameList;
        return this;
    }
    public String getComponentNameList() {
        return this.componentNameList;
    }

    public RunClusterServiceActionRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public RunClusterServiceActionRequest setIsRolling(Boolean isRolling) {
        this.isRolling = isRolling;
        return this;
    }
    public Boolean getIsRolling() {
        return this.isRolling;
    }

    public RunClusterServiceActionRequest setExecuteStrategy(String executeStrategy) {
        this.executeStrategy = executeStrategy;
        return this;
    }
    public String getExecuteStrategy() {
        return this.executeStrategy;
    }

    public RunClusterServiceActionRequest setCustomParams(String customParams) {
        this.customParams = customParams;
        return this;
    }
    public String getCustomParams() {
        return this.customParams;
    }

    public RunClusterServiceActionRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public RunClusterServiceActionRequest setNodeCountPerBatch(Integer nodeCountPerBatch) {
        this.nodeCountPerBatch = nodeCountPerBatch;
        return this;
    }
    public Integer getNodeCountPerBatch() {
        return this.nodeCountPerBatch;
    }

    public RunClusterServiceActionRequest setTolerateFailCount(Integer tolerateFailCount) {
        this.tolerateFailCount = tolerateFailCount;
        return this;
    }
    public Integer getTolerateFailCount() {
        return this.tolerateFailCount;
    }

    public RunClusterServiceActionRequest setOnlyRestartStaleConfigNodes(Boolean onlyRestartStaleConfigNodes) {
        this.onlyRestartStaleConfigNodes = onlyRestartStaleConfigNodes;
        return this;
    }
    public Boolean getOnlyRestartStaleConfigNodes() {
        return this.onlyRestartStaleConfigNodes;
    }

    public RunClusterServiceActionRequest setTurnOnMaintenanceMode(Boolean turnOnMaintenanceMode) {
        this.turnOnMaintenanceMode = turnOnMaintenanceMode;
        return this;
    }
    public Boolean getTurnOnMaintenanceMode() {
        return this.turnOnMaintenanceMode;
    }

    public RunClusterServiceActionRequest setHostGroupIdList(java.util.List<String> hostGroupIdList) {
        this.hostGroupIdList = hostGroupIdList;
        return this;
    }
    public java.util.List<String> getHostGroupIdList() {
        return this.hostGroupIdList;
    }

}
