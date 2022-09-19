// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeMyBaseHostOverViewRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeMyBaseHostOverViewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMyBaseHostOverViewRequest self = new DescribeMyBaseHostOverViewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMyBaseHostOverViewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeMyBaseHostOverViewRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeMyBaseHostOverViewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMyBaseHostOverViewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeMyBaseHostOverViewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
