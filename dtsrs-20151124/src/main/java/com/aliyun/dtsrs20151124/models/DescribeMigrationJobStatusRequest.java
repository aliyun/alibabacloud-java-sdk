// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobStatusRequest extends TeaModel {
    @NameInMap("MigrationJobId")
    public String migrationJobId;

    public static DescribeMigrationJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobStatusRequest self = new DescribeMigrationJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobStatusRequest setMigrationJobId(String migrationJobId) {
        this.migrationJobId = migrationJobId;
        return this;
    }
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

}
