// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class CheckUserIfAuthoriseMyBaseSystemRoleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Region")
    public String region;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    public static CheckUserIfAuthoriseMyBaseSystemRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUserIfAuthoriseMyBaseSystemRoleRequest self = new CheckUserIfAuthoriseMyBaseSystemRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

}
