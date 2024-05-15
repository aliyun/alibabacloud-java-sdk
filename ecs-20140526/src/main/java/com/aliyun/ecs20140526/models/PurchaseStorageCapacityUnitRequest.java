// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseStorageCapacityUnitRequest extends TeaModel {
    /**
     * <p>The number of SCUs that you want to purchase. Valid values: 1 to 20.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The capacity of the SCU. Unit: GiB. Valid values: 20, 40, 100, 200, 500, 1024, 2048, 5210, 10240, 20480, and 52100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Capacity")
    public Integer capacity;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique across requests. The `token` can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](https://help.aliyun.com/document_detail/25693.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the SCU. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The source of the request. The value is automatically set to OpenAPI and does not need to be changed. Default value: OpenAPI.</p>
     */
    @NameInMap("FromApp")
    public String fromApp;

    /**
     * <p>The name of the SCU. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The validity period of the SCU. Valid values:</p>
     * <br>
     * <p>*   Valid values when PeriodUnit is set to Month: 1, 2, 3, and 6.</p>
     * <p>*   Valid values when PeriodUnit is set to Year: 1, 3, and 5.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the validity period of the SCU. Valid values:</p>
     * <br>
     * <p>*   Month</p>
     * <p>*   Year</p>
     * <br>
     * <p>Default value: Month.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the region in which to purchase the SCU. The purchased SCU can offset the bills of pay-as-you-go disks that reside in the specified region. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The time at which the SCU takes effect. It can be up to six months later than the time at which the SCU is created. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is empty by default. If this parameter is left empty, the SCU takes effect immediately after it is created.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<PurchaseStorageCapacityUnitRequestTag> tag;

    public static PurchaseStorageCapacityUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        PurchaseStorageCapacityUnitRequest self = new PurchaseStorageCapacityUnitRequest();
        return TeaModel.build(map, self);
    }

    public PurchaseStorageCapacityUnitRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public PurchaseStorageCapacityUnitRequest setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }
    public Integer getCapacity() {
        return this.capacity;
    }

    public PurchaseStorageCapacityUnitRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PurchaseStorageCapacityUnitRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PurchaseStorageCapacityUnitRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public PurchaseStorageCapacityUnitRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PurchaseStorageCapacityUnitRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public PurchaseStorageCapacityUnitRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PurchaseStorageCapacityUnitRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public PurchaseStorageCapacityUnitRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public PurchaseStorageCapacityUnitRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PurchaseStorageCapacityUnitRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PurchaseStorageCapacityUnitRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public PurchaseStorageCapacityUnitRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public PurchaseStorageCapacityUnitRequest setTag(java.util.List<PurchaseStorageCapacityUnitRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<PurchaseStorageCapacityUnitRequestTag> getTag() {
        return this.tag;
    }

    public static class PurchaseStorageCapacityUnitRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the SCU. N is the identifier of the tag key that you specify. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. N is the identifier of the tag value that you specify and corresponds to the N in `Tag.N.Key`. Valid values: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with `acs:` or contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static PurchaseStorageCapacityUnitRequestTag build(java.util.Map<String, ?> map) throws Exception {
            PurchaseStorageCapacityUnitRequestTag self = new PurchaseStorageCapacityUnitRequestTag();
            return TeaModel.build(map, self);
        }

        public PurchaseStorageCapacityUnitRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PurchaseStorageCapacityUnitRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
