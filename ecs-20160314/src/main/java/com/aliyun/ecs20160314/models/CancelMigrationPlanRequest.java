// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CancelMigrationPlanRequest extends TeaModel {
    @NameInMap("MigrationPlanId")
    public String migrationPlanId;

    @NameInMap("OnlyCancelPlan")
    public Boolean onlyCancelPlan;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CancelMigrationPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelMigrationPlanRequest self = new CancelMigrationPlanRequest();
        return TeaModel.build(map, self);
    }

    public CancelMigrationPlanRequest setMigrationPlanId(String migrationPlanId) {
        this.migrationPlanId = migrationPlanId;
        return this;
    }
    public String getMigrationPlanId() {
        return this.migrationPlanId;
    }

    public CancelMigrationPlanRequest setOnlyCancelPlan(Boolean onlyCancelPlan) {
        this.onlyCancelPlan = onlyCancelPlan;
        return this;
    }
    public Boolean getOnlyCancelPlan() {
        return this.onlyCancelPlan;
    }

    public CancelMigrationPlanRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CancelMigrationPlanRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CancelMigrationPlanRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CancelMigrationPlanRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelMigrationPlanRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CancelMigrationPlanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
