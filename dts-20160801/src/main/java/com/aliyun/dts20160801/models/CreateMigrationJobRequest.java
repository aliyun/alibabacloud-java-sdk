// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class CreateMigrationJobRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("MigrationJobClass")
    public String migrationJobClass;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("Region")
    public String region;

    public static CreateMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationJobRequest self = new CreateMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateMigrationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateMigrationJobRequest setMigrationJobClass(String migrationJobClass) {
        this.migrationJobClass = migrationJobClass;
        return this;
    }
    public String getMigrationJobClass() {
        return this.migrationJobClass;
    }

    public CreateMigrationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateMigrationJobRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
