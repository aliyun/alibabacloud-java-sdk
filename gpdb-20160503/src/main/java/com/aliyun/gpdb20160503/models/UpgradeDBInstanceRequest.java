// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceRequest extends TeaModel {
    /**
     * <p>The Serverless cache storage capacity. Unit: GB.</p>
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
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("DBInstanceGroupCount")
    public String DBInstanceGroupCount;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a specific region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-rj***************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The effective period. Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong> (default): The change takes effect immediately.</li>
     * <li><strong>MaintainTime</strong>: The change takes effect during the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediate</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The specifications of segment nodes. For information about supported node specifications, see <a href="https://help.aliyun.com/document_detail/35406.html">Instance specifications</a>.</p>
     * <blockquote>
     * <p>This parameter is supported only for elastic storage mode instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4C16G</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MasterNodeNum")
    public String masterNodeNum;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. You do not need to specify this parameter.</p>
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
     * <p>The ID of the resource group to which the instance belongs. For information about how to obtain the resource group ID, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The performance level (PL) of the disk. Valid values:</p>
     * <ul>
     * <li><strong>pl0</strong>: PL0.</li>
     * <li><strong>pl1</strong>: PL1.</li>
     * <li><strong>pl2</strong>: PL2.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pl1</p>
     */
    @NameInMap("SegDiskPerformanceLevel")
    public String segDiskPerformanceLevel;

    /**
     * <p>The number of segment nodes. The supported number of nodes varies based on the instance resource type and instance edition:</p>
     * <ul>
     * <li>Elastic storage mode, high-availability edition: valid values are 4 to 512, in increments of 4.</li>
     * <li>Elastic storage mode, &lt;props=&quot;china&quot;&gt;basic edition (formerly high-performance edition)&lt;props=&quot;intl&quot;&gt;high-performance edition: valid values are 2 to 512, in increments of 2.</li>
     * <li>Serverless manual scheduling mode: valid values are 2 to 512, in increments of 2.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SegNodeNum")
    public String segNodeNum;

    /**
     * <p>The cloud disk storage type after the change. Currently, only ESSD cloud disks are supported. Set the value to <strong>cloud_essd</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("SegStorageType")
    public String segStorageType;

    /**
     * <ul>
     * <li><p>Serverless instances:
     * The compute resource threshold. Valid values: 8 to 32, in increments of 8. Unit: ACU. Default value: 32.</p>
     * </li>
     * <li><p>Serverless Pro instances: The reserved compute resources. Valid values: 16 to 1024. Unit: ACU. Default value: 16. The increment rules are as follows:</p>
     * <ul>
     * <li>Range 16 to 32: increments of 4.</li>
     * <li>Range 32 to 64: increments of 8.</li>
     * <li>Range 64 to 128: increments of 16.</li>
     * <li>Range 128 to 256: increments of 32.</li>
     * <li>Range greater than 256: increments of 64.<blockquote>
     * <p>This parameter is required only for Serverless automatic scheduling mode and Serverless Pro instances.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("ServerlessResource")
    public String serverlessResource;

    /**
     * <p>The storage capacity of segment nodes. Unit: GB. Valid values: 50 to &lt;props=&quot;china&quot;&gt;8000&lt;props=&quot;intl&quot;&gt;6000, in increments of 50.</p>
     * <blockquote>
     * <p>This parameter is supported only for elastic storage mode instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StorageSize")
    public String storageSize;

    /**
     * <p>The type of the specification change. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): Changes the number of segment nodes. SegNodeNum is required. Other parameters do not take effect.</li>
     * <li><strong>1</strong>: Changes the segment node specifications and instance storage capacity. InstanceSpec is required. StorageSize is optional and must be greater than or equal to the current instance storage capacity.</li>
     * <li><strong>2</strong>: Changes the number of master nodes. MasterNodeNum is required. Other parameters do not take effect.</li>
     * <li><strong>3</strong>: Changes the cloud disk storage type and performance level (PL). SegDiskPerformanceLevel and SegStorageType are required. Other parameters do not take effect.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Different instance resource types support different Upgrade/Downgrade operations for compute nodes. For more information, see <a href="https://help.aliyun.com/document_detail/50956.html">Precautions</a>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>After you select a specification change type, only the corresponding parameters take effect. Other parameters do not take effect. For example, if <strong>UpgradeType</strong> is set to 0 and you specify both the number of segment nodes and the number of master nodes, only the number of segment nodes is changed.</li>
     * <li>Changing the number of master nodes is supported only on the China site (aliyun.com).</li>
     * <li>You can change the cloud disk storage type only from standard SSD to ESSD cloud disk.</li>
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

    public UpgradeDBInstanceRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
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
