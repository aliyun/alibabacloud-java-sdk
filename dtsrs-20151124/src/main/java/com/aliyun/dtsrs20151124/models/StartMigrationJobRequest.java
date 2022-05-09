// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class StartMigrationJobRequest extends TeaModel {
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    public static StartMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMigrationJobRequest self = new StartMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public StartMigrationJobRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

}
