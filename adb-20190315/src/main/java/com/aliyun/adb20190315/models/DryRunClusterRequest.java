// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DryRunClusterRequest extends TeaModel {
    /**
     * <p>The specifications of computing resources.</p>
     * <br>
     * <p>> You can call the [DescribeComputeResource](~~469002~~) operation to query the specifications of computing resources.</p>
     */
    @NameInMap("ComputeResource")
    public String computeResource;

    /**
     * <p>The description of the cluster.</p>
     * <br>
     * <p>*   The description cannot start with `http://` or `https://`.</p>
     * <p>*   The description must be 2 to 256 characters in length</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <br>
     * <p>*   You can leave this parameter empty when you set Operation to **Buy**.</p>
     * <p>*   This parameter must be specified when you set Operation to **Modify**.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The network type of the cluster. Set the value to **VPC**.</p>
     */
    @NameInMap("DBClusterNetworkType")
    public String DBClusterNetworkType;

    /**
     * <p>The version of the AnalyticDB for MySQL Data Warehouse Edition cluster. Set the value to **3.0**.</p>
     */
    @NameInMap("DBClusterVersion")
    public String DBClusterVersion;

    /**
     * <p>Specifies whether to enable the default resource group.</p>
     * <br>
     * <p>> If you leave this parameter empty, true is used.</p>
     */
    @NameInMap("EnableDefaultResourcePool")
    public Boolean enableDefaultResourcePool;

    /**
     * <p>The type of the operation. Valid values:</p>
     * <br>
     * <p>*   **Buy**: purchases a cluster.</p>
     * <p>*   **Modify**: changes configurations of a cluster.</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The billing method of the cluster. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go.</p>
     * <p>*   **Prepaid**: subscription.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription type of the subscription cluster. Valid values:</p>
     * <br>
     * <p>*   **Year**: subscription on a yearly basis.</p>
     * <p>*   **Month**: subscription on a monthly basis.</p>
     * <br>
     * <p>> This parameter must be specified when PayType is set to Prepaid.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The amount of reserved storage resources.</p>
     */
    @NameInMap("StorageResource")
    public String storageResource;

    /**
     * <p>The subscription duration of the subscription cluster.</p>
     * <br>
     * <p>*   Valid values when Period is set to Year: 1, 2, 3, and 5 (integer).</p>
     * <p>*   Valid values when Period is set to Month: 1 to 11 (integer).</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when PayType is set to Prepaid.</p>
     * <br>
     * <p>*   Longer subscription durations offer more savings. Purchasing a cluster for one year is more cost-effective than purchasing the cluster for 10 or 11 months.</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The virtual private cloud (VPC) ID of the cluster.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the cluster.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~143074~~) operation to query the most recent zone list.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DryRunClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DryRunClusterRequest self = new DryRunClusterRequest();
        return TeaModel.build(map, self);
    }

    public DryRunClusterRequest setComputeResource(String computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public String getComputeResource() {
        return this.computeResource;
    }

    public DryRunClusterRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DryRunClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DryRunClusterRequest setDBClusterNetworkType(String DBClusterNetworkType) {
        this.DBClusterNetworkType = DBClusterNetworkType;
        return this;
    }
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    public DryRunClusterRequest setDBClusterVersion(String DBClusterVersion) {
        this.DBClusterVersion = DBClusterVersion;
        return this;
    }
    public String getDBClusterVersion() {
        return this.DBClusterVersion;
    }

    public DryRunClusterRequest setEnableDefaultResourcePool(Boolean enableDefaultResourcePool) {
        this.enableDefaultResourcePool = enableDefaultResourcePool;
        return this;
    }
    public Boolean getEnableDefaultResourcePool() {
        return this.enableDefaultResourcePool;
    }

    public DryRunClusterRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public DryRunClusterRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DryRunClusterRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DryRunClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DryRunClusterRequest setStorageResource(String storageResource) {
        this.storageResource = storageResource;
        return this;
    }
    public String getStorageResource() {
        return this.storageResource;
    }

    public DryRunClusterRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public DryRunClusterRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DryRunClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DryRunClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
