// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class ReplaceDedicatedHostRequest extends TeaModel {
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("FailoverMode")
    public String failoverMode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ReplaceDedicatedHostRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceDedicatedHostRequest self = new ReplaceDedicatedHostRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceDedicatedHostRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public ReplaceDedicatedHostRequest setFailoverMode(String failoverMode) {
        this.failoverMode = failoverMode;
        return this;
    }
    public String getFailoverMode() {
        return this.failoverMode;
    }

    public ReplaceDedicatedHostRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReplaceDedicatedHostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReplaceDedicatedHostRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReplaceDedicatedHostRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
