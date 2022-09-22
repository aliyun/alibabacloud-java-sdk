// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostTypesRequest extends TeaModel {
    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    @NameInMap("Generation")
    public String generation;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SupportInstanceTypeFamily")
    public String supportInstanceTypeFamily;

    public static DescribeDedicatedHostTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostTypesRequest self = new DescribeDedicatedHostTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostTypesRequest setDedicatedHostType(String dedicatedHostType) {
        this.dedicatedHostType = dedicatedHostType;
        return this;
    }
    public String getDedicatedHostType() {
        return this.dedicatedHostType;
    }

    public DescribeDedicatedHostTypesRequest setGeneration(String generation) {
        this.generation = generation;
        return this;
    }
    public String getGeneration() {
        return this.generation;
    }

    public DescribeDedicatedHostTypesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDedicatedHostTypesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDedicatedHostTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedHostTypesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDedicatedHostTypesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDedicatedHostTypesRequest setSupportInstanceTypeFamily(String supportInstanceTypeFamily) {
        this.supportInstanceTypeFamily = supportInstanceTypeFamily;
        return this;
    }
    public String getSupportInstanceTypeFamily() {
        return this.supportInstanceTypeFamily;
    }

}
