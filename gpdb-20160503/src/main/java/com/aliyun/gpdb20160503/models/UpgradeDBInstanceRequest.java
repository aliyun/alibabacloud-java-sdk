// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is no longer used.</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>This parameter is no longer used.</p>
     */
    @NameInMap("DBInstanceGroupCount")
    public String DBInstanceGroupCount;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBInstances](~~86911~~) operation to query the IDs of all AnalyticDB for PostgreSQL instances within a region.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The specifications of each compute node. For information about the supported specifications, see [Instance specifications](~~35406~~).</p>
     * <br>
     * <p>> This parameter is available only for instances in elastic storage mode.</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>The number of coordinator nodes. Valid values: 1 and 2.</p>
     * <br>
     * <p>> This parameter is available only for China site (aliyun.com).</p>
     */
    @NameInMap("MasterNodeNum")
    public String masterNodeNum;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is no longer used.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID of the instance.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~86912~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs. For information about how to obtain the ID of a resource group, see [View basic information of a resource group](~~151181~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The performance level of enhanced SSDs (ESSDs). Valid values:</p>
     * <br>
     * <p>*   **pl0**</p>
     * <p>*   **pl1**</p>
     * <p>*   **pl2**</p>
     */
    @NameInMap("SegDiskPerformanceLevel")
    public String segDiskPerformanceLevel;

    /**
     * <p>The number of compute nodes. The number of compute nodes varies based on the instance resource type and edition.</p>
     * <br>
     * <p>*   Valid values for High-availability Edition instances in elastic storage mode: 4 to 512, in 4 increments.</p>
     * <p>*   Valid values for High-performance Edition instances in elastic storage mode: 2 to 512, in 2 increments.</p>
     * <p>*   Valid values for instances in manual Serverless mode: 2 to 512, in 2 increments.</p>
     */
    @NameInMap("SegNodeNum")
    public String segNodeNum;

    /**
     * <p>The disk storage type of the instance after the change. The disk storage type can be changed only to ESSD. Set the value to **cloud_essd**.</p>
     */
    @NameInMap("SegStorageType")
    public String segStorageType;

    /**
     * <p>The storage capacity of each compute node. Unit: GB. Valid values: 50 to 6000, in 50 increments.</p>
     * <br>
     * <p>> This parameter is available only for instances in elastic storage mode.</p>
     */
    @NameInMap("StorageSize")
    public String storageSize;

    /**
     * <p>The type of the instance configuration change. Valid values:</p>
     * <br>
     * <p>*   **0** (default): changes the number of compute nodes.</p>
     * <p>*   **1**: changes the specifications and storage capacity of each compute node.</p>
     * <p>*   **2**: changes the number of coordinator nodes.</p>
     * <p>*   **3**: changes the disk storage type and ESSD performance level of the instance.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The supported changes to compute node configurations vary based on the instance resource type. For more information, see the "[Usage notes](~~50956~~)" section of the Change compute node configurations topic.</p>
     * <br>
     * <p>*   After you specify a change type, only the corresponding parameters take effect. For example, if you set **UpgradeType** to 0, the parameter that is used to change the number of compute nodes takes effect, but the parameter that is used to change the number of coordinator nodes does not.</p>
     * <p>*   The number of coordinator nodes can be changed only on the China site (aliyun.com).</p>
     * <p>*   The disk storage type can be changed only from ultra disks to ESSDs.</p>
     */
    @NameInMap("UpgradeType")
    public Long upgradeType;

    public static UpgradeDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceRequest self = new UpgradeDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public UpgradeDBInstanceRequest setDBInstanceGroupCount(String DBInstanceGroupCount) {
        this.DBInstanceGroupCount = DBInstanceGroupCount;
        return this;
    }
    public String getDBInstanceGroupCount() {
        return this.DBInstanceGroupCount;
    }

    public UpgradeDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBInstanceRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public UpgradeDBInstanceRequest setMasterNodeNum(String masterNodeNum) {
        this.masterNodeNum = masterNodeNum;
        return this;
    }
    public String getMasterNodeNum() {
        return this.masterNodeNum;
    }

    public UpgradeDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeDBInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public UpgradeDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpgradeDBInstanceRequest setSegDiskPerformanceLevel(String segDiskPerformanceLevel) {
        this.segDiskPerformanceLevel = segDiskPerformanceLevel;
        return this;
    }
    public String getSegDiskPerformanceLevel() {
        return this.segDiskPerformanceLevel;
    }

    public UpgradeDBInstanceRequest setSegNodeNum(String segNodeNum) {
        this.segNodeNum = segNodeNum;
        return this;
    }
    public String getSegNodeNum() {
        return this.segNodeNum;
    }

    public UpgradeDBInstanceRequest setSegStorageType(String segStorageType) {
        this.segStorageType = segStorageType;
        return this;
    }
    public String getSegStorageType() {
        return this.segStorageType;
    }

    public UpgradeDBInstanceRequest setStorageSize(String storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public String getStorageSize() {
        return this.storageSize;
    }

    public UpgradeDBInstanceRequest setUpgradeType(Long upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public Long getUpgradeType() {
        return this.upgradeType;
    }

}
