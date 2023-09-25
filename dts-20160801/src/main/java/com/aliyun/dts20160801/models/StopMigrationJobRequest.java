// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class StopMigrationJobRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("MigrationJobId")
    public String migrationJobId;

    @NameInMap("OwnerId")
    public String ownerId;

    public static StopMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMigrationJobRequest self = new StopMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public StopMigrationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StopMigrationJobRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public StopMigrationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
