// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DeleteMigrationJobRequest extends TeaModel {
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    @NameInMap("OwnerId")
    public String ownerId;

    public static DeleteMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMigrationJobRequest self = new DeleteMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMigrationJobRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    public DeleteMigrationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
