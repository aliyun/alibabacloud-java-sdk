// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class StopMigrationJobRequest extends TeaModel {
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    public static StopMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMigrationJobRequest self = new StopMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public StopMigrationJobRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

}
