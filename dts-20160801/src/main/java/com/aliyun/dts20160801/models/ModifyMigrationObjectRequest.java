// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class ModifyMigrationObjectRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("MigrationJobId")
    public String migrationJobId;

    @NameInMap("MigrationObject")
    public String migrationObject;

    @NameInMap("OwnerId")
    public String ownerId;

    public static ModifyMigrationObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMigrationObjectRequest self = new ModifyMigrationObjectRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMigrationObjectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyMigrationObjectRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public ModifyMigrationObjectRequest setMigrationObject(String migrationObject) {
        this.migrationObject = migrationObject;
        return this;
    }
    public String getMigrationObject() {
        return this.migrationObject;
    }

    public ModifyMigrationObjectRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
