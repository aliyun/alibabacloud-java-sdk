// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobAlertRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the data migration instance. You can call the **DescribeMigrationJobs** operation to query the instance ID.</p>
     */
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMigrationJobAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobAlertRequest self = new DescribeMigrationJobAlertRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobAlertRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeMigrationJobAlertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeMigrationJobAlertRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public DescribeMigrationJobAlertRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeMigrationJobAlertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
