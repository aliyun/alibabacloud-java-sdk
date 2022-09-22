// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRebootTimeRequest extends TeaModel {
    @NameInMap("AutoRebootTimeFrom")
    public String autoRebootTimeFrom;

    @NameInMap("AutoRebootTimeTo")
    public String autoRebootTimeTo;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeInstanceAutoRebootTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRebootTimeRequest self = new DescribeInstanceAutoRebootTimeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAutoRebootTimeRequest setAutoRebootTimeFrom(String autoRebootTimeFrom) {
        this.autoRebootTimeFrom = autoRebootTimeFrom;
        return this;
    }
    public String getAutoRebootTimeFrom() {
        return this.autoRebootTimeFrom;
    }

    public DescribeInstanceAutoRebootTimeRequest setAutoRebootTimeTo(String autoRebootTimeTo) {
        this.autoRebootTimeTo = autoRebootTimeTo;
        return this;
    }
    public String getAutoRebootTimeTo() {
        return this.autoRebootTimeTo;
    }

    public DescribeInstanceAutoRebootTimeRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeInstanceAutoRebootTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstanceAutoRebootTimeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceAutoRebootTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInstanceAutoRebootTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
