// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesOverviewRequest extends TeaModel {
    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription.</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The database engine version of the instance. Valid values: <strong>5.0</strong>, <strong>4.4</strong>, <strong>4.2</strong>, <strong>4.0</strong>, and <strong>3.4</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The instance type. For more information about the instance types of different architectures, see the following topics:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/311407.html">Standalone instance types</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/311410.html">Replica set instance types</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a></li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>You do not need to specify this parameter for serverless instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dds.mongo.2xlarge</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The IDs of the instances whose overview information you want to query.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not specify this parameter, the overview information of all instances within the current Alibaba Cloud account is queried by default.</li>
     * <li>You can specify multiple instance IDs. Separate multiple instance IDs with commas (,).</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dds-bp12c5b040dc****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The status of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/63870.html">Instance statuses</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The architecture of the instance. Valid values: </p>
     * <ul>
     * <li><strong>sharding</strong>: sharded cluster instance.</li>
     * <li><strong>replicate</strong>: replica set or standalone instance.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li><strong>serverless</strong>: serverless instance.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Specify this parameter based on your business requirements. For example, if you want to query the overview information of sharded cluster instances, set this parameter to <strong>sharding</strong>.</li>
     * <li>If you do not specify this parameter, the overview information of all instances is queried by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>replicate</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Classic</strong>: classic network.</li>
     * <li><strong>VPC</strong>: VPC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Classic</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query available regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information of a resource group</a>.</p>
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
     * <p>Specifies whether the instance tag label is displayed. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowTags")
    public Boolean showTags;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDBInstancesOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesOverviewRequest self = new DescribeDBInstancesOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesOverviewRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeDBInstancesOverviewRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeDBInstancesOverviewRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public DescribeDBInstancesOverviewRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeDBInstancesOverviewRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeDBInstancesOverviewRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeDBInstancesOverviewRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeDBInstancesOverviewRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBInstancesOverviewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstancesOverviewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesOverviewRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBInstancesOverviewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBInstancesOverviewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstancesOverviewRequest setShowTags(Boolean showTags) {
        this.showTags = showTags;
        return this;
    }
    public Boolean getShowTags() {
        return this.showTags;
    }

    public DescribeDBInstancesOverviewRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDBInstancesOverviewRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeDBInstancesOverviewRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
