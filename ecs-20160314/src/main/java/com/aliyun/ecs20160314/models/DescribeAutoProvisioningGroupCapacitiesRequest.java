// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupCapacitiesRequest extends TeaModel {
    @NameInMap("AutoProvisioningGroupId")
    public java.util.List<String> autoProvisioningGroupId;

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

    public static DescribeAutoProvisioningGroupCapacitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupCapacitiesRequest self = new DescribeAutoProvisioningGroupCapacitiesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupCapacitiesRequest setAutoProvisioningGroupId(java.util.List<String> autoProvisioningGroupId) {
        this.autoProvisioningGroupId = autoProvisioningGroupId;
        return this;
    }
    public java.util.List<String> getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

    public DescribeAutoProvisioningGroupCapacitiesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAutoProvisioningGroupCapacitiesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAutoProvisioningGroupCapacitiesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAutoProvisioningGroupCapacitiesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAutoProvisioningGroupCapacitiesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
