// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class AttachHostsToBastionUserRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("BastionUser")
    public String bastionUser;

    @NameInMap("BastionInstanceId")
    public String bastionInstanceId;

    @NameInMap("Hosts")
    public String hosts;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    public static AttachHostsToBastionUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachHostsToBastionUserRequest self = new AttachHostsToBastionUserRequest();
        return TeaModel.build(map, self);
    }

    public AttachHostsToBastionUserRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachHostsToBastionUserRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachHostsToBastionUserRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AttachHostsToBastionUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachHostsToBastionUserRequest setBastionUser(String bastionUser) {
        this.bastionUser = bastionUser;
        return this;
    }
    public String getBastionUser() {
        return this.bastionUser;
    }

    public AttachHostsToBastionUserRequest setBastionInstanceId(String bastionInstanceId) {
        this.bastionInstanceId = bastionInstanceId;
        return this;
    }
    public String getBastionInstanceId() {
        return this.bastionInstanceId;
    }

    public AttachHostsToBastionUserRequest setHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }
    public String getHosts() {
        return this.hosts;
    }

    public AttachHostsToBastionUserRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

}
