// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationsRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public DescribeCapacityReservationsRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><p>PostPaid: pay-as-you-go.</p>
     * </li>
     * <li><p>PrePaid: subscription.</p>
     * </li>
     * </ul>
     * <p>Default value: PostPaid.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance type. You can use this parameter to query only active capacity reservations. To query released capacity reservations, you must specify <code>PrivatePoolOptions.Ids</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set the value to the <code>NextToken</code> value returned in the previous call to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The operating system of the instance. Valid values:</p>
     * <ul>
     * <li><p>windows: Returns only capacity reservations for Windows.</p>
     * </li>
     * <li><p>linux: Returns only capacity reservations for Linux.</p>
     * </li>
     * <li><p>all: Returns all capacity reservations.</p>
     * </li>
     * </ul>
     * <p>Default value: all.</p>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The region ID of the capacity reservation. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. When you use this parameter to filter resources, the operation returns a maximum of 1,000 resources.</p>
     * <blockquote>
     * <p>Filtering by the default resource group is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the capacity reservation. Valid values:</p>
     * <ul>
     * <li><p>All: all statuses.</p>
     * </li>
     * <li><p>Pending: The capacity reservation is initializing. This is the initial status of a scheduled capacity reservation.</p>
     * </li>
     * <li><p>Preparing: The system is preparing resources for the scheduled capacity reservation.</p>
     * </li>
     * <li><p>Prepared: The resources are prepared, and the scheduled capacity reservation is waiting to take effect.</p>
     * </li>
     * <li><p>Active: The capacity reservation is active.</p>
     * </li>
     * <li><p>Released: The capacity reservation is released, either manually or automatically upon expiration.</p>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter, the operation returns capacity reservations in all states except <code>Pending</code> and <code>Released</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags attached to the capacity reservations.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeCapacityReservationsRequestTag> tag;

    /**
     * <p>The zone ID of the capacity reservation.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeCapacityReservationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationsRequest self = new DescribeCapacityReservationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationsRequest setPrivatePoolOptions(DescribeCapacityReservationsRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public DescribeCapacityReservationsRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public DescribeCapacityReservationsRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeCapacityReservationsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeCapacityReservationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCapacityReservationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCapacityReservationsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCapacityReservationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCapacityReservationsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public DescribeCapacityReservationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCapacityReservationsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeCapacityReservationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCapacityReservationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCapacityReservationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeCapacityReservationsRequest setTag(java.util.List<DescribeCapacityReservationsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeCapacityReservationsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeCapacityReservationsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeCapacityReservationsRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The IDs of the capacity reservations. The value can be a JSON array that consists of up to 100 capacity reservation IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;crp-bp1gubrkqutenqdd****&quot;, &quot;crp-bp67acfmxazb5****&quot;]</p>
         */
        @NameInMap("Ids")
        public String ids;

        public static DescribeCapacityReservationsRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsRequestPrivatePoolOptions self = new DescribeCapacityReservationsRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsRequestPrivatePoolOptions setIds(String ids) {
            this.ids = ids;
            return this;
        }
        public String getIds() {
            return this.ids;
        }

    }

    public static class DescribeCapacityReservationsRequestTag extends TeaModel {
        /**
         * <p>The key of the Nth tag. You can specify up to 20 tags.</p>
         * <p>A maximum of 1,000 resources that match the specified tags can be returned. If you specify multiple tags, only resources that have all of these tags are returned. If the number of matching resources exceeds 1,000, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query the resources.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the Nth tag. You can specify up to 20 tags.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCapacityReservationsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapacityReservationsRequestTag self = new DescribeCapacityReservationsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeCapacityReservationsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCapacityReservationsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
