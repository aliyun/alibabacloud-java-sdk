// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiskReplicaPairRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DiskId")
    public String diskId;

    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    @NameInMap("DestinationDiskId")
    public String destinationDiskId;

    @NameInMap("PairName")
    public String pairName;

    @NameInMap("Description")
    public String description;

    @NameInMap("AsyncCycle")
    public Integer asyncCycle;

    public static CreateDiskReplicaPairRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskReplicaPairRequest self = new CreateDiskReplicaPairRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiskReplicaPairRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDiskReplicaPairRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDiskReplicaPairRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDiskReplicaPairRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDiskReplicaPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDiskReplicaPairRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public CreateDiskReplicaPairRequest setDestinationRegionId(String destinationRegionId) {
        this.destinationRegionId = destinationRegionId;
        return this;
    }
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    public CreateDiskReplicaPairRequest setDestinationDiskId(String destinationDiskId) {
        this.destinationDiskId = destinationDiskId;
        return this;
    }
    public String getDestinationDiskId() {
        return this.destinationDiskId;
    }

    public CreateDiskReplicaPairRequest setPairName(String pairName) {
        this.pairName = pairName;
        return this;
    }
    public String getPairName() {
        return this.pairName;
    }

    public CreateDiskReplicaPairRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDiskReplicaPairRequest setAsyncCycle(Integer asyncCycle) {
        this.asyncCycle = asyncCycle;
        return this;
    }
    public Integer getAsyncCycle() {
        return this.asyncCycle;
    }

}
