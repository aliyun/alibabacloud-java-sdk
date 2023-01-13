// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAccountAttributesRequest extends TeaModel {
    /**
     * <p>The list of attribute names.</p>
     */
    @NameInMap("AttributeName")
    public java.util.List<String> attributeName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the zone.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAccountAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAttributesRequest self = new DescribeAccountAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAttributesRequest setAttributeName(java.util.List<String> attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public java.util.List<String> getAttributeName() {
        return this.attributeName;
    }

    public DescribeAccountAttributesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAccountAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAccountAttributesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAccountAttributesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAccountAttributesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
