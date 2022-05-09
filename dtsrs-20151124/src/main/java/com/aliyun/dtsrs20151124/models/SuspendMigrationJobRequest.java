// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class SuspendMigrationJobRequest extends TeaModel {
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    public static SuspendMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendMigrationJobRequest self = new SuspendMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public SuspendMigrationJobRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

}
