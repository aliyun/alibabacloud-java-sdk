// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("DBInstanceGroupCount")
    public String DBInstanceGroupCount;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-rj***************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The specifications of each compute node. For information about the supported specifications, see <a href="https://help.aliyun.com/document_detail/35406.html">Instance specifications</a>.</p>
     * <blockquote>
     * <p>This parameter is available only for instances in elastic storage mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4C16G</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MasterNodeNum")
    public String masterNodeNum;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is no longer used.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID of the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs. For information about how to obtain the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The performance level of enhanced SSDs (ESSDs). Valid values:</p>
     * <ul>
     * <li><strong>pl0</strong></li>
     * <li><strong>pl1</strong></li>
     * <li><strong>pl2</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pl1</p>
     */
    @NameInMap("SegDiskPerformanceLevel")
    public String segDiskPerformanceLevel;

    /**
     * <p>The number of compute nodes. The number of compute nodes varies based on the instance resource type and edition.</p>
     * <ul>
     * <li>Valid values for High-availability Edition instances in elastic storage mode: 4 to 512, in 4 increments.</li>
     * <li>Valid values for High-performance Edition instances in elastic storage mode: 2 to 512, in 2 increments.</li>
     * <li>Valid values for instances in manual Serverless mode: 2 to 512, in 2 increments.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SegNodeNum")
    public String segNodeNum;

    /**
     * <p>The disk storage type of the instance after the change. The disk storage type can be changed only to ESSD. Set the value to <strong>cloud_essd</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("SegStorageType")
    public String segStorageType;

    /**
     * <p>The storage capacity of each compute node. Unit: GB. Valid values: 50 to 6000, in 50 increments.</p>
     * <blockquote>
     * <p> This parameter is available only for instances in elastic storage mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StorageSize")
    public String storageSize;

    /**
     * <p>The type of the instance configuration change. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): changes the number of compute nodes.</li>
     * <li><strong>1</strong>: changes the specifications and storage capacity of each compute node.</li>
     * <li><strong>2</strong>: changes the number of coordinator nodes.</li>
     * <li><strong>3</strong>: changes the disk storage type and ESSD performance level of the instance.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The supported changes to compute node configurations vary based on the instance resource type. For more information, see the &quot;<a href="https://help.aliyun.com/document_detail/50956.html">Usage notes</a>&quot; section of the Change compute node configurations topic.</p>
     * </li>
     * <li><p>After you specify a change type, only the corresponding parameters take effect. For example, if you set <strong>UpgradeType</strong> to 0, the parameter that is used to change the number of compute nodes takes effect, but the parameter that is used to change the number of coordinator nodes does not.</p>
     * </li>
     * <li><p>The number of coordinator nodes can be changed only on the China site (aliyun.com).</p>
     * </li>
     * <li><p>The disk storage type can be changed only from ultra disks to ESSDs.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
