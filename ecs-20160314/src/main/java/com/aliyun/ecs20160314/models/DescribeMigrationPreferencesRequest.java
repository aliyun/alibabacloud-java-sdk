// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeMigrationPreferencesRequest extends TeaModel {
    @NameInMap("MigrationNetworkType")
    public String migrationNetworkType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeMigrationPreferencesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationPreferencesRequest self = new DescribeMigrationPreferencesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationPreferencesRequest setMigrationNetworkType(String migrationNetworkType) {
        this.migrationNetworkType = migrationNetworkType;
        return this;
    }
    public String getMigrationNetworkType() {
        return this.migrationNetworkType;
    }

    public DescribeMigrationPreferencesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeMigrationPreferencesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMigrationPreferencesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeMigrationPreferencesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
