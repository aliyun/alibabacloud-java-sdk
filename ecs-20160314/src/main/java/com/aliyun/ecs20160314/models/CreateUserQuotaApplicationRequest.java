// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateUserQuotaApplicationRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("QuotaType")
    public String quotaType;

    @NameInMap("QuotaValue")
    public Integer quotaValue;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateUserQuotaApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserQuotaApplicationRequest self = new CreateUserQuotaApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserQuotaApplicationRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateUserQuotaApplicationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateUserQuotaApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserQuotaApplicationRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateUserQuotaApplicationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateUserQuotaApplicationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateUserQuotaApplicationRequest setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

    public CreateUserQuotaApplicationRequest setQuotaValue(Integer quotaValue) {
        this.quotaValue = quotaValue;
        return this;
    }
    public Integer getQuotaValue() {
        return this.quotaValue;
    }

    public CreateUserQuotaApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateUserQuotaApplicationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateUserQuotaApplicationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateUserQuotaApplicationRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
