// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateStorageSetRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the storage set. The description must be 2 to 256 characters in length and cannot start with [http:// or https://](http://https://。).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum number of partitions supported by the storage set. The value must be greater than or equal to 2 but cannot exceed the quota that you obtained by calling the [DescribeAccountAttributes](~~73772~~) operation.</p>
     * <br>
     * <p>Default value: 2.</p>
     */
    @NameInMap("MaxPartitionNumber")
    public Integer maxPartitionNumber;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the storage set. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the storage set. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter and cannot start with [http:// or https:// ](http://https://。、（:）、（\_）（-）。).</p>
     */
    @NameInMap("StorageSetName")
    public String storageSetName;

    /**
     * <p>The zone ID of the storage set. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateStorageSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageSetRequest self = new CreateStorageSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateStorageSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStorageSetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateStorageSetRequest setMaxPartitionNumber(Integer maxPartitionNumber) {
        this.maxPartitionNumber = maxPartitionNumber;
        return this;
    }
    public Integer getMaxPartitionNumber() {
        return this.maxPartitionNumber;
    }

    public CreateStorageSetRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateStorageSetRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateStorageSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStorageSetRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateStorageSetRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateStorageSetRequest setStorageSetName(String storageSetName) {
        this.storageSetName = storageSetName;
        return this;
    }
    public String getStorageSetName() {
        return this.storageSetName;
    }

    public CreateStorageSetRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
