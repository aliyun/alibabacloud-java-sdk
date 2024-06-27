// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    /**
     * <p>The queried instances.</p>
     */
    @NameInMap("Items")
    public DescribeDBInstancesResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>53EA07B7-FC2A-521B-AB7C-27**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponseBody self = new DescribeDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesResponseBody setItems(DescribeDBInstancesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstancesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * 
         * <strong>example:</strong>
         * <p>test-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag self = new DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstancesResponseBodyItemsDBInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag> tag;

        public static DescribeDBInstancesResponseBodyItemsDBInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItemsDBInstanceTags self = new DescribeDBInstancesResponseBodyItemsDBInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItemsDBInstanceTags setTag(java.util.List<DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyItemsDBInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBInstancesResponseBodyItemsDBInstance extends TeaModel {
        /**
         * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86910.html">DescribeDBInstanceAttribute</a> operation to query the access mode of an instance.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ConnectionMode")
        public String connectionMode;

        /**
         * <p>The time when the instance was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-09T04:54:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The edition of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong>: Basic Edition.</li>
         * <li><strong>HighAvailability</strong>: High-availability Edition.</li>
         * <li><strong>Finance</strong>: Enterprise Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HighAvailability</p>
         */
        @NameInMap("DBInstanceCategory")
        public String DBInstanceCategory;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The resource type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Serverless</strong>: Serverless mode.</li>
         * <li><strong>StorageElastic</strong>: elastic storage mode.</li>
         * <li><strong>Classic</strong>: reserved storage mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StorageElastic</p>
         */
        @NameInMap("DBInstanceMode")
        public String DBInstanceMode;

        /**
         * <p>The type of the network interface card (NIC) that is used by the instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Internet.</li>
         * <li><strong>1</strong>: internal network.</li>
         * <li><strong>2</strong>: VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        /**
         * <p>The status of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/86944.html">Instance statuses</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The database engine of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gpdb</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>6.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The expiration time of the instance. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> The expiration time of a pay-as-you-go instance is <code>2999-09-08T16:00:00Z</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2999-09-08T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The resource type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>cluster</strong>: Serverless mode or elastic storage mode.</li>
         * <li><strong>replicaSet</strong>: reserved storage mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("InstanceDeployType")
        public String instanceDeployType;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Classic</strong>: classic network.</li>
         * <li><strong>VPC</strong>: VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        /**
         * <p>The lock mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Unlock</strong>: The instance is not locked.</li>
         * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
         * <li><strong>LockByExpiration</strong>: The instance is automatically locked due to instance expiration.</li>
         * <li><strong>LockByRestoration</strong>: The instance is automatically locked due to instance restoration.</li>
         * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked due to exhausted storage.</li>
         * <li><strong>LockReadInstanceByDiskQuota</strong>: The instance is a read-only instance and is automatically locked when the disk space is full.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The reason why the instance is locked. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The instance is not locked.</li>
         * <li><strong>1</strong>: The instance is manually locked.</li>
         * <li><strong>2</strong>: The instance is automatically locked due to instance expiration.</li>
         * <li><strong>3</strong>: The instance is automatically locked due to instance restoration.</li>
         * <li><strong>4</strong>: The instance is automatically locked due to exhausted storage.</li>
         * </ul>
         * <blockquote>
         * <p> If the instance is in reserved storage mode and is not locked, null is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The number of coordinator nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MasterNodeNum")
        public Integer masterNodeNum;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("ProdType")
        public String prodType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The number of compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("SegNodeNum")
        public String segNodeNum;

        /**
         * <p>The type of the Serverless mode. Valid values:</p>
         * <ul>
         * <li><strong>Manual</strong>: manual scheduling.</li>
         * <li><strong>Auto</strong>: automatic scheduling.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for instances in Serverless mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("ServerlessMode")
        public String serverlessMode;

        /**
         * <p>The storage capacity of the instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("StorageSize")
        public String storageSize;

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>cloud_essd</strong>: enhanced SSD (ESSD).</li>
         * <li><strong>cloud_efficiency</strong>: ultra disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The tags that are added to the instance.</p>
         */
        @NameInMap("Tags")
        public DescribeDBInstancesResponseBodyItemsDBInstanceTags tags;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1cpq8mr64paltkb****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp19ame5m1r3oejns****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstancesResponseBodyItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItemsDBInstance self = new DescribeDBInstancesResponseBodyItemsDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceCategory(String DBInstanceCategory) {
            this.DBInstanceCategory = DBInstanceCategory;
            return this;
        }
        public String getDBInstanceCategory() {
            return this.DBInstanceCategory;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceMode(String DBInstanceMode) {
            this.DBInstanceMode = DBInstanceMode;
            return this;
        }
        public String getDBInstanceMode() {
            return this.DBInstanceMode;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setInstanceDeployType(String instanceDeployType) {
            this.instanceDeployType = instanceDeployType;
            return this;
        }
        public String getInstanceDeployType() {
            return this.instanceDeployType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setMasterNodeNum(Integer masterNodeNum) {
            this.masterNodeNum = masterNodeNum;
            return this;
        }
        public Integer getMasterNodeNum() {
            return this.masterNodeNum;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setProdType(String prodType) {
            this.prodType = prodType;
            return this;
        }
        public String getProdType() {
            return this.prodType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setSegNodeNum(String segNodeNum) {
            this.segNodeNum = segNodeNum;
            return this;
        }
        public String getSegNodeNum() {
            return this.segNodeNum;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setServerlessMode(String serverlessMode) {
            this.serverlessMode = serverlessMode;
            return this;
        }
        public String getServerlessMode() {
            return this.serverlessMode;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setStorageSize(String storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public String getStorageSize() {
            return this.storageSize;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setTags(DescribeDBInstancesResponseBodyItemsDBInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBInstancesResponseBodyItemsDBInstanceTags getTags() {
            return this.tags;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstancesResponseBodyItemsDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstancesResponseBodyItems extends TeaModel {
        @NameInMap("DBInstance")
        public java.util.List<DescribeDBInstancesResponseBodyItemsDBInstance> DBInstance;

        public static DescribeDBInstancesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItems self = new DescribeDBInstancesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItems setDBInstance(java.util.List<DescribeDBInstancesResponseBodyItemsDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyItemsDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
