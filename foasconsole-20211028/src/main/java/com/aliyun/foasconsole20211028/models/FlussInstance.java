// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class FlussInstance extends TeaModel {
    @NameInMap("ClusterState")
    public ClusterState clusterState;

    @NameInMap("ClusterStatus")
    public String clusterStatus;

    @NameInMap("ConsoleUrl")
    public String consoleUrl;

    @NameInMap("DiskSize")
    public Long diskSize;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("OrderState")
    public String orderState;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceCreateTime")
    public Long resourceCreateTime;

    @NameInMap("ResourceExpiredTime")
    public Long resourceExpiredTime;

    @NameInMap("TabletServerModel")
    public String tabletServerModel;

    @NameInMap("TabletServerNum")
    public Long tabletServerNum;

    @NameInMap("TabletServerType")
    public String tabletServerType;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("VSwitches")
    public java.util.List<FlussVswitch> vSwitches;

    @NameInMap("VpcId")
    public String vpcId;

    public static FlussInstance build(java.util.Map<String, ?> map) throws Exception {
        FlussInstance self = new FlussInstance();
        return TeaModel.build(map, self);
    }

    public FlussInstance setClusterState(ClusterState clusterState) {
        this.clusterState = clusterState;
        return this;
    }
    public ClusterState getClusterState() {
        return this.clusterState;
    }

    public FlussInstance setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }
    public String getClusterStatus() {
        return this.clusterStatus;
    }

    public FlussInstance setConsoleUrl(String consoleUrl) {
        this.consoleUrl = consoleUrl;
        return this;
    }
    public String getConsoleUrl() {
        return this.consoleUrl;
    }

    public FlussInstance setDiskSize(Long diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Long getDiskSize() {
        return this.diskSize;
    }

    public FlussInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public FlussInstance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public FlussInstance setOrderState(String orderState) {
        this.orderState = orderState;
        return this;
    }
    public String getOrderState() {
        return this.orderState;
    }

    public FlussInstance setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public FlussInstance setResourceCreateTime(Long resourceCreateTime) {
        this.resourceCreateTime = resourceCreateTime;
        return this;
    }
    public Long getResourceCreateTime() {
        return this.resourceCreateTime;
    }

    public FlussInstance setResourceExpiredTime(Long resourceExpiredTime) {
        this.resourceExpiredTime = resourceExpiredTime;
        return this;
    }
    public Long getResourceExpiredTime() {
        return this.resourceExpiredTime;
    }

    public FlussInstance setTabletServerModel(String tabletServerModel) {
        this.tabletServerModel = tabletServerModel;
        return this;
    }
    public String getTabletServerModel() {
        return this.tabletServerModel;
    }

    public FlussInstance setTabletServerNum(Long tabletServerNum) {
        this.tabletServerNum = tabletServerNum;
        return this;
    }
    public Long getTabletServerNum() {
        return this.tabletServerNum;
    }

    public FlussInstance setTabletServerType(String tabletServerType) {
        this.tabletServerType = tabletServerType;
        return this;
    }
    public String getTabletServerType() {
        return this.tabletServerType;
    }

    public FlussInstance setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public FlussInstance setVSwitches(java.util.List<FlussVswitch> vSwitches) {
        this.vSwitches = vSwitches;
        return this;
    }
    public java.util.List<FlussVswitch> getVSwitches() {
        return this.vSwitches;
    }

    public FlussInstance setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
