// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceRequest extends TeaModel {
    /**
     * <p>Specifies the cache storage for Serverless Pro instances. Unit: GB.</p>
     * <blockquote>
     * <p>This parameter is required only for Serverless Pro instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("CacheStorageSize")
    public String cacheStorageSize;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("DBInstanceGroupCount")
    public String DBInstanceGroupCount;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in the specified region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-rj***************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The specifications of segment nodes. For supported node specifications, see <a href="https://help.aliyun.com/document_detail/35406.html">Instance types</a>.</p>
     * <blockquote>
     * <p>This parameter is available only for instances in storage-elastic mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4C16G</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>The number of master nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MasterNodeNum")
    public String masterNodeNum;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs. To obtain the resource group ID, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The performance level (PL) of the disk. Valid values:</p>
     * <ul>
     * <li><p><strong>pl0</strong>: PL0.</p>
     * </li>
     * <li><p><strong>pl1</strong>: PL1.</p>
     * </li>
     * <li><p><strong>pl2</strong>: PL2.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pl1</p>
     */
    @NameInMap("SegDiskPerformanceLevel")
    public String segDiskPerformanceLevel;

    /**
     * <p>The number of segment nodes. The supported number of nodes varies based on the instance resource type and edition:</p>
     * <ul>
     * <li><p>Instances in storage-elastic mode (High-availability Edition): 4 to 512, in increments of 4.</p>
     * </li>
     * <li><p>Instances in storage-elastic mode (High-performance Edition): 2 to 512, in increments of 2.</p>
     * </li>
     * <li><p>Instances in Serverless manual-scheduling mode: 2 to 512, in increments of 2.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SegNodeNum")
    public String segNodeNum;

    /**
     * <p>The new disk storage type. You can only upgrade to an ESSD cloud disk. To do so, set this parameter to <strong>cloud_essd</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("SegStorageType")
    public String segStorageType;

    /**
     * <ul>
     * <li><p>For an instance in Serverless automatic-scheduling mode, this parameter specifies the computing resource threshold. The value must be a multiple of 8 in the range of 8 to 32. Unit: ACU. Default value: 32.</p>
     * </li>
     * <li><p>For a Serverless Pro instance, this parameter specifies the reserved computing resources. Valid values range from 16 to 1,024. Unit: ACU. Default value: 16. Increment rules:</p>
     * <ul>
     * <li><p>16 to 32: in increments of 4.</p>
     * </li>
     * <li><p>32 to 64: in increments of 8.</p>
     * </li>
     * <li><p>64 to 128: in increments of 16.</p>
     * </li>
     * <li><p>128 to 256: in increments of 32.</p>
     * </li>
     * <li><p>Greater than 256: in increments of 64.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required only for instances in Serverless automatic-scheduling mode and Serverless Pro instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("ServerlessResource")
    public String serverlessResource;

    /**
     * <p>The storage capacity of each segment node. Unit: GB. The value must be a multiple of 50 in the range of 50 to &lt;props=&quot;china&quot;&gt;8,000&lt;props=&quot;intl&quot;&gt;6,000.</p>
     * <blockquote>
     * <p>This parameter is available only for instances in storage-elastic mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StorageSize")
    public String storageSize;

    /**
     * <p>The type of specification change. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong> (default): Changes the number of segment nodes. The SegNodeNum parameter is required, and other parameters are ignored.</p>
     * </li>
     * <li><p><strong>1</strong>: Changes the specifications and storage capacity of segment nodes. The InstanceSpec parameter is required. The StorageSize parameter is optional. If specified, its value must be greater than or equal to the current storage capacity of the instance.</p>
     * </li>
     * <li><p><strong>2</strong>: Changes the number of master nodes. The MasterNodeNum parameter is required, and other parameters are ignored.</p>
     * </li>
     * <li><p><strong>3</strong>: Changes the disk storage type and performance level. The SegDiskPerformanceLevel and SegStorageType parameters are required, and other parameters are ignored.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Support for scaling computing resources varies by instance resource type. For more information, see <a href="https://help.aliyun.com/document_detail/50956.html">Usage notes</a>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li><p>If you select a change type, only the parameters associated with that type take effect; other parameters are ignored. For example, if you set <strong>UpgradeType</strong> to 0 and specify parameters to change both the number of segment nodes and the number of master nodes, only the parameters for changing the number of segment nodes take effect.</p>
     * </li>
     * <li><p>You can change the number of master nodes only on the Alibaba Cloud China site.</p>
     * </li>
     * <li><p>You can change the disk storage type only from ultra disk to ESSD cloud disk.</p>
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

    public UpgradeDBInstanceRequest setCacheStorageSize(String cacheStorageSize) {
        this.cacheStorageSize = cacheStorageSize;
        return this;
    }
    public String getCacheStorageSize() {
        return this.cacheStorageSize;
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

    public UpgradeDBInstanceRequest setServerlessResource(String serverlessResource) {
        this.serverlessResource = serverlessResource;
        return this;
    }
    public String getServerlessResource() {
        return this.serverlessResource;
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
