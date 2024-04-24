// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationsRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public DescribeCapacityReservationsRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   PostPaid: pay-as-you-go.</p>
     * <p>*   PrePaid: subscription.</p>
     * <br>
     * <p>Default value: PostPaid.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance type.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of the NextToken parameter.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The operating system of the instance. Valid values:</p>
     * <br>
     * <p>*   windows: Windows operating systems.</p>
     * <p>*   linux: Linux operating systems.</p>
     * <p>*   all: all operating system types.</p>
     * <br>
     * <p>Default value: all.</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The region ID of the capacity reservation. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the capacity reservation belongs. If you specify this parameter to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
     * <br>
     * <p>> Resources in the default resource group are displayed in the response regardless of whether you specify this parameter.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The state of the capacity reservation. Valid values:</p>
     * <br>
     * <p>*   All: All states.</p>
     * <p>*   Pending: The capacity reservation is being initialized. Scheduled capacity reservations enter the Pending state after they are created.</p>
     * <p>*   Preparing: The capacity reservation is being prepared. Scheduled capacity reservations are in the Preparing state while resources are being provisioned.</p>
     * <p>*   Prepared: The capacity reservation is to take effect. After resources are provisioned, scheduled capacity reservations remain in the Prepared state until they take effect.</p>
     * <p>*   Active: The capacity reservation is in effect.</p>
     * <p>*   Released: The capacity reservation has been released manually or automatically when it expired.</p>
     * <br>
     * <p>Default value: Active.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeCapacityReservationsRequestTag> tag;

    /**
     * <p>The zone ID of the capacity reservation.</p>
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
         * <p>The IDs of capacity reservations. The value can be a JSON array that consists of up to 100 capacity reservation IDs. Separate the IDs with commas (,).</p>
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
         * <p>The key of tag N. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>If you specify a single tag to query resources, up to 1,000 resources with this tag are returned in the response. If you specify multiple tags to query resources, up to 1,000 resources with all these tags are returned in the response. To query more than 1,000 resources with the specified tags, call the [ListTagResources](~~110425~~) operation.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. Valid values of N: 1 to 20.</p>
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
