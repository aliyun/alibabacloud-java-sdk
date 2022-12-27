// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationsRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public DescribeCapacityReservationsRequestPrivatePoolOptions privatePoolOptions;

    // The billing method of instances to be created by using the capacity reservation. Valid values:
    // 
    // *   PostPaid: pay-as-you-go
    // *   PrePaid: subscription
    // 
    // Default value: PostPaid.
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // The instance type.
    @NameInMap("InstanceType")
    public String instanceType;

    // The maximum number of entries to return on each page.
    // 
    // Maximum value: 100.
    // 
    // Default value: 10.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token used to start the next query. Set the value to the NextToken value obtained from the response to the previous request.
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The operating system type of instances to be created by using the capacity reservation. Valid values:
    // 
    // *   windows: Windows operating systems
    // *   linux: Linux operating systems
    // *   all: all operating system types
    // 
    // Default value: all.
    @NameInMap("Platform")
    public String platform;

    // The region ID of the capacity reservation. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group to which the capacity reservation belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.  
    // 
    // >  Resources in the default resource group are displayed in the response regardless of how this parameter is set.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The state of the capacity reservation. Valid values:
    // 
    // *   All: All states.
    // *   Pending: The capacity reservation is being initialized. Scheduled capacity reservations enter the Pending state after they are created.
    // *   Preparing: The capacity reservation is being prepared. Scheduled capacity reservations are in the Preparing state while resources are being provisioned.
    // *   Prepared: The capacity reservation is to take effect. After resources are provisioned, scheduled capacity reservations remain in the Prepared state until they take effect.
    // *   Active: The capacity reservation is in effect.
    // *   Released: The capacity reservation has been released manually or automatically when it expired.
    // 
    // Default value: Active.
    @NameInMap("Status")
    public String status;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<DescribeCapacityReservationsRequestTag> tag;

    // The zone ID of the capacity reservation.
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
        // The IDs of capacity reservations. The value can be a JSON array that consists of up to 100 capacity reservation IDs. Separate the IDs with commas (,).
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
        // The key of tag N of the capacity reservation. Valid values of N: 1 to 20.
        // 
        // If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the capacity reservation. Valid values of N: 1 to 20.
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
