// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class FlussInstance extends TeaModel {
    @NameInMap("ClusterState")
    public ClusterState clusterState;

    /**
     * <p>The cluster status.</p>
     */
    @NameInMap("ClusterStatus")
    public String clusterStatus;

    /**
     * <p>The URL of the instance management console.</p>
     */
    @NameInMap("ConsoleUrl")
    public String consoleUrl;

    /**
     * <p>The disk size, in GB.</p>
     */
    @NameInMap("DiskSize")
    public Long diskSize;

    /**
     * <p>Specifies whether high availability (HA) is enabled.</p>
     */
    @NameInMap("Ha")
    public Boolean ha;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance name.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The order state.</p>
     */
    @NameInMap("OrderState")
    public String orderState;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The creation time of the resource, as a UNIX timestamp in milliseconds.</p>
     */
    @NameInMap("ResourceCreateTime")
    public Long resourceCreateTime;

    /**
     * <p>The expiration time of the resource, as a UNIX timestamp in milliseconds.</p>
     */
    @NameInMap("ResourceExpiredTime")
    public Long resourceExpiredTime;

    /**
     * <p>The tablet server model.</p>
     */
    @NameInMap("TabletServerModel")
    public String tabletServerModel;

    /**
     * <p>The number of tablet servers.</p>
     */
    @NameInMap("TabletServerNum")
    public Long tabletServerNum;

    /**
     * <p>The tablet server type.</p>
     */
    @NameInMap("TabletServerType")
    public String tabletServerType;

    /**
     * <p>The number of compute units (CUs) for post-tiering.</p>
     */
    @NameInMap("TieringPostCu")
    public Long tieringPostCu;

    /**
     * <p>The number of compute units (CUs) for pre-tiering.</p>
     */
    @NameInMap("TieringPreCu")
    public Long tieringPreCu;

    /**
     * <p>The Alibaba Cloud account ID (UID).</p>
     */
    @NameInMap("Uid")
    public String uid;

    /**
     * <p>The VSwitch details.</p>
     */
    @NameInMap("VSwitches")
    public java.util.List<FlussVswitch> vSwitches;

    /**
     * <p>The VPC ID.</p>
     */
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

    public FlussInstance setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
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

    public FlussInstance setTieringPostCu(Long tieringPostCu) {
        this.tieringPostCu = tieringPostCu;
        return this;
    }
    public Long getTieringPostCu() {
        return this.tieringPostCu;
    }

    public FlussInstance setTieringPreCu(Long tieringPreCu) {
        this.tieringPreCu = tieringPreCu;
        return this;
    }
    public Long getTieringPreCu() {
        return this.tieringPreCu;
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
