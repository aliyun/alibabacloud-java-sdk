// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostTypesRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ECS instance family supported by the dedicated host type.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The information about the dedicated host type.</p>
     */
    @NameInMap("SupportedInstanceTypeFamily")
    public String supportedInstanceTypeFamily;

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

    public DescribeDedicatedHostTypesRequest setSupportedInstanceTypeFamily(String supportedInstanceTypeFamily) {
        this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
        return this;
    }
    public String getSupportedInstanceTypeFamily() {
        return this.supportedInstanceTypeFamily;
    }

}
