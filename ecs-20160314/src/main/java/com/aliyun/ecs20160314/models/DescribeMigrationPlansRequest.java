// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeMigrationPlansRequest extends TeaModel {
    @NameInMap("MigrationPlanId")
    public String migrationPlanId;

    @NameInMap("Name")
    public String name;

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

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    public static DescribeMigrationPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationPlansRequest self = new DescribeMigrationPlansRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationPlansRequest setMigrationPlanId(String migrationPlanId) {
        this.migrationPlanId = migrationPlanId;
        return this;
    }
    public String getMigrationPlanId() {
        return this.migrationPlanId;
    }

    public DescribeMigrationPlansRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeMigrationPlansRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeMigrationPlansRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMigrationPlansRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMigrationPlansRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMigrationPlansRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeMigrationPlansRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeMigrationPlansRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeMigrationPlansRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
