// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesRequest extends TeaModel {
    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The endpoint of the node. You can call the <a href="https://help.aliyun.com/document_detail/62010.html">DescribeDBInstanceAttribute</a> operation to query the endpoint of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1ea17b41abecf43****.mongodb.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionDomain")
    public String connectionDomain;

    /**
     * <p>The instance type. For more information about valid values, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>dds.mongo.mid</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The name of the instance. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must start with a letter.</li>
     * <li>It can contain digits, letters, underscores (_), and hyphens (-).</li>
     * <li>It must be 2 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Test database</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp199659b178****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The state of the instance. For more information about valid values, see <a href="https://help.aliyun.com/document_detail/63870.html">Instance states</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBInstanceStatus")
    public String DBInstanceStatus;

    /**
     * <p>The architecture of the instance. Valid values:</p>
     * <ul>
     * <li><strong>sharding</strong>: sharded cluster instance</li>
     * <li><strong>replicate</strong>: replica set or standalone instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sharding</p>
     */
    @NameInMap("DBInstanceType")
    public String DBInstanceType;

    /**
     * <p>The type of the node in the instance. This parameter is used to filter standard or test instance.</p>
     * <ol>
     * <li>Valid value for a standalone or DBFS instance.</li>
     * <li>Valid value for a standard instance that comes in the replica set or sharded cluster architecture: standard</li>
     * <li>Valid value when all instances are displayed: default</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DBNodeType")
    public String DBNodeType;

    /**
     * <p>The database engine of the instance. Set the value to <strong>MongoDB</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance.</p>
     * <ul>
     * <li><strong>6.0</strong></li>
     * <li><strong>5.0</strong></li>
     * <li><strong>4.4</strong></li>
     * <li><strong>4.2</strong></li>
     * <li><strong>4.0</strong></li>
     * <li><strong>3.4</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The time when the instance expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-26T16:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Specifies whether the instance has expired. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Classic</strong></li>
     * <li><strong>VPC</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. The value of this parameter must be an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of nodes in the replica set instance. Valid values:</p>
     * <ul>
     * <li><strong>3</strong></li>
     * <li><strong>5</strong></li>
     * <li><strong>7</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags of the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDBInstancesRequestTag> tag;

    /**
     * <p>The vSwitch ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1vj604nj5a9zz74****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1n3i15v90el48nx****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent zone list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDBInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesRequest self = new DescribeDBInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeDBInstancesRequest setConnectionDomain(String connectionDomain) {
        this.connectionDomain = connectionDomain;
        return this;
    }
    public String getConnectionDomain() {
        return this.connectionDomain;
    }

    public DescribeDBInstancesRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public DescribeDBInstancesRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public DescribeDBInstancesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstancesRequest setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
        return this;
    }
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    public DescribeDBInstancesRequest setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
        return this;
    }
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    public DescribeDBInstancesRequest setDBNodeType(String DBNodeType) {
        this.DBNodeType = DBNodeType;
        return this;
    }
    public String getDBNodeType() {
        return this.DBNodeType;
    }

    public DescribeDBInstancesRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBInstancesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeDBInstancesRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDBInstancesRequest setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeDBInstancesRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeDBInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesRequest setReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }
    public String getReplicationFactor() {
        return this.replicationFactor;
    }

    public DescribeDBInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstancesRequest setTag(java.util.List<DescribeDBInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDBInstancesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeDBInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDBInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeDBInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeDBInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
         * <ul>
         * <li>The key cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</li>
         * <li>It can be up to 64 characters in length.</li>
         * <li>It cannot be an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testdatabase</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
         * <ul>
         * <li>The value cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</li>
         * <li>The value can be up to 128 characters in length.</li>
         * <li>It can be an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>apitest</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesRequestTag self = new DescribeDBInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
